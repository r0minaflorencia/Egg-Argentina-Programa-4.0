package com.egg.entities;

public class Perro extends Animal {

    public Perro() {
        super();
    }

    public Perro(String nombre, String raza, String color, int edad, int vida, Long id, Duenio duenio) {
        super(nombre, raza, color, edad, vida, id, duenio);
    }

    @Override
    public void alimentar() {
        System.out.println(Perro.class.getSimpleName() + " " + nombre + " está comiendo balanceado..! :3 ");
    }

   
    
}
