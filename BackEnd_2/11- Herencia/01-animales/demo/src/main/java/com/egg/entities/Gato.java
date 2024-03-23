package com.egg.entities;

public class Gato extends Animal {

    public Gato() {
        super();
    }

    public Gato(String nombre, String raza, String color, int edad, int vida, Long id, Duenio duenio) {
        super(nombre, raza, color, edad, vida, id, duenio);
    }

    @Override
    public void alimentar() {
        System.out.println(Gato.class.getSimpleName() + " " + nombre + " está comiendo balanceado..! :3 ");
    }

}
