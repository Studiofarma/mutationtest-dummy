package org.example;

public class Giocatore {
    private String nome;
    private String cognome;
    private String ruolo;

    public Giocatore(String nome, String cognome, String ruolo) {
       setNome(nome);
        setCognome(cognome);
        setRuolo(ruolo);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        this.ruolo = ruolo;
    }

}
