package org.autoTestNew;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.example.*;
import org.junit.jupiter.api.Disabled;
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
    @Disabled("TODO: Complete this test")
    void testGettersAndSetters() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   org.example.Gol.getGiocatore().
        //   The arrange section threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Gol gol = null;

        // Act
        Giocatore actualGiocatore = gol.getGiocatore();
        Partita actualPartita = gol.getPartita();

        // Assert
        // TODO: Add assertions on result
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

        Gol gol = new Gol(giocatore,
                new Partita("Data", squadraCasa, squadraOspite, new Stagione(1900, new ArrayList<>())));

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
                () -> (new Gol(giocatore,
                        new Partita("Data", squadraCasa, squadraOspite, new Stagione(1900, new ArrayList<>()))))
                        .setGiocatore(null));
    }

    /**
     * Method under test: {@link Gol#setGiocatore(Giocatore)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetGiocatore3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Gol gol = new Gol(giocatore, new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>())));

        // Act
        gol.setGiocatore(new Giocatore("Nome", "Cognome", "Ruolo"));
    }

    /**
     * Method under test: {@link Gol#setGiocatore(Giocatore)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetGiocatore4() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act
        (new Gol(giocatore, new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()))))
                .setGiocatore(null);
    }

    /**
     * Method under test: {@link Gol#setPartita(Partita)}
     */
    @Test
    void testSetPartita() {
        // Arrange
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act and Assert
        assertThrows(NullValueException.class, () -> (new Gol(giocatore,
                new Partita("Data", squadraCasa, squadraOspite, new Stagione(1900, new ArrayList<>())))).setPartita(null));
    }

    /**
     * Method under test: {@link Gol#setPartita(Partita)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetPartita2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Gol gol = new Gol(giocatore, new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>())));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        // Act
        gol.setPartita(new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(1, new ArrayList<>())));
    }

    /**
     * Method under test: {@link Gol#setPartita(Partita)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetPartita3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act
        (new Gol(giocatore, new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()))))
                .setPartita(null);
    }

    /**
     * Method under test: {@link Gol#Gol(Giocatore, Partita)}
     */
    @Test
    void testNewGol() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> new Gol(null, null));
        assertThrows(NullValueException.class, () -> new Gol(new Giocatore("Nome", "Cognome", "Ruolo"), null));

    }

    /**
     * Method under test: {@link Gol#Gol(Giocatore, Partita)}
     */
    @Test
    void testNewGol2() {
        // Arrange
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1900, new ArrayList<>()));

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
    @Disabled("TODO: Complete this test")
    void testNewGol3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act
        new Gol(giocatore, new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>())));

    }
}
