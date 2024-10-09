package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class TestPartita {
    private Stagione stagione;
    private Partita partita;
    private List<Squadra> squadre;
    private Giocatore g1, g2, g3, g4;
    private Squadra juventus, milan;
    private Allenatore a1, a2;
    private List<Giocatore> giocatoriJuve;
    private List<Giocatore> giocatoriMilan;
    private Campionato campionato;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        // Setup for each test
        campionato = new Campionato("Serie A");
        squadre = new ArrayList<>();

        // Inizializza i giocatori
        g1 = new Giocatore("Dusan", "Vlahovic", "Attaccante");
        g2 = new Giocatore("Nicolò", "Fagioli", "Centrocampista");
        g3 = new Giocatore("Alvaro", "Morata", "Attaccante");
        g4 = new Giocatore("Christian", "Pulisic", "Centrocampista");

        // Inizializza le liste di giocatori
        giocatoriJuve = new ArrayList<>();
        giocatoriJuve.add(g1);
        giocatoriJuve.add(g2);

        giocatoriMilan = new ArrayList<>();
        giocatoriMilan.add(g3);
        giocatoriMilan.add(g4);

        // Inizializza gli allenatori
        a1 = new Allenatore("Thiago", "Motta");
        a2 = new Allenatore("Max", "Allegri");

        // Inizializza le squadre
        juventus = new Squadra("Juventus", a1, giocatoriJuve);
        milan = new Squadra("Milan", a2, giocatoriMilan);

        // Aggiungi le squadre alla lista
        squadre.add(juventus);
        squadre.add(milan);
        stagione = new Stagione(2023, squadre);

        // Create a new match
        partita = new Partita("2023-10-03", juventus, milan, stagione);
    }

    @Test
    void testConstructor() {
        assertEquals("2023-10-03",partita.getData());
        assertEquals(juventus,partita.getSquadraCasa());
        assertEquals(milan,partita.getSquadraOspite());
        assertEquals(stagione,partita.getStagione());
        assertNull(partita.getRisultato());
        assertTrue(partita.getGolPartita().isEmpty());
    }

    @Test
    void testGoalPartita(){
        Gol gol = new Gol(new Giocatore("Alvaro", "Morata", "Attaccante"), partita);
        partita = new Partita("2060-10-03", juventus, milan, stagione);
        partita.setGolPartita(List.of(gol));
        assertEquals(List.of(gol),partita.getGolPartita());
    }

    @Test
    void testSetRisultatoSuccess() {
        // Arrange
        Risultato risultato = new Risultato(1, 1);
        Gol gol = new Gol(g1, partita); // Vlahovic scores
        Gol gol2 = new Gol(g3, partita);
        partita.setRisultato(risultato, Arrays.asList(gol), Arrays.asList(gol2));

        // Assert
        assertEquals(risultato, partita.getRisultato());
        assertEquals(2, partita.getGolPartita().size());
        assertTrue(partita.getGolPartita().contains(gol));
        Assertions.assertEquals("Risultato aggiunto correttamente!", outputStreamCaptor.toString().trim());
    }

    @Test
    void testSetRisultatoGoalMismatch() {
        // Arrange
        Risultato risultato = new Risultato(2, 1);
        Gol golCasa = new Gol(g1, partita); // Vlahovic scores
        Gol golOspite = new Gol(new Giocatore("Alvaro", "Morata", "Attaccante"), partita); // Incorrect player

        partita.setRisultato(risultato, Arrays.asList(golCasa), Collections.emptyList());
        Assertions.assertEquals("Errore! Il risultato e i marcatori non corrispondono", outputStreamCaptor.toString().trim());
        assertNull(partita.getRisultato(), "Il risultato deve essere null perchè non c'è corrispondenza con il risultato");
        assertEquals(Collections.emptyList(),partita.getGolPartita());
    }
    @Test
    void testSetRisultatoGoalMismatchFirst() {
        // Arrange
        Risultato risultato = new Risultato(0, 1);
       // Gol golCasa = new Gol(g1, partita); // Vlahovic scores
        Gol golOspite = new Gol(new Giocatore("Alvaro", "Morata", "Attaccante"), partita); // Incorrect player

        partita.setRisultato(risultato, Collections.emptyList(),Collections.emptyList());
        Assertions.assertEquals("Errore! Il risultato e i marcatori non corrispondono", outputStreamCaptor.toString().trim());
        assertNull(partita.getRisultato(), "Il risultato deve essere null perchè non c'è corrispondenza con il risultato");
        assertEquals(Collections.emptyList(),partita.getGolPartita());
    }
    @Test
    void testSetRisultatoGoalMismatchSecond() {
        // Arrange
        Risultato risultato = new Risultato(0, 0);
        Gol golCasa = new Gol(g1, partita); // Vlahovic scores

        partita.setRisultato(risultato, Arrays.asList(golCasa), Collections.emptyList());
        Assertions.assertEquals("Errore! Il risultato e i marcatori non corrispondono", outputStreamCaptor.toString().trim());
        assertNull(partita.getRisultato(), "Il risultato deve essere null perchè non c'è corrispondenza con il risultato");
        assertEquals(Collections.emptyList(),partita.getGolPartita());
    }

    @Test
    void testSetRisultatoIncorrectPlayerCasa() {
        // Arrange
        Risultato risultato = new Risultato(1, 0);
        Gol golCasa = new Gol(new Giocatore("Pavel", "Nedved", "Centrocampista"), partita);

        partita.setRisultato(risultato, Arrays.asList(golCasa), Collections.emptyList());
        Assertions.assertEquals("Il giocatore: Nedved nella stagione "+ stagione.getAnno() + " NON apparteneva alla squadra : "
                +partita.getSquadraCasa().getNomeSquadra(), outputStreamCaptor.toString().trim());
        assertNull(partita.getRisultato(), "Il risultato deve essere null perchè non c'è corrispondenza con i giocatori");
        assertEquals(Collections.emptyList(),partita.getGolPartita());
    }

    @Test
    void testSetRisultatoIncorrectOspite() {
        // Arrange
        Risultato risultato = new Risultato(0, 1);
        Gol golOspite = new Gol(new Giocatore("Gonzalo", "Higuain", "Attaccante"), partita); // Not in the team

        partita.setRisultato(risultato, Collections.emptyList(), Arrays.asList(golOspite));
        Assertions.assertEquals("Il giocatore: Higuain nella stagione "+ stagione.getAnno()
                + " NON apparteneva alla squadra : "+partita.getSquadraOspite().getNomeSquadra(), outputStreamCaptor.toString().trim());
        assertNull(partita.getRisultato(), "Il risultato deve essere null perchè non c'è corrispondenza con i giocatori");
        assertEquals(Collections.emptyList(),partita.getGolPartita());
    }

    @Test
    public void testSetRisultato_GolNonCorrispondenti_ClearGolPartita() {
        Risultato risultato = new Risultato(2, 1); // Risultato errato: 2 gol per Juventus, ma solo 1 nella lista
        List<Gol> golJuventus = new ArrayList<>();
        List<Gol> golMilan = new ArrayList<>();

        golJuventus.add(new Gol(g1, partita));
        golMilan.add(new Gol(g2, partita));

        // Prima di chiamare il metodo, aggiungiamo un gol a golPartita
        partita.getGolPartita().add(new Gol(g1, partita));
        assertFalse(partita.getGolPartita().isEmpty()); // Assicuriamoci che golPartita non sia vuota prima della chiamata

        // Chiamata del metodo
        partita.setRisultato(risultato, golJuventus, golMilan);

        // Verifica che golPartita sia stata svuotata a causa dell'errore
        assertTrue(partita.getGolPartita().isEmpty()); // Assicura che la lista sia stata svuotata
    }

    @Test
    void testToString() {
        // Arrange
        Risultato risultato = new Risultato(1, 0);
        Gol gol = new Gol(g1, partita);
        partita.setRisultato(risultato, Arrays.asList(gol), Collections.emptyList());

        // Act
        String partitaString = partita.toString();

        // Assert
        assertEquals(partitaString,"Partita tra Juventus e Milan il 2023-10-03\n" + "Risultato: " + risultato +'\n'+
                "Gol segnati:"+ '\n'+"- Dusan Vlahovic" +'\n' +"-----------------------------------------------------------");
    }

    @Test
    void testToStringNoGoal() {
        // Arrange
        Risultato risultato = new Risultato(0, 0);
        partita.setRisultato(risultato, Collections.emptyList(), Collections.emptyList());
        String partitaString = partita.toString();

        // Assert
        assertEquals(partitaString,"Partita tra Juventus e Milan il 2023-10-03\n" + "Risultato: " + risultato +'\n'+
                "-----------------------------------------------------------");
    }

    @Test
    void testSsquadraContieneGiocatore(){
        assertFalse(partita.squadraContieneGiocatore(juventus,g3,stagione));
        assertTrue(partita.squadraContieneGiocatore(juventus,g1,stagione));
        // caso che mi elimina il mutante
        Squadra inter = new Squadra("Inter", a1,  Collections.emptyList());
        assertFalse(partita.squadraContieneGiocatore(inter,g1,stagione));
    }
}
