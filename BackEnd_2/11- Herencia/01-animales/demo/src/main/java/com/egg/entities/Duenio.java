package com.egg.entities;

import java.util.List;

public class Duenio {

    private String nombre, apellido;
    private List<Animal> mascotas;
    private Long dni;

    public Duenio() {
    }

    public Duenio(String nombre, String apellido, List<Animal> mascotas, Long dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mascotas = mascotas;
        this.dni = dni;
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

    public List<Animal> getmascotas() {
        return mascotas;
    }

    public void setmascotas(List<Animal> mascotas) {
        this.mascotas = mascotas;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
        result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
        result = prime * result + ((mascotas == null) ? 0 : mascotas.hashCode());
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Duenio other = (Duenio) obj;
        if (nombre == null) {
            if (other.nombre != null)
                return false;
        } else if (!nombre.equals(other.nombre))
            return false;
        if (apellido == null) {
            if (other.apellido != null)
                return false;
        } else if (!apellido.equals(other.apellido))
            return false;
        if (mascotas == null) {
            if (other.mascotas != null)
                return false;
        } else if (!mascotas.equals(other.mascotas))
            return false;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Usuario [ " + apellido + " " + nombre + ", DNI: " + dni + ", mascotas/s: " + mascotas + "]";
    }

}
