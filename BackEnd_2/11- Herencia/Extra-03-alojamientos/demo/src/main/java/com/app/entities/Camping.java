package com.app.entities;

public final class Camping extends ExtraHotel {

    private int capacidadCarpas, cantidadBanios;
    private boolean tieneRestaurante;

    public Camping() {
    }

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean esPrivado,
            double metrosCuadrados, int capacidadCarpas, int cantidadBanios, boolean tieneRestaurante) {
        super(nombre, direccion, localidad, gerente, esPrivado, metrosCuadrados);
        this.capacidadCarpas = capacidadCarpas;
        this.cantidadBanios = cantidadBanios;
        this.tieneRestaurante = tieneRestaurante;
    }

    public int getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(int capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public boolean isTieneRestaurante() {
        return tieneRestaurante;
    }

    public void setTieneRestaurante(boolean tieneRestaurante) {
        this.tieneRestaurante = tieneRestaurante;
    }

    @Override
    public String toString() {
        return super.toString() + ", capacidad para " + capacidadCarpas + " carpas, cantidad de baños: " + cantidadBanios
                + ", ¿tiene restaurante? " + tieneRestaurante + "]";
    }

}
