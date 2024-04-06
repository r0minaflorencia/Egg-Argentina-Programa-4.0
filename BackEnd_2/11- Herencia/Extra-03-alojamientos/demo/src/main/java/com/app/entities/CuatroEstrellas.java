package com.app.entities;

public class CuatroEstrellas extends Hotel {

    protected String gimnasio, restaurante;
    protected int capacidadRestaurante;

    public CuatroEstrellas() {
    }

    public CuatroEstrellas(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones,
            int cantidadCamas, int cantidadPisos, double precio, String gimnasio, String restaurante,
            int capacidadRestaurante) {
        super(nombre, direccion, localidad, gerente, cantidadHabitaciones, cantidadCamas, cantidadPisos, precio);
        this.gimnasio = gimnasio;
        this.restaurante = restaurante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(String restaurante) {
        this.restaurante = restaurante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    @Override
    public String toString() {
        return super.toString() + ", gimnasio: " + gimnasio + ", restaurante: " + restaurante
                + ", capacidad del restaurante: " + capacidadRestaurante + "]";
    }

}
