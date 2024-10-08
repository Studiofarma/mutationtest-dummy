package org.example;

import java.util.ArrayList;
import java.util.List;

public class Partita {
    private String data;
    private Squadra squadraCasa;
    private Squadra squadraOspite;
    private Risultato risultato;
    private List<Gol> golPartita;
    private Stagione stagione;

    public Partita(String data, Squadra squadraCasa, Squadra squadraOspite,Stagione stagione) {
        setData(data);
        setSquadraCasa(squadraCasa);
        setSquadraOspite(squadraOspite);
        setStagione(stagione);
        this.golPartita = new ArrayList<>();
    }

    public Risultato getRisultato() {
        return risultato;
    }

    public void setRisultato(Risultato risultato,List<Gol> goal1,List<Gol> goal2) {
        boolean correct=true;
        if(risultato.getGoal1()!=goal1.size() || risultato.getGoal2()!=goal2.size()){
            System.out.println("Errore! Il risultato e i marcatori non corrispondono");
            correct=false;
        }
        else {
            for (Gol g : goal1) {
                if(squadraContieneGiocatore(squadraCasa,g.getGiocatore(),stagione)){
                    golPartita.add(g);
                }
                else{
                    correct=false;
                    System.out.println("Il giocatore: "+g.getGiocatore().getCognome() + " nella stagione " + stagione.getAnno() + " NON apparteneva alla squadra : " + squadraCasa.getNomeSquadra());
                }
            }
            for (Gol g : goal2) {
                if(squadraContieneGiocatore(squadraOspite,g.getGiocatore(),stagione)){
                    golPartita.add(g);
                }
                else{
                    correct=false;
                    System.out.println("Il giocatore: "+g.getGiocatore().getCognome() + " nella stagione " + stagione.getAnno() + " NON apparteneva alla squadra : " + squadraOspite.getNomeSquadra());
                }
            }

        }
        if(correct){
            this.risultato = risultato;
            System.out.println("Risultato aggiunto correttamente!");
        }
        else{ golPartita=new ArrayList<>();}
    }

    private boolean squadraContieneGiocatore(Squadra squadra, Giocatore giocatore, Stagione stagione) {
        List<Giocatore> giocatori = stagione.getGiocatoriSquadra(squadra);

        if (giocatori != null) {
            return giocatori.contains(giocatore);
        }
        return false;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Squadra getSquadraCasa() {
        return squadraCasa;
    }

    public void setSquadraCasa(Squadra squadraCasa) {
        this.squadraCasa = squadraCasa;
    }

    public Squadra getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(Squadra squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public List<Gol> getGolPartita() {
        return golPartita;
    }

    private void setGolPartita(List<Gol> golPartita) {
        this.golPartita = golPartita;
    }
    public Stagione getStagione() {
        return stagione;
    }

    public void setStagione(Stagione stagione) {
        this.stagione = stagione;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Partita tra ")
                .append(squadraCasa.getNomeSquadra()).append(" e ").append(squadraOspite.getNomeSquadra())
                .append(" il ").append(data).append("\n")
                .append("Risultato: ").append(risultato).append("\n");

        if (!golPartita.isEmpty()) {
            sb.append("Gol segnati:\n");
            for (Gol gol : golPartita) {
                sb.append("- ").append(gol.getGiocatore().getNome()).append(" ").append(gol.getGiocatore().getCognome()).append("\n");
            }
        }
        sb.append("-----------------------------------------------------------");
        return sb.toString();
    }
}
