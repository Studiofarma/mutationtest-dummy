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
        if(giocatore==null)
            throw new NullValueException("Giocatore cannot be null");
        else this.giocatore = giocatore;

    }

    public Partita getPartita() {
        return partita;
    }

    public void setPartita(Partita partita) {
        if(partita==null)
            throw new NullValueException("Partita cannot be null");
        else this.partita = partita;

    }


}
