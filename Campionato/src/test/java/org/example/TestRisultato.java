package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestRisultato {

    private Risultato risultato;

    @BeforeEach
    public void setUp() {
        // Initialize the Risultato object before each test
        risultato = new Risultato(2, 3); // Example values
    }

    @Test
    public void testGetGoal1() {
        assertEquals(2, risultato.getGoal1(), "Goal1 dovrebbe essere 2");
    }

    @Test
    public void testGetGoal2() {
        assertEquals(3, risultato.getGoal2(), "Goal2 dovrebbe essere 3");
    }

    @Test
    public void testToString() {
        String expected = "Risultato{goal1=2, goal2=3}";
        assertEquals(expected, risultato.toString(), "toString() dovrebbe ritornare la stringa corretta!");
    }
}
