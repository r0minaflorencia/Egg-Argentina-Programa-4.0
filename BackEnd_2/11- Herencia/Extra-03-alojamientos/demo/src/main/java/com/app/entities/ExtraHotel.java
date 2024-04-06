package com.app.entities;

public class ExtraHotel extends Alojamiento {

    protected boolean esPrivado;
    protected double metrosCuadrados;

    public ExtraHotel() {
    }

    public ExtraHotel(String nombre, String direccion, String localidad, String gerente, boolean esPrivado,
            double metrosCuadrados) {
        super(nombre, direccion, localidad, gerente);
        this.esPrivado = esPrivado;
        this.metrosCuadrados = metrosCuadrados;
    }

    public boolean isEsPrivado() {
        return esPrivado;
    }

    public void setEsPrivado(boolean esPrivado) {
        this.esPrivado = esPrivado;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    @Override
    public String toString() {
        return super.toString() + ", ¿es privado? " + esPrivado + ", metros cuadrados: " + metrosCuadrados ;
    }

    

}
