package com.cinema.services;

import java.util.ArrayList;
import java.util.Collections;
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
        peliculas.add(new Pelicula("Narnia: el leon, la bruja y el ropero", "Andrew Adamson", 140, true));
        peliculas.add(new Pelicula("Narnia: el principe Caspian", "Andrew Adamson", 144, false));
        peliculas.add(new Pelicula("Narnia: la travesia del viajero del alba", "Michael Apted", 115, true));

        return peliculas;
    }

    public List<Espectador> cargarUsuariosPredeterminados() {
        espectadores.add(new Espectador("Daniel", 28, 250));
        espectadores.add(new Espectador("Gabriela", 17, 120));
        espectadores.add(new Espectador("Nico", 33, 300));
        espectadores.add(new Espectador("Clara", 29, 550));
        espectadores.add(new Espectador("Celeste", 25, 100));
        espectadores.add(new Espectador("David", 30, 430));
        espectadores.add(new Espectador("Ana", 16, 83));

        return espectadores;
    }

    public void simulacion() {
        double precioEntrada = 150;
        Pelicula selectedMovie = null;

        Scanner scan = new Scanner(System.in);

        System.out.print("Ingresa el título de la película que deseas ver: ");
        String buscarPelicula = scan.nextLine();

        for (Pelicula movie : peliculas) {
            if (movie.getTitulo().equalsIgnoreCase(buscarPelicula)) {
                selectedMovie = movie;
                break;
            }
        }

        if (selectedMovie != null) {

            for (Espectador user : espectadores) {

                if (selectedMovie.getAtp() == false && user.getEdad() < 18) {
                    System.out.println(user.getNombre() + ": la película es apta para mayores de edad.");
                } else if ((selectedMovie.getAtp() == false && user.getEdad() >= 18)
                        || selectedMovie.getAtp() == true) {
                    if (user.getDineroDisponible() >= precioEntrada) {
                        Collections.shuffle(butacas);

                        for (ButacaEnum butaca : butacas) {
                            if (butaca.getDisponibilidad() == true) {
                                butaca.setDisponibilidad(false);
                                System.out.println(user.toString() + " ha ocupado la butaca: " + butaca.name());

                            }
                            break;
                        }

                    } else {
                        System.out.println(user.getNombre() + " no cuenta con dinero suficiente.");
                    }
                }
            }

        } else {
            System.out.println("No has seleccionado una película.");
        }

    }

    public void actualizarCartelera() {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n Selecciona una opción" +
                "\n a- Agregar película" +
                "\n b- Eliminar película");
        String option = scan.next().toLowerCase();

        switch (option) {
            case "a":
            agregarPelicula();
                break;
            case "b":
                eliminarPelicula();
                break;
            default:
            System.out.println("Debes ingresar una respuesta válida.");
                break;
        }

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

    public void eliminarPelicula() {
        System.out.println("método en construcción...");
    }

    public void cargarNuevoUsuario() {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        String respuesta;

        espectadores.add(EspectadorService.cargarUsuario());

        do {
            System.out.print("¿Agregar otro usuario? (s/n): ");
            respuesta = scan.next().toLowerCase();
            switch (respuesta) {
                case "s":
                    espectadores.add(EspectadorService.cargarUsuario());
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
        Collections.sort(butacas);
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
