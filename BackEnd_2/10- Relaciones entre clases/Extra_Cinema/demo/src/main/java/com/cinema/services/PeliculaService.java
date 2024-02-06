package com.cinema.services;

import java.util.Scanner;

import com.cinema.entities.Pelicula;

public class PeliculaService {

    private Scanner scan;

    public PeliculaService() {
        this.scan = new Scanner(System.in);
    }

    public Pelicula agregarPelicula() {
        System.out.println("Agregar pelicula");
        System.out.print("Título: ");
        String titulo = scan.nextLine();
        System.out.print("Director: ");
        String director = scan.nextLine();
        System.out.print("Duración: ");
        int duracion = scan.nextInt();
        boolean atp = false;
        String respuesta;
        do {
            System.out.print("¿Es ATP? (s/n): ");
            respuesta = scan.next().toLowerCase();

            if (respuesta.equals("s")) {
                atp = true;
                break;
            } else if (respuesta.equals("n")) {
                atp = false;
                break;
            } else {
                System.out.println("Debes ingresar una respuesta válida.");
            }
        } while (!respuesta.equals("s") || !respuesta.equals("n"));

        return new Pelicula(titulo, director, duracion, atp);
    }

}
