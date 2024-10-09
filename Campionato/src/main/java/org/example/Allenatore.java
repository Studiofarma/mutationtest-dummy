package org.example;

public class Allenatore {
    private String nome;
    private String cognome;

    public Allenatore(String nome, String cognome) {

        setNome(nome);
        setCognome(cognome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome==null)
            throw new NullValueException("Nome cannot be null");
        else this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        if(cognome==null)
            throw new NullValueException("Cognome cannot be null");
       else this.cognome = cognome;
    }
}
