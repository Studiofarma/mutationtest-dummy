package org.autoTestNew;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.example.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
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
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   org.example.Partita.setData(String).
        //   The arrange section threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        Campionato campionato = new Campionato("Serie A");
        List<Squadra> squadre = new ArrayList<>();

        // Inizializza i giocatori
        Giocatore g1 = new Giocatore("Dusan", "Vlahovic", "Attaccante");
        Giocatore g2 = new Giocatore("Nicolò", "Fagioli", "Centrocampista");
        Giocatore g3 = new Giocatore("Alvaro", "Morata", "Attaccante");
        Giocatore g4 = new Giocatore("Christian", "Pulisic", "Centrocampista");

        // Inizializza le liste di giocatori
        List<Giocatore> giocatoriJuve = new ArrayList<>();
        giocatoriJuve.add(g1);
        giocatoriJuve.add(g2);

        List<Giocatore>  giocatoriMilan = new ArrayList<>();
        giocatoriMilan.add(g3);
        giocatoriMilan.add(g4);

        // Inizializza gli allenatori
        Allenatore a1 = new Allenatore("Thiago", "Motta");
        Allenatore a2 = new Allenatore("Max", "Allegri");

        // Inizializza le squadre
        Squadra juventus = new Squadra("Juventus", a1, giocatoriJuve);
        Squadra milan = new Squadra("Milan", a2, giocatoriMilan);

        // Aggiungi le squadre alla lista
        squadre.add(juventus);
        squadre.add(milan);
        Stagione stagione = new Stagione(2023, squadre);

        String data="2022-03-10";
        // Create a new match
        Partita partita = new Partita(data, juventus, milan, stagione);

        // Arrange
        Risultato risultato = new Risultato(0, 0);


        partita.setRisultato(risultato, Collections.emptyList(),Collections.emptyList());

        // Act

        assertEquals(data,partita.getData());
        assertEquals(juventus,partita.getSquadraCasa());
        assertEquals(milan,partita.getSquadraOspite());
        assertEquals(stagione,partita.getStagione());
        assertEquals(risultato,partita.getRisultato());
        assertEquals(Collections.emptyList(),partita.getGolPartita());
    }

    /**
     * Method under test: {@link Partita#setRisultato(Risultato, List, List)}
     */
    @Test
    void testSetGetRisultato() {
        // Arrange
        Campionato campionato = new Campionato("Serie A");
        List<Squadra> squadre = new ArrayList<>();

        // Inizializza i giocatori
        Giocatore g1 = new Giocatore("Dusan", "Vlahovic", "Attaccante");
        Giocatore g2 = new Giocatore("Nicolò", "Fagioli", "Centrocampista");
        Giocatore g3 = new Giocatore("Alvaro", "Morata", "Attaccante");
        Giocatore g4 = new Giocatore("Christian", "Pulisic", "Centrocampista");

        // Inizializza le liste di giocatori
        List<Giocatore> giocatoriJuve = new ArrayList<>();
        giocatoriJuve.add(g1);
        giocatoriJuve.add(g2);

        List<Giocatore>  giocatoriMilan = new ArrayList<>();
        giocatoriMilan.add(g3);
        giocatoriMilan.add(g4);

        // Inizializza gli allenatori
        Allenatore a1 = new Allenatore("Thiago", "Motta");
        Allenatore a2 = new Allenatore("Max", "Allegri");

        // Inizializza le squadre
        Squadra juventus = new Squadra("Juventus", a1, giocatoriJuve);
        Squadra milan = new Squadra("Milan", a2, giocatoriMilan);

        // Aggiungi le squadre alla lista
        squadre.add(juventus);
        squadre.add(milan);
        Stagione stagione = new Stagione(2023, squadre);

        String data="2022-03-10";
        // Create a new match
        Partita partita = new Partita(data, juventus, milan, stagione);

        // Arrange
        Risultato risultato = new Risultato(1, 0);
        List<Gol> gols=List.of(new Gol(g1,partita));

        partita.setRisultato(risultato, gols,Collections.emptyList());
        partita.setGolPartita(gols);
        assertEquals(gols,partita.getGolPartita());

    }

    @Test
    void testGolPartita(){
        // Arrange
        Campionato campionato = new Campionato("Serie A");
        List<Squadra> squadre = new ArrayList<>();

        // Inizializza i giocatori
        Giocatore g1 = new Giocatore("Dusan", "Vlahovic", "Attaccante");
        Giocatore g2 = new Giocatore("Nicolò", "Fagioli", "Centrocampista");
        Giocatore g3 = new Giocatore("Alvaro", "Morata", "Attaccante");
        Giocatore g4 = new Giocatore("Christian", "Pulisic", "Centrocampista");

        // Inizializza le liste di giocatori
        List<Giocatore> giocatoriJuve = new ArrayList<>();
        giocatoriJuve.add(g1);
        giocatoriJuve.add(g2);

        List<Giocatore>  giocatoriMilan = new ArrayList<>();
        giocatoriMilan.add(g3);
        giocatoriMilan.add(g4);

        // Inizializza gli allenatori
        Allenatore a1 = new Allenatore("Thiago", "Motta");
        Allenatore a2 = new Allenatore("Max", "Allegri");

        // Inizializza le squadre
        Squadra juventus = new Squadra("Juventus", a1, giocatoriJuve);
        Squadra milan = new Squadra("Milan", a2, giocatoriMilan);

        // Aggiungi le squadre alla lista
        squadre.add(juventus);
        squadre.add(milan);
        Stagione stagione = new Stagione(2023, squadre);

        String data="2022-03-10";
        // Create a new match

        Partita partita = new Partita(data, juventus, milan, stagione);
        List<Gol> gols=List.of(new Gol(g1,partita),new Gol(g2,partita));
        partita.setGolPartita(gols);

        assertEquals(gols,partita.getGolPartita());
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

        // Act and Assert
        assertFalse((new Partita("Data", squadraCasa, squadraOspite, new Stagione(1900, new ArrayList<>())))
                .squadraContieneGiocatore(null, null, null));
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */

    @Test
    void testSquadraContieneGiocatore18(){
        Campionato campionato = new Campionato("Serie A");
        List<Squadra> squadre = new ArrayList<>();

        // Inizializza i giocatori
        Giocatore g1 = new Giocatore("Dusan", "Vlahovic", "Attaccante");
        Giocatore g3 = new Giocatore("Alvaro", "Morata", "Attaccante");

        // Inizializza le liste di giocatori
        List<Giocatore> giocatoriJuve = new ArrayList<>();
        giocatoriJuve.add(g1);

        List<Giocatore> giocatoriMilan = new ArrayList<>();
        giocatoriMilan.add(g3);

        // Inizializza gli allenatori
        Allenatore a1 = new Allenatore("Thiago", "Motta");
        Allenatore a2 = new Allenatore("Stefano", "Pioli");

        // Inizializza le squadre
        Squadra juventus = new Squadra("Juventus", a1, giocatoriJuve);
        Squadra milan = new Squadra("Milan", a2, giocatoriMilan);

        // Aggiungi le squadre alla lista
        squadre.add(juventus);
        squadre.add(milan);
        Stagione stagione = new Stagione(2023, squadre);

        // Create a new match
        Partita partita = new Partita("2023-10-03", juventus, milan, stagione);

        assertFalse(partita.squadraContieneGiocatore(juventus,g3,stagione));
        assertTrue(partita.squadraContieneGiocatore(juventus,g1,stagione));
        // casi che mi elimina il mutante
        Squadra inter = new Squadra("Inter", a1,  Collections.emptyList());
        assertFalse(partita.squadraContieneGiocatore(inter,g1,stagione));
        assertFalse(partita.squadraContieneGiocatore(null,g1,stagione));
        assertFalse(partita.squadraContieneGiocatore(juventus,null,stagione));
        assertFalse(partita.squadraContieneGiocatore(juventus,g1,null));
        assertFalse(partita.squadraContieneGiocatore(null,null,stagione));
        assertFalse(partita.squadraContieneGiocatore(null,g1,null));
        assertFalse(partita.squadraContieneGiocatore(juventus,null,null));
    }

    @Test
    @Disabled("TODO: Complete this test")
    void testSquadraContieneGiocatore2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
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

        // Act
        partita.squadraContieneGiocatore(squadra, giocatore, new Stagione(1, new ArrayList<>()));
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSquadraContieneGiocatore3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act
        (new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()))).squadraContieneGiocatore(null,
                null, null);
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
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));

        // Act
        partita.squadraContieneGiocatore(null, null, new Stagione(1, new ArrayList<>()));
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
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());
        squadra.setGiocatori(null);
        squadra.setNomeSquadra("Stagione");

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        partita.squadraContieneGiocatore(null, null, stagione);
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
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());
        squadra.setGiocatori(new ArrayList<>());
        squadra.setNomeSquadra("Stagione");

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        partita.squadraContieneGiocatore(null, null, stagione);
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
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));

        // Act
        partita.squadraContieneGiocatore(null, new Giocatore("Nome", "Cognome", "Ruolo"), null);
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSquadraContieneGiocatore8() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
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
    void testSquadraContieneGiocatore9() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());
        squadra.setGiocatori(null);
        squadra.setNomeSquadra("Stagione");

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        partita.squadraContieneGiocatore(null, giocatore, stagione);
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSquadraContieneGiocatore10() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());
        squadra.setGiocatori(new ArrayList<>());
        squadra.setNomeSquadra("Stagione");

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        partita.squadraContieneGiocatore(null, giocatore, stagione);
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSquadraContieneGiocatore11() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        // Act
        partita.squadraContieneGiocatore(new Squadra("Nome Squadra", allenatore3, new ArrayList<>()), null, null);
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSquadraContieneGiocatore12() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        // Act
        partita.squadraContieneGiocatore(squadra, null, new Stagione(1, new ArrayList<>()));
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSquadraContieneGiocatore13() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadra2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());
        squadra2.setGiocatori(null);
        squadra2.setNomeSquadra("Stagione");

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra2);

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        partita.squadraContieneGiocatore(squadra, null, stagione);
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSquadraContieneGiocatore14() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadra2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());
        squadra2.setGiocatori(new ArrayList<>());
        squadra2.setNomeSquadra("Stagione");

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra2);

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        partita.squadraContieneGiocatore(squadra, null, stagione);
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSquadraContieneGiocatore15() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        // Act
        partita.squadraContieneGiocatore(squadra, new Giocatore("Nome", "Cognome", "Ruolo"), null);
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSquadraContieneGiocatore16() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
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

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadra2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());
        squadra2.setGiocatori(null);
        squadra2.setNomeSquadra("Stagione");

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra2);

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        partita.squadraContieneGiocatore(squadra, giocatore, stagione);
    }

    /**
     * Method under test:
     * {@link Partita#squadraContieneGiocatore(Squadra, Giocatore, Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSquadraContieneGiocatore17() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
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

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadra2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());
        squadra2.setGiocatori(new ArrayList<>());
        squadra2.setNomeSquadra("Stagione");

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra2);

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        partita.squadraContieneGiocatore(squadra, giocatore, stagione);
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

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1900, new ArrayList<>()));
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
                () -> (new Partita("Data", squadraCasa, squadraOspite, new Stagione(1900, new ArrayList<>())))
                        .setSquadraCasa(null));
    }

    /**
     * Method under test: {@link Partita#setSquadraCasa(Squadra)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetSquadraCasa3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        // Act
        partita.setSquadraCasa(new Squadra("Nome Squadra", allenatore3, new ArrayList<>()));
    }

    /**
     * Method under test: {@link Partita#setSquadraCasa(Squadra)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetSquadraCasa4() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act
        (new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()))).setSquadraCasa(null);
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

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1900, new ArrayList<>()));
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
                () -> (new Partita("Data", squadraCasa, squadraOspite, new Stagione(1900, new ArrayList<>())))
                        .setSquadraOspite(null));
    }

    /**
     * Method under test: {@link Partita#setSquadraOspite(Squadra)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetSquadraOspite3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        // Act
        partita.setSquadraOspite(new Squadra("Nome Squadra", allenatore3, new ArrayList<>()));
    }

    /**
     * Method under test: {@link Partita#setSquadraOspite(Squadra)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetSquadraOspite4() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act
        (new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()))).setSquadraOspite(null);
    }

    /**
     * Method under test: {@link Partita#setStagione(Stagione)}
     */
    @Test
    void testSetStagione() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act and Assert
        assertThrows(NullValueException.class,
                () -> (new Partita("Data", squadraCasa, squadraOspite, new Stagione(1900, new ArrayList<>())))
                        .setStagione(null));
    }

    /**
     * Method under test: {@link Partita#setStagione(Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetStagione2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Partita partita = new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));

        // Act
        partita.setStagione(new Stagione(1, new ArrayList<>()));
    }

    /**
     * Method under test: {@link Partita#setStagione(Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetStagione3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act
        (new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()))).setStagione(null);
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
                (new Partita("Data", squadraCasa, squadraOspite, new Stagione(1900, new ArrayList<>()))).toString());
    }

    /**
     * Method under test: {@link Partita#toString()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testToString2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act
        (new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()))).toString();
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
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

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

        // Act
        partita.toString();
    }

    /**
     * Method under test:
     * {@link Partita#Partita(String, Squadra, Squadra, Stagione)}
     */
    @Test
    void testNewPartita() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> new Partita("Data", null, null, null));

    }

    /**
     * Method under test:
     * {@link Partita#Partita(String, Squadra, Squadra, Stagione)}
     */
    @Test
    void testNewPartita2() {
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
    void testNewPartita3() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        // Act and Assert
        assertThrows(NullValueException.class,
                () -> new Partita("Data", squadraCasa, new Squadra("Nome Squadra", allenatore2, new ArrayList<>()), null));

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

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        Stagione stagione = new Stagione(1900, new ArrayList<>());

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
    @Disabled("TODO: Complete this test")
    void testNewPartita5() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act
        new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>()));

    }
}
