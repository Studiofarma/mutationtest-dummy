package org.autoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.example.*;
import org.junit.jupiter.api.Test;

public class PartitaDiffblueTest {
    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Partita#setData(String)}
     *   <li>{@link Partita#setGolPartita(List)}
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

        Stagione stagione = new Stagione(2000, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, stagione);

        // Act
        partita.setData("Data");
        ArrayList<Gol> golPartita = new ArrayList<>();
        partita.setGolPartita(golPartita);
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
        assertSame(squadraCasa, actualSquadraCasa);
        assertSame(squadraOspite, actualSquadraOspite);
        assertSame(stagione, actualStagione);
    }

    /**
     * Method under test: {@link Partita#setRisultato(Risultato, List, List)}
     */
    @Test
    void testSetRisultato() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>()));
        Risultato risultato = new Risultato(1, 1);

        ArrayList<Gol> goal1 = new ArrayList<>();

        // Act
        partita.setRisultato(risultato, goal1, new ArrayList<>());
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

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        // Act and Assert
        assertFalse(partita.squadraContieneGiocatore(squadra, giocatore, new Stagione(2000, new ArrayList<>())));
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

        // Act and Assert
        assertFalse((new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>())))
                .squadraContieneGiocatore(null, null, null));
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

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>()));

        // Act and Assert
        assertFalse(partita.squadraContieneGiocatore(null, null, new Stagione(2000, new ArrayList<>())));
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    void testSquadraContieneGiocatore4() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        // Act and Assert
        assertFalse(partita.squadraContieneGiocatore(squadra, null, new Stagione(2000, new ArrayList<>())));
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    void testSquadraContieneGiocatore5() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadra2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());
        squadra2.setGiocatori(new ArrayList<>());
        squadra2.setNomeSquadra("Stagione");

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra2);

        Stagione stagione = new Stagione(2000, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act and Assert
        assertFalse(partita.squadraContieneGiocatore(squadra, giocatore, stagione));
    }

    /**
     * Method under test: {@link Partita#setSquadraCasa(Squadra)}
     */
    @Test
    void testSetSquadraCasa() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        // Act
        partita.setSquadraCasa(new Squadra("Nome Squadra", allenatore3, new ArrayList<>()));
    }

    /**
     * Method under test: {@link Partita#setSquadraCasa(Squadra)}
     */
    @Test
    void testSetSquadraCasa2() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act and Assert
        assertThrows(NullValueException.class,
                () -> (new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>())))
                        .setSquadraCasa(null));
    }

    /**
     * Method under test: {@link Partita#setSquadraOspite(Squadra)}
     */
    @Test
    void testSetSquadraOspite() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        // Act
        partita.setSquadraOspite(new Squadra("Nome Squadra", allenatore3, new ArrayList<>()));
    }

    /**
     * Method under test: {@link Partita#setSquadraOspite(Squadra)}
     */
    @Test
    void testSetSquadraOspite2() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act and Assert
        assertThrows(NullValueException.class,
                () -> (new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>())))
                        .setSquadraOspite(null));
    }

    /**
     * Method under test: {@link Partita#setStagione(Stagione)}
     */
    @Test
    void testSetStagione() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>()));

        // Act
        partita.setStagione(new Stagione(2000, new ArrayList<>()));
    }

    /**
     * Method under test: {@link Partita#setStagione(Stagione)}
     */
    @Test
    void testSetStagione2() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act and Assert
        assertThrows(NullValueException.class,
                () -> (new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()))).setStagione(null));
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
                (new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>()))).toString());
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
                .add(new Gol(giocatore, new Partita("Data", squadraCasa, squadraOspite, new Stagione(2000, new ArrayList<>()))));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(2000, new ArrayList<>()));
        partita.setGolPartita(golPartita);

        // Act and Assert
        assertEquals("Partita tra Nome Squadra e Nome Squadra il Data\n" + "Risultato: null\n" + "Gol segnati:\n"
                + "- Nome Cognome\n" + "-----------------------------------------------------------", partita.toString());
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

        Stagione stagione = new Stagione(2000, new ArrayList<>());

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

    /**
     * Method under test:
     * {@link Partita#Partita(String, Squadra, Squadra, Stagione)}
     */
    @Test
    void testNewPartita2() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> new Partita("Data", null, null, null));

    }

    /**
     * Method under test:
     * {@link Partita#Partita(String, Squadra, Squadra, Stagione)}
     */
    @Test
    void testNewPartita3() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        // Act and Assert
        assertThrows(NullValueException.class,
                () -> new Partita("Data", new Squadra("Nome Squadra", allenatore, new ArrayList<>()), null, null));

    }

    /**
     * Method under test:
     * {@link Partita#Partita(String, Squadra, Squadra, Stagione)}
     */
    @Test
    void testNewPartita4() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        // Act and Assert
        assertThrows(NullValueException.class,
                () -> new Partita("Data", squadraCasa, new Squadra("Nome Squadra", allenatore2, new ArrayList<>()), null));

    }
}
