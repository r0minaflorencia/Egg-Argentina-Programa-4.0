package com.egg.entities;

public class Conejo extends Animal {

    public Conejo() {
        super();
    }

    public Conejo(String nombre, String raza, String color, int edad, int vida, Long id, Duenio duenio) {
        super(nombre, raza, color, edad, vida, id, duenio);
    }

    @Override
    public void alimentar() {
        System.out.println(Conejo.class.getSimpleName() + " " + nombre + " está comiendo zanahorias..! :B ");
    }

}
