package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TestStagione {

    private Campionato serieA;
    private Stagione stagione2023;
    private Stagione stagione2024;
    private Squadra juventus;
    private Squadra milan;
    private Squadra inter;
    private Partita partita1;
    private Partita partita2;
    private Partita partita3;
    private Giocatore g1,g2,g3,g4,g5,g6;
    private Allenatore a1,a2,a3,a4;
    private Risultato risultato1,risultato2,risultato3;

    @BeforeEach
    void setUp() {
        // Creazione del campionato
        serieA = new Campionato("Serie A");

        // Creazione dei giocatori
        g1 = new Giocatore("Dusan", "Vlahovic", "Attaccante");
        g2 = new Giocatore("Nicolò", "Fagioli", "Centrocampista");
        g3 = new Giocatore("Alvaro", "Morata", "Attaccante");
        g4 = new Giocatore("Christian", "Pulisic", "Centrocampista");
        g5 = new Giocatore("Lautaro", "Martinez", "Attaccante");
         g6 = new Giocatore("Nicolo", "Barella", "Centrocampista");

        // Creazione degli allenatori
        a1 = new Allenatore("Thiago", "Motta");
        a2 = new Allenatore("Max", "Allegri");
        a3 = new Allenatore("Stefano", "Pioli");
        a4 = new Allenatore("Simone", "Inzaghi");

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
        juventus = new Squadra("Juventus", a1, giocatoriJuve);
        milan = new Squadra("Milan", a3, giocatoriMilan);
        inter = new Squadra("Inter", a4, giocatoriInter);

        // Creazione delle stagioni
        stagione2024 = new Stagione(2024, List.of(juventus,milan,inter));

        // Creazione di partite per la stagione 2024
        partita1 = new Partita("2024-10-03", juventus, milan, stagione2024);
        partita2 = new Partita("2024-10-10", milan, inter, stagione2024);
        partita3 = new Partita("2024-10-17", inter, juventus, stagione2024);

        // Impostazione dei risultati
        risultato1 = new Risultato(2, 1); // Juventus 2 - Milan 1
        risultato2 = new Risultato(1, 1); // Milan 1 - Inter 1 (pareggio)
        risultato3 = new Risultato(3, 0); // Inter 3 - Juventus 0

        // Aggiunta dei risultati e dei gol (esempio di giocatori che segnano)
        List<Gol> golPartita1Juve = Arrays.asList(new Gol(g1, partita1), new Gol(g1, partita1)); // Doppietta di Vlahovic
        List<Gol> golPartita1Milan = Arrays.asList(new Gol(g3, partita1)); // Gol di Morata

        partita1.setRisultato(risultato1, golPartita1Juve, golPartita1Milan);

        List<Gol> golPartita2Milan = Arrays.asList(new Gol(g3, partita2)); // Gol di Morata
        List<Gol> golPartita2Inter = Arrays.asList(new Gol(g5, partita2)); // Gol di Lautaro

        partita2.setRisultato(risultato2, golPartita2Milan, golPartita2Inter);

        List<Gol> golPartita3Inter = Arrays.asList(new Gol(g5, partita3), new Gol(g6, partita3), new Gol(g5, partita3)); // Lautaro doppietta, Barella 1 gol

        partita3.setRisultato(risultato3,golPartita3Inter,new ArrayList<>());

        // Aggiunta delle partite alla stagione
        stagione2024.aggiungiPartita(partita1);
        stagione2024.aggiungiPartita(partita2);
        stagione2024.aggiungiPartita(partita3);

        // Aggiunta della stagione al campionato
        serieA.aggiungiStagione(stagione2024);

    }

    @Test
    void testAggiungiPartita() {
        // Verify that the matches were added to the season
        List<Partita> partite = stagione2024.getPartite();
        assertEquals(3, partite.size(), "Dovrebbero essere 3 le partite in questa stagione");
        assertEquals(partita1, partite.get(0), "Prima partita non corrisponde");
        assertEquals(partita2, partite.get(1), "Seconda partita non corrisponde");
        assertEquals(partita3, partite.get(2), "Seconda partita non corrisponde");
    }

    @Test
    void testCalcolaClassifica() {

        // Calculate standings
        Map<Squadra, Integer> classifica = stagione2024.calcolaClassifica();

        // Check the standings
        assertNotNull(classifica, "Classifica should not be null.");
        assertEquals(4, classifica.get(inter).intValue(), "Inter dovrebbe avere 4 punti.");
        assertEquals(3, classifica.get(juventus).intValue(), "Juventus dovrebbe avere 3 punti.");
        assertEquals(1, classifica.get(milan).intValue(), "Milan dovrebbe avere 1 point.");
    }

    @Test
    void testClassificaMarcatori(){
        Map<Giocatore, Integer> marcatori = stagione2024.classificaMarcatori();

        // Check the standings
        assertNotNull(marcatori, "Classifica should not be null.");
        assertEquals(3, marcatori.get(g5).intValue(), "Martinez dovrebbe avere 3 goal.");
        assertEquals(2, marcatori.get(g3).intValue(), "Morata dovrebbe avere 2 goal.");
        assertEquals(2, marcatori.get(g1).intValue(), "Vlahovic dovrebbe avere 2 goal.");
        assertEquals(1, marcatori.get(g6).intValue(), "Barella dovrebbe avere 1 goal.");

    }
    @Test
    void testToString() {
        String expectedString = partita1.toString() + "\n" + partita2.toString() + "\n" + partita3.toString() + "\n";
        assertEquals(expectedString, stagione2024.toString(), "toString non ritorna corrispondenza corretta.");
    }

    @Test
    void testCreaPartite(){
        stagione2023 = new Stagione(2023, List.of(juventus,milan,inter));
        serieA.aggiungiStagione(stagione2023);
        serieA.getStagioneByAnno(2023).creaPartite();

        assertEquals(6,stagione2023.getPartite().size());

    }

    @Test
    public void testAggiungiRisultato() {
        stagione2023 = new Stagione(2023, List.of(juventus,milan,inter));
        serieA.aggiungiStagione(stagione2023);
        serieA.getStagioneByAnno(2023).aggiungiPartita(partita1);

        // Crea un risultato
        Risultato risultato = new Risultato(2, 1); // Juventus 2 - Milan 1

        // Crea liste di gol (se necessario)
        List<Gol> golJuventus = new ArrayList<>();
        List<Gol> golMilan = new ArrayList<>();

        // Aggiungi i gol (fai riferimento alla tua implementazione di Gol)
        golJuventus.add(new Gol(g1, partita1));
        golJuventus.add(new Gol(g1, partita1));
        golMilan.add(new Gol(g3, partita1));

        // Aggiungi il risultato alla partita
        serieA.getStagioneByAnno(2023).aggiungiRisultato(risultato, serieA.getStagioneByAnno(2023).getPartite().get(0), golJuventus, golMilan);

        // Verifica che il risultato sia stato impostato correttamente
        Partita partita = serieA.getStagioneByAnno(2023).getPartite().get(0);
        assertNotNull(partita.getRisultato());
        assertEquals(2, partita.getRisultato().getGoal1()); // Juventus
        assertEquals(1, partita.getRisultato().getGoal2()); // Milan
    }
}
