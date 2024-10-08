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
        if(nome==null)
            throw new NullValueException("nome cannot be null");
        else this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        if(cognome==null)
            throw new NullValueException("cognome cannot be null");
        else this.cognome = cognome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public void setRuolo(String ruolo) {
        if(ruolo==null)
            throw new NullValueException("ruolo cannot be null");
        else this.ruolo = ruolo;
    }

}
