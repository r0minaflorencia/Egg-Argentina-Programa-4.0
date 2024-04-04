package com.app.entities;

public abstract class Edificio {

    protected double ancho, largo, altura;

    public Edificio() {
    }

    public Edificio(double ancho, double largo, double altura) {
        this.ancho = ancho;
        this.largo = largo;
        this.altura = altura;
    }

    public abstract void calcularSuperficie();
    public abstract void calcularVolumen();

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [ancho: " + ancho + ", largo: " + largo + ", alto: " + altura;
    }

    
    
}
