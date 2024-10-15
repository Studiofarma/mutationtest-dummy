package org.autoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.example.Allenatore;
import org.example.Giocatore;
import org.example.NullValueException;
import org.example.Squadra;
import org.junit.jupiter.api.Test;

public class SquadraDiffblueTest {
    /**
     * Method under test: {@link Squadra#setNomeSquadra(String)}
     */
    @Test
    void testSetNomeSquadra() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        // Act
        (new Squadra("Nome Squadra", allenatore, new ArrayList<>())).setNomeSquadra("Nome Squadra");
    }

    /**
     * Method under test: {@link Squadra#setNomeSquadra(String)}
     */
    @Test
    void testSetNomeSquadra2() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        // Act and Assert
        assertThrows(NullValueException.class,
                () -> (new Squadra("Nome Squadra", allenatore, new ArrayList<>())).setNomeSquadra(null));
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Squadra#getAllenatore()}
     *   <li>{@link Squadra#getGiocatori()}
     *   <li>{@link Squadra#getNomeSquadra()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        ArrayList<Giocatore> giocatori = new ArrayList<>();
        Squadra squadra = new Squadra("Nome Squadra", allenatore, giocatori);

        // Act
        Allenatore actualAllenatore = squadra.getAllenatore();
        List<Giocatore> actualGiocatori = squadra.getGiocatori();

        // Assert
        assertEquals("Nome Squadra", squadra.getNomeSquadra());
        assertTrue(actualGiocatori.isEmpty());
        assertSame(giocatori, actualGiocatori);
        assertSame(allenatore, actualAllenatore);
    }

    /**
     * Method under test: {@link Squadra#setAllenatore(Allenatore)}
     */
    @Test
    void testSetAllenatore() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        // Act
        squadra.setAllenatore(new Allenatore("Nome", "Cognome"));
    }

    /**
     * Method under test: {@link Squadra#setAllenatore(Allenatore)}
     */
    @Test
    void testSetAllenatore2() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        // Act and Assert
        assertThrows(NullValueException.class,
                () -> (new Squadra("Nome Squadra", allenatore, new ArrayList<>())).setAllenatore(null));
    }

    /**
     * Method under test: {@link Squadra#setGiocatori(List)}
     */
    @Test
    void testSetGiocatori() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        // Act
        squadra.setGiocatori(new ArrayList<>());
    }

    /**
     * Method under test: {@link Squadra#setGiocatori(List)}
     */
    @Test
    void testSetGiocatori2() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        // Act and Assert
        assertThrows(NullValueException.class,
                () -> (new Squadra("Nome Squadra", allenatore, new ArrayList<>())).setGiocatori(null));
    }

    /**
     * Method under test: {@link Squadra#setGiocatori(List)}
     */
    @Test
    void testSetGiocatori3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        ArrayList<Giocatore> giocatori = new ArrayList<>();
        giocatori.add(new Giocatore("Nome", "Cognome", "Ruolo"));

        // Act
        squadra.setGiocatori(giocatori);
    }

    /**
     * Method under test: {@link Squadra#setGiocatori(List)}
     */
    @Test
    void testSetGiocatori4() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        ArrayList<Giocatore> giocatori = new ArrayList<>();
        giocatori.add(new Giocatore("Nome", "Cognome", "Ruolo"));
        giocatori.add(new Giocatore("Nome", "Cognome", "Ruolo"));

        // Act
        squadra.setGiocatori(giocatori);
    }

    /**
     * Method under test: {@link Squadra#Squadra(String, Allenatore, List)}
     */
    @Test
    void testNewSquadra() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        ArrayList<Giocatore> giocatori = new ArrayList<>();

        // Act
        Squadra actualSquadra = new Squadra("Nome Squadra", allenatore, giocatori);

        // Assert
        assertEquals("Nome Squadra", actualSquadra.getNomeSquadra());
        List<Giocatore> giocatori2 = actualSquadra.getGiocatori();
        assertTrue(giocatori2.isEmpty());
        assertSame(giocatori, giocatori2);
        assertSame(allenatore, actualSquadra.getAllenatore());
    }

    /**
     * Method under test: {@link Squadra#Squadra(String, Allenatore, List)}
     */
    @Test
    void testNewSquadra2() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> new Squadra(null, null, null));

    }

    /**
     * Method under test: {@link Squadra#Squadra(String, Allenatore, List)}
     */
    @Test
    void testNewSquadra3() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> new Squadra("Nome Squadra", null, null));

    }

    /**
     * Method under test: {@link Squadra#Squadra(String, Allenatore, List)}
     */
    @Test
    void testNewSquadra4() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> new Squadra("Nome Squadra", new Allenatore("Nome", "Cognome"), null));

    }

    /**
     * Method under test: {@link Squadra#Squadra(String, Allenatore, List)}
     */
    @Test
    void testNewSquadra5() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        ArrayList<Giocatore> giocatori = new ArrayList<>();
        giocatori.add(new Giocatore("Nome", "Cognome", "Ruolo"));

        // Act
        Squadra actualSquadra = new Squadra("Nome Squadra", allenatore, giocatori);

        // Assert
        assertEquals("Nome Squadra", actualSquadra.getNomeSquadra());
        assertSame(giocatori, actualSquadra.getGiocatori());
        assertSame(allenatore, actualSquadra.getAllenatore());
    }

    /**
     * Method under test: {@link Squadra#Squadra(String, Allenatore, List)}
     */
    @Test
    void testNewSquadra6() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        ArrayList<Giocatore> giocatori = new ArrayList<>();
        giocatori.add(new Giocatore("Nome", "Cognome", "Ruolo"));
        giocatori.add(new Giocatore("Nome", "Cognome", "Ruolo"));

        // Act
        Squadra actualSquadra = new Squadra("Nome Squadra", allenatore, giocatori);

        // Assert
        assertEquals("Nome Squadra", actualSquadra.getNomeSquadra());
        assertSame(giocatori, actualSquadra.getGiocatori());
        assertSame(allenatore, actualSquadra.getAllenatore());
    }
}
