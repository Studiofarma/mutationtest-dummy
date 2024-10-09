package org.autoTestNew;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.Allenatore;
import org.example.NullValueException;
import org.junit.jupiter.api.Test;

public class AllenatoreDiffblueTest {
    /**
     * Method under test: {@link Allenatore#setNome(String)}
     */
    @Test
    void testSetNome() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        (new Allenatore("Nome", "Cognome")).setNome("Nome");
    }

    /**
     * Method under test: {@link Allenatore#setNome(String)}
     */
    @Test
    void testSetNome2() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> (new Allenatore("Nome", "Cognome")).setNome(null));
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Allenatore#getCognome()}
     *   <li>{@link Allenatore#getNome()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        Allenatore allenatore = new Allenatore("Nome", "Cognome");

        // Act
        String actualCognome = allenatore.getCognome();

        // Assert
        assertEquals("Cognome", actualCognome);
        assertEquals("Nome", allenatore.getNome());
    }

    /**
     * Method under test: {@link Allenatore#setCognome(String)}
     */
    @Test
    void testSetCognome() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        (new Allenatore("Nome", "Cognome")).setCognome("Cognome");
    }

    /**
     * Method under test: {@link Allenatore#setCognome(String)}
     */
    @Test
    void testSetCognome2() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> (new Allenatore("Nome", "Cognome")).setCognome(null));
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

    /**
     * Method under test: {@link Allenatore#Allenatore(String, String)}
     */
    @Test
    void testNewAllenatore2() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> new Allenatore(null, null));

    }

    /**
     * Method under test: {@link Allenatore#Allenatore(String, String)}
     */
    @Test
    void testNewAllenatore3() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> new Allenatore("Nome", null));

    }
}
