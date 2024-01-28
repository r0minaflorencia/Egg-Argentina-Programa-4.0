package com.app;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * author Romina Avalos;
 */

import com.app.entities.Perro;
import com.app.entities.Persona;

public class Main {
    public static void main(String[] args) {

        // welcome
        System.out.println("Sistema de adopción canina");

        Set<Perro> perros = new HashSet<>();
        Set<Persona> personas = new HashSet<>();
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        String option;

        do {
            System.out.println(
                    "Menú" +
                            "\n a- cargar perros" +
                            "\n b- registrar persona" +
                            "\n c- mostrar perros" +
                            "\n d- adoptar" +
                            "\n e- mostrar personas" +
                            "\n f- salir");
            option = scan.next().toLowerCase();
            switch (option) {
                case "a":
                    agregarPerros(perros);
                    break;
                case "b":
                    agregarPersonas(personas);
                    break;
                case "c":
                    mostrarPerros(perros);
                    break;
                case "d":
                    adoptar(perros, personas);
                    break;
                case "e":
                    mostrarPersonas(personas);
                    break;
                case "f":
                    System.out.println("exit");
                    exit = true;
                    break;
                default:
                    System.out.println("Debes ingresar una opción válida.");
                    break;
            }
        } while (!exit);

        scan.close();

        System.out.println(); // space

    }

    public static Set<Persona> agregarPersonas(Set<Persona> personas) {
        if (personas.add(registrarPersona())) {
            System.out.println("Se ha registrado correctamente");
        } else {
            System.out.println("Ya existe una persona registrada con ese dni.");
        }
        return personas;
    }

    public static Persona registrarPersona() {
        System.out.println("Registrar persona");
        Scanner scan = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = scan.next();
        System.out.print("Apellido: ");
        String apellido = scan.next();
        System.out.print("Dni: ");
        Integer dni = scan.nextInt();
        System.out.print("Edad: ");
        int edad = scan.nextInt();

        return new Persona(nombre, apellido, dni, edad, new HashSet<>());
    }

    public static Set<Perro> agregarPerros(Set<Perro> perros) {
        perros.add(registrarPerros());
        return perros;
    }

    public static Perro registrarPerros() {
        System.out.println("Registrar perro");
        Scanner scan = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = scan.next();
        System.out.print("Raza: ");
        String raza = scan.next();
        System.out.print("Tamaño: ");
        String tamanio = scan.next();
        System.out.print("Edad: ");
        int edad = scan.nextInt();

        return new Perro(nombre, raza, tamanio, edad);
    }

    public static void adoptar(Set<Perro> perros, Set<Persona> personas) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresa tus datos para adoptar una mascota");
        System.out.print("Nombre: ");
        String nombre = scan.next().toLowerCase();
        System.out.print("Dni: ");
        Integer dni = scan.nextInt();
        boolean successfulLogIn = false;
        boolean perroEncontrado = false;

        for (Persona persona : personas) {
            if ((persona.getDni().equals(dni)) && (persona.getNombre().toLowerCase().equals(nombre))) {
                successfulLogIn = true;
                System.out.print("Nombre del perro que desea adoptar: ");
                String adoptar = scan.next().toLowerCase();
                String confirm;

                for (Perro perro : perros) {
                    if ((successfulLogIn) && (perro.getNombre().toLowerCase().equals(adoptar))
                            && (perro.getDuenio() == null)) {
                        perroEncontrado = true;
                        System.out.print(persona.getNombre() + " " + persona.getApellido() +
                                " ¿Confirmas que queres adoptar a " + perro.getNombre() + "? (s/n): ");
                        confirm = scan.next().toLowerCase();
                        switch (confirm) {
                            case "s":
                                perro.setDuenio(persona);
                                persona.getPerros().add(perro);
                                System.out.println("¡Felicitaciones! Adoptaste a " + perro.getNombre());
                                break;
                            case "n":
                                break;
                            default:
                                break;
                        }
                    } else if (successfulLogIn && perro.getNombre().toLowerCase().equals(adoptar)
                            && perro.getDuenio() != null) {
                        System.out.println(perro.getNombre() + " ya fue adoptado/a.");
                        return;
                    }
                }

                if (!perroEncontrado) {
                    System.out.println("No se encuentra el perro que buscas.");
                }
            }
        }

        if (!successfulLogIn) {
            System.out.println("No estas registrado en nuestro sistema, debes hacerlo primero para poder adoptar.");
        }

    }

    public static void mostrarPersonas(Set<Persona> personas) {
        System.out.println("Lista de personas registradas en el sistema");
        if (personas.isEmpty()) {
            System.out.println("No se encuentran personas registradas.");
            return;
        } else {
            for (Persona persona : personas) {
                if (persona.getPerros().isEmpty()) {
                    System.out.println(persona.toString());
                } else {
                    System.out.println(persona.toString() + " \n Perros: " + persona.getPerros());
                }
            }
        }

    }

    public static void mostrarPerros(Set<Perro> perros) {
        System.out.println("Perros registrados");
        if (perros.isEmpty()) {
            System.out.println("No se encuentran perros registrados.");
            return;
        } else {
            for (Perro perro : perros) {
                if (perro.getDuenio() == null) {
                    System.out.println(perro.toString());
                } else {
                    System.out.println("[" + perro.toString() + " \nDueño/a: " +
                            perro.getDuenio().getNombre() + " " + perro.getDuenio().getApellido() + "]");
                }
            }
        }
    }

}