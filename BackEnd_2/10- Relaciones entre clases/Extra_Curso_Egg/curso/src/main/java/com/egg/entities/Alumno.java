package com.egg.entities;

import java.util.Objects;

public class Alumno {

    private String nombre, apellido;
    private Integer dni;
    private Voto votos;

    public Alumno() {

    }

    public Alumno(String nombre, String apellido, Integer dni, Voto votos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.votos = votos;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Voto getVotos() {
        return votos;
    }

    public void setVotos(Voto votos) {
        this.votos = votos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Alumno alumno = (Alumno) o;
        return dni == alumno.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return apellido + " " + nombre + ", dni n° " + dni + ", votos: " + votos;
    }

}
