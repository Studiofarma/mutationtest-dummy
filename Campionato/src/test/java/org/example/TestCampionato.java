package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class TestCampionato {

    private Campionato campionato;
    private List<Squadra> squadre;
    private Giocatore g1, g2, g3, g4;
    private Squadra juventus, milan;
    private Allenatore a1, a2;
    private List<Giocatore> giocatoriJuve;
    private List<Giocatore> giocatoriMilan;

    // Metodo che viene eseguito prima di ogni test per inizializzare gli oggetti comuni
    @BeforeEach
    public void setUp() {
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
    }

    @Test
    public void testNomeCampionato() {
        // Verifica che il nome del campionato sia stato impostato correttamente
        assertEquals("Serie A", campionato.getNomeCampionato());

        // Cambia nome campionato e verifica
        campionato.setNomeCampionato("Premier League");
        assertEquals("Premier League", campionato.getNomeCampionato());
    }

    @Test
    public void testAggiungiStagione() {
        Stagione stagione2024 = new Stagione(2024, squadre);

        // Aggiungi una stagione e verifica che la lista delle stagioni abbia una dimensione corretta
        campionato.aggiungiStagione(stagione2024);
        assertEquals(1, campionato.getStagioni().size());

        // Verifica che la stagione aggiunta sia effettivamente quella corretta
        assertEquals(stagione2024, campionato.getStagioni().get(0));
    }

    @Test
    public void testGetStagioni() {
        Stagione stagione2024 = new Stagione(2024, squadre);
        Stagione stagione2025 = new Stagione(2025, squadre);

        campionato.aggiungiStagione(stagione2024);
        campionato.aggiungiStagione(stagione2025);

        // Verifica che la lista delle stagioni abbia due elementi
        List<Stagione> stagioni = campionato.getStagioni();
        assertEquals(2, stagioni.size());

        // Verifica che entrambe le stagioni siano nella lista
        assertTrue(stagioni.contains(stagione2024));
        assertTrue(stagioni.contains(stagione2025));
    }

}
