package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Creazione del campionato
        Campionato serieA = new Campionato("Serie A");

        // Creazione dei giocatori
        Giocatore g1 = new Giocatore("Dusan", "Vlahovic", "Attaccante");
        Giocatore g2 = new Giocatore("Nicolò", "Fagioli", "Centrocampista");
        Giocatore g3 = new Giocatore("Alvaro", "Morata", "Attaccante");
        Giocatore g4 = new Giocatore("Christian", "Pulisic", "Centrocampista");
        Giocatore g5 = new Giocatore("Lautaro", "Martinez", "Attaccante");
        Giocatore g6 = new Giocatore("Nicolo", "Barella", "Centrocampista");

        // Creazione degli allenatori
        Allenatore a1 = new Allenatore("Thiago", "Motta");
        Allenatore a2 = new Allenatore("Max", "Allegri");
        Allenatore a3 = new Allenatore("Stefano", "Pioli");
        Allenatore a4 = new Allenatore("Simone", "Inzaghi");

        // Creazione delle liste di giocatori per squadra e per stagione
        List<Giocatore> giocatoriJuve = new ArrayList<>();
        giocatoriJuve.add(g1);
        giocatoriJuve.add(g2);

        List<Giocatore> giocatoriMilan = new ArrayList<>();
        giocatoriMilan.add(g3);
        giocatoriMilan.add(g4);

        List<Giocatore> giocatoriInter = new ArrayList<>();
        giocatoriInter.add(g5);
        giocatoriInter.add(g6);

        // Creazione delle squadre
        Squadra juventus = new Squadra("Juventus", a1, giocatoriJuve);
        Squadra milan = new Squadra("Milan", a3, giocatoriMilan);
        Squadra inter = new Squadra("Inter", a4, giocatoriInter);

        // Creazione delle stagioni
        Stagione stagione2024 = new Stagione(2024,List.of(juventus,milan,inter));

        // Creazione di partite per la stagione 2024
        Partita partita1 = new Partita("2024-10-03", juventus, milan, stagione2024);
        Partita partita2 = new Partita("2024-10-10", milan, inter, stagione2024);
        Partita partita3 = new Partita("2024-10-17", inter, juventus, stagione2024);

        // Impostazione dei risultati
        Risultato risultato1 = new Risultato(2, 1); // Juventus 2 - Milan 1
        Risultato risultato2 = new Risultato(1, 1); // Milan 1 - Inter 1 (pareggio)
        Risultato risultato3 = new Risultato(3, 0); // Inter 3 - Juventus 0

        // Aggiunta dei risultati e dei gol (esempio di giocatori che segnano)
        List<Gol> golPartita1Juve = Arrays.asList(new Gol(g1, partita1), new Gol(g1, partita1)); // Doppietta di Vlahovic
        List<Gol> golPartita1Milan = Arrays.asList(new Gol(g3, partita1)); // Gol di Morata

        partita1.setRisultato(risultato1, golPartita1Juve, golPartita1Milan);

        List<Gol> golPartita2Milan = Arrays.asList(new Gol(g3, partita2)); // Gol di Morata
        List<Gol> golPartita2Inter = Arrays.asList(new Gol(g5, partita2)); // Gol di Lautaro

        partita2.setRisultato(risultato2, golPartita2Milan, golPartita2Inter);

        List<Gol> golPartita3Inter = Arrays.asList(new Gol(g5, partita3), new Gol(g6, partita3), new Gol(g5, partita3)); // Lautaro doppietta, Barella 1 gol

        partita3.setRisultato(risultato3,golPartita3Inter,new ArrayList<>());

        serieA.aggiungiStagione(stagione2024);
        serieA.getStagioneByAnno(2024).creaPartite();
        serieA.getStagioneByAnno(2024).aggiungiPartita(partita1);
        serieA.getStagioneByAnno(2024).aggiungiPartita(partita2);
        serieA.getStagioneByAnno(2024).aggiungiPartita(partita3);
        System.out.println(stagione2024);

        // Calcolo e stampa della classifica
        Map<Squadra, Integer> classifica = stagione2024.calcolaClassifica();
        System.out.println("Classifica della stagione 2024:");
        for (Map.Entry<Squadra, Integer> entry : classifica.entrySet()) {
            System.out.println(entry.getKey().getNomeSquadra() + ": " + entry.getValue() + " punti");
        }

        // Calcolo e stampa della classifica marcatori
        Map<Giocatore, Integer> marcatori = stagione2024.classificaMarcatori();
        System.out.println("Classifica marcatori della stagione 2024:");
        for (Map.Entry<Giocatore, Integer> entry : marcatori.entrySet()) {
            System.out.println(entry.getKey().getCognome() +  ": " + entry.getValue() + " goal");
        }
    }
}
