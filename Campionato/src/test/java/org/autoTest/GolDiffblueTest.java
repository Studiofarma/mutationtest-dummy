package org.autoTest;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.example.*;
import org.junit.jupiter.api.Test;

public class GolDiffblueTest {
    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Gol#getGiocatore()}
     *   <li>{@link Gol#getPartita()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>()));

        Gol gol = new Gol(giocatore, partita);

        // Act
        Giocatore actualGiocatore = gol.getGiocatore();

        // Assert
        assertSame(giocatore, actualGiocatore);
        assertSame(partita, gol.getPartita());
    }

    /**
     * Method under test: {@link Gol#setGiocatore(Giocatore)}
     */
    @Test
    void testSetGiocatore() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Gol gol = new Gol(giocatore, new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>())));

        // Act
        gol.setGiocatore(new Giocatore("Nome", "Cognome", "Ruolo"));
    }

    /**
     * Method under test: {@link Gol#setGiocatore(Giocatore)}
     */
    @Test
    void testSetGiocatore2() {
        // Arrange
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act and Assert
        assertThrows(NullValueException.class,
                () -> (new Gol(giocatore, new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()))))
                        .setGiocatore(null));
    }

    /**
     * Method under test: {@link Gol#setPartita(Partita)}
     */
    @Test
    void testSetPartita() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Gol gol = new Gol(giocatore, new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>())));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        // Act
        gol.setPartita(new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(2000, new ArrayList<>())));
    }

    /**
     * Method under test: {@link Gol#setPartita(Partita)}
     */
    @Test
    void testSetPartita2() {
        // Arrange
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act and Assert
        assertThrows(NullValueException.class,
                () -> (new Gol(giocatore, new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()))))
                        .setPartita(null));
    }

    /**
     * Method under test: {@link Gol#Gol(Giocatore, Partita)}
     */
    @Test
    void testNewGol() {
        // Arrange
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>()));

        // Act
        Gol actualGol = new Gol(giocatore, partita);

        // Assert
        assertSame(giocatore, actualGol.getGiocatore());
        assertSame(partita, actualGol.getPartita());
    }

    /**
     * Method under test: {@link Gol#Gol(Giocatore, Partita)}
     */
    @Test
    void testNewGol2() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> new Gol(null, null));

    }

    /**
     * Method under test: {@link Gol#Gol(Giocatore, Partita)}
     */
    @Test
    void testNewGol3() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> new Gol(new Giocatore("Nome", "Cognome", "Ruolo"), null));

    }
}
