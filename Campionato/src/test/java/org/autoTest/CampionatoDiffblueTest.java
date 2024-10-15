package org.autoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.example.Campionato;
import org.example.Stagione;
import org.junit.jupiter.api.Test;

public class CampionatoDiffblueTest {
    /**
     * Method under test: {@link Campionato#aggiungiStagione(Stagione)}
     */
    @Test
    void testAggiungiStagione() {
        // Arrange
        Campionato campionato = new Campionato("alice.liddell@example.org");
        Stagione stagione = new Stagione(2000, new ArrayList<>());

        // Act
        campionato.aggiungiStagione(stagione);

        // Assert
        List<Stagione> stagioni = campionato.getStagioni();
        assertEquals(1, stagioni.size());
        assertSame(stagione, stagioni.get(0));
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
