package com.example.entities;

import java.time.LocalDate;

public class Cliente {

    private String nombre, apellido;
    private int dni, posicionAmarre;
    private LocalDate fechaAlquiler, fechaDevolucion;
    private Nave barco;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Cliente(String nombre, String apellido, int dni, int posicionAmarre, LocalDate fechaAlquiler,
    LocalDate fechaDevolucion, Nave barco) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.posicionAmarre = posicionAmarre;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public LocalDate getFechaAlquiler() {
        return fechaAlquiler;
    }

    public void setFechaAlquiler(LocalDate fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(LocalDate fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Nave getBarco() {
        return barco;
    }

    public void setBarco(Nave barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Cliente [nombre: " + nombre + ", apellido: " + apellido + ", DNI: " + dni + "]";
    }

    

}
