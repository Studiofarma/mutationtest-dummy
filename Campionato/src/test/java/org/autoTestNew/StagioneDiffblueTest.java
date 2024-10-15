package org.autoTestNew;

import java.util.*;

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
        // Arrange
        Stagione stagione = new Stagione(1900, new ArrayList<>());
        stagione.setSquadre(new ArrayList<>());

        // Act and Assert
        assertThrows(NullValueException.class, () -> stagione.aggiungiPartita(null));
    }

    /**
     * Method under test: {@link Stagione#aggiungiPartita(Partita)}
     */
    @Test
    void testAggiungiPartita2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        List<Squadra> squadre=new ArrayList<>();
        squadre.add(squadraCasa);
        squadre.add(squadraOspite);
        Stagione stagione = new Stagione(1900, squadre);
        // Act

        Partita p=new Partita("Data", squadraCasa, squadraOspite, stagione);
        stagione.aggiungiPartita(p);

        assertEquals(p,stagione.getPartite().get(0));
    }

    /**
     * Method under test: {@link Stagione#aggiungiPartita(Partita)}
     */
    @Test
    void testAggiungiPartita3() {
        // Arrange

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        List<Squadra> squadre=new ArrayList<>();
        //squadre.add(squadraCasa);
        squadre.add(squadraOspite);
        Stagione stagione = new Stagione(1900, squadre);
        // Act

        Partita p=new Partita("Data", squadraCasa, squadraOspite, stagione);
        stagione.aggiungiPartita(p);

        assertEquals(Collections.emptyList(),stagione.getPartite());
    }

    /**
     * Method under test: {@link Stagione#aggiungiPartita(Partita)}
     */
    @Test
    void testAggiungiPartita4() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        /// Arrange

        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        List<Squadra> squadre=new ArrayList<>();
        squadre.add(squadraCasa);
        //squadre.add(squadraOspite);
        Stagione stagione = new Stagione(1900, squadre);
        // Act

        Partita p=new Partita("Data", squadraCasa, squadraOspite, stagione);
        stagione.aggiungiPartita(p);

        assertEquals(Collections.emptyList(),stagione.getPartite());
    }

    /**
     * Method under test: {@link Stagione#aggiungiPartita(Partita)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAggiungiPartita5() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(new ArrayList<>());
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        // Act
        stagione.aggiungiPartita(new Partita("Data", squadraCasa, squadraOspite, new Stagione(1, new ArrayList<>())));
    }

    /**
     * Method under test: {@link Stagione#setAnno(int)}
     */
    @Test
    void testSetAnno() {
        // Arrange, Act and Assert
        Stagione stagione=new Stagione(2000,new ArrayList<>());
        assertThrows(NullValueException.class, () -> stagione.setAnno(1899));
        assertThrows(NullValueException.class, () -> stagione.setAnno(2201));
        stagione.setAnno(1900);
        assertEquals(1900,stagione.getAnno());
        stagione.setAnno(2200);
        assertEquals(2200,stagione.getAnno());;
    }

    /**
     * Method under test: {@link Stagione#setAnno(int)}
     */
    @Test
    void testSetAnno2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        (new Stagione(1900, new ArrayList<>())).setAnno(1900);
    }

    /**
     * Method under test: {@link Stagione#setAnno(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetAnno3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new Stagione(1, new ArrayList<>())).setAnno(1);
    }

    /**
     * Method under test: {@link Stagione#setAnno(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetAnno4() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new Stagione(1, new ArrayList<>())).setAnno(1900);
    }

    /**
     * Method under test: {@link Stagione#setAnno(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetAnno5() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new Stagione(1, new ArrayList<>())).setAnno(1899);
    }

    /**
     * Method under test: {@link Stagione#setAnno(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetAnno6() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new Stagione(1, new ArrayList<>())).setAnno(2200);
    }

    /**
     * Method under test: {@link Stagione#setAnno(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testSetAnno7() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new Stagione(1, new ArrayList<>())).setAnno(2201);
    }

    /**
     * Method under test: {@link Stagione#setPartite(List)}
     */
    @Test
    void testSetPartiteNoSquadraInStagione() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Stagione stagione = new Stagione(1900, new ArrayList<>());

        ArrayList<Partita> partite = new ArrayList<>();
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        //squadre.add(squadraOspite);
        squadre.add(squadraCasa);

        stagione.setSquadre(squadre);
        Partita partita=new Partita("2020-01-10",squadraCasa,squadraOspite,stagione);

        partite.add(partita);
        // Act
        stagione.setPartite(partite);

        assertEquals(Collections.emptyList(), stagione.getPartite());
    }

    /**
     * Method under test: {@link Stagione#setPartite(List)}
     */
    @Test
    void testSetPartite() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Stagione stagione = new Stagione(1900, new ArrayList<>());

        ArrayList<Partita> partite = new ArrayList<>();
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        squadre.add(squadraOspite);
        squadre.add(squadraCasa);

        stagione.setSquadre(squadre);
        Partita partita=new Partita("2020-01-10",squadraCasa,squadraOspite,stagione);
        Partita partita2=new Partita("2020-02-10",squadraOspite,squadraCasa,stagione);

        partite.add(partita);
        partite.add(partita2);
        // Act
        stagione.setPartite(partite);

        assertEquals(partite, stagione.getPartite());
    }

    /**
     * Method under test: {@link Stagione#setPartite(List)}
     */
    @Test
    void testSetPartite3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Stagione stagione = new Stagione(1900, new ArrayList<>());

        ArrayList<Partita> partite = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa = new Squadra("Nome Squadra", allenatore, new ArrayList<>());

        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite = new Squadra("Nome Squadra", allenatore2, new ArrayList<>());

        partite.add(new Partita("Data", squadraCasa, squadraOspite, new Stagione(1900, new ArrayList<>())));
        Allenatore allenatore3 = new Allenatore("Nome", "Cognome");

        Squadra squadraCasa2 = new Squadra("Nome Squadra", allenatore3, new ArrayList<>());

        Allenatore allenatore4 = new Allenatore("Nome", "Cognome");

        Squadra squadraOspite2 = new Squadra("Nome Squadra", allenatore4, new ArrayList<>());

        partite.add(new Partita("Data", squadraCasa2, squadraOspite2, new Stagione(1900, new ArrayList<>())));

        // Act
        stagione.setPartite(partite);
    }

    /**
     * Method under test: {@link Stagione#setPartite(List)}
     */
    @Test
    void testSetPartite4() {
        // Arrange
        Stagione stagione = new Stagione(1900, new ArrayList<>());

        ArrayList<Partita> partite = new ArrayList<>();
        partite.add(null);

        // Act and Assert
        assertThrows(NullValueException.class, () -> stagione.setPartite(partite));
    }

    /**
     * Method under test: {@link Stagione#setPartite(List)}
     */
    @Test
    void testSetPartite5() {
        // Arrange
        Stagione stagione = new Stagione(1900, new ArrayList<>());
        stagione.setSquadre(new ArrayList<>());

        // Act and Assert
        assertThrows(NullValueException.class, () -> stagione.setPartite(null));
    }

    /**
     * Method under test: {@link Stagione#toString()}
     */
    @Test
    void testToString() {
        // Arrange, Act and Assert
        assertEquals("Nessuna partita in questo stagione.\n", (new Stagione(1900, new ArrayList<>())).toString());
    }

    /**
     * Method under test: {@link Stagione#toString()}
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

        // Arrange and Act
        (new Stagione(1, new ArrayList<>())).toString();
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Stagione#getAnno()}
     *   <li>{@link Stagione#getPartite()}
     *   <li>{@link Stagione#getSquadre()}
     * </ul>
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGettersAndSetters2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: Exception in arrange section.
        //   Diffblue Cover was unable to construct an instance of the class under test using
        //   org.example.Stagione.getAnno().
        //   The arrange section threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R081 to resolve this issue.

        // Arrange
        // TODO: Populate arranged inputs
        Stagione stagione = null;

        // Act
        int actualAnno = stagione.getAnno();
        List<Partita> actualPartite = stagione.getPartite();
        List<Squadra> actualSquadre = stagione.getSquadre();

        // Assert
        // TODO: Add assertions on result
    }

    /**
     * Method under test: {@link Stagione#Stagione(int, List)}
     */
    @Test
    void testNewStagione() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> new Stagione(1, new ArrayList<>()));
        assertThrows(NullValueException.class, () -> new Stagione(1900, null));
        assertThrows(NullValueException.class, () -> new Stagione(2201, null));

    }

    /**
     * Method under test: {@link Stagione#Stagione(int, List)}
     */
    @Test
    void testNewStagione2() {
        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();

        // Act
        Stagione actualStagione = new Stagione(1900, squadre);

        // Assert
        assertEquals(1900, actualStagione.getAnno());
        assertTrue(actualStagione.getPartite().isEmpty());
        List<Squadra> squadre2 = actualStagione.getSquadre();
        assertTrue(squadre2.isEmpty());
        assertSame(squadre, squadre2);
    }

    /**
     * Method under test: {@link Stagione#Stagione(int, List)}
     */
    @Test
    void testNewStagione3() {
        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(null);

        // Act and Assert
        assertThrows(NullValueException.class, () -> new Stagione(1900, squadre));

    }

    /**
     * Method under test: {@link Stagione#Stagione(int, List)}
     */
    @Test
    void testNewStagione4() {
        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Anno invalido", "Anno invalido");

        squadre.add(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));
        Allenatore allenatore2 = new Allenatore("Anno invalido", "Anno invalido");

        squadre.add(new Squadra("Anno invalido", allenatore2, new ArrayList<>()));

        // Act and Assert
        assertThrows(NullValueException.class, () -> new Stagione(1, squadre));

    }

    /**
     * Method under test: {@link Stagione#calcolaClassifica()}
     */
    @Test
    void testCalcolaClassifica() {
        // Arrange, Act and Assert
        assertTrue((new Stagione(1900, new ArrayList<>())).calcolaClassifica().isEmpty());
    }

    /**
     * Method under test: {@link Stagione#calcolaClassifica()}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testCalcolaClassifica2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new Stagione(1, new ArrayList<>())).calcolaClassifica();
    }

    /**
     * Method under test: {@link Stagione#classificaMarcatori()}
     */
    @Test
    void testClassificaMarcatori() {
        // Arrange, Act and Assert
        assertTrue((new Stagione(1900, new ArrayList<>())).classificaMarcatori().isEmpty());
    }

    /**
     * Method under test: {@link Stagione#classificaMarcatori()}
     */
    @Test
    void testClassificaMarcatori2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw

        // Arrange and Act


        Campionato serieA = new Campionato("Serie A");

        // Creazione dei giocatori
        Giocatore g1 = new Giocatore("Dusan", "Vlahovic", "Attaccante");
        Giocatore g2 = new Giocatore("Nicolò", "Fagioli", "Centrocampista");
        Giocatore g3 = new Giocatore("Alvaro", "Morata", "Attaccante");
        Giocatore g4 = new Giocatore("Christian", "Pulisic", "Centrocampista");
        Giocatore g5 = new Giocatore("Lautaro", "Martinez", "Attaccante");
        Giocatore g6 = new Giocatore("Nicolo", "Barella", "Centrocampista");

        // Creazione degli allenatori
        Allenatore a1 = new Allenatore("Thiago", "Motta");
        Allenatore a2 = new Allenatore("Max", "Allegri");
        Allenatore a3 = new Allenatore("Stefano", "Pioli");
        Allenatore a4 = new Allenatore("Simone", "Inzaghi");

        // Creazione delle liste di giocatori per squadra e per stagione
        List<Giocatore> giocatoriJuve = new ArrayList<>();
        giocatoriJuve.add(g1);
        giocatoriJuve.add(g2);

        List<Giocatore> giocatoriMilan = new ArrayList<>();
        giocatoriMilan.add(g3);
        giocatoriMilan.add(g4);

        List<Giocatore> giocatoriInter = new ArrayList<>();
        giocatoriInter.add(g5);
        giocatoriInter.add(g6);

        // Creazione delle squadre
        Squadra juventus = new Squadra("Juventus", a1, giocatoriJuve);
        Squadra milan = new Squadra("Milan", a3, giocatoriMilan);
        Squadra inter = new Squadra("Inter", a4, giocatoriInter);

        List <Squadra> squadre=new ArrayList<>();
        squadre.add(juventus);
        squadre.add(milan);
        squadre.add(inter);

        // Creazione delle stagioni
        Stagione stagione2024 = new Stagione(2024, squadre);

        // Creazione di partite per la stagione 2024
        Partita partita1 = new Partita("2024-10-03", juventus, milan, stagione2024);
        Partita partita2 = new Partita("2024-10-10", milan, inter, stagione2024);
        Partita partita3 = new Partita("2024-10-17", inter,juventus, stagione2024);
        Partita partita4= new Partita("2024-05-06",juventus,milan,stagione2024);
        // Impostazione dei risultati
        Risultato risultato1 = new Risultato(2, 1); // Juventus 2 - Milan 1
        Risultato risultato2 = new Risultato(1, 1); // Milan 1 - Inter 1 (pareggio)
        Risultato risultato3 = new Risultato(3, 0); //  Juventus 0 - Inter 3

        // Aggiunta dei risultati e dei gol (esempio di giocatori che segnano)
        List<Gol> golPartita1Juve = Arrays.asList(new Gol(g1, partita1), new Gol(g1, partita1)); // Doppietta di Vlahovic
        List<Gol> golPartita1Milan = Arrays.asList(new Gol(g3, partita1)); // Gol di Morata

        partita1.setRisultato(risultato1, golPartita1Juve, golPartita1Milan);

        List<Gol> golPartita2Milan = Arrays.asList(new Gol(g3, partita2)); // Gol di Morata
        List<Gol> golPartita2Inter = Arrays.asList(new Gol(g5, partita2)); // Gol di Lautaro

        partita2.setRisultato(risultato2, golPartita2Milan, golPartita2Inter);

        List<Gol> golPartita3Inter = Arrays.asList(new Gol(g5, partita3), new Gol(g6, partita3), new Gol(g5, partita3)); // Lautaro doppietta, Barella 1 gol

        partita3.setRisultato(risultato3,golPartita3Inter,new ArrayList<>());

        // Aggiunta delle partite alla stagione
        stagione2024.aggiungiPartita(partita1);
        stagione2024.aggiungiPartita(partita2);
        stagione2024.aggiungiPartita(partita3);

        // Aggiunta della stagione al campionato
        serieA.aggiungiStagione(stagione2024);


        LinkedHashMap<Giocatore, Integer> marcatori = stagione2024.classificaMarcatori();
        LinkedHashMap<Giocatore, Integer> expectedMarcatori = new LinkedHashMap<>();
        expectedMarcatori.put(g5,3);
        expectedMarcatori.put(g1,2);
        expectedMarcatori.put(g3,2);
        expectedMarcatori.put(g6,1);

        assertEqualsMarcatori(expectedMarcatori, marcatori); // G
    }

    private void assertEqualsMarcatori(LinkedHashMap<Giocatore, Integer> expected, LinkedHashMap<Giocatore, Integer> actual) {

        assertEquals(expected.size(), actual.size(), "Mappa di dimensioni diverse");

        Iterator<Map.Entry<Giocatore, Integer>> expectedIterator = expected.entrySet().iterator();
        Iterator<Map.Entry<Giocatore, Integer>> actualIterator = actual.entrySet().iterator();

        while (expectedIterator.hasNext() && actualIterator.hasNext()) {
            Map.Entry<Giocatore, Integer> expectedEntry = expectedIterator.next();
            Map.Entry<Giocatore, Integer> actualEntry = actualIterator.next();

            assertEquals(expectedEntry.getKey(), actualEntry.getKey(), "I giocatori non sono gli stessi");
            assertEquals(expectedEntry.getValue(), actualEntry.getValue(), "I goal non corrispondono");
        }
    }
    /**
     * Method under test: {@link Stagione#setSquadre(List)}
     */
    @Test
    void testSetSquadre() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Stagione stagione = new Stagione(1900, new ArrayList<>());

        // Act
        stagione.setSquadre(new ArrayList<>());
    }

    /**
     * Method under test: {@link Stagione#setSquadre(List)}
     */
    @Test
    void testSetSquadre2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Stagione stagione = new Stagione(1900, new ArrayList<>());

        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));

        // Act
        stagione.setSquadre(squadre);
    }

    /**
     * Method under test: {@link Stagione#setSquadre(List)}
     */
    @Test
    void testSetSquadre3() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        Stagione stagione = new Stagione(1900, new ArrayList<>());

        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore, new ArrayList<>()));
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("Nome Squadra", allenatore2, new ArrayList<>()));

        // Act
        stagione.setSquadre(squadre);
    }

    /**
     * Method under test: {@link Stagione#setSquadre(List)}
     */
    @Test
    void testSetSquadre4() {
        // Arrange
        Stagione stagione = new Stagione(1900, new ArrayList<>());

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(null);

        // Act and Assert
        assertThrows(NullValueException.class, () -> stagione.setSquadre(squadre));
    }

    /**
     * Method under test: {@link Stagione#setSquadre(List)}
     */
    @Test
    void testSetSquadre5() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> (new Stagione(1900, new ArrayList<>())).setSquadre(null));
    }

    /**
     * Method under test: {@link Stagione#getGiocatoriSquadra(Squadra)}
     */
    @Test
    void testGetGiocatoriSquadra() {
        // Arrange
        Stagione stagione = new Stagione(1900, new ArrayList<>());
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
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        ArrayList<Giocatore> giocatori = new ArrayList<>();
        squadre.add(new Squadra("Nome Squadra", allenatore, giocatori));
        Stagione stagione = new Stagione(1900, squadre);
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
    void testGetGiocatoriSquadra3() {
        // Arrange
        ArrayList<Squadra> squadre = new ArrayList<>();
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        squadre.add(new Squadra("42", allenatore, new ArrayList<>()));
        Stagione stagione = new Stagione(1900, squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        // Act and Assert
        assertNull(stagione.getGiocatoriSquadra(new Squadra("Nome Squadra", allenatore2, new ArrayList<>())));
    }

    /**
     * Method under test: {@link Stagione#getGiocatoriSquadra(Squadra)}
     */
    @Test
    void testGetGiocatoriSquadra4() {
        // Arrange, Act and Assert
        assertNull((new Stagione(1900, new ArrayList<>())).getGiocatoriSquadra(null));
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
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Stagione stagione = new Stagione(1, new ArrayList<>());
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
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        stagione.getGiocatoriSquadra(null);
    }

    /**
     * Method under test: {@link Stagione#getGiocatoriSquadra(Squadra)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testGetGiocatoriSquadra7() {
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

        Squadra squadra = new Squadra("Nome Squadra", allenatore, new ArrayList<>());
        squadra.setNomeSquadra("foo");

        ArrayList<Squadra> squadre = new ArrayList<>();
        squadre.add(squadra);

        Stagione stagione = new Stagione(1, new ArrayList<>());
        stagione.setSquadre(squadre);
        Allenatore allenatore2 = new Allenatore("Nome", "Cognome");

        // Act
        stagione.getGiocatoriSquadra(new Squadra("Nome Squadra", allenatore2, new ArrayList<>()));
    }


    // Test per verificare che nessuna squadra giochi contro se stessa:
    @Test
    public void testNessunaSquadraGiocaControSeStessa() {
        Campionato serieA = new Campionato("Serie A");

        // Creazione dei giocatori
        Giocatore g1 = new Giocatore("Dusan", "Vlahovic", "Attaccante");
        Giocatore g2 = new Giocatore("Nicolò", "Fagioli", "Centrocampista");
        Giocatore g3 = new Giocatore("Alvaro", "Morata", "Attaccante");
        Giocatore g4 = new Giocatore("Christian", "Pulisic", "Centrocampista");
        Giocatore g5 = new Giocatore("Lautaro", "Martinez", "Attaccante");
        Giocatore g6 = new Giocatore("Nicolo", "Barella", "Centrocampista");

        // Creazione degli allenatori
        Allenatore a1 = new Allenatore("Thiago", "Motta");
        Allenatore a2 = new Allenatore("Max", "Allegri");
        Allenatore a3 = new Allenatore("Stefano", "Pioli");
        Allenatore a4 = new Allenatore("Simone", "Inzaghi");

        // Creazione delle liste di giocatori per squadra e per stagione
        List<Giocatore> giocatoriJuve = new ArrayList<>();
        giocatoriJuve.add(g1);
        giocatoriJuve.add(g2);

        List<Giocatore> giocatoriMilan = new ArrayList<>();
        giocatoriMilan.add(g3);
        giocatoriMilan.add(g4);

        List<Giocatore> giocatoriInter = new ArrayList<>();
        giocatoriInter.add(g5);
        giocatoriInter.add(g6);

        // Creazione delle squadre
        Squadra juventus = new Squadra("Juventus", a1, giocatoriJuve);
        Squadra milan = new Squadra("Milan", a3, giocatoriMilan);
        Squadra inter = new Squadra("Inter", a4, giocatoriInter);

        List <Squadra> squadre=new ArrayList<>();
        squadre.add(juventus);
        squadre.add(milan);
        squadre.add(inter);

        // Creazione delle stagioni
        Stagione stagione2024 = new Stagione(2024, squadre);

        serieA.aggiungiStagione(stagione2024);
        serieA.getStagioneByAnno(2024).creaPartite();
        List<Partita> partite = serieA.getStagioneByAnno(2024).getPartite();
        for (Partita partita : partite) {
            assertNotEquals(partita.getSquadraCasa(), partita.getSquadraOspite(),
                    "Una squadra gioca contro se stessa");
        }
    }

    //Test per verificare che il numero di partite sia corretto
    @Test
    public void testNumeroCorrettoDiPartite() {
        Campionato serieA = new Campionato("Serie A");

        // Creazione dei giocatori
        Giocatore g1 = new Giocatore("Dusan", "Vlahovic", "Attaccante");
        Giocatore g2 = new Giocatore("Nicolò", "Fagioli", "Centrocampista");
        Giocatore g3 = new Giocatore("Alvaro", "Morata", "Attaccante");
        Giocatore g4 = new Giocatore("Christian", "Pulisic", "Centrocampista");
        Giocatore g5 = new Giocatore("Lautaro", "Martinez", "Attaccante");
        Giocatore g6 = new Giocatore("Nicolo", "Barella", "Centrocampista");

        // Creazione degli allenatori
        Allenatore a1 = new Allenatore("Thiago", "Motta");
        Allenatore a2 = new Allenatore("Max", "Allegri");
        Allenatore a3 = new Allenatore("Stefano", "Pioli");
        Allenatore a4 = new Allenatore("Simone", "Inzaghi");

        // Creazione delle liste di giocatori per squadra e per stagione
        List<Giocatore> giocatoriJuve = new ArrayList<>();
        giocatoriJuve.add(g1);
        giocatoriJuve.add(g2);

        List<Giocatore> giocatoriMilan = new ArrayList<>();
        giocatoriMilan.add(g3);
        giocatoriMilan.add(g4);

        List<Giocatore> giocatoriInter = new ArrayList<>();
        giocatoriInter.add(g5);
        giocatoriInter.add(g6);

        // Creazione delle squadre
        Squadra juventus = new Squadra("Juventus", a1, giocatoriJuve);
        Squadra milan = new Squadra("Milan", a3, giocatoriMilan);
        Squadra inter = new Squadra("Inter", a4, giocatoriInter);

        List <Squadra> squadre=new ArrayList<>();
        squadre.add(juventus);
        squadre.add(milan);
        squadre.add(inter);

        // Creazione delle stagioni
        Stagione stagione2024 = new Stagione(2024, squadre);

        serieA.aggiungiStagione(stagione2024);
        serieA.getStagioneByAnno(2024).creaPartite();
        List<Partita> partite = serieA.getStagioneByAnno(2024).getPartite();

        int numeroSquadre = squadre.size();
        int numeroAttesoPartite = (numeroSquadre * (numeroSquadre - 1)) ;
        assertEquals(numeroAttesoPartite, partite.size(),
                "Il numero di partite non è corretto");
    }

    // Unica combinazione
    @Test
    public void testCombinazioniUnicheDiSquadre() {
        Campionato serieA = new Campionato("Serie A");

        // Creazione dei giocatori
        Giocatore g1 = new Giocatore("Dusan", "Vlahovic", "Attaccante");
        Giocatore g2 = new Giocatore("Nicolò", "Fagioli", "Centrocampista");
        Giocatore g3 = new Giocatore("Alvaro", "Morata", "Attaccante");
        Giocatore g4 = new Giocatore("Christian", "Pulisic", "Centrocampista");
        Giocatore g5 = new Giocatore("Lautaro", "Martinez", "Attaccante");
        Giocatore g6 = new Giocatore("Nicolo", "Barella", "Centrocampista");

        // Creazione degli allenatori
        Allenatore a1 = new Allenatore("Thiago", "Motta");
        Allenatore a2 = new Allenatore("Max", "Allegri");
        Allenatore a3 = new Allenatore("Stefano", "Pioli");
        Allenatore a4 = new Allenatore("Simone", "Inzaghi");

        // Creazione delle liste di giocatori per squadra e per stagione
        List<Giocatore> giocatoriJuve = new ArrayList<>();
        giocatoriJuve.add(g1);
        giocatoriJuve.add(g2);

        List<Giocatore> giocatoriMilan = new ArrayList<>();
        giocatoriMilan.add(g3);
        giocatoriMilan.add(g4);

        List<Giocatore> giocatoriInter = new ArrayList<>();
        giocatoriInter.add(g5);
        giocatoriInter.add(g6);

        // Creazione delle squadre
        Squadra juventus = new Squadra("Juventus", a1, giocatoriJuve);
        Squadra milan = new Squadra("Milan", a3, giocatoriMilan);
        Squadra inter = new Squadra("Inter", a4, giocatoriInter);

        List <Squadra> squadre=new ArrayList<>();
        squadre.add(juventus);
        squadre.add(milan);
        squadre.add(inter);

        // Creazione delle stagioni
        Stagione stagione2024 = new Stagione(2024, squadre);
        serieA.aggiungiStagione(stagione2024);

        serieA.getStagioneByAnno(2024).creaPartite();
        List<Partita> partite = serieA.getStagioneByAnno(2024).getPartite();

        Set<String> combinazioni = new HashSet<>();
        for (Partita partita : partite) {
            String combinazione = partita.getSquadraCasa().getNomeSquadra() +
                    "-" + partita.getSquadraOspite().getNomeSquadra();
            combinazioni.add(combinazione);
        }
        assertEquals(partite.size(), combinazioni.size(),
                "Ci sono partite duplicate o squadre ripetute");
    }

    /**
     * Method under test: {@link Stagione#creaPartite()}
     */
    @Test
    void testCreaPartite() {
        // Arrange
        Stagione stagione = new Stagione(1900, new ArrayList<>());

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
        Stagione stagione = new Stagione(1900, squadre);

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
        Stagione stagione = new Stagione(1900, squadre);

        // Act
        stagione.creaPartite();

        // Assert
        List<Partita> partite = stagione.getPartite();
        assertEquals(2, partite.size());
        Partita getResult = partite.get(0);
        assertEquals("1900-09-01", getResult.getData());
        Partita getResult2 = partite.get(1);
        assertEquals("1900-09-08", getResult2.getData());
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
        Stagione stagione = new Stagione(1900, squadre);

        // Act
        stagione.creaPartite();

        // Assert
        List<Partita> partite = stagione.getPartite();
        assertEquals(6, partite.size());
        Partita getResult = partite.get(0);
        assertEquals("1900-09-01", getResult.getData());
        Partita getResult2 = partite.get(1);
        assertEquals("1900-09-08", getResult2.getData());
        Partita getResult3 = partite.get(2);
        assertEquals("1900-09-15", getResult3.getData());
        Partita getResult4 = partite.get(3);
        assertEquals("1900-09-22", getResult4.getData());
        Partita getResult5 = partite.get(4);
        assertEquals("1900-09-29", getResult5.getData());
        Partita getResult6 = partite.get(5);
        assertEquals("1900-10-06", getResult6.getData());
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
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange and Act
        (new Stagione(1, new ArrayList<>())).creaPartite();
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
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
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
    void testCreaPartite7() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   java.lang.ThreadDeath
        //       at org.example.Partita.getSquadraCasa(Partita.java:83)
        //       at org.example.Stagione.creaPartite(Stagione.java:234)
        //   com.diffblue.cover.agent.UnboundedLoopException: Cover agent detected a potentially unbounded loop executing at org.example.Partita#getSquadraCasa:83
        //       at org.example.Partita.getSquadraCasa(Partita.java:83)
        //       at org.example.Stagione.creaPartite(Stagione.java:234)
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

        Stagione stagione = new Stagione(1900, new ArrayList<>());
        stagione.setSquadre(squadre);

        // Act
        stagione.creaPartite();
    }

    /**
     * Method under test:
     * {@link Stagione#aggiungiRisultato(Risultato, Partita, List, List)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAggiungiRisultato() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange
        // TODO: Populate arranged inputs
        Stagione stagione = null;
        Risultato risultato = null;
        Partita p = null;
        List<Gol> g1 = null;
        List<Gol> g2 = null;

        // Act
        stagione.aggiungiRisultato(risultato, p, g1, g2);

        // Assert
        // TODO: Add assertions on result
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

}
