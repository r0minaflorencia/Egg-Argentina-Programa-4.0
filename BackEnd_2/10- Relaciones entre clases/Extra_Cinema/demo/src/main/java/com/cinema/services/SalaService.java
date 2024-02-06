package com.cinema.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cinema.entities.Espectador;
import com.cinema.entities.Pelicula;
import com.cinema.entities.Sala;
import com.cinema.enums.ButacaEnum;

public class SalaService {

    private ArrayList<Pelicula> peliculas;
    private ArrayList<ButacaEnum> butacas;
    private ArrayList<Espectador> espectadores;

    public SalaService() {
        this.butacas = new ArrayList<>();
        this.peliculas = new ArrayList<>();
        this.espectadores = new ArrayList<>();
    }

    public Sala create() {
        inicializarSala();
        cargarPeliculasPorDefecto();
        cargarUsuariosPredeterminados();
        System.out.println("Se inicializó la sala correctamente.");
        return new Sala(butacas, peliculas);
    }

    public ArrayList<ButacaEnum> inicializarSala() {
        for (ButacaEnum butaca : ButacaEnum.values()) {
            butacas.add(butaca);
        }
        return butacas;
    }

    public List<Pelicula> cargarPeliculasPorDefecto() {
        peliculas.add(new Pelicula("Narnia: El León, la Bruja y el Ropero", "Andrew Adamson", 140, true));
        peliculas.add(new Pelicula("Narnia: El príncipe Caspian", "Andrew Adamson", 144, true));
        peliculas.add(new Pelicula("Narnia: La travesía del Viajero del Alba", "Michael Apted", 115, true));

        return peliculas;
    }

    public List<Espectador> cargarUsuariosPredeterminados() {
        espectadores.add(new Espectador("Daniel", 28, 250));
        espectadores.add(new Espectador("Gabriela", 17, 120));
        espectadores.add(new Espectador("Nico", 33, 300));
        espectadores.add(new Espectador("Clara", 29, 550));
        espectadores.add(new Espectador("Celeste", 25, 100));
        espectadores.add(new Espectador("David", 30, 430));

        return espectadores;
    }

    public void simulacion() {
        double precioEntrada = 150;
        System.out.println("En proceso...");
    }

    public void agregarPelicula() {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        String respuesta;

        peliculas.add(PeliculaService.agregarPelicula());

        do {
            System.out.print("¿Agregar otra película? (s/n): ");
            respuesta = scan.next().toLowerCase();
            switch (respuesta) {
                case "s":
                    peliculas.add(PeliculaService.agregarPelicula());
                    break;
                case "n":
                    exit = true;
                    break;
                default:
                    System.out.println("Debes ingresar una respuesta válida.");
                    break;
            }

        } while (!exit);
    }

    public void mostrarCartelera() {
        if (peliculas.isEmpty()) {
            System.out.println("No se cargaron peliculas aún.");
        } else {
            System.out.println("Películas:");
            for (Pelicula pelicula : peliculas) {
                System.out.println(pelicula.toString());
            }
        }
    }

    public void mostrarButacas() {
        if (butacas.isEmpty()) {
            System.out.println("Debes inicializar la sala primero.");
        } else {
            System.out.println("Butacas:");
            for (ButacaEnum butaca : butacas) {
                System.out.print("[" + butaca.name() + " - disponibilidad: " + butaca.getDisponibilidad() + "] ");
            }
        }
    }

}
