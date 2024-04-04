package com.example.entities;

public class Nave {

    protected int eslora, matricula, anioFabricacion;

    public Nave() {
    }

    public Nave(int eslora, int matricula, int anioFabricacion) {
        this.eslora = eslora;
        this.matricula = matricula;
        this.anioFabricacion = anioFabricacion;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [eslora: " + eslora + ", matricula: " + matricula + ", fabricada en: " + anioFabricacion;
    }

    

}
