package com.cinema.entities;

public class Butaca {
    private int nro;
    private char letra;
    private boolean disponibilidad;

    public Butaca() {

    }

    public Butaca(int nro, char letra, boolean disponibilidad) {
        this.nro = nro;
        this.letra = letra;
        this.disponibilidad = disponibilidad;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    @Override
    public String toString() {
        return letra + nro + " - disponibilidad: " + disponibilidad;
    }

}
