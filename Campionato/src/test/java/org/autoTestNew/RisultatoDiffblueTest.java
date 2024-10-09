package org.autoTestNew;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.Risultato;
import org.junit.jupiter.api.Test;

public class RisultatoDiffblueTest {
    /**
     * Methods under test:
     * <ul>
     *   <li>{@link Risultato#setGoal1(int)}
     *   <li>{@link Risultato#setGoal2(int)}
     *   <li>{@link Risultato#toString()}
     *   <li>{@link Risultato#getGoal1()}
     *   <li>{@link Risultato#getGoal2()}
     * </ul>
     */
    @Test
    void testGettersAndSetters() {
        // Arrange
        Risultato risultato = new Risultato(1, 1);

        // Act
        risultato.setGoal1(1);
        risultato.setGoal2(1);
        String actualToStringResult = risultato.toString();
        int actualGoal1 = risultato.getGoal1();

        // Assert that nothing has changed
        assertEquals("Risultato{goal1=1, goal2=1}", actualToStringResult);
        assertEquals(1, actualGoal1);
        assertEquals(1, risultato.getGoal2());
    }

    /**
     * Method under test: {@link Risultato#Risultato(int, int)}
     */
    @Test
    void testNewRisultato() {
        // Arrange and Act
        Risultato actualRisultato = new Risultato(1, 1);

        // Assert
        assertEquals(1, actualRisultato.getGoal1());
        assertEquals(1, actualRisultato.getGoal2());
    }
}
