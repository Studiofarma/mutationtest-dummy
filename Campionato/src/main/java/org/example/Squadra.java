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
        this.nomeSquadra = nomeSquadra;
    }


    public Allenatore getAllenatore() {
        return allenatore;
    }

    public void setAllenatore(Allenatore allenatore) {
        this.allenatore = allenatore;
    }

    public List<Giocatore> getGiocatori() {
        return giocatori;
    }

    public void setGiocatori(List<Giocatore> giocatori) {
        this.giocatori = giocatori;
    }
}
