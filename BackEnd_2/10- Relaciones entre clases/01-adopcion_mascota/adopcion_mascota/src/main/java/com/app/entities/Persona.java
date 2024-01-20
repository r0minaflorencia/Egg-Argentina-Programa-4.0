package com.app.entities;

import java.util.Set;

public class Persona implements Comparable {

    private String nombre, apellido;
    private int edad;
    private Integer dni;
    private Set<Perro> perros;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer dni, int edad, Set<Perro> perros) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.perros = perros;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Perro> getPerros() {
        return perros;
    }

    public void setPerros(Set<Perro> perros) {
        this.perros = perros;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    @Override
    public String toString() {
        return "{" + nombre + " " + apellido + " DNI n°: " + dni + ", edad: " + edad + " años." + "}";
    }

}
