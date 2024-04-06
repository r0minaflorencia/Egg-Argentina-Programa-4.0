package com.app.entities;

public class Hotel extends Alojamiento {

    protected int cantidadHabitaciones, cantidadCamas, cantidadPisos;
    protected double precio;

    public Hotel() {
    }

    public Hotel(String nombre, String direccion, String localidad, String gerente, int cantidadHabitaciones,
            int cantidadCamas, int cantidadPisos, double precio) {
        super(nombre, direccion, localidad, gerente);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.cantidadCamas = cantidadCamas;
        this.cantidadPisos = cantidadPisos;
        this.precio = precio;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString() + ", cantidad de habitaciones: " + cantidadHabitaciones + ", cantidad de camas: "
                + cantidadCamas + ", cantidad de pisos: " + cantidadPisos + ", precio: " + precio;
    }

}
