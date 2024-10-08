package org.example;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitaDiffblueTest {
    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Partita#equals(Object)}
     *   <li>{@link Partita#hashCode()}
     * </ul>
     */
    @Test
    void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));

        // Act and Assert
        assertEquals(partita, partita);
        int expectedHashCodeResult = partita.hashCode();
        assertEquals(expectedHashCodeResult, partita.hashCode());
    }

    /**
     * Method under test: {@link Partita#setRisultato(Risultato, List, List)}
     */
    @Test
    void testSetRisultato() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Risultato risultato = new Risultato(1, 1);

        ArrayList<Gol> goal1 = new ArrayList<>();

        // Act
        partita.setRisultato(risultato, goal1, new ArrayList<>());

        // Assert
        assertNull(partita.getRisultato());
    }

    /**
     * Method under test: {@link Partita#setRisultato(Risultato, List, List)}
     */
    @Test
    void testSetRisultato3() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Risultato risultato = new Risultato(0, 1);

        ArrayList<Gol> goal1 = new ArrayList<>();

        // Act
        partita.setRisultato(risultato, goal1, new ArrayList<>());

        // Assert
        assertNull(partita.getRisultato());
    }

    /**
     * Method under test: {@link Partita#setRisultato(Risultato, List, List)}
     */
    @Test
    void testSetRisultato4() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Risultato risultato = new Risultato(0, 0);

        ArrayList<Gol> goal1 = new ArrayList<>();

        // Act
        partita.setRisultato(risultato, goal1, new ArrayList<>());

        // Assert
        assertSame(risultato, partita.getRisultato());
    }


    /**
     * Method under test: {@link Partita#setRisultato(Risultato, List, List)}
     */
    @Test
    void testSetRisultato6() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Risultato.getGoal1()" because "risultato" is null
        //       at org.example.Partita.setRisultato(Partita.java:29)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        ArrayList<Gol> goal1 = new ArrayList<>();

        // Act
        Exception exception = assertThrows(NullValueException.class, () -> {
            partita.setRisultato(null, goal1, new ArrayList<>());
        });
        assertEquals("Risultato cannot be null", exception.getMessage());
    }



    /**
     * Method under test: {@link Partita#setRisultato(Risultato, List, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetRisultato11() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Gol.getGiocatore()" because "g" is null
        //       at org.example.Partita.setRisultato(Partita.java:35)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");
        squadra.setGiocatori(null);

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        partita.setStagione(stagione);
        Risultato risultato = new Risultato(1, 1);

        ArrayList<Gol> goal1 = new ArrayList<>();
        goal1.add(null);

        ArrayList<Gol> goal2 = new ArrayList<>();
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore5, new ArrayList<>());

        goal2
                .add(new Gol(giocatore, new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(1, new ArrayList<>()))));

        // Act
        partita.setRisultato(risultato, goal1, goal2);
    }

    /**
     * Method under test: {@link Partita#setRisultato(Risultato, List, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetRisultato12() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Giocatore.getCognome()" because the return value of "org.example.Gol.getGiocatore()" is null
        //       at org.example.Partita.setRisultato(Partita.java:48)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");
        squadra.setGiocatori(null);

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        partita.setStagione(stagione);
        Risultato risultato = new Risultato(1, 1);

        ArrayList<Gol> goal1 = new ArrayList<>();
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore5, new ArrayList<>());

        goal1
                .add(new Gol(giocatore, new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(1, new ArrayList<>()))));

        ArrayList<Gol> goal2 = new ArrayList<>();
        Allenatore allenatore6 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa3 = new Squadra("Nome Squadra", allenatore6, new ArrayList<>());

        Allenatore allenatore7 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite3 = new Squadra("Nome Squadra", allenatore7, new ArrayList<>());

        goal2.add(new Gol(null, new Partita("Data", squadraCasa3, squadraOspite3, new Stagione(1, new ArrayList<>()))));

        // Act
        partita.setRisultato(risultato, goal1, goal2);
    }

    /**
     * Method under test: {@link Partita#setRisultato(Risultato, List, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetRisultato13() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Gol.getGiocatore()" because "g" is null
        //       at org.example.Partita.setRisultato(Partita.java:44)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");
        squadra.setGiocatori(null);

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        partita.setStagione(stagione);
        Risultato risultato = new Risultato(1, 1);

        ArrayList<Gol> goal1 = new ArrayList<>();
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        Allenatore allenatore5 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore5, new ArrayList<>());

        goal1
                .add(new Gol(giocatore, new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(1, new ArrayList<>()))));

        ArrayList<Gol> goal2 = new ArrayList<>();
        goal2.add(null);

        // Act
        partita.setRisultato(risultato, goal1, goal2);
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    void testSquadraContieneGiocatore() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        // Act and Assert
        assertFalse(partita.squadraContieneGiocatore(squadra, giocatore, new Stagione(1, new ArrayList<>())));
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    void testSquadraContieneGiocatore2() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadra2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());
        squadra2.setGiocatori(null);
        squadra2.setNomeSquadra("Stagione");

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra2);

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act and Assert
        assertFalse(partita.squadraContieneGiocatore(squadra, giocatore, stagione));
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    void testSquadraContieneGiocatore3() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore4, new ArrayList<>()));

        // Act and Assert
        assertFalse(partita.squadraContieneGiocatore(squadra, giocatore, new Stagione(1, squadre)));
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSquadraContieneGiocatore4() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Squadra.getNomeSquadra()" because "s" is null
        //       at org.example.Stagione.getGiocatoriSquadra(Stagione.java:149)
        //       at org.example.Partita.squadraContieneGiocatore(Partita.java:61)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        // Act
        partita.squadraContieneGiocatore(null, giocatore, new Stagione(1, new ArrayList<>()));
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSquadraContieneGiocatore5() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "String.equalsIgnoreCase(String)" because the return value of "org.example.Squadra.getNomeSquadra()" is null
        //       at org.example.Stagione.getGiocatoriSquadra(Stagione.java:145)
        //       at org.example.Partita.squadraContieneGiocatore(Partita.java:61)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra(null, allenatore4, new ArrayList<>()));

        // Act
        partita.squadraContieneGiocatore(squadra, giocatore, new Stagione(1, squadre));
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSquadraContieneGiocatore6() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Squadra.getNomeSquadra()" because "s" is null
        //       at org.example.Stagione.getGiocatoriSquadra(Stagione.java:145)
        //       at org.example.Partita.squadraContieneGiocatore(Partita.java:61)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore3, new ArrayList<>()));

        // Act
        partita.squadraContieneGiocatore(null, giocatore, new Stagione(1, squadre));
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSquadraContieneGiocatore7() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Squadra.getNomeSquadra()" because "squadra" is null
        //       at org.example.Stagione.getGiocatoriSquadra(Stagione.java:145)
        //       at org.example.Partita.squadraContieneGiocatore(Partita.java:61)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(null);

        // Act
        partita.squadraContieneGiocatore(squadra, giocatore, new Stagione(1, squadre));
    }

    /**
     * Method under test: {@link Partita#toString()}
     */
    @Test
    void testToString() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act and Assert
        assertEquals(
                "Partita tra Nome Squadra e Nome Squadra il Data\n" + "Risultato: null\n"
                        + "-----------------------------------------------------------",
                (new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()))).toString());
    }

    /**
     * Method under test: {@link Partita#toString()}
     */
    @Test
    void testToString2() {
        // Arrange
        ArrayList<Gol> golPartita = new ArrayList<>();
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        golPartita
                .add(new Gol(giocatore, new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()))));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(1, new ArrayList<>()));
        partita.setGolPartita(golPartita);

        // Act and Assert
        assertEquals("Partita tra Nome Squadra e Nome Squadra il Data\n" + "Risultato: null\n" + "Gol segnati:\n"
                + "- Nome Cognome\n" + "-----------------------------------------------------------", partita.toString());
    }

    /**
     * Method under test: {@link Partita#toString()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToString3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Squadra.getNomeSquadra()" because "this.squadraCasa" is null
        //       at org.example.Partita.toString(Partita.java:113)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        // Act
        (new Partita("Data", null, squadraOspite, new Stagione(1, new ArrayList<>()))).toString();
    }

    /**
     * Method under test: {@link Partita#toString()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToString4() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Squadra.getNomeSquadra()" because "this.squadraOspite" is null
        //       at org.example.Partita.toString(Partita.java:113)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        // Act
        (new Partita("Data", squadraCasa, null, new Stagione(1, new ArrayList<>()))).toString();
    }

    /**
     * Method under test: {@link Partita#toString()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToString5() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Giocatore.getNome()" because the return value of "org.example.Gol.getGiocatore()" is null
        //       at org.example.Partita.toString(Partita.java:120)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ArrayList<Gol> golPartita = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        golPartita.add(new Gol(null, new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()))));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(1, new ArrayList<>()));
        partita.setGolPartita(golPartita);

        // Act
        partita.toString();
    }

    /**
     * Method under test: {@link Partita#toString()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToString6() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.NullPointerException: Cannot invoke "org.example.Gol.getGiocatore()" because "gol" is null
        //       at org.example.Partita.toString(Partita.java:120)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        ArrayList<Gol> golPartita = new ArrayList<>();
        golPartita.add(null);
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        partita.setGolPartita(golPartita);

        // Act
        partita.toString();
    }

    /**
     * Method under test: {@link Partita#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        // Act and Assert
        assertNotEquals(partita, new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(1, new ArrayList<>())));
    }

    /**
     * Method under test: {@link Partita#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("org.example.Partita", squadraCasa, squadraOspite,
                new Stagione(1, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        // Act and Assert
        assertNotEquals(partita, new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(1, new ArrayList<>())));
    }

    /**
     * Method under test: {@link Partita#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsNull_thenReturnNotEqual() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act and Assert
        assertNotEquals(new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>())), null);
    }

    /**
     * Method under test: {@link Partita#equals(Object)}
     */
    @Test
    void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act and Assert
        assertNotEquals(new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>())),
                "Different type to Partita");
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Partita#setData(String)}
     *   <li>{@link Partita#setGolPartita(List)}
     *   <li>{@link Partita#setSquadraCasa(Squadra)}
     *   <li>{@link Partita#setSquadraOspite(Squadra)}
     *   <li>{@link Partita#setStagione(Stagione)}
     *   <li>{@link Partita#getData()}
     *   <li>{@link Partita#getGolPartita()}
     *   <li>{@link Partita#getRisultato()}
     *   <li>{@link Partita#getSquadraCasa()}
     *   <li>{@link Partita#getSquadraOspite()}
     *   <li>{@link Partita#getStagione()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));

        // Act
        partita.setData("Data");
        ArrayList<Gol> golPartita = new ArrayList<>();
        partita.setGolPartita(golPartita);
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        partita.setSquadraCasa(squadraCasa2);
        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        partita.setSquadraOspite(squadraOspite2);
        Stagione stagione = new Stagione(1, new ArrayList<>());

        partita.setStagione(stagione);
        String actualData = partita.getData();
        List<Gol> actualGolPartita = partita.getGolPartita();
        partita.getRisultato();
        Squadra actualSquadraCasa = partita.getSquadraCasa();
        Squadra actualSquadraOspite = partita.getSquadraOspite();
        Stagione actualStagione = partita.getStagione();

        // Assert that nothing has changed
        assertEquals("Data", actualData);
        assertTrue(actualGolPartita.isEmpty());
        assertSame(golPartita, actualGolPartita);
        assertSame(squadraCasa2, actualSquadraCasa);
        assertSame(squadraOspite2, actualSquadraOspite);
        assertSame(stagione, actualStagione);
    }

    /**
     * Method under test:
     * {@link Partita#Partita(String, Squadra, Squadra, Stagione)}
     */
    @Test
    void testNewPartita() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Stagione stagione = new Stagione(1, new ArrayList<>());

        // Act
        Partita actualPartita = new Partita("Data", squadraCasa, squadraOspite, stagione);

        // Assert
        assertEquals("Data", actualPartita.getData());
        assertNull(actualPartita.getRisultato());
        assertTrue(actualPartita.getGolPartita().isEmpty());
        assertSame(squadraCasa, actualPartita.getSquadraCasa());
        assertSame(squadraOspite, actualPartita.getSquadraOspite());
        assertSame(stagione, actualPartita.getStagione());
    }
}
