package com.example;

import java.util.HashSet;
import java.util.Set;

import com.example.entities.Animal;
import com.example.entities.Gato;
import com.example.entities.Perro;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello animals!");

        // instances
        Animal dog1 = new Perro("Coco", "negro", 4);
        Animal dog2 = new Perro("Canelo", "negro", 3);
        Animal cat = new Gato("Diego", "naranjoso", 7);

        // create list and add Objects to list
        Set<Animal> animals = new HashSet<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(cat);

        // all 4Each
        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }

        // sounds (calling concrete methods)
        System.out.println("\n -- act");
        dog1.saludar();
        dog2.saludar();
        cat.saludar();

        // sounds (calling abstract methods)
        System.out.println("\n -- Hello: ");
        dog1.sonidoAbstracto();
        dog2.sonidoAbstracto();
        cat.sonidoAbstracto();


    }
}