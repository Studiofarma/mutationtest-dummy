package org.example;

import java.time.LocalDate;
import java.util.*;

public class Stagione {
    private int anno;
    private List<Partita> partite;  // Relazione 1:N con Partita
    private List<Squadra> squadre;

    public Stagione(int anno, List<Squadra> squadre) {
        setAnno(anno);
        this.partite = new ArrayList<>();
        setSquadre(squadre);
    }

    // Aggiungere una partita alla stagione
    public void aggiungiPartita(Partita partita) {
        boolean flag = true;
        if (!squadre.contains(partita.getSquadraCasa())) {
            System.out.println("Errore: Squadra: " + partita.getSquadraCasa().toString() + " non iscritta alla stagione!");
            flag = false;
        }
        if (!squadre.contains(partita.getSquadraOspite())) {
            System.out.println("Errore: Squadra: " + partita.getSquadraOspite().toString() + " non iscritta alla stagione!");
            flag = false;
        }
        if (flag) {
            partite.add(partita);
        }
    }

    public List<Partita> getPartite() {
        return partite;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public void setPartite(List<Partita> partite) {
        boolean flag = true;
        for (Partita p : partite) {
            if (!squadre.contains(p.getSquadraCasa())) {
                System.out.println("Errore: Squadra: " + p.getSquadraCasa().toString() + " non iscritta alla stagione!");
                flag = false;
            }
            if (!squadre.contains(p.getSquadraOspite())) {
                System.out.println("Errore: Squadra: " + p.getSquadraOspite().toString() + " non iscritta alla stagione!");
                flag = false;
            }
        }
        // tutte le partite devono esssere corrette
        if (flag) {
            this.partite.addAll(partite);
        }


    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Partita p : partite) {
            sb.append(p.toString()).append('\n');
        }
        if (partite.isEmpty()) {
            sb.append("Nessuna partita in questo stagione.\n");
        }
        return sb.toString();
    }

    // Metodo per calcolare la classifica
    public Map<Squadra, Integer> calcolaClassifica() {
        // Mappa per tenere traccia dei punti delle squadre
        Map<Squadra, Integer> classifica = new HashMap<>();

        // Iteriamo su tutte le partite della stagione
        for (Partita partita : partite) {
            Squadra squadraCasa = partita.getSquadraCasa();
            Squadra squadraOspite = partita.getSquadraOspite();

            // Inizializziamo i punti delle squadre se non presenti
            classifica.putIfAbsent(squadraCasa, 0);
            classifica.putIfAbsent(squadraOspite, 0);

            if (partita.getRisultato() != null) {
                if (partita.getRisultato().getGoal1() > partita.getRisultato().getGoal2()) {
                    // Squadra di casa vince
                    classifica.put(squadraCasa, classifica.get(squadraCasa) + 3);
                } else if (partita.getRisultato().getGoal1() < partita.getRisultato().getGoal2()) {
                    // Squadra ospite vince
                    classifica.put(squadraOspite, classifica.get(squadraOspite) + 3);
                } else {
                    // Pareggio
                    classifica.put(squadraCasa, classifica.get(squadraCasa) + 1);
                    classifica.put(squadraOspite, classifica.get(squadraOspite) + 1);
                }
            }
        }

        // Ritorniamo la classifica ordinata per punti in ordine decrescente
        return classifica.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .collect(LinkedHashMap::new,
                        (map, entry) -> map.put(entry.getKey(), entry.getValue()),
                        LinkedHashMap::putAll);


    }

    public Map<Giocatore, Integer> classificaMarcatori() {
        Map<Giocatore, Integer> marcatori = new HashMap<>();

        for (Partita p : partite) {
            for (Gol g : p.getGolPartita()) {
                // incremento i goal del marcatore
                marcatori.putIfAbsent(g.getGiocatore(), 0);
                marcatori.put(g.getGiocatore(), marcatori.get(g.getGiocatore()) + 1);
            }
        }
        return marcatori.entrySet()
                .stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .collect(LinkedHashMap::new,
                        (map, entry) -> map.put(entry.getKey(), entry.getValue()),
                        LinkedHashMap::putAll);
    }

    public List<Squadra> getSquadre() {
        return squadre;
    }

    public void setSquadre(List<Squadra> squadre) {
        this.squadre = squadre;
    }

    public List<Giocatore> getGiocatoriSquadra(Squadra s) {
        for (Squadra squadra : squadre) {
            if (squadra.getNomeSquadra().equalsIgnoreCase(s.getNomeSquadra())) {
                return squadra.getGiocatori();
            }
        }
        System.out.println("La squadra: " + s.getNomeSquadra() + " nella stagione :" + this.getAnno() + " non è presente");
        return null;
    }

    public void creaPartite() {
        List<Partita> partite = new ArrayList<>();
        LocalDate dataInizio = LocalDate.of(anno, 9, 1);  // Inizia dal 1 settembre
        int giorniTraTurni = 7;  // Ogni turno a distanza di una settimana
        LocalDate dataCorrente = dataInizio;

        // Lista delle partite che devono essere giocate (andata)
        List<Partita> partiteDiAndata = new ArrayList<>();

        // Genera tutte le partite di andata (ogni squadra gioca contro ogni altra una volta)
        for (int i = 0; i < squadre.size(); i++) {
            for (int j = i + 1; j < squadre.size(); j++) {
                Squadra squadraCasa = squadre.get(i);
                Squadra squadraOspite = squadre.get(j);
                partiteDiAndata.add(new Partita(null, squadraCasa, squadraOspite, this));
            }
        }

        // Alterna le partite in turni
        while (!partiteDiAndata.isEmpty()) {
            List<Partita> partiteGiornata = new ArrayList<>();
            List<Squadra> squadreGiaGiocate = new ArrayList<>();

            // Seleziona partite per il turno, evitando che le squadre giochino più di una volta
            for (Partita partita : partiteDiAndata) {
                Squadra squadraCasa = partita.getSquadraCasa();
                Squadra squadraOspite = partita.getSquadraOspite();

                // Aggiungi la partita solo se entrambe le squadre non hanno già giocato nel turno
                if (!squadreGiaGiocate.contains(squadraCasa) && !squadreGiaGiocate.contains(squadraOspite)) {
                    partiteGiornata.add(partita);
                    squadreGiaGiocate.add(squadraCasa);
                    squadreGiaGiocate.add(squadraOspite);
                }
            }

            // Imposta la data per tutte le partite del turno corrente
            for (Partita partita : partiteGiornata) {
                partita.setData(dataCorrente.toString());
                partite.add(partita);
            }

            // Rimuovi le partite giocate in questo turno dalla lista delle partite di andata
            partiteDiAndata.removeAll(partiteGiornata);

            // Passa al turno successivo: incrementa la data di una settimana
            dataCorrente = dataCorrente.plusDays(giorniTraTurni);
        }

        // Dopo aver generato e pianificato tutte le partite di andata
        List<Partita> partiteDiRitorno = new ArrayList<>();

        for (int i = 0; i < squadre.size(); i++) {
            for (int j = i + 1; j < squadre.size(); j++) {
                Squadra squadraCasa = squadre.get(j);  // Inverti le squadre per il ritorno
                Squadra squadraOspite = squadre.get(i);
                partiteDiRitorno.add(new Partita(null, squadraCasa, squadraOspite, this));
            }
        }

// Ripeti lo stesso ciclo per organizzare i turni delle partite di ritorno
        while (!partiteDiRitorno.isEmpty()) {
            List<Partita> partiteGiornata = new ArrayList<>();
            List<Squadra> squadreGiaGiocate = new ArrayList<>();

            for (Partita partita : partiteDiRitorno) {
                Squadra squadraCasa = partita.getSquadraCasa();
                Squadra squadraOspite = partita.getSquadraOspite();

                if (!squadreGiaGiocate.contains(squadraCasa) && !squadreGiaGiocate.contains(squadraOspite)) {
                    partiteGiornata.add(partita);
                    squadreGiaGiocate.add(squadraCasa);
                    squadreGiaGiocate.add(squadraOspite);
                }
            }

            for (Partita partita : partiteGiornata) {
                partita.setData(dataCorrente.toString());
                partite.add(partita);
            }

            partiteDiRitorno.removeAll(partiteGiornata);
            dataCorrente = dataCorrente.plusDays(giorniTraTurni); // Avanza al turno successivo
        }

        // Imposta le partite nella stagione
        setPartite(partite);
    }


    public void aggiungiRisultato(Risultato risultato, Partita p,List<Gol> g1,List<Gol> g2) {
        p.setRisultato(risultato,g1,g2);
    }
}

