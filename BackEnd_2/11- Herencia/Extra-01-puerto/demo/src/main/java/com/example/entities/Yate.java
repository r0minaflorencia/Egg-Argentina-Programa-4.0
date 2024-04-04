package com.example.entities;

public class Yate extends Nave {

  private double potenciaCV;
  private int cantidadCamarotes;

  public Yate() {}

  public Yate(
    int eslora,
    int matricula,
    int anioFabricacion,
    double potenciaCV,
    int cantidadCamarotes
  ) {
    super(eslora, matricula, anioFabricacion);
    this.potenciaCV = potenciaCV;
    this.cantidadCamarotes = cantidadCamarotes;
  }

  public double getPotenciaCV() {
    return potenciaCV;
  }

  public void setPotenciaCV(double potenciaCV) {
    this.potenciaCV = potenciaCV;
  }

  public int getCantidadCamarotes() {
    return cantidadCamarotes;
  }

  public void setCantidadCamarotes(int cantidadCamarotes) {
    this.cantidadCamarotes = cantidadCamarotes;
  }

  @Override
  public String toString() {
    return (
      super.toString() +
      ", potencia: " + potenciaCV + " CV., cantidad de camarotes: " + cantidadCamarotes + "]");
  }
}
