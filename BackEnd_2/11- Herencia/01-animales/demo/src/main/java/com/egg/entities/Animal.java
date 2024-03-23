package com.egg.entities;

public abstract class Animal {

    protected String nombre, raza, color;
    protected int edad, vida;
    protected Long id;
    protected Duenio duenio;

    public abstract void alimentar();

    public Animal() {

    }

    public Animal(String nombre, String raza, String color, int edad, int vida, Long id, Duenio duenio) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.edad = edad;
        this.vida = vida;
        this.id = id;
        this.duenio = duenio;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animal [nombre: " + nombre + ", raza: " + raza +
                ", color: " + color + ", edad: " + edad
                + ", ID:" + id + "] vida: " + vida;
    }

}
