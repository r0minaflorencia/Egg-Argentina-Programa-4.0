package com.extra_biblioteca.servicios;

import com.extra_biblioteca.entidades.Libro;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class LibroServicio {

    private final Scanner scan;
    private HashSet<Libro> books;

    public LibroServicio() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        this.books = new HashSet();
    }

    public static Libro crear() {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar libro");
        System.out.print("Título: ");
        String titulo = scan.next();
        System.out.print("Autor/es: ");
        String autor = scan.next();
        System.out.print("Ejemplares: ");
        int disponibles = scan.nextInt();
        int alquilados = 0;
        System.out.print("ISBN: ");
        Integer isbn = scan.nextInt();

        return new Libro(titulo, autor, disponibles, alquilados, isbn);
    }

    public HashSet<Libro> guardar() {
        books.add(crear());
        return books;
    }

    public void mostrar() {
        for (Libro book : books) {
            System.out.println(book.toString());
        }
    }

    public void alquilar() {
        String buscar;
        boolean encontrado = false;
        boolean confirm = false;

        System.out.println("Buscar por"
                + "\n a- Título"
                + "\n b- Autor/es");
        switch (scan.next().toLowerCase()) {
            case "a":
                System.out.println("Título del libro: ");
                buscar = scan.next().toLowerCase();

                for (Libro book : books) {
                    if (buscar.equals(book.getTitulo().toLowerCase())) {
                        encontrado = true;
                        if (book.getDisponibles() >= 1) { //confirmo disponibilidad del libro
                            do {
                                System.out.println("¿Rentar " + book.getTitulo() + "? (s/n): ");
                                String rta = scan.next().toLowerCase();
                                switch (rta) {
                                    case "s":
                                        book.setAlquilados(book.getAlquilados() + 1);
                                        book.setDisponibles(book.getDisponibles() - 1);
                                        System.out.println("Rentaste " + book.toString());
                                        return;
                                    case "n":
                                        System.out.println("Se canceló la solicitud de renta.");
                                        confirm = true;
                                        break;
                                    default:
                                        System.out.println("Debes ingresar una respuesta válida.");
                                        confirm = false;
                                }
                            } while (!confirm);
                        } else {
                            System.out.println("No contamos con disponibilidad del libro.");
                        }
                    }
                }

                if (!encontrado) {
                    System.out.println("No se encontraron resultados de búsqueda.");
                }

                break;
            case "b":
                System.out.print("Buscar por autor: ");
                buscar = scan.next().toLowerCase();

                for (Libro book : books) {
                    if (book.getAutor().toLowerCase().equals(buscar)) {
                        encontrado = true;
                        System.out.println("Resultados");

                        do {
                            System.out.print(book.getTitulo() + ", ¿Alquilar? (s/n): ");
                            String rta = scan.next().toLowerCase();

                            switch (rta) {
                                case "s":
                                    if (book.getDisponibles() >= 1) {
                                        book.setAlquilados(book.getAlquilados() + 1);
                                        book.setDisponibles(book.getDisponibles() - 1);
                                        System.out.println("Rentaste " + book.toString());
                                        return;
                                    } else {
                                        System.out.println("No contamos con disponibilidad del libro.");
                                    }
                                case "n":
                                    System.out.println("Se canceló la solicitud de renta.");
                                    confirm = true;
                                    break;
                                default:
                                    System.out.println("Debes ingresar una respuesta válida.");
                                    confirm = false;
                            }
                        } while (!confirm);
                    }
                }

                if (!encontrado) {
                    System.out.println("No se encontraron resultados de búsqueda.");
                }

                break;

            default:
                System.out.println("Debes ingresar una opción válida.");
        }

    }

    public void devolver() {
        boolean encontrado = false;

        System.out.println("Devolver"
                + "\n ingresa el título: ");
        String devolver = scan.next().toLowerCase();

        for (Libro book : books) {
            if (devolver.equals(book.getTitulo().toLowerCase())
                    && book.getAlquilados() >= 1) {
                encontrado = true;
                System.out.println("¿Devolver " + book.getTitulo() + "? (s/n): ");
                String rta = scan.next().toLowerCase();
                if (rta.equals("s")) {
                    book.setAlquilados(book.getAlquilados() - 1);
                    book.setDisponibles(book.getDisponibles() + 1);
                    System.out.println("Devolviste " + book.toString());
                    return;
                } else {
                    System.out.println("La solicitud no se procesó correctamente. Intente nuevamente.");
                }
            } else {
                System.out.println("No existe registro de la renta en nuestro sistema.");
            }
        }

        if (!encontrado) {
            System.out.println("No se encontraron resultados de búsqueda.");
        }

    }

}
