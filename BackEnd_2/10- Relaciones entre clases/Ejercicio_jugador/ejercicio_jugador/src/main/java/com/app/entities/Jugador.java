package com.app.entities;

public class Jugador implements Comparable<Jugador> {

    String nombre, apellido;
    Integer nro;
    int posicion;

    public Jugador() {

    }

    public Jugador(String nombre, String apellido, int posicion, Integer nro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.nro = nro;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNro() {
        return nro;
    }

    public void setNro(Integer nro) {
        this.nro = nro;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Jugador jugador = (Jugador) o;

        return nro.equals(jugador.nro);
    }

    @Override
    public int hashCode() {
        return nro.hashCode();
    }

    @Override
    public int compareTo(Jugador o) {
        return this.nro.compareTo(o.getNro());
    }

    @Override
    public String toString() {
        return " \nN°" + nro + ": " + nombre + " " + apellido + ", ranking: " + posicion;
    }

}