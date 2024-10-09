package org.example;

import java.util.List;
import java.util.Map;

public class Squadra {
    private String nomeSquadra;
    private Allenatore allenatore;
    private List<Giocatore>giocatori;

    public Squadra(String nomeSquadra,Allenatore allenatore, List<Giocatore>giocatori) {
       setNomeSquadra( nomeSquadra);
       setAllenatore(allenatore);
       setGiocatori(giocatori);
    }


    public String getNomeSquadra() {
        return nomeSquadra;
    }

    public void setNomeSquadra(String nomeSquadra) {
        if(nomeSquadra==null)
            throw new NullValueException("Nome squadra cannot be null");
        else this.nomeSquadra = nomeSquadra;
    }


    public Allenatore getAllenatore() {
        return allenatore;
    }

    public void setAllenatore(Allenatore allenatore) {
        if(allenatore==null)
            throw new NullValueException("Allenatore cannot be null");
        else this.allenatore = allenatore;

    }

    public List<Giocatore> getGiocatori() {
        return giocatori;
    }

    public void setGiocatori(List<Giocatore> giocatori) {
        if(giocatori==null)
            throw new NullValueException("Partita cannot be null");
        else this.giocatori = giocatori;
    }
}
