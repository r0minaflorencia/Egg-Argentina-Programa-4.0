package com.app.entities;

public class Polideportivo extends Edificio {

    private boolean techado;

    public Polideportivo() {

    }

    public Polideportivo(double ancho, double largo, double alto, boolean techado) {
        super(ancho, largo, alto);
        this.techado = techado;
    }

    @Override
    public void calcularSuperficie() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
                "Unimplemented method 'calcularSuperficie'");
    }

    @Override
    public void calcularVolumen() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
                "Unimplemented method 'calcularVolumen'");
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
