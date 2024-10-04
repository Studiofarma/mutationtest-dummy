package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// Test class for the Gol class
public class TestGol {

    private Partita partita;
    private Gol gol;
    private Campionato campionato;
    private List<Squadra> squadre;
    private Giocatore g1, g2, g3, g4;
    private Squadra juventus, milan;
    private Allenatore a1, a2;
    private List<Giocatore> giocatoriJuve;
    private List<Giocatore> giocatoriMilan;

    // Setup method to initialize objects before each test
    @BeforeEach
    public void setUp() {
        Squadra squadraCasa = new Squadra("Juventus", null, null);
        Squadra squadraOspite = new Squadra("Milan", null, null);

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

        Stagione stagione = new Stagione(2024,squadre);
        partita = new Partita("2024-10-03", squadraCasa, squadraOspite, stagione);

        // Create a Gol instance with the initialized player and match
        gol = new Gol(g1, partita);
    }

    // Test to ensure that the Giocatore instance is correctly set and retrieved
    @Test
    public void testGetGiocatore() {
        assertEquals(g1, gol.getGiocatore(), "Il giocatore del gol non è corretto");
    }

    // Test to ensure that the Partita instance is correctly set and retrieved
    @Test
    public void testGetPartita() {
        assertEquals(partita, gol.getPartita(), "La partita del gol non è corretta");
    }

    // Test to verify that the setter method for Giocatore works correctly
    @Test
    public void testSetGiocatore() {
        Giocatore nuovoGiocatore = new Giocatore("Cristiano", "Ronaldo", "Attaccante");
        gol.setGiocatore(nuovoGiocatore);
        assertEquals(nuovoGiocatore, gol.getGiocatore(), "Il setter del giocatore non funziona correttamente");
    }

    // Test to verify that the setter method for Partita works correctly
    @Test
    public void testSetPartita() {
        Squadra nuovaSquadraCasa = new Squadra("Inter", null, null);
        Partita nuovaPartita = new Partita("2024-10-10", nuovaSquadraCasa, new Squadra("Roma", null, null), new Stagione(2024,squadre));
        gol.setPartita(nuovaPartita);
        assertEquals(nuovaPartita, gol.getPartita(), "Il setter della partita non funziona correttamente");
    }
}
