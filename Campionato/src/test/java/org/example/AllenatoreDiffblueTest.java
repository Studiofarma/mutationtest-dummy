package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AllenatoreDiffblueTest {
    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Allenatore#setCognome(String)}
     *   <li>{@link Allenatore#setNome(String)}
     *   <li>{@link Allenatore#getCognome()}
     *   <li>{@link Allenatore#getNome()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        // Act
        allenatore.setCognome("Cognome");
        allenatore.setNome("Nome");
        String actualCognome = allenatore.getCognome();

        // Assert that nothing has changed
        assertEquals("Cognome", actualCognome);
        assertEquals("Nome", allenatore.getNome());
    }

    /**
     * Method under test: {@link Allenatore#Allenatore(String, String)}
     */
    @Test
    void testNewAllenatore() {
        // Arrange and Act
        Allenatore actualAllenatore = new Allenatore("Nome", "Cognome");

        // Assert
        assertEquals("Cognome", actualAllenatore.getCognome());
        assertEquals("Nome", actualAllenatore.getNome());
    }
}
