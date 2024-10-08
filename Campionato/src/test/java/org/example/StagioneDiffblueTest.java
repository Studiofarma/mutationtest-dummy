package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

class StagioneDiffblueTest {
    /**
     * Method under test: {@link Stagione#aggiungiPartita(Partita)}
     */
    @Test
    void testAggiungiPartita() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act
        stagione.aggiungiPartita(new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>())));
    }

    /**
     * Method under test: {@link Stagione#aggiungiPartita(Partita)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAggiungiPartita2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Squadra.getNomeSquadra()" because the return value of "org.example.Partita.getSquadraCasa()" is null
        //       at org.example.Stagione.aggiungiPartita(Stagione.java:21)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        // Act
        stagione.aggiungiPartita(new Partita("Data", null, squadraOspite, new Stagione(1, new ArrayList<>())));
    }

    /**
     * Method under test: {@link Stagione#aggiungiPartita(Partita)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAggiungiPartita3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Squadra.getNomeSquadra()" because the return value of "org.example.Partita.getSquadraOspite()" is null
        //       at org.example.Stagione.aggiungiPartita(Stagione.java:25)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        // Act
        stagione.aggiungiPartita(new Partita("Data", squadraCasa, null, new Stagione(1, new ArrayList<>())));
    }

    /**
     * Method under test: {@link Stagione#aggiungiPartita(Partita)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAggiungiPartita4() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Partita.getSquadraCasa()" because "partita" is null
        //       at org.example.Stagione.aggiungiPartita(Stagione.java:20)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new Stagione(1, new ArrayList<>())).aggiungiPartita(null);
    }

    /**
     * Method under test: {@link Stagione#setPartite(List)}
     */
    @Test
    void testSetPartite() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());

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
        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(new ArrayList<>());

        ArrayList<Partita> partite = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        partite.add(new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>())));

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
        Stagione stagione = new Stagione(1, new ArrayList<>());

        ArrayList<Partita> partite = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        partite.add(new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>())));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        partite.add(new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(1, new ArrayList<>())));

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
        //   java.lang.NullPointerException: Cannot invoke "org.example.Squadra.getNomeSquadra()" because the return value of "org.example.Partita.getSquadraCasa()" is null
        //       at org.example.Stagione.setPartite(Stagione.java:49)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(new ArrayList<>());

        ArrayList<Partita> partite = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        partite.add(new Partita("Data", null, squadraOspite, new Stagione(1, new ArrayList<>())));

        // Act
        stagione.setPartite(partite);
    }

    /**
     * Method under test: {@link Stagione#setPartite(List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetPartite5() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Squadra.getNomeSquadra()" because the return value of "org.example.Partita.getSquadraOspite()" is null
        //       at org.example.Stagione.setPartite(Stagione.java:53)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(new ArrayList<>());

        ArrayList<Partita> partite = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        partite.add(new Partita("Data", squadraCasa, null, new Stagione(1, new ArrayList<>())));

        // Act
        stagione.setPartite(partite);
    }

    /**
     * Method under test: {@link Stagione#setPartite(List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetPartite6() {
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
        partite.add(null);

        // Act
        stagione.setPartite(partite);
    }

    /**
     * Method under test: {@link Stagione#toString()}
     */
    @Test
    void testToString() {
        // Arrange, Act and Assert
        assertEquals("Nessuna partita in questo stagione.\n", (new Stagione(1, new ArrayList<>())).toString());
    }

    /**
     * Method under test: {@link Stagione#calcolaClassifica()}
     */
    @Test
    void testCalcolaClassifica() {
        // Arrange, Act and Assert
        assertTrue((new Stagione(1, new ArrayList<>())).calcolaClassifica().isEmpty());
    }

    /**
     * Method under test: {@link Stagione#classificaMarcatori()}
     */
    @Test
    void testClassificaMarcatori() {
        // Arrange, Act and Assert
        assertTrue((new Stagione(1, new ArrayList<>())).classificaMarcatori().isEmpty());
    }

    /**
     * Method under test: {@link Stagione#getGiocatoriSquadra(Squadra)}
     */
    @Test
    void testGetGiocatoriSquadra() {
        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
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

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        // Act and Assert
        assertNull(stagione.getGiocatoriSquadra(new Squadra("Nome Squadra", allenatore2, new ArrayList<>())));
    }

    /**
     * Method under test: {@link Stagione#getGiocatoriSquadra(Squadra)}
     */
    @Test
    void testGetGiocatoriSquadra3() {
        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        ArrayList<Giocatore> giocatori = new ArrayList<>();
        squadre.add(new Squadra("Nome Squadra", allenatore, giocatori));
        Stagione stagione = new Stagione(1, squadre);
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
    void testGetGiocatoriSquadra4() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Squadra.getNomeSquadra()" because "s" is null
        //       at org.example.Stagione.getGiocatoriSquadra(Stagione.java:149)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new Stagione(1, new ArrayList<>())).getGiocatoriSquadra(null);
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
        //       at org.example.Stagione.getGiocatoriSquadra(Stagione.java:145)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(null);
        Stagione stagione = new Stagione(1, squadre);
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        // Act
        stagione.getGiocatoriSquadra(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));
    }

    /**
     * Method under test: {@link Stagione#getGiocatoriSquadra(Squadra)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGiocatoriSquadra6() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Squadra.getNomeSquadra()" because "s" is null
        //       at org.example.Stagione.getGiocatoriSquadra(Stagione.java:145)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));

        // Act
        (new Stagione(1, squadre)).getGiocatoriSquadra(null);
    }

    /**
     * Method under test: {@link Stagione#creaPartite()}
     */
    @Test
    void testCreaPartite() {
        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());

        // Act
        stagione.creaPartite();

        // Assert
        assertTrue(stagione.getPartite().isEmpty());
    }

    /**
     * Method under test: {@link Stagione#creaPartite()}
     */
    @Test
    void testCreaPartite2() {
        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));
        Stagione stagione = new Stagione(1, squadre);

        // Act
        stagione.creaPartite();

        // Assert
        assertTrue(stagione.getPartite().isEmpty());
    }

    /**
     * Method under test: {@link Stagione#creaPartite()}
     */
    @Test
    void testCreaPartite3() {
        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        squadre.add(squadra);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadra2 = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        squadre.add(squadra2);
        Stagione stagione = new Stagione(1, squadre);

        // Act
        stagione.creaPartite();

        // Assert
        List<Partita> partite = stagione.getPartite();
        assertEquals(2, partite.size());
        Partita getResult = partite.get(0);
        assertEquals("0001-09-01", getResult.getData());
        Partita getResult2 = partite.get(1);
        assertEquals("0001-09-08", getResult2.getData());
        assertNull(getResult.getRisultato());
        assertNull(getResult2.getRisultato());
        assertTrue(getResult.getGolPartita().isEmpty());
        assertTrue(getResult2.getGolPartita().isEmpty());
        assertSame(squadra, getResult.getSquadraCasa());
        assertSame(squadra2, getResult2.getSquadraCasa());
        assertSame(squadra2, getResult.getSquadraOspite());
        assertSame(squadra, getResult2.getSquadraOspite());
        assertSame(stagione, getResult.getStagione());
        assertSame(stagione, getResult2.getStagione());
    }

    /**
     * Method under test: {@link Stagione#creaPartite()}
     */
    @Test
    void testCreaPartite4() {
        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        squadre.add(squadra);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadra2 = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        squadre.add(squadra2);
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra3 = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        squadre.add(squadra3);
        Stagione stagione = new Stagione(1, squadre);

        // Act
        stagione.creaPartite();

        // Assert
        List<Partita> partite = stagione.getPartite();
        assertEquals(6, partite.size());
        Partita getResult = partite.get(0);
        assertEquals("0001-09-01", getResult.getData());
        Partita getResult2 = partite.get(1);
        assertEquals("0001-09-08", getResult2.getData());
        Partita getResult3 = partite.get(2);
        assertEquals("0001-09-15", getResult3.getData());
        Partita getResult4 = partite.get(3);
        assertEquals("0001-09-22", getResult4.getData());
        Partita getResult5 = partite.get(4);
        assertEquals("0001-09-29", getResult5.getData());
        Partita getResult6 = partite.get(5);
        assertEquals("0001-10-06", getResult6.getData());
        assertNull(getResult.getRisultato());
        assertNull(getResult2.getRisultato());
        assertNull(getResult3.getRisultato());
        assertNull(getResult4.getRisultato());
        assertNull(getResult5.getRisultato());
        assertNull(getResult6.getRisultato());
        assertTrue(getResult.getGolPartita().isEmpty());
        assertTrue(getResult2.getGolPartita().isEmpty());
        assertTrue(getResult3.getGolPartita().isEmpty());
        assertTrue(getResult4.getGolPartita().isEmpty());
        assertTrue(getResult5.getGolPartita().isEmpty());
        assertTrue(getResult6.getGolPartita().isEmpty());
        assertSame(squadra, getResult.getSquadraCasa());
        assertSame(squadra, getResult2.getSquadraCasa());
        assertSame(squadra2, getResult3.getSquadraCasa());
        assertSame(squadra2, getResult4.getSquadraCasa());
        assertSame(squadra3, getResult5.getSquadraCasa());
        assertSame(squadra3, getResult6.getSquadraCasa());
        assertSame(squadra2, getResult.getSquadraOspite());
        assertSame(squadra3, getResult2.getSquadraOspite());
        assertSame(squadra3, getResult3.getSquadraOspite());
        assertSame(squadra, getResult4.getSquadraOspite());
        assertSame(squadra, getResult5.getSquadraOspite());
        assertSame(squadra2, getResult6.getSquadraOspite());
        assertSame(stagione, getResult.getStagione());
        assertSame(stagione, getResult2.getStagione());
        assertSame(stagione, getResult3.getStagione());
        assertSame(stagione, getResult4.getStagione());
        assertSame(stagione, getResult5.getStagione());
        assertSame(stagione, getResult6.getStagione());
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
        //       at org.example.Partita.getData(Partita.java:70)
        //       at org.example.Partita.equals(Partita.java:131)
        //       at java.base/java.util.ArrayList.indexOfRange(ArrayList.java:299)
        //       at java.base/java.util.ArrayList.indexOf(ArrayList.java:286)
        //       at java.base/java.util.ArrayList.contains(ArrayList.java:275)
        //       at java.base/java.util.ArrayList.batchRemove(ArrayList.java:829)
        //       at java.base/java.util.ArrayList.removeAll(ArrayList.java:791)
        //       at org.example.Stagione.creaPartite(Stagione.java:196)
        //   com.diffblue.cover.agent.UnboundedLoopException: Cover agent detected a potentially unbounded loop executing at org.example.Partita#getData:70
        //       at org.example.Partita.getData(Partita.java:70)
        //       at org.example.Partita.equals(Partita.java:131)
        //       at java.base/java.util.ArrayList.indexOfRange(ArrayList.java:299)
        //       at java.base/java.util.ArrayList.indexOf(ArrayList.java:286)
        //       at java.base/java.util.ArrayList.contains(ArrayList.java:275)
        //       at java.base/java.util.ArrayList.batchRemove(ArrayList.java:829)
        //       at java.base/java.util.ArrayList.removeAll(ArrayList.java:791)
        //       at org.example.Stagione.creaPartite(Stagione.java:196)
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
    void testCreaPartite6() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.time.DateTimeException: Invalid value for Year (valid values -999999999 - 999999999): -2147483648
        //       at java.base/java.time.temporal.ValueRange.checkValidValue(ValueRange.java:319)
        //       at java.base/java.time.temporal.ChronoField.checkValidValue(ChronoField.java:718)
        //       at java.base/java.time.LocalDate.of(LocalDate.java:270)
        //       at org.example.Stagione.creaPartite(Stagione.java:155)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new Stagione(Integer.MIN_VALUE, new ArrayList<>())).creaPartite();
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
        //       at org.example.Partita.getData(Partita.java:70)
        //       at org.example.Partita.equals(Partita.java:131)
        //       at java.base/java.util.ArrayList.indexOfRange(ArrayList.java:299)
        //       at java.base/java.util.ArrayList.indexOf(ArrayList.java:286)
        //       at java.base/java.util.ArrayList.contains(ArrayList.java:275)
        //       at java.base/java.util.ArrayList.batchRemove(ArrayList.java:829)
        //       at java.base/java.util.ArrayList.removeAll(ArrayList.java:791)
        //       at org.example.Stagione.creaPartite(Stagione.java:196)
        //   com.diffblue.cover.agent.UnboundedLoopException: Cover agent detected a potentially unbounded loop executing at org.example.Partita#getData:70
        //       at org.example.Partita.getData(Partita.java:70)
        //       at org.example.Partita.equals(Partita.java:131)
        //       at java.base/java.util.ArrayList.indexOfRange(ArrayList.java:299)
        //       at java.base/java.util.ArrayList.indexOf(ArrayList.java:286)
        //       at java.base/java.util.ArrayList.contains(ArrayList.java:275)
        //       at java.base/java.util.ArrayList.batchRemove(ArrayList.java:829)
        //       at java.base/java.util.ArrayList.removeAll(ArrayList.java:791)
        //       at org.example.Stagione.creaPartite(Stagione.java:196)
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
    void testCreaPartite8() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ThreadDeath
        //       at org.example.Partita.equals(Partita.java:131)
        //       at java.base/java.util.ArrayList.indexOfRange(ArrayList.java:299)
        //       at java.base/java.util.ArrayList.indexOf(ArrayList.java:286)
        //       at java.base/java.util.ArrayList.contains(ArrayList.java:275)
        //       at java.base/java.util.ArrayList.batchRemove(ArrayList.java:829)
        //       at java.base/java.util.ArrayList.removeAll(ArrayList.java:791)
        //       at org.example.Stagione.creaPartite(Stagione.java:196)
        //   com.diffblue.cover.agent.UnboundedLoopException: Cover agent detected a potentially unbounded loop executing at org.example.Partita#equals:131
        //       at org.example.Partita.equals(Partita.java:131)
        //       at java.base/java.util.ArrayList.indexOfRange(ArrayList.java:299)
        //       at java.base/java.util.ArrayList.indexOf(ArrayList.java:286)
        //       at java.base/java.util.ArrayList.contains(ArrayList.java:275)
        //       at java.base/java.util.ArrayList.batchRemove(ArrayList.java:829)
        //       at java.base/java.util.ArrayList.removeAll(ArrayList.java:791)
        //       at org.example.Stagione.creaPartite(Stagione.java:196)
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
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    void testAggiungiRisultato() {
        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        Risultato risultato = new Risultato(1, 1);

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita p = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));

        ArrayList<Gol> g1 = new ArrayList<>();

        // Act
        stagione.aggiungiRisultato(risultato, p, g1, new ArrayList<>());

        // Assert
        assertNull(p.getRisultato());
    }

    /**
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    void testAggiungiRisultato2() {
        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        Risultato risultato = new Risultato(1, 1);

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");
        squadra.setGiocatori(null);

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione2 = new Stagione(1, new ArrayList<>());
        stagione2.setSquadre(squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Partita p = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        p.setStagione(stagione2);

        ArrayList<Gol> g1 = new ArrayList<>();
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore5, new ArrayList<>());

        g1.add(new Gol(giocatore, new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(1, new ArrayList<>()))));

        ArrayList<Gol> g2 = new ArrayList<>();
        Giocatore giocatore2 = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa3 = new Squadra("Nome Squadra", allenatore6, new ArrayList<>());

        Allenatore allenatore7 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite3 = new Squadra("Nome Squadra", allenatore7, new ArrayList<>());

        g2.add(new Gol(giocatore2, new Partita("Data", squadraCasa3, squadraOspite3, new Stagione(1, new ArrayList<>()))));

        // Act
        stagione.aggiungiRisultato(risultato, p, g1, g2);

        // Assert
        assertNull(p.getRisultato());
    }

    /**
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    void testAggiungiRisultato3() {
        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        Risultato risultato = new Risultato(0, 1);

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita p = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));

        ArrayList<Gol> g1 = new ArrayList<>();

        // Act
        stagione.aggiungiRisultato(risultato, p, g1, new ArrayList<>());

        // Assert
        assertNull(p.getRisultato());
    }

    /**
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    void testAggiungiRisultato4() {
        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        Risultato risultato = new Risultato(0, 0);

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita p = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));

        ArrayList<Gol> g1 = new ArrayList<>();

        // Act
        stagione.aggiungiRisultato(risultato, p, g1, new ArrayList<>());

        // Assert
        assertSame(risultato, p.getRisultato());
    }

    /**
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    void testAggiungiRisultato5() {
        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        Risultato risultato = new Risultato(1, 1);

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");
        squadra.setGiocatori(null);

        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore2 = new Allenatore("Errore! Il risultato e i marcatori non corrispondono",
                "Errore! Il risultato e i marcatori non corrispondono");

        squadre.add(new Squadra("Nome Squadra", allenatore2, new ArrayList<>()));
        squadre.add(squadra);

        Stagione stagione2 = new Stagione(1, new ArrayList<>());
        stagione2.setSquadre(squadre);
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        Partita p = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        p.setStagione(stagione2);

        ArrayList<Gol> g1 = new ArrayList<>();
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore5, new ArrayList<>());

        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore6, new ArrayList<>());

        g1.add(new Gol(giocatore, new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(1, new ArrayList<>()))));

        ArrayList<Gol> g2 = new ArrayList<>();
        Giocatore giocatore2 = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore7 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa3 = new Squadra("Nome Squadra", allenatore7, new ArrayList<>());

        Allenatore allenatore8 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite3 = new Squadra("Nome Squadra", allenatore8, new ArrayList<>());

        g2.add(new Gol(giocatore2, new Partita("Data", squadraCasa3, squadraOspite3, new Stagione(1, new ArrayList<>()))));

        // Act
        stagione.aggiungiRisultato(risultato, p, g1, g2);

        // Assert
        assertNull(p.getRisultato());
    }

    /**
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAggiungiRisultato6() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Risultato.getGoal1()" because "risultato" is null
        //       at org.example.Partita.setRisultato(Partita.java:29)
        //       at org.example.Stagione.aggiungiRisultato(Stagione.java:244)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita p = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));

        ArrayList<Gol> g1 = new ArrayList<>();

        // Act
        stagione.aggiungiRisultato(null, p, g1, new ArrayList<>());
    }

    /**
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAggiungiRisultato7() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Squadra.getNomeSquadra()" because "s" is null
        //       at org.example.Stagione.getGiocatoriSquadra(Stagione.java:145)
        //       at org.example.Partita.squadraContieneGiocatore(Partita.java:61)
        //       at org.example.Partita.setRisultato(Partita.java:35)
        //       at org.example.Stagione.aggiungiRisultato(Stagione.java:244)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        Risultato risultato = new Risultato(1, 1);

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");
        squadra.setGiocatori(null);

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione2 = new Stagione(1, new ArrayList<>());
        stagione2.setSquadre(squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita p = new Partita("Data", null, squadraOspite, new Stagione(1, new ArrayList<>()));
        p.setStagione(stagione2);

        ArrayList<Gol> g1 = new ArrayList<>();
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        g1.add(new Gol(giocatore, new Partita("Data", squadraCasa, squadraOspite2, new Stagione(1, new ArrayList<>()))));

        ArrayList<Gol> g2 = new ArrayList<>();
        Giocatore giocatore2 = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore5, new ArrayList<>());

        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite3 = new Squadra("Nome Squadra", allenatore6, new ArrayList<>());

        g2.add(new Gol(giocatore2, new Partita("Data", squadraCasa2, squadraOspite3, new Stagione(1, new ArrayList<>()))));

        // Act
        stagione.aggiungiRisultato(risultato, p, g1, g2);
    }

    /**
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAggiungiRisultato8() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Squadra.getNomeSquadra()" because "s" is null
        //       at org.example.Stagione.getGiocatoriSquadra(Stagione.java:145)
        //       at org.example.Partita.squadraContieneGiocatore(Partita.java:61)
        //       at org.example.Partita.setRisultato(Partita.java:44)
        //       at org.example.Stagione.aggiungiRisultato(Stagione.java:244)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        Risultato risultato = new Risultato(1, 1);

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");
        squadra.setGiocatori(null);

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione2 = new Stagione(1, new ArrayList<>());
        stagione2.setSquadre(squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita p = new Partita("Data", squadraCasa, null, new Stagione(1, new ArrayList<>()));
        p.setStagione(stagione2);

        ArrayList<Gol> g1 = new ArrayList<>();
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        g1.add(new Gol(giocatore, new Partita("Data", squadraCasa2, squadraOspite, new Stagione(1, new ArrayList<>()))));

        ArrayList<Gol> g2 = new ArrayList<>();
        Giocatore giocatore2 = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa3 = new Squadra("Nome Squadra", allenatore5, new ArrayList<>());

        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore6, new ArrayList<>());

        g2.add(new Gol(giocatore2, new Partita("Data", squadraCasa3, squadraOspite2, new Stagione(1, new ArrayList<>()))));

        // Act
        stagione.aggiungiRisultato(risultato, p, g1, g2);
    }

    /**
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAggiungiRisultato9() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Giocatore.getCognome()" because the return value of "org.example.Gol.getGiocatore()" is null
        //       at org.example.Partita.setRisultato(Partita.java:39)
        //       at org.example.Stagione.aggiungiRisultato(Stagione.java:244)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        Risultato risultato = new Risultato(1, 1);

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");
        squadra.setGiocatori(null);

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione2 = new Stagione(1, new ArrayList<>());
        stagione2.setSquadre(squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Partita p = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        p.setStagione(stagione2);

        ArrayList<Gol> g1 = new ArrayList<>();
        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore5, new ArrayList<>());

        g1.add(new Gol(null, new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(1, new ArrayList<>()))));

        ArrayList<Gol> g2 = new ArrayList<>();
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa3 = new Squadra("Nome Squadra", allenatore6, new ArrayList<>());

        Allenatore allenatore7 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite3 = new Squadra("Nome Squadra", allenatore7, new ArrayList<>());

        g2.add(new Gol(giocatore, new Partita("Data", squadraCasa3, squadraOspite3, new Stagione(1, new ArrayList<>()))));

        // Act
        stagione.aggiungiRisultato(risultato, p, g1, g2);
    }

    /**
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAggiungiRisultato10() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Gol.getGiocatore()" because "g" is null
        //       at org.example.Partita.setRisultato(Partita.java:35)
        //       at org.example.Stagione.aggiungiRisultato(Stagione.java:244)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        Risultato risultato = new Risultato(1, 1);

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");
        squadra.setGiocatori(null);

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione2 = new Stagione(1, new ArrayList<>());
        stagione2.setSquadre(squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Partita p = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        p.setStagione(stagione2);

        ArrayList<Gol> g1 = new ArrayList<>();
        g1.add(null);

        ArrayList<Gol> g2 = new ArrayList<>();
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore5, new ArrayList<>());

        g2.add(new Gol(giocatore, new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(1, new ArrayList<>()))));

        // Act
        stagione.aggiungiRisultato(risultato, p, g1, g2);
    }

    /**
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAggiungiRisultato11() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Giocatore.getCognome()" because the return value of "org.example.Gol.getGiocatore()" is null
        //       at org.example.Partita.setRisultato(Partita.java:48)
        //       at org.example.Stagione.aggiungiRisultato(Stagione.java:244)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        Risultato risultato = new Risultato(1, 1);

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");
        squadra.setGiocatori(null);

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione2 = new Stagione(1, new ArrayList<>());
        stagione2.setSquadre(squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Partita p = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        p.setStagione(stagione2);

        ArrayList<Gol> g1 = new ArrayList<>();
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore5, new ArrayList<>());

        g1.add(new Gol(giocatore, new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(1, new ArrayList<>()))));

        ArrayList<Gol> g2 = new ArrayList<>();
        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa3 = new Squadra("Nome Squadra", allenatore6, new ArrayList<>());

        Allenatore allenatore7 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite3 = new Squadra("Nome Squadra", allenatore7, new ArrayList<>());

        g2.add(new Gol(null, new Partita("Data", squadraCasa3, squadraOspite3, new Stagione(1, new ArrayList<>()))));

        // Act
        stagione.aggiungiRisultato(risultato, p, g1, g2);
    }

    /**
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAggiungiRisultato12() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Gol.getGiocatore()" because "g" is null
        //       at org.example.Partita.setRisultato(Partita.java:44)
        //       at org.example.Stagione.aggiungiRisultato(Stagione.java:244)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        Risultato risultato = new Risultato(1, 1);

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");
        squadra.setGiocatori(null);

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione2 = new Stagione(1, new ArrayList<>());
        stagione2.setSquadre(squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Partita p = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        p.setStagione(stagione2);

        ArrayList<Gol> g1 = new ArrayList<>();
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore5, new ArrayList<>());

        g1.add(new Gol(giocatore, new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(1, new ArrayList<>()))));

        ArrayList<Gol> g2 = new ArrayList<>();
        g2.add(null);

        // Act
        stagione.aggiungiRisultato(risultato, p, g1, g2);
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
        Stagione stagione = new Stagione(1, new ArrayList<>());

        // Act
        stagione.setAnno(1);
        ArrayList<Squadra> squadre = new ArrayList<>();
        stagione.setSquadre(squadre);
        int actualAnno = stagione.getAnno();
        List<Partita> actualPartite = stagione.getPartite();
        List<Squadra> actualSquadre = stagione.getSquadre();

        // Assert that nothing has changed
        assertEquals(1, actualAnno);
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
        Stagione actualStagione = new Stagione(1, squadre);

        // Assert
        assertEquals(1, actualStagione.getAnno());
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
        Stagione actualStagione = new Stagione(1, squadre);

        // Assert
        assertEquals(1, actualStagione.getAnno());
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
        Stagione actualStagione = new Stagione(1, squadre);

        // Assert
        assertEquals(1, actualStagione.getAnno());
        assertTrue(actualStagione.getPartite().isEmpty());
        assertSame(squadre, actualStagione.getSquadre());
    }
}
