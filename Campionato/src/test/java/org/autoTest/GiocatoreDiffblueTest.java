package org.autoTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.Giocatore;
import org.example.NullValueException;
import org.junit.jupiter.api.Test;

public class GiocatoreDiffblueTest {
    /**
     * Method under test: {@link Giocatore#setNome(String)}
     */
    @Test
    void testSetNome() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        (new Giocatore("Nome", "Cognome", "Ruolo")).setNome("Nome");
    }

    /**
     * Method under test: {@link Giocatore#setNome(String)}
     */
    @Test
    void testSetNome2() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> (new Giocatore("Nome", "Cognome", "Ruolo")).setNome(null));
    }

    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Giocatore#getCognome()}
     *   <li>{@link Giocatore#getNome()}
     *   <li>{@link Giocatore#getRuolo()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        Giocatore giocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        // Act
        String actualCognome = giocatore.getCognome();
        String actualNome = giocatore.getNome();

        // Assert
        assertEquals("Cognome", actualCognome);
        assertEquals("Nome", actualNome);
        assertEquals("Ruolo", giocatore.getRuolo());
    }

    /**
     * Method under test: {@link Giocatore#setCognome(String)}
     */
    @Test
    void testSetCognome() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        (new Giocatore("Nome", "Cognome", "Ruolo")).setCognome("Cognome");
    }

    /**
     * Method under test: {@link Giocatore#setCognome(String)}
     */
    @Test
    void testSetCognome2() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> (new Giocatore("Nome", "Cognome", "Ruolo")).setCognome(null));
    }

    /**
     * Method under test: {@link Giocatore#setRuolo(String)}
     */
    @Test
    void testSetRuolo() {
        // TODO: Diffblue Cover was only able to create a partial test for this method:
        //   Diffblue AI was unable to find a test

        // Arrange and Act
        (new Giocatore("Nome", "Cognome", "Ruolo")).setRuolo("Ruolo");
    }

    /**
     * Method under test: {@link Giocatore#setRuolo(String)}
     */
    @Test
    void testSetRuolo2() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> (new Giocatore("Nome", "Cognome", "Ruolo")).setRuolo(null));
    }

    /**
     * Method under test: {@link Giocatore#Giocatore(String, String, String)}
     */
    @Test
    void testNewGiocatore() {
        // Arrange and Act
        Giocatore actualGiocatore = new Giocatore("Nome", "Cognome", "Ruolo");

        // Assert
        assertEquals("Cognome", actualGiocatore.getCognome());
        assertEquals("Nome", actualGiocatore.getNome());
        assertEquals("Ruolo", actualGiocatore.getRuolo());
    }

    /**
     * Method under test: {@link Giocatore#Giocatore(String, String, String)}
     */
    @Test
    void testNewGiocatore2() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> new Giocatore(null, null, null));

    }

    /**
     * Method under test: {@link Giocatore#Giocatore(String, String, String)}
     */
    @Test
    void testNewGiocatore3() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> new Giocatore("Nome", null, null));

    }

    /**
     * Method under test: {@link Giocatore#Giocatore(String, String, String)}
     */
    @Test
    void testNewGiocatore4() {
        // Arrange, Act and Assert
        assertThrows(NullValueException.class, () -> new Giocatore("Nome", "Cognome", null));

    }
}
