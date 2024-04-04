package com.example.entities;

public class BarcoMotor extends Nave {

    private double potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(int eslora, int matricula, int anioFabricacion, double potenciaCV) {
        super(eslora, matricula, anioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public double getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(double potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    @Override
    public String toString() {
        return super.toString() + ", potencia: " + potenciaCV + " CV]";
    }

}
