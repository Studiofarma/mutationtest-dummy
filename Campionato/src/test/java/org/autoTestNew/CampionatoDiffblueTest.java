package org.autoTestNew;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.example.Campionato;
import org.example.Stagione;
import org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

public class CampionatoDiffblueTest {
    /**
     * Method under test: {@link Campionato#aggiungiStagione(Stagione)}
     */
    @Test
    void testAggiungiStagione() {
        // Arrange
        Campionato campionato = new Campionato("alice.liddell@example.org");

        // Act
        campionato.aggiungiStagione(null);

        // Assert
        List<Stagione> stagioni = campionato.getStagioni();
        assertEquals(1, stagioni.size());
        assertNull(stagioni.get(0));
    }

    /**
     * Method under test: {@link Campionato#aggiungiStagione(Stagione)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testAggiungiStagione2() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Reason: No inputs found that don't throw a trivial exception.
        //   Diffblue Cover tried to run the arrange/act section, but the method under
        //   test threw
        //   org.example.NullValueException: Anno invalido
        //       at org.example.Stagione.setAnno(Stagione.java:47)
        //       at org.example.Stagione.<init>(Stagione.java:12)
        //   See https://diff.blue/R013 to resolve this issue.

        // Arrange
        Campionato campionato = new Campionato("alice.liddell@example.org");

        // Act
        campionato.aggiungiStagione(new Stagione(1, new ArrayList<>()));
    }

    /**
     * Method under test: {@link Campionato#getStagioneByAnno(int)}
     */
    @Test
    void testGetStagioneByAnno() {
        // Arrange, Act and Assert
        assertNull((new Campionato("alice.liddell@example.org")).getStagioneByAnno(1));
    }

    /**
     * Method under test: {@link Campionato#getStagioneByAnno(int)}
     */
    @Test
    void testGetStagioneByAnno2() {
        // Arrange
        Campionato campionato = new Campionato("alice.liddell@example.org");
        Stagione stagione = new Stagione(2000, new ArrayList<>());
        // Act
        campionato.aggiungiStagione(stagione);
        // Assert
       assertEquals(stagione,campionato.getStagioneByAnno(2000));
    }

    /**
     * Method under test: {@link Campionato#getStagioneByAnno(int)}
     */
    @Test
    void testGetStagioneByAnno3() {
        // Arrange
        Campionato campionato = new Campionato("alice.liddell@example.org");
        Stagione stagione = new Stagione(2000, new ArrayList<>());
        // Act
        campionato.aggiungiStagione(stagione);
        // Assert
        assertNull(campionato.getStagioneByAnno(2001));
    }




    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Campionato#setNomeCampionato(String)}
     *   <li>{@link Campionato#getNomeCampionato()}
     *   <li>{@link Campionato#getStagioni()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        Campionato campionato = new Campionato("alice.liddell@example.org");

        // Act
        campionato.setNomeCampionato("alice.liddell@example.org");
        String actualNomeCampionato = campionato.getNomeCampionato();

        // Assert that nothing has changed
        assertEquals("alice.liddell@example.org", actualNomeCampionato);
        assertTrue(campionato.getStagioni().isEmpty());
    }

    /**
     * Method under test: {@link Campionato#Campionato(String)}
     */
    @Test
    void testNewCampionato() {
        // Arrange and Act
        Campionato actualCampionato = new Campionato("alice.liddell@example.org");

        // Assert
        assertEquals("alice.liddell@example.org", actualCampionato.getNomeCampionato());
        assertTrue(actualCampionato.getStagioni().isEmpty());
    }
}
