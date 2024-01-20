package com.egg;

import com.egg.entidades.Dni;
import com.egg.entidades.Persona;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Persona person = new Persona();
        Dni dni = new Dni();

        //seteo nombre y apellido
        person.setApellido("Avalos");
        person.setNombre("Romina");

        //dni
        dni.setSerie('a');
        dni.setNro(1235);

        //set dni
        person.setDni(dni);

        System.out.println(person.toString());

    }
}