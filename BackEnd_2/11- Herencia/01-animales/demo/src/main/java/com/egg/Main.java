package com.egg;

import java.util.ArrayList;

import com.egg.entities.Animal;
import com.egg.entities.Conejo;
import com.egg.entities.Duenio;
import com.egg.entities.Gato;
import com.egg.entities.Perro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello animals!");

        // create user
        Duenio usuario = new Duenio("Romina", "Avalos", new ArrayList<>(), (long) 12345);
        Animal cat = new Gato("Garfield", "Angora", "naranja", 7, 5, (long) 12445, usuario);
        Animal bunny = new Conejo("Bad", "Wild", "white", 4, 5, (long) 14785, usuario);
        Animal dog = new Perro("Rocko", "Rottweiler", "negro", 5, 5, (long) 65432, null);

        // pet
        usuario.getmascotas().add(cat);
        usuario.getmascotas().add(bunny);
        usuario.getmascotas().add(dog);

        // show user info
        System.out.println(usuario.toString());

        // feed animals
        for (Animal animal : usuario.getmascotas()) {
            animal.alimentar();
            animal.setVida(animal.getVida() + 1);
        }

        // show animals
        for (Animal animal : usuario.getmascotas()) {
            System.out.println(animal.toString());
        }

    }
}