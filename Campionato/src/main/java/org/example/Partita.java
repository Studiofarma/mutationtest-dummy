package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Partita {
    private String data;
    private Squadra squadraCasa;
    private Squadra squadraOspite;
    private Risultato risultato;
    private List<Gol> golPartita;
    private Stagione stagione;

    public Partita(String data, Squadra squadraCasa, Squadra squadraOspite,Stagione stagione) {
        setData(data);
        setSquadraCasa(squadraCasa);
        setSquadraOspite(squadraOspite);
        setStagione(stagione);
        this.golPartita = new ArrayList<>();
    }


    public Risultato getRisultato() {
        return risultato;
    }

    public void setRisultato(Risultato risultato,List<Gol> goal1,List<Gol> goal2) {
        if(risultato!=null) {
            boolean correct = true;
            if (risultato.getGoal1() != goal1.size() || risultato.getGoal2() != goal2.size()) {
                System.out.println("Errore! Il risultato e i marcatori non corrispondono");
                correct = false;
            } else {
                for (Gol g : goal1) {
                    if (squadraContieneGiocatore(squadraCasa, g.getGiocatore(), stagione)) {
                        golPartita.add(g);
                    } else {
                        System.out.println("Il giocatore: " + g.getGiocatore().getCognome() + " nella stagione " + stagione.getAnno() + " NON apparteneva alla squadra : " + squadraCasa.getNomeSquadra());
                        correct = false;
                    }
                }
                for (Gol g : goal2) {
                    if (squadraContieneGiocatore(squadraOspite, g.getGiocatore(), stagione)) {
                        golPartita.add(g);
                    } else {
                        System.out.println("Il giocatore: " + g.getGiocatore().getCognome() + " nella stagione " + stagione.getAnno() + " NON apparteneva alla squadra : " + squadraOspite.getNomeSquadra());
                        correct = false;
                    }
                }
            }
            if (correct) {
                this.risultato = risultato;
                System.out.println("Risultato aggiunto correttamente!");
            } else {
                golPartita.clear();
            }
        }
        else throw new NullValueException("Risultato cannot be null");
    }

    public boolean squadraContieneGiocatore(Squadra squadra, Giocatore giocatore, Stagione stagione) {
        List<Giocatore> giocatori;
        if(stagione!= null && squadra!=null && giocatore!=null){
            giocatori = stagione.getGiocatoriSquadra(squadra);
            if(giocatori!=null){
                return giocatori.contains(giocatore);
            }
            return false;
        }
        return false;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Squadra getSquadraCasa() {
        return squadraCasa;
    }

    public void setSquadraCasa(Squadra squadraCasa) {
        if(squadraCasa!=null)
            this.squadraCasa = squadraCasa;
        else throw new NullValueException("Squadra cannot be null");
    }

    public Squadra getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(Squadra squadraOspite) {
        if(squadraOspite!=null)
            this.squadraOspite = squadraOspite;
        else throw new NullValueException("Squadra cannot be null");
    }

    public List<Gol> getGolPartita() {
        return golPartita;
    }

    public void setGolPartita(List<Gol> golPartita) {
        this.golPartita = golPartita;
    }

    public Stagione getStagione() {
        return stagione;
    }

    public void setStagione(Stagione stagione) {
        if(stagione==null)
            throw new NullValueException("Stagione cannot be null");
        else this.stagione = stagione;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Partita tra ")
                .append(squadraCasa.getNomeSquadra()).append(" e ").append(squadraOspite.getNomeSquadra())
                .append(" il ").append(data).append("\n")
                .append("Risultato: ").append(risultato).append("\n");

        if (!golPartita.isEmpty()) {
            sb.append("Gol segnati:\n");
            for (Gol gol : golPartita) {
                sb.append("- ").append(gol.getGiocatore().getNome()).append(" ").append(gol.getGiocatore().getCognome()).append("\n");
            }
        }
        sb.append("-----------------------------------------------------------");
        return sb.toString();
    }

}
