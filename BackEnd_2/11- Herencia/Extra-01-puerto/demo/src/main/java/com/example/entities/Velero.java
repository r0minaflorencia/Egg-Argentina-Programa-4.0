package com.example.entities;

public class Velero extends Nave {

    private int nroMastiles;

    public Velero() {
    }

    public Velero(int eslora, int matricula, int anioFabricacion, int nroMastiles) {
        super(eslora, matricula, anioFabricacion);
        this.nroMastiles = nroMastiles;
    }

    public int getNroMastiles() {
        return nroMastiles;
    }

    public void setNroMastiles(int nroMastiles) {
        this.nroMastiles = nroMastiles;
    }

    @Override
    public String toString() {
        return super.toString() + ", nroMastiles: " + nroMastiles + "]";
    }

    

}
