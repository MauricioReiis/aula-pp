package org.example;

public class Detento {
    private String crime;
    private String bloco;
    private String pena;

    public Detento() {
        this.crime = "";
        this.bloco = "";
    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getPena() {
        return pena;
    }

    public void setPena(String pena) {
        this.pena = pena;
    }
}
