package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestGiocatore {

    @Test
    public void testGiocatoreCreation() {
        // Create a new Giocatore object
        Giocatore giocatore = new Giocatore("Dusan", "Vlahovic", "Attaccante");

        // Verify that the attributes are correctly set
        assertEquals("Dusan", giocatore.getNome());
        assertEquals("Vlahovic", giocatore.getCognome());
        assertEquals("Attaccante", giocatore.getRuolo());
    }

    @Test
    public void testSetNome() {
        // Create a new Giocatore object
        Giocatore giocatore = new Giocatore("Dusan", "Vlahovic", "Attaccante");

        // Update the nome
        giocatore.setNome("Federico");

        // Verify that the nome was updated correctly
        assertEquals("Federico", giocatore.getNome());
    }

    @Test
    public void testSetCognome() {
        // Create a new Giocatore object
        Giocatore giocatore = new Giocatore("Dusan", "Vlahovic", "Attaccante");

        // Update the cognome
        giocatore.setCognome("Chiesa");

        // Verify that the cognome was updated correctly
        assertEquals("Chiesa", giocatore.getCognome());
    }

    @Test
    public void testSetRuolo() {
        // Create a new Giocatore object
        Giocatore giocatore = new Giocatore("Dusan", "Vlahovic", "Attaccante");

        // Update the ruolo
        giocatore.setRuolo("Centrocampista");

        // Verify that the ruolo was updated correctly
        assertEquals("Centrocampista", giocatore.getRuolo());
    }
}
