package org.example;

public class Gol {
    private Giocatore giocatore;
    private Partita partita;

    public Gol(Giocatore giocatore, Partita partita) {

       setGiocatore(giocatore);
       setPartita(partita);
    }

    public Giocatore getGiocatore() {
        return giocatore;
    }

    public void setGiocatore(Giocatore giocatore) {
        this.giocatore = giocatore;
    }

    public Partita getPartita() {
        return partita;
    }

    public void setPartita(Partita partita) {
        this.partita = partita;
    }


}
