package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestStagione {

    private Campionato serieA;
    private Stagione stagione2023;
    private Stagione stagione2024;
    private Squadra juventus;
    private Squadra milan;
    private Squadra inter;
    private Partita partita1;
    private Partita partita2;
    private Partita partita3,partita4;
    private Giocatore g1,g2,g3,g4,g5,g6;
    private Allenatore a1,a2,a3,a4;
    private Risultato risultato1,risultato2,risultato3;
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        // Creazione del campionato
        serieA = new Campionato("Serie A");

        // Creazione dei giocatori
        g1 = new Giocatore("Dusan", "Vlahovic", "Attaccante");
        g2 = new Giocatore("Nicolò", "Fagioli", "Centrocampista");
        g3 = new Giocatore("Alvaro", "Morata", "Attaccante");
        g4 = new Giocatore("Christian", "Pulisic", "Centrocampista");
        g5 = new Giocatore("Lautaro", "Martinez", "Attaccante");
         g6 = new Giocatore("Nicolo", "Barella", "Centrocampista");

        // Creazione degli allenatori
        a1 = new Allenatore("Thiago", "Motta");
        a2 = new Allenatore("Max", "Allegri");
        a3 = new Allenatore("Stefano", "Pioli");
        a4 = new Allenatore("Simone", "Inzaghi");

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
        juventus = new Squadra("Juventus", a1, giocatoriJuve);
        milan = new Squadra("Milan", a3, giocatoriMilan);
        inter = new Squadra("Inter", a4, giocatoriInter);

        // Creazione delle stagioni
        stagione2024 = new Stagione(2024, List.of(juventus,milan,inter));

        // Creazione di partite per la stagione 2024
        partita1 = new Partita("2024-10-03", juventus, milan, stagione2024);
        partita2 = new Partita("2024-10-10", milan, inter, stagione2024);
        partita3 = new Partita("2024-10-17", inter,juventus, stagione2024);
        partita4= new Partita("2024-05-06",juventus,milan,stagione2024);
        // Impostazione dei risultati
        risultato1 = new Risultato(2, 1); // Juventus 2 - Milan 1
        risultato2 = new Risultato(1, 1); // Milan 1 - Inter 1 (pareggio)
        risultato3 = new Risultato(3, 0); //  Juventus 0 - Inter 3

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

    }

    @Test
    void testAggiungiPartita() {
        assertEquals(List.of(partita1,partita2,partita3), stagione2024.getPartite(), "Le partite non corrispondono a quelle inserite");
    }

    @Test
    void testAggiungiPartitaNoCasa() {
        List<Giocatore> giocatoriNapoli = new ArrayList<>();
        giocatoriNapoli.add(g1);
        giocatoriNapoli.add(g2);
        Squadra napoli = new Squadra("Napoli", a4,giocatoriNapoli);
        assertEquals(List.of(partita1,partita2,partita3), stagione2024.getPartite(), "Le partite non corrispondono a quelle inserite");
        Partita partita4 = new Partita("2023-10-03", napoli, juventus, stagione2024);
        stagione2024.aggiungiPartita(partita4);
        assertTrue(outputStreamCaptor.toString().trim().contains("Errore: Squadra: " + partita4.getSquadraCasa().getNomeSquadra() + " non iscritta alla stagione!"));
        assertEquals(List.of(partita1,partita2,partita3), stagione2024.getPartite(), "Le partite non corrispondono a quelle inserite");
    }

    @Test
    void testAggiungiPartitaNoOspiti() {
        List<Giocatore> giocatoriNapoli = new ArrayList<>();
        giocatoriNapoli.add(g1);
        giocatoriNapoli.add(g2);
        Squadra napoli = new Squadra("Napoli", a4,giocatoriNapoli);
        assertEquals(List.of(partita1,partita2,partita3), stagione2024.getPartite(), "Le partite non corrispondono a quelle inserite");
        Partita partita4 = new Partita("2023-10-03", juventus,napoli , stagione2024);
        stagione2024.aggiungiPartita(partita4);
        assertTrue(outputStreamCaptor.toString().trim().contains("Errore: Squadra: " + partita4.getSquadraOspite().getNomeSquadra() + " non iscritta alla stagione!"));
        assertEquals(List.of(partita1,partita2,partita3), stagione2024.getPartite(), "Le partite non corrispondono a quelle inserite");
    }

    @Test
    void testAggiungiSetPartite() {
        stagione2024.getPartite().clear();
        stagione2024.setPartite(List.of(partita1,partita2,partita3));
        assertEquals(List.of(partita1,partita2,partita3), stagione2024.getPartite(), "Le partite non corrispondono a quelle inserite");
    }

    @Test
    void testAggiungiSetNoOspiti() {
        stagione2024.getPartite().clear();
        List<Giocatore> giocatoriNapoli = new ArrayList<>();
        giocatoriNapoli.add(g1);
        giocatoriNapoli.add(g2);
        Squadra napoli = new Squadra("Napoli", a4,giocatoriNapoli);
        Partita partita4 = new Partita("2023-10-03", juventus,napoli , stagione2024);
        stagione2024.setPartite(List.of(partita4));
        assertTrue(outputStreamCaptor.toString().trim().contains("Errore: Squadra: " + partita4.getSquadraOspite().getNomeSquadra() + " non iscritta alla stagione!"));
        assertEquals(Collections.emptyList(), stagione2024.getPartite(), "Le partite non corrispondono a quelle inserite");
    }

    @Test
    void testAggiungiSetNoCasa() {
        stagione2024.getPartite().clear();
        List<Giocatore> giocatoriNapoli = new ArrayList<>();
        giocatoriNapoli.add(g1);
        giocatoriNapoli.add(g2);
        Squadra napoli = new Squadra("Napoli", a4,giocatoriNapoli);
        Partita partita4 = new Partita("2023-10-03", napoli,juventus , stagione2024);
        stagione2024.setPartite(List.of(partita4));
        assertTrue(outputStreamCaptor.toString().trim().contains("Errore: Squadra: " + partita4.getSquadraCasa().getNomeSquadra() + " non iscritta alla stagione!"));
        assertEquals(Collections.emptyList(), stagione2024.getPartite(), "Le partite non corrispondono a quelle inserite");
    }

    /*
    @Test
    void testCalcolaClassifica() {

        // Calculate standings
        stagione2024.getPartite().clear();

        LinkedHashMap<Squadra, Integer> classifica = stagione2024.calcolaClassifica();
        LinkedHashMap<Squadra, Integer> expecedClassifica = new LinkedHashMap<>();

        expecedClassifica.put(juventus,Integer.valueOf(3));
        expecedClassifica.put(milan,Integer.valueOf(0));
        stagione2024.aggiungiPartita(partita1);
        assertEqualsClassifica(expecedClassifica,stagione2024.calcolaClassifica());

        expecedClassifica.clear();
        expecedClassifica.put(juventus,Integer.valueOf(3));
        expecedClassifica.put(milan,Integer.valueOf(1));
        expecedClassifica.put(inter,Integer.valueOf(1));
        stagione2024.aggiungiPartita(partita2);
        assertEqualsClassifica(expecedClassifica,stagione2024.calcolaClassifica());

        expecedClassifica.clear();
        expecedClassifica.put(inter,Integer.valueOf(4));
        expecedClassifica.put(juventus,Integer.valueOf(3));
        expecedClassifica.put(milan,Integer.valueOf(1));
        stagione2024.aggiungiPartita(partita3);
        assertEqualsClassifica(expecedClassifica,stagione2024.calcolaClassifica());

        stagione2024.aggiungiPartita(partita4);
        assertEqualsClassifica(expecedClassifica,stagione2024.calcolaClassifica());
    }*/

    @Test
    void testCalcolaClassificaPareggio() {
        // Calculate standings
        stagione2024.getPartite().clear();
        stagione2024.aggiungiPartita(partita4);
        LinkedHashMap<Squadra, Integer> expecedClassifica = new LinkedHashMap<>();

        expecedClassifica.put(juventus, 0);
        expecedClassifica.put(milan, 0);
        assertEqualsClassifica(expecedClassifica,stagione2024.calcolaClassifica());
        stagione2024.aggiungiRisultato(new Risultato(0,0),partita4,Collections.emptyList(),Collections.emptyList());

        expecedClassifica.put(juventus, 1);
        expecedClassifica.put(milan, 1);

        assertEqualsClassifica(expecedClassifica,stagione2024.calcolaClassifica());

    }

    @Test
    void testCalcolaClassificaVittoria2() {
        // Calculate standings
        stagione2024.getPartite().clear();
        stagione2024.aggiungiPartita(partita4);
        stagione2024.aggiungiRisultato(new Risultato(0,1),partita4,Collections.emptyList(),List.of(new Gol(g4,partita4)));

        LinkedHashMap<Squadra, Integer> expecedClassifica = new LinkedHashMap<>();

        expecedClassifica.put(milan,Integer.valueOf(3));
        expecedClassifica.put(juventus,Integer.valueOf(0));
        assertEqualsClassifica(expecedClassifica,stagione2024.calcolaClassifica());
    }
    @Test
    void testCalcolaClassificaVittoria1() {
        // Calculate standings
        stagione2024.getPartite().clear();
        stagione2024.aggiungiPartita(partita4);
        stagione2024.aggiungiRisultato(new Risultato(1,0),partita4,List.of(new Gol(g1,partita4)),Collections.emptyList());

        LinkedHashMap<Squadra, Integer> expecedClassifica = new LinkedHashMap<>();

        expecedClassifica.put(juventus,Integer.valueOf(3));
        expecedClassifica.put(milan,Integer.valueOf(0));
        assertEqualsClassifica(expecedClassifica,stagione2024.calcolaClassifica());
    }

    @Test
    void testClassificaMarcatori(){
        LinkedHashMap<Giocatore, Integer> marcatori = stagione2024.classificaMarcatori();
        LinkedHashMap<Giocatore, Integer> expectedMarcatori = new LinkedHashMap<>();
        expectedMarcatori.put(g5,3);
        expectedMarcatori.put(g1,2);
        expectedMarcatori.put(g3,2);
        expectedMarcatori.put(g6,1);

        assertEqualsMarcatori(expectedMarcatori, marcatori); // Giocatore2 deve essere primo (10 gol)
    }

    private void assertEqualsMarcatori(LinkedHashMap<Giocatore, Integer> expected, LinkedHashMap<Giocatore, Integer> actual) {
        // Check that both maps have the same size
        assertEquals(expected.size(), actual.size(), "The maps have different sizes.");
        // Get iterators for both maps
        Iterator<Map.Entry<Giocatore, Integer>> expectedIterator = expected.entrySet().iterator();
        Iterator<Map.Entry<Giocatore, Integer>> actualIterator = actual.entrySet().iterator();

        // Iterate over both maps and compare each entry one by one
        while (expectedIterator.hasNext() && actualIterator.hasNext()) {
            Map.Entry<Giocatore, Integer> expectedEntry = expectedIterator.next();
            Map.Entry<Giocatore, Integer> actualEntry = actualIterator.next();

            // Check if the keys (Giocatore) are the same
            assertEquals(expectedEntry.getKey(), actualEntry.getKey(), "The players are not the same.");

            // Check if the values (goal counts) are the same
            assertEquals(expectedEntry.getValue(), actualEntry.getValue(), "The goal counts do not match for player: " + expectedEntry.getKey().getNome());
        }
    }

    private void assertEqualsClassifica(LinkedHashMap<Squadra, Integer> expected, LinkedHashMap<Squadra, Integer> actual) {
        // Check that both maps have the same size
        assertEquals(expected.size(), actual.size(), "The maps have different sizes.");
        // Get iterators for both maps
        Iterator<Map.Entry<Squadra, Integer>> expectedIterator = expected.entrySet().iterator();
        Iterator<Map.Entry<Squadra, Integer>> actualIterator = actual.entrySet().iterator();

        // Iterate over both maps and compare each entry one by one
        while (expectedIterator.hasNext() && actualIterator.hasNext()) {
            Map.Entry<Squadra, Integer> expectedEntry = expectedIterator.next();
            Map.Entry<Squadra, Integer> actualEntry = actualIterator.next();

            // Check if the keys (Giocatore) are the same
            assertEquals(expectedEntry.getKey(), actualEntry.getKey(), "La squadra non è la stessa.");

            // Check if the values (goal counts) are the same
            assertEquals(expectedEntry.getValue(), actualEntry.getValue(), "I punti non corrispondono " + expectedEntry.getKey().getNomeSquadra());
        }
    }

    @Test
    void testToString() {
        String expectedString = partita1.toString() + "\n" + partita2.toString() + "\n" + partita3.toString() + "\n";
        assertEquals(expectedString, stagione2024.toString(), "toString non ritorna corrispondenza corretta.");
    }

    @Test
    void testNoPartiteInStagioneToString(){
        Stagione stagioneEmpty = new Stagione(2026, Collections.emptyList());
        String expectedString = "Nessuna partita in questo stagione.\n";
        assertEquals(expectedString, stagioneEmpty.toString(), "toString non ritorna corrispondenza corretta.");
    }

    @Test
    void testGetSquadre(){
        assertEquals(List.of(juventus,milan,inter),stagione2024.getSquadre());
    }

    @Test
    void testGetGiocatoriSquadra(){
        List<Giocatore> giocatoriJuve = new ArrayList<>();
        giocatoriJuve.add(g1);
        giocatoriJuve.add(g2);
        assertEquals(giocatoriJuve,stagione2024.getGiocatoriSquadra(juventus));
    }

    @Test
    void testGetGiocatoriSquadraNotExist(){
        List<Giocatore> giocatoriNapoli = new ArrayList<>();
        giocatoriNapoli.add(g1);
        giocatoriNapoli.add(g2);
        Squadra napoli = new Squadra("Napoli", a4,giocatoriNapoli);

        List<Giocatore> giocatori= stagione2024.getGiocatoriSquadra(napoli);
        assertTrue(outputStreamCaptor.toString().trim().contains("La squadra: "+ napoli.getNomeSquadra()+ " nella stagione :" + stagione2024.getAnno() + " non è presente"));
        assertNull(giocatori);
    }

    @Test
    void testCreaPartite(){
        stagione2023 = new Stagione(2023, List.of(juventus,milan,inter));
        serieA.aggiungiStagione(stagione2023);
        serieA.getStagioneByAnno(2023).creaPartite();

        assertEquals(6,stagione2023.getPartite().size());

       // assertEquals("2023-09-01",stagione2023.getPartite().get(0).getData());
        assertTrue(verificaDistanzaSetteGiorniTraPartite(stagione2023.getAnno(),stagione2023.getPartite()));


        Partita p1=new Partita("2023-09-01",juventus,milan,stagione2023);
        Partita p2=new Partita("2023-09-08",juventus,inter,stagione2023);
        Partita p3=new Partita("2023-09-15",milan,inter,stagione2023);
        Partita p4=new Partita("2023-09-22",milan,juventus,stagione2023);
        Partita p5=new Partita("2023-09-29",inter,juventus,stagione2023);
        Partita p6=new Partita("2023-10-06",inter,milan,stagione2023);

        ArrayList<Partita> partite = new ArrayList<>();
        partite.addAll(List.of(p1,p2,p3,p4,p5,p6));
        // check all match
        assertEquals(partite.toString(),stagione2023.getPartite().toString());
    }

    public boolean verificaDistanzaSetteGiorniTraPartite(int anno,List<Partita> partite) {
        if (partite.size() < 2) {
            return true;  // Se c'è solo una partita, non c'è bisogno di fare confronti
        }

        for (int i = 1; i < partite.size(); i++) {
            LocalDate dataPrecedente = LocalDate.parse(partite.get(i - 1).getData());
            LocalDate dataCorrente = LocalDate.parse(partite.get(i).getData());

            if(i==0){
                String start=anno+"-09-"+"01";
                if(!dataCorrente.toString().equals(start)){
                    return false;
                }
            }
            long differenzaGiorni = ChronoUnit.DAYS.between(dataPrecedente, dataCorrente);

            if (differenzaGiorni != 7) {
                return false;  // La differenza non è di 7 giorni
            }
        }

        return true;  // Tutte le partite hanno una distanza di 7 giorni
    }
    @Test
    public void testAggiungiRisultato() {
        stagione2023 = new Stagione(2023, List.of(juventus,milan,inter));
        serieA.aggiungiStagione(stagione2023);
        serieA.getStagioneByAnno(2023).aggiungiPartita(partita1);

        // Crea un risultato
        Risultato risultato = new Risultato(2, 1); // Juventus 2 - Milan 1

        // Crea liste di gol (se necessario)
        List<Gol> golJuventus = new ArrayList<>();
        List<Gol> golMilan = new ArrayList<>();

        // Aggiungi i gol (fai riferimento alla tua implementazione di Gol)
        golJuventus.add(new Gol(g1, partita1));
        golJuventus.add(new Gol(g1, partita1));
        golMilan.add(new Gol(g3, partita1));

        // Aggiungi il risultato alla partita
        serieA.getStagioneByAnno(2023).aggiungiRisultato(risultato, serieA.getStagioneByAnno(2023).getPartite().get(0), golJuventus, golMilan);

        // Verifica che il risultato sia stato impostato correttamente
        Partita partita = serieA.getStagioneByAnno(2023).getPartite().get(0);
        assertNotNull(partita.getRisultato());
        assertEquals(2, partita.getRisultato().getGoal1()); // Juventus
        assertEquals(1, partita.getRisultato().getGoal2()); // Milan
    }
}
