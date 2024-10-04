package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestAllenatore {

    private Allenatore allenatore;

    @BeforeEach
    public void setUp() {
        // Inizializza un oggetto Allenatore prima di ogni test
        allenatore = new Allenatore("Max", "Allegri");
    }

    @Test
    public void testGetNome() {
        // Verifica che il nome sia stato impostato correttamente
        assertEquals("Max", allenatore.getNome(), "Il nome dovrebbe essere Max");
    }

    @Test
    public void testSetNome() {
        // Cambia il nome e verifica che il cambiamento sia corretto
        allenatore.setNome("Maurizio");
        assertEquals("Maurizio", allenatore.getNome(), "Il nome dovrebbe essere cambiato in Maurizio");
    }

    @Test
    public void testGetCognome() {
        // Verifica che il cognome sia stato impostato correttamente
        assertEquals("Allegri", allenatore.getCognome(), "Il cognome dovrebbe essere Allegri");
    }

    @Test
    public void testSetCognome() {
        // Cambia il cognome e verifica che il cambiamento sia corretto
        allenatore.setCognome("Sarri");
        assertEquals("Sarri", allenatore.getCognome(), "Il cognome dovrebbe essere cambiato in Sarri");
    }

    @Test
    public void testConstructorWithInvalidNome() {
        // Verifica se il costruttore gestisce nomi non validi (null o vuoti)
        allenatore.setNome(null);
        assertNull(allenatore.getNome(), "Il nome dovrebbe essere null");

        allenatore.setNome("");
        assertEquals("", allenatore.getNome(), "Il nome dovrebbe essere una stringa vuota");
    }

    @Test
    public void testConstructorWithInvalidCognome() {
        // Verifica se il costruttore gestisce cognomi non validi (null o vuoti)
        allenatore.setCognome(null);
        assertNull(allenatore.getCognome(), "Il cognome dovrebbe essere null");

        allenatore.setCognome("");
        assertEquals("", allenatore.getCognome(), "Il cognome dovrebbe essere una stringa vuota");
    }
}
