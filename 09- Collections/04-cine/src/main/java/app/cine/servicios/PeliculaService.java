package app.cine.servicios;

import app.cine.entidades.Pelicula;
import app.cine.utilidades.Comparators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no. */
/**
 *
 * @author Romina
 */
public class PeliculaService {

    public static Pelicula createMovie() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cargar película");

        System.out.print("Título: ");
        String titulo = scan.next();
        System.out.print("Director: ");
        String director = scan.next();
        System.out.print("Duración: ");
        Integer duracion = scan.nextInt();

        return new Pelicula(titulo, director, duracion);
    }

    public List<Pelicula> arrayMovies() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        List<Pelicula> movies = new ArrayList();
        boolean salir;

        do {
            movies.add(createMovie());

            System.out.print("¿Guardar otra película? (s/n): ");
            String rta = scan.next();
            if (rta.equalsIgnoreCase("s")) {
                salir = false;
            } else if (rta.equalsIgnoreCase("n")) {
                salir = true;
            } else {
                System.out.println("No has ingresado una respuesta válida.");
                salir = true;
            }

        } while (!salir);

        return movies;
    }

    public void showArray(List<Pelicula> movies) {
        System.out.println();
        System.out.println("Lista de películas");
        for (Pelicula movie : movies) {
            System.out.println(movie);
        }
    }

    public void filterByDuration(List<Pelicula> movies) {
        System.out.println();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Filtrar películas con duración mayor a ___ hs. ");
        int filtrarDuracion = scan.nextInt();

        for (Pelicula movie : movies) {
            if (movie.getDuracion() >= filtrarDuracion) {
                System.out.println(movie);
            }
        }
    }

    public void sortByDurationAsc(List<Pelicula> movies) {
        System.out.println();
        Collections.sort(movies, Comparators.orderByTitleAsc);
        System.out.println("Ordenar por duración de forma ascendente");

        for (Pelicula movie : movies) {
            System.out.println("[" + movie.toString() + "]");
        }
    }

    public void sortByDurationDesc(List<Pelicula> movies) {
        System.out.println();
        Collections.sort(movies, Comparators.orderByTitleDesc);
        System.out.println("Ordenar por duración de forma descendente");

        for (Pelicula movie : movies) {
            System.out.println("[" + movie.toString() + "]");
        }
    }

    public void sortByTitleAsc(List<Pelicula> movies) {
        System.out.println();
        Collections.sort(movies, Comparators.orderByTitleAsc);
        System.out.println("Ordenar por título de A-Z");

        for (Pelicula movie : movies) {
            System.out.println("[" + movie.getTitulo() + "]");
        }

    }

    public void sortByTitleDesc(List<Pelicula> movies) {
        System.out.println();
        Collections.sort(movies, Comparators.orderByTitleDesc);
        System.out.println("Ordenar por título de Z-A");

        for (Pelicula movie : movies) {
            System.out.println("[" + movie.getTitulo() + "]");
        }
    }

}
