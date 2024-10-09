package org.example;

import java.util.ArrayList;
import java.util.List;

public class Campionato {
    private String nomeCampionato;
    private List<Stagione> stagioni;  // Relazione N:1 con Stagione

    public Campionato(String nomeCampionato) {
       setNomeCampionato(nomeCampionato);
        this.stagioni = new ArrayList<>();
    }
    // Aggiungere una stagione al campionato
    public void aggiungiStagione(Stagione stagione) {
        stagioni.add(stagione);
    }

    public List<Stagione> getStagioni() {
        return stagioni;
    }

    public String getNomeCampionato() {
        return nomeCampionato;
    }

    public void setNomeCampionato(String nomeCampionato) {
        this.nomeCampionato = nomeCampionato;
    }

    public Stagione getStagioneByAnno(int anno) {
        for (Stagione stagione : stagioni) {
            if (stagione.getAnno() == anno) {
                return stagione;  // Restituisce la stagione se l'anno corrisponde
            }
        }
        return null;  // Restituisce null se non viene trovata nessuna stagione
    }
}
