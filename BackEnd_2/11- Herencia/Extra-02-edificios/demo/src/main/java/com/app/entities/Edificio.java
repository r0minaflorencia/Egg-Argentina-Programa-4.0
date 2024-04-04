package com.app.entities;

public abstract class Edificio {

    protected double ancho, largo, alto;

    public Edificio() {
    }

    public Edificio(double ancho, double largo, double alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
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

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [ancho: " + ancho + ", largo: " + largo + ", alto: " + alto;
    }

    
    
}
