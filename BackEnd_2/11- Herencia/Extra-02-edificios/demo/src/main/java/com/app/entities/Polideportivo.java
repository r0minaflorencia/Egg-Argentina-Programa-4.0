package com.app.entities;

public class Polideportivo extends Edificio {

    private boolean techado;

    public Polideportivo() {

    }

    public Polideportivo(double ancho, double largo, double alto, boolean techado) {
        super(ancho, largo, alto);
        this.techado = techado;
    }

    public Polideportivo crear() {
        // TODO here
        return null;
    }

    @Override
    public void calcularSuperficie(double largo, double ancho) {
        System.out.println("La superficie del polideportivo es de " + (largo * ancho));
    }

    @Override
    public void calcularVolumen(double largo, double ancho, double altura) {
        System.out.println("El volumen del polideportivo es de " + (largo * ancho * altura));
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

    @Override
    public String toString() {
        return super.toString() + ", ¿techado? " + techado + "]";
    }

}
