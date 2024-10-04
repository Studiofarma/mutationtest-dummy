package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TestPartita {
    private Stagione stagione;
    private Partita partita;
    private List<Squadra> squadre;
    private Giocatore g1, g2, g3, g4;
    private Squadra juventus, milan;
    private Allenatore a1, a2;
    private List<Giocatore> giocatoriJuve;
    private List<Giocatore> giocatoriMilan;
    private Campionato campionato;

    @BeforeEach
    void setUp() {
        // Setup for each test
        campionato = new Campionato("Serie A");
        squadre = new ArrayList<>();

        // Inizializza i giocatori
        g1 = new Giocatore("Dusan", "Vlahovic", "Attaccante");
        g2 = new Giocatore("Nicolò", "Fagioli", "Centrocampista");
        g3 = new Giocatore("Alvaro", "Morata", "Attaccante");
        g4 = new Giocatore("Christian", "Pulisic", "Centrocampista");

        // Inizializza le liste di giocatori
        giocatoriJuve = new ArrayList<>();
        giocatoriJuve.add(g1);
        giocatoriJuve.add(g2);

        giocatoriMilan = new ArrayList<>();
        giocatoriMilan.add(g3);
        giocatoriMilan.add(g4);

        // Inizializza gli allenatori
        a1 = new Allenatore("Thiago", "Motta");
        a2 = new Allenatore("Max", "Allegri");

        // Inizializza le squadre
        juventus = new Squadra("Juventus", a1, giocatoriJuve);
        milan = new Squadra("Milan", a2, giocatoriMilan);

        // Aggiungi le squadre alla lista
        squadre.add(juventus);
        squadre.add(milan);
        stagione = new Stagione(2023, squadre);

        // Create a new match
        partita = new Partita("2023-10-03", juventus, milan, stagione);
    }

    @Test
    void testSetRisultatoSuccess() {
        // Arrange
        Risultato risultato = new Risultato(1, 0); // Juventus 1 - Milan 0
        Gol gol = new Gol(g1, partita); // Vlahovic scores

        // Act
        partita.setRisultato(risultato, Arrays.asList(gol), Collections.emptyList());

        // Assert
        assertEquals(risultato, partita.getRisultato());
        assertEquals(1, partita.getGolPartita().size());
        assertTrue(partita.getGolPartita().contains(gol));
        System.out.println(partita); // Print match details
    }

    @Test
    void testSetRisultatoGoalMismatch() {
        // Arrange
        Risultato risultato = new Risultato(1, 1); // Expected: 1-1
        Gol golCasa = new Gol(g1, partita); // Vlahovic scores
        Gol golOspite = new Gol(new Giocatore("Alvaro", "Morata", "Attaccante"), partita); // Incorrect player

        // Act
        partita.setRisultato(risultato, Arrays.asList(golCasa), Arrays.asList(golOspite));

        // Assert
        assertNull(partita.getRisultato(), "Il risultato deve essere null perchè non c'è corrispondenza con il risultato");
        assertEquals(0, partita.getGolPartita().size());
    }

    @Test
    void testSetRisultatoIncorrectPlayer() {
        // Arrange
        Risultato risultato = new Risultato(1, 0); // Juventus 1 - Milan 0
        Gol golOspite = new Gol(new Giocatore("Gonzalo", "Higuain", "Attaccante"), partita); // Not in the team

        // Act
        partita.setRisultato(risultato, Collections.emptyList(), Arrays.asList(golOspite));

        // Assert
        assertNull(partita.getRisultato(), "Il risultato deve essere null perchè non c'è corrispondenza con i giocatori");
        assertEquals(0, partita.getGolPartita().size());
    }

    @Test
    void testToString() {
        // Arrange
        Risultato risultato = new Risultato(1, 0);
        Gol gol = new Gol(g1, partita);
        partita.setRisultato(risultato, Arrays.asList(gol), Collections.emptyList());

        // Act
        String partitaString = partita.toString();

        // Assert
        assertTrue(partitaString.contains("Partita tra Juventus e Milan"));
        assertTrue(partitaString.contains("Risultato: " + risultato));
        assertTrue(partitaString.contains("Gol segnati:"));
        assertTrue(partitaString.contains("Dusan Vlahovic"));
    }
}
