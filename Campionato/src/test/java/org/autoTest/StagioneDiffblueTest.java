package org.autoTest;

import java.util.ArrayList;
import java.util.List;

import org.example.*;
import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StagioneDiffblueTest {
    /**
     * Method under test: {@link Stagione#aggiungiPartita(Partita)}
     */
    @Test
    void testAggiungiPartita() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Stagione stagione = new Stagione(2000, new ArrayList<>());
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act
        stagione.aggiungiPartita(new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>())));
    }

    /**
     * Method under test: {@link Stagione#aggiungiPartita(Partita)}
     */
    @Test
    void testAggiungiPartita2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Partita.getSquadraCasa()" because "partita" is null
        //       at org.example.Stagione.aggiungiPartita(Stagione.java:20)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        assertThrows(NullValueException.class,
                () -> new Stagione(1, new ArrayList<>()).aggiungiPartita(null));
    }

    /**
     * Method under test: {@link Stagione#setPartite(List)}
     */
    @Test
    void testSetPartite() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Stagione stagione = new Stagione(2000, new ArrayList<>());

        // Act
        stagione.setPartite(new ArrayList<>());
    }

    /**
     * Method under test: {@link Stagione#setPartite(List)}
     */
    @Test
    void testSetPartite2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Stagione stagione = new Stagione(2000, new ArrayList<>());
        stagione.setSquadre(new ArrayList<>());

        ArrayList<Partita> partite = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        partite.add(new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>())));

        // Act
        stagione.setPartite(partite);
    }

    /**
     * Method under test: {@link Stagione#setPartite(List)}
     */
    @Test
    void testSetPartite3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Stagione stagione = new Stagione(2000, new ArrayList<>());

        ArrayList<Partita> partite = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        partite.add(new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>())));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        partite.add(new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(2000, new ArrayList<>())));

        // Act
        stagione.setPartite(partite);
    }

    /**
     * Method under test: {@link Stagione#setPartite(List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetPartite4() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Partita.getSquadraCasa()" because "p" is null
        //       at org.example.Stagione.setPartite(Stagione.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(new ArrayList<>());

        ArrayList<Partita> partite = new ArrayList<>();

        assertThrows(NullValueException.class,
                () ->  partite.add(null));
    }

    /**
     * Method under test: {@link Stagione#toString()}
     */
    @Test
    void testToString() {
        // Arrange, Act and Assert
        assertEquals("Nessuna partita in questo stagione.\n", (new Stagione(2000, new ArrayList<>())).toString());
    }

    /**
     * Method under test: {@link Stagione#calcolaClassifica()}
     */
    @Test
    void testCalcolaClassifica() {
        // Arrange, Act and Assert
        assertTrue((new Stagione(2000, new ArrayList<>())).calcolaClassifica().isEmpty());
    }

    /**
     * Method under test: {@link Stagione#classificaMarcatori()}
     */
    @Test
    void testClassificaMarcatori() {
        // Arrange, Act and Assert
        assertTrue((new Stagione(2000, new ArrayList<>())).classificaMarcatori().isEmpty());
    }

    /**
     * Method under test: {@link Stagione#getGiocatoriSquadra(Squadra)}
     */
    @Test
    void testGetGiocatoriSquadra() {
        // Arrange
        Stagione stagione = new Stagione(2000, new ArrayList<>());
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        // Act and Assert
        assertNull(stagione.getGiocatoriSquadra(new Squadra("Nome Squadra", allenatore, new ArrayList<>())));
    }

    /**
     * Method under test: {@link Stagione#getGiocatoriSquadra(Squadra)}
     */
    @Test
    void testGetGiocatoriSquadra2() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione = new Stagione(2000, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act and Assert
        assertNull(stagione.getGiocatoriSquadra(null));
    }

    /**
     * Method under test: {@link Stagione#getGiocatoriSquadra(Squadra)}
     */
    @Test
    void testGetGiocatoriSquadra3() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione = new Stagione(2000, new ArrayList<>());
        stagione.setSquadre(squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        // Act and Assert
        assertNull(stagione.getGiocatoriSquadra(new Squadra("Nome Squadra", allenatore2, new ArrayList<>())));
    }

    /**
     * Method under test: {@link Stagione#getGiocatoriSquadra(Squadra)}
     */
    @Test
    void testGetGiocatoriSquadra4() {
        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        ArrayList<Giocatore> giocatori = new ArrayList<>();
        squadre.add(new Squadra("Nome Squadra", allenatore, giocatori));
        Stagione stagione = new Stagione(2000, squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        // Act
        List<Giocatore> actualGiocatoriSquadra = stagione
                .getGiocatoriSquadra(new Squadra("Nome Squadra", allenatore2, new ArrayList<>()));

        // Assert
        assertTrue(actualGiocatoriSquadra.isEmpty());
        assertSame(giocatori, actualGiocatoriSquadra);
    }

    /**
     * Method under test: {@link Stagione#getGiocatoriSquadra(Squadra)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGiocatoriSquadra5() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Squadra.getNomeSquadra()" because "squadra" is null
        //       at org.example.Stagione.getGiocatoriSquadra(Stagione.java:147)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(null);
        Stagione stagione = new Stagione(2000, squadre);
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        // Act
        stagione.getGiocatoriSquadra(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));
    }

    /**
     * Method under test: {@link Stagione#creaPartite()}
     */
    @Test
    void testCreaPartite() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        (new Stagione(2000, new ArrayList<>())).creaPartite();
    }

    /**
     * Method under test: {@link Stagione#creaPartite()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreaPartite2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ThreadDeath
        //       at org.example.Partita.getSquadraCasa(Partita.java:83)
        //       at org.example.Stagione.creaPartite(Stagione.java:221)
        //   com.diffblue.cover.agent.UnboundedLoopException: Cover agent detected a potentially unbounded loop executing at org.example.Partita#getSquadraCasa:83
        //       at org.example.Partita.getSquadraCasa(Partita.java:83)
        //       at org.example.Stagione.creaPartite(Stagione.java:221)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore2, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore3, new ArrayList<>()));
        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore4, new ArrayList<>()));
        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore5, new ArrayList<>()));
        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore6, new ArrayList<>()));
        Allenatore allenatore7 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore7, new ArrayList<>()));
        Allenatore allenatore8 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore8, new ArrayList<>()));
        Allenatore allenatore9 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore9, new ArrayList<>()));
        Allenatore allenatore10 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore10, new ArrayList<>()));
        Allenatore allenatore11 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore11, new ArrayList<>()));
        Allenatore allenatore12 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore12, new ArrayList<>()));
        Allenatore allenatore13 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore13, new ArrayList<>()));
        Allenatore allenatore14 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore14, new ArrayList<>()));
        Allenatore allenatore15 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore15, new ArrayList<>()));
        Allenatore allenatore16 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore16, new ArrayList<>()));
        Allenatore allenatore17 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore17, new ArrayList<>()));
        Allenatore allenatore18 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore18, new ArrayList<>()));
        Allenatore allenatore19 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore19, new ArrayList<>()));

        Stagione stagione = new Stagione(2000, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        stagione.creaPartite();
    }

    /**
     * Method under test: {@link Stagione#creaPartite()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreaPartite3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.time.DateTimeException: Invalid value for Year (valid values -999999999 - 999999999): -2147483648
        //       at java.base/java.time.temporal.ValueRange.checkValidValue(ValueRange.java:319)
        //       at java.base/java.time.temporal.ChronoField.checkValidValue(ChronoField.java:718)
        //       at java.base/java.time.LocalDate.of(LocalDate.java:270)
        //       at org.example.Stagione.creaPartite(Stagione.java:157)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new Stagione(Integer.MIN_VALUE, new ArrayList<>())).creaPartite();
    }

    /**
     * Method under test: {@link Stagione#creaPartite()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreaPartite4() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ThreadDeath
        //       at org.example.Stagione.creaPartite(Stagione.java:229)
        //   com.diffblue.cover.agent.UnboundedLoopException: Cover agent detected a potentially unbounded loop executing at org.example.Stagione#creaPartite:229
        //       at org.example.Stagione.creaPartite(Stagione.java:229)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));

        ArrayList<Squadra> squadre2 = new ArrayList<>();
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore2, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore3, new ArrayList<>()));
        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore4, new ArrayList<>()));
        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore5, new ArrayList<>()));
        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore6, new ArrayList<>()));
        Allenatore allenatore7 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore7, new ArrayList<>()));
        Allenatore allenatore8 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore8, new ArrayList<>()));
        Allenatore allenatore9 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore9, new ArrayList<>()));
        Allenatore allenatore10 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore10, new ArrayList<>()));
        Allenatore allenatore11 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore11, new ArrayList<>()));
        Allenatore allenatore12 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore12, new ArrayList<>()));
        Allenatore allenatore13 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore13, new ArrayList<>()));
        Allenatore allenatore14 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore14, new ArrayList<>()));
        Allenatore allenatore15 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore15, new ArrayList<>()));
        Allenatore allenatore16 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore16, new ArrayList<>()));
        Allenatore allenatore17 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore17, new ArrayList<>()));
        Allenatore allenatore18 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore18, new ArrayList<>()));
        Allenatore allenatore19 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore19, new ArrayList<>()));
        Allenatore allenatore20 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore20, new ArrayList<>()));

        Stagione stagione = new Stagione(1, squadre);
        stagione.setSquadre(squadre2);

        // Act
        stagione.creaPartite();
    }

    /**
     * Method under test: {@link Stagione#creaPartite()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreaPartite5() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ThreadDeath
        //       at org.example.Partita.getSquadraOspite(Partita.java:93)
        //       at org.example.Stagione.creaPartite(Stagione.java:222)
        //   com.diffblue.cover.agent.UnboundedLoopException: Cover agent detected a potentially unbounded loop executing at org.example.Partita#getSquadraOspite:93
        //       at org.example.Partita.getSquadraOspite(Partita.java:93)
        //       at org.example.Stagione.creaPartite(Stagione.java:222)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore2, new ArrayList<>()));

        ArrayList<Squadra> squadre2 = new ArrayList<>();
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore3, new ArrayList<>()));
        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore4, new ArrayList<>()));
        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore5, new ArrayList<>()));
        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore6, new ArrayList<>()));
        Allenatore allenatore7 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore7, new ArrayList<>()));
        Allenatore allenatore8 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore8, new ArrayList<>()));
        Allenatore allenatore9 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore9, new ArrayList<>()));
        Allenatore allenatore10 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore10, new ArrayList<>()));
        Allenatore allenatore11 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore11, new ArrayList<>()));
        Allenatore allenatore12 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore12, new ArrayList<>()));
        Allenatore allenatore13 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore13, new ArrayList<>()));
        Allenatore allenatore14 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore14, new ArrayList<>()));
        Allenatore allenatore15 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore15, new ArrayList<>()));
        Allenatore allenatore16 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore16, new ArrayList<>()));
        Allenatore allenatore17 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore17, new ArrayList<>()));
        Allenatore allenatore18 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore18, new ArrayList<>()));
        Allenatore allenatore19 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore19, new ArrayList<>()));
        Allenatore allenatore20 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore20, new ArrayList<>()));
        Allenatore allenatore21 = new Allenatore("Nome", "Cognome");

        squadre2.add(new Squadra("Nome Squadra", allenatore21, new ArrayList<>()));

        Stagione stagione = new Stagione(1, squadre);
        stagione.setSquadre(squadre2);

        // Act
        stagione.creaPartite();
    }

    /**
     * Method under test: {@link Stagione#creaPartite()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreaPartite6() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ThreadDeath
        //       at org.example.Partita.setSquadraOspite(Partita.java:100)
        //       at org.example.Partita.<init>(Partita.java:18)
        //       at org.example.Stagione.creaPartite(Stagione.java:211)
        //   com.diffblue.cover.agent.UnboundedLoopException: Cover agent detected a potentially unbounded loop executing at org.example.Partita#setSquadraOspite:100
        //       at org.example.Partita.setSquadraOspite(Partita.java:100)
        //       at org.example.Partita.<init>(Partita.java:18)
        //       at org.example.Stagione.creaPartite(Stagione.java:211)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore2, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore3, new ArrayList<>()));
        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore4, new ArrayList<>()));
        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore5, new ArrayList<>()));
        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore6, new ArrayList<>()));
        Allenatore allenatore7 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore7, new ArrayList<>()));
        Allenatore allenatore8 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore8, new ArrayList<>()));
        Allenatore allenatore9 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore9, new ArrayList<>()));
        Allenatore allenatore10 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore10, new ArrayList<>()));
        Allenatore allenatore11 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore11, new ArrayList<>()));
        Allenatore allenatore12 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore12, new ArrayList<>()));
        Allenatore allenatore13 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore13, new ArrayList<>()));
        Allenatore allenatore14 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore14, new ArrayList<>()));
        Allenatore allenatore15 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore15, new ArrayList<>()));
        Allenatore allenatore16 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore16, new ArrayList<>()));
        Allenatore allenatore17 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore17, new ArrayList<>()));
        Allenatore allenatore18 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore18, new ArrayList<>()));
        Allenatore allenatore19 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore19, new ArrayList<>()));
        Allenatore allenatore20 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore20, new ArrayList<>()));

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        stagione.creaPartite();
    }

    /**
     * Method under test: {@link Stagione#creaPartite()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreaPartite7() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ThreadDeath
        //       at org.example.Stagione.creaPartite(Stagione.java:195)
        //   com.diffblue.cover.agent.UnboundedLoopException: Cover agent detected a potentially unbounded loop executing at org.example.Stagione#creaPartite:195
        //       at org.example.Stagione.creaPartite(Stagione.java:195)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore2, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore3, new ArrayList<>()));
        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore4, new ArrayList<>()));
        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore5, new ArrayList<>()));
        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore6, new ArrayList<>()));
        Allenatore allenatore7 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore7, new ArrayList<>()));
        Allenatore allenatore8 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore8, new ArrayList<>()));
        Allenatore allenatore9 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore9, new ArrayList<>()));
        Allenatore allenatore10 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore10, new ArrayList<>()));
        Allenatore allenatore11 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore11, new ArrayList<>()));
        Allenatore allenatore12 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore12, new ArrayList<>()));
        Allenatore allenatore13 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore13, new ArrayList<>()));
        Allenatore allenatore14 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore14, new ArrayList<>()));
        Allenatore allenatore15 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore15, new ArrayList<>()));
        Allenatore allenatore16 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore16, new ArrayList<>()));
        Allenatore allenatore17 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore17, new ArrayList<>()));
        Allenatore allenatore18 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore18, new ArrayList<>()));
        Allenatore allenatore19 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore19, new ArrayList<>()));
        Allenatore allenatore20 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore20, new ArrayList<>()));
        Allenatore allenatore21 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore21, new ArrayList<>()));

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        stagione.creaPartite();
    }

    /**
     * Method under test: {@link Stagione#creaPartite()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreaPartite8() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ThreadDeath
        //       at org.example.Stagione.creaPartite(Stagione.java:189)
        //   com.diffblue.cover.agent.UnboundedLoopException: Cover agent detected a potentially unbounded loop executing at org.example.Stagione#creaPartite:189
        //       at org.example.Stagione.creaPartite(Stagione.java:189)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore2, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore3, new ArrayList<>()));
        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore4, new ArrayList<>()));
        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore5, new ArrayList<>()));
        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore6, new ArrayList<>()));
        Allenatore allenatore7 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore7, new ArrayList<>()));
        Allenatore allenatore8 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore8, new ArrayList<>()));
        Allenatore allenatore9 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore9, new ArrayList<>()));
        Allenatore allenatore10 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore10, new ArrayList<>()));
        Allenatore allenatore11 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore11, new ArrayList<>()));
        Allenatore allenatore12 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore12, new ArrayList<>()));
        Allenatore allenatore13 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore13, new ArrayList<>()));
        Allenatore allenatore14 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore14, new ArrayList<>()));
        Allenatore allenatore15 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore15, new ArrayList<>()));
        Allenatore allenatore16 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore16, new ArrayList<>()));
        Allenatore allenatore17 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore17, new ArrayList<>()));
        Allenatore allenatore18 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore18, new ArrayList<>()));
        Allenatore allenatore19 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore19, new ArrayList<>()));
        Allenatore allenatore20 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore20, new ArrayList<>()));
        Allenatore allenatore21 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore21, new ArrayList<>()));
        Allenatore allenatore22 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore22, new ArrayList<>()));

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        stagione.creaPartite();
    }

    /**
     * Method under test: {@link Stagione#creaPartite()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreaPartite9() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ThreadDeath
        //       at org.example.Partita.getSquadraOspite(Partita.java:93)
        //       at org.example.Stagione.creaPartite(Stagione.java:181)
        //   com.diffblue.cover.agent.UnboundedLoopException: Cover agent detected a potentially unbounded loop executing at org.example.Partita#getSquadraOspite:93
        //       at org.example.Partita.getSquadraOspite(Partita.java:93)
        //       at org.example.Stagione.creaPartite(Stagione.java:181)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore2, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore3, new ArrayList<>()));
        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore4, new ArrayList<>()));
        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore5, new ArrayList<>()));
        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore6, new ArrayList<>()));
        Allenatore allenatore7 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore7, new ArrayList<>()));
        Allenatore allenatore8 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore8, new ArrayList<>()));
        Allenatore allenatore9 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore9, new ArrayList<>()));
        Allenatore allenatore10 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore10, new ArrayList<>()));
        Allenatore allenatore11 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore11, new ArrayList<>()));
        Allenatore allenatore12 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore12, new ArrayList<>()));
        Allenatore allenatore13 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore13, new ArrayList<>()));
        Allenatore allenatore14 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore14, new ArrayList<>()));
        Allenatore allenatore15 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore15, new ArrayList<>()));
        Allenatore allenatore16 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore16, new ArrayList<>()));
        Allenatore allenatore17 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore17, new ArrayList<>()));
        Allenatore allenatore18 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore18, new ArrayList<>()));
        Allenatore allenatore19 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore19, new ArrayList<>()));
        Allenatore allenatore20 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore20, new ArrayList<>()));
        Allenatore allenatore21 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore21, new ArrayList<>()));
        Allenatore allenatore22 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore22, new ArrayList<>()));
        Allenatore allenatore23 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore23, new ArrayList<>()));

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        stagione.creaPartite();
    }

    /**
     * Method under test: {@link Stagione#creaPartite()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreaPartite10() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Squadra cannot be null
        //       at org.example.Partita.setSquadraCasa(Partita.java:89)
        //       at org.example.Partita.<init>(Partita.java:17)
        //       at org.example.Stagione.creaPartite(Stagione.java:169)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(null);
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore2, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore3, new ArrayList<>()));
        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore4, new ArrayList<>()));
        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore5, new ArrayList<>()));
        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore6, new ArrayList<>()));
        Allenatore allenatore7 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore7, new ArrayList<>()));
        Allenatore allenatore8 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore8, new ArrayList<>()));
        Allenatore allenatore9 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore9, new ArrayList<>()));
        Allenatore allenatore10 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore10, new ArrayList<>()));
        Allenatore allenatore11 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore11, new ArrayList<>()));
        Allenatore allenatore12 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore12, new ArrayList<>()));
        Allenatore allenatore13 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore13, new ArrayList<>()));
        Allenatore allenatore14 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore14, new ArrayList<>()));
        Allenatore allenatore15 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore15, new ArrayList<>()));
        Allenatore allenatore16 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore16, new ArrayList<>()));
        Allenatore allenatore17 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore17, new ArrayList<>()));
        Allenatore allenatore18 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore18, new ArrayList<>()));

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        stagione.creaPartite();
    }

    /**
     * Method under test: {@link Stagione#creaPartite()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCreaPartite11() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Squadra cannot be null
        //       at org.example.Partita.setSquadraOspite(Partita.java:99)
        //       at org.example.Partita.<init>(Partita.java:18)
        //       at org.example.Stagione.creaPartite(Stagione.java:169)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));
        squadre.add(null);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore2, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore3, new ArrayList<>()));
        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore4, new ArrayList<>()));
        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore5, new ArrayList<>()));
        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore6, new ArrayList<>()));
        Allenatore allenatore7 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore7, new ArrayList<>()));
        Allenatore allenatore8 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore8, new ArrayList<>()));
        Allenatore allenatore9 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore9, new ArrayList<>()));
        Allenatore allenatore10 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore10, new ArrayList<>()));
        Allenatore allenatore11 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore11, new ArrayList<>()));
        Allenatore allenatore12 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore12, new ArrayList<>()));
        Allenatore allenatore13 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore13, new ArrayList<>()));
        Allenatore allenatore14 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore14, new ArrayList<>()));
        Allenatore allenatore15 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore15, new ArrayList<>()));
        Allenatore allenatore16 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore16, new ArrayList<>()));
        Allenatore allenatore17 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore17, new ArrayList<>()));
        Allenatore allenatore18 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore18, new ArrayList<>()));

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        stagione.creaPartite();
    }

    /**
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    void testAggiungiRisultato() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Stagione stagione = new Stagione(2000, new ArrayList<>());
        Risultato risultato = new Risultato(1, 1);

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita p = new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>()));

        ArrayList<Gol> g1 = new ArrayList<>();

        // Act
        stagione.aggiungiRisultato(risultato, p, g1, new ArrayList<>());
    }

    /**
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    void testAggiungiRisultato2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Stagione stagione = new Stagione(2000, new ArrayList<>());
        Risultato risultato = new Risultato(0, 1);

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita p = new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>()));

        ArrayList<Gol> g1 = new ArrayList<>();

        // Act
        stagione.aggiungiRisultato(risultato, p, g1, new ArrayList<>());
    }

    /**
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    void testAggiungiRisultato3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Stagione stagione = new Stagione(2000, new ArrayList<>());
        Risultato risultato = new Risultato(1, 1);

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");
        squadra.setGiocatori(new ArrayList<>());

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione2 = new Stagione(2000, new ArrayList<>());
        stagione2.setSquadre(squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Partita p = new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>()));
        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        p.setSquadraOspite(new Squadra("Nome Squadra", allenatore4, new ArrayList<>()));
        p.setStagione(stagione2);
        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        p.setSquadraCasa(new Squadra("Nome Squadra", allenatore5, new ArrayList<>()));
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore6, new ArrayList<>());

        Allenatore allenatore7 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore7, new ArrayList<>());

        Gol gol = new Gol(giocatore, new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(2000, new ArrayList<>())));
        gol.setGiocatore(new Giocatore("Nome", "Cognome", "Ruolo"));

        ArrayList<Gol> g1 = new ArrayList<>();
        g1.add(gol);
        Giocatore giocatore2 = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore8 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa3 = new Squadra("Nome Squadra", allenatore8, new ArrayList<>());

        Allenatore allenatore9 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite3 = new Squadra("Nome Squadra", allenatore9, new ArrayList<>());

        Gol gol2 = new Gol(giocatore2,
                new Partita("Data", squadraCasa3, squadraOspite3, new Stagione(2000, new ArrayList<>())));
        gol2.setGiocatore(new Giocatore("Nome", "Cognome", "Ruolo"));

        ArrayList<Gol> g2 = new ArrayList<>();
        g2.add(gol2);

        // Act
        stagione.aggiungiRisultato(risultato, p, g1, g2);
    }

    /**
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    void testAggiungiRisultato4() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Risultato cannot be null
        //       at org.example.Partita.setRisultato(Partita.java:59)
        //       at org.example.Stagione.aggiungiRisultato(Stagione.java:246)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Stagione stagione = new Stagione(2000, new ArrayList<>());
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");
        squadra.setGiocatori(new ArrayList<>());

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione2 = new Stagione(2000, new ArrayList<>());
        stagione2.setSquadre(squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Partita p = new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>()));
        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        p.setSquadraOspite(new Squadra("Nome Squadra", allenatore4, new ArrayList<>()));
        p.setStagione(stagione2);
        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        p.setSquadraCasa(new Squadra("Nome Squadra", allenatore5, new ArrayList<>()));
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore6, new ArrayList<>());

        Allenatore allenatore7 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore7, new ArrayList<>());

        Gol gol = new Gol(giocatore, new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(2000, new ArrayList<>())));
        gol.setGiocatore(new Giocatore("Nome", "Cognome", "Ruolo"));

        ArrayList<Gol> g1 = new ArrayList<>();
        g1.add(gol);
        Giocatore giocatore2 = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore8 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa3 = new Squadra("Nome Squadra", allenatore8, new ArrayList<>());

        Allenatore allenatore9 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite3 = new Squadra("Nome Squadra", allenatore9, new ArrayList<>());

        Gol gol2 = new Gol(giocatore2,
                new Partita("Data", squadraCasa3, squadraOspite3, new Stagione(2000, new ArrayList<>())));
        gol2.setGiocatore(new Giocatore("Nome", "Cognome", "Ruolo"));

        ArrayList<Gol> g2 = new ArrayList<>();
        g2.add(gol2);

        // Act


        // Act and Assert
        assertThrows(NullValueException.class,
                () -> stagione.aggiungiRisultato(null, p, g1, g2));
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Stagione#setAnno(int)}
     *   <li>{@link Stagione#setSquadre(List)}
     *   <li>{@link Stagione#getAnno()}
     *   <li>{@link Stagione#getPartite()}
     *   <li>{@link Stagione#getSquadre()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        Stagione stagione = new Stagione(2000, new ArrayList<>());

        // Act
        stagione.setAnno(2000);
        ArrayList<Squadra> squadre = new ArrayList<>();
        stagione.setSquadre(squadre);
        int actualAnno = stagione.getAnno();
        List<Partita> actualPartite = stagione.getPartite();
        List<Squadra> actualSquadre = stagione.getSquadre();

        // Assert that nothing has changed
        assertEquals(2000, actualAnno);
        assertTrue(actualPartite.isEmpty());
        assertTrue(actualSquadre.isEmpty());
        assertSame(squadre, actualSquadre);
    }

    /**
     * Method under test: {@link Stagione#Stagione(int, List)}
     */
    @Test
    void testNewStagione() {
        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();

        // Act
        Stagione actualStagione = new Stagione(2000, squadre);

        // Assert
        assertEquals(2000, actualStagione.getAnno());
        assertTrue(actualStagione.getPartite().isEmpty());
        List<Squadra> squadre2 = actualStagione.getSquadre();
        assertTrue(squadre2.isEmpty());
        assertSame(squadre, squadre2);
    }

    /**
     * Method under test: {@link Stagione#Stagione(int, List)}
     */
    @Test
    void testNewStagione2() {
        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));

        // Act
        Stagione actualStagione = new Stagione(2000, squadre);

        // Assert
        assertEquals(2000, actualStagione.getAnno());
        assertTrue(actualStagione.getPartite().isEmpty());
        assertSame(squadre, actualStagione.getSquadre());
    }

    /**
     * Method under test: {@link Stagione#Stagione(int, List)}
     */
    @Test
    void testNewStagione3() {
        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore2, new ArrayList<>()));

        // Act
        Stagione actualStagione = new Stagione(2000, squadre);

        // Assert
        assertEquals(2000, actualStagione.getAnno());
        assertTrue(actualStagione.getPartite().isEmpty());
        assertSame(squadre, actualStagione.getSquadre());
    }
}
