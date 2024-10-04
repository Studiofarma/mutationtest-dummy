package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TestSquadra {

    private Stagione stagione;

    private List<Squadra> squadre;
    private Giocatore g1, g2, g3, g4;
    private Squadra juventus, milan;
    private Allenatore a1, a2;
    private List<Giocatore> giocatoriJuve;
    private List<Giocatore> giocatoriMilan;
    private Campionato campionato;
    @BeforeEach
    void setUp() {
        // Inizializza i giocatori
        g1 = new Giocatore("Dusan", "Vlahovic", "Attaccante");
        g2 = new Giocatore("Nicolò", "Fagioli", "Centrocampista");

        // Inizializza le liste di giocatori
        giocatoriJuve = new ArrayList<>();
        giocatoriJuve.add(g1);
        giocatoriJuve.add(g2);

        // Inizializza gli allenatori
        a1 = new Allenatore("Thiago", "Motta");
        // Inizializza le squadre
        juventus = new Squadra("Juventus", a1, giocatoriJuve);
    }

    @Test
    void testGetNomeSquadra() {
        assertEquals("Juventus", juventus.getNomeSquadra());
    }

    @Test
    void testGetAllenatori() {
        assertEquals(a1, juventus.getAllenatore());
    }

    @Test
    void testGiocatori(){
        assertEquals(giocatoriJuve, juventus.getGiocatori());
    }


    @Test
    void testSetNomeSquadra() {
        juventus.setNomeSquadra("Juventus FC");
        assertEquals("Juventus FC", juventus.getNomeSquadra());
    }

    @Test
    void testSetAllenatore() {
        Allenatore n=new Allenatore("Max","Allegri");
        juventus.setAllenatore(n);
        assertEquals(n, juventus.getAllenatore());
    }
    @Test
    void testSetGiocatori(){
        List<Giocatore> giocatori= new ArrayList<>();
        giocatori.add(g2);
        juventus.setGiocatori(giocatori);
        assertEquals(giocatori, juventus.getGiocatori());
    }

}
