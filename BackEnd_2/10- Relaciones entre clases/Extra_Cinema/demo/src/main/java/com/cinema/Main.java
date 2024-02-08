package com.cinema;

import java.util.Scanner;

import com.cinema.services.SalaService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Cinema!");

        SalaService salaService = new SalaService();
        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        do {
            System.out.println("Menú" +
                    "\n a- Cargar sala" +
                    "\n b- Mostrar cartelera" +
                    "\n c- Simulación" +
                    "\n d- Mostrar estado de butacas" +
                    "\n e- Actualizar cartelera" +
                    "\n f- Cargar nuevo usuario" +
                    "\n g- Salir");
            String respuesta = scan.next().toLowerCase();

            switch (respuesta) {
                case "a":
                    salaService.create(); // cargar pelicula y espectadores de prueba;
                    break;
                case "b":
                    salaService.mostrarCartelera();
                    break;
                case "c":
                    salaService.simulacion();
                    break;
                case "d":
                    salaService.mostrarButacas();
                    break;
                case "e":
                    salaService.actualizarCartelera();
                    break;
                case "f":
                    salaService.cargarNuevoUsuario();
                    break;
                case "g":
                    System.out.println("Exit.");
                    exit = true;
                    break;
                default:
                    System.out.println("Debes ingresar una respuesta válida.");
                    break;
            }

        } while (!exit);

        scan.close();

    }
}