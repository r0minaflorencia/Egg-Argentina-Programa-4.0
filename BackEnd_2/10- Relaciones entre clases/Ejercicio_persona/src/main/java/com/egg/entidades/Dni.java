package com.egg.entidades;

public class Dni {

    private char serie;
    private Integer nro;

    public Dni() {

    }

    public Dni(char serie, Integer nro) {
        this.serie = serie;
        this.nro = nro;
    }

    public Integer getNro() {
        return nro;
    }

    public char getSerie() {
        return serie;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "{" + serie + nro + '}';
    }

}
