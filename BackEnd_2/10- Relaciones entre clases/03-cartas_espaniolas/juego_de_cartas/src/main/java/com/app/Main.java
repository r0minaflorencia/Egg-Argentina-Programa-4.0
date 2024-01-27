package com.app;

import java.util.Scanner;

import com.app.entities.Baraja;

/*
 * author Romina Avalos
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Juego de cartas");
        Baraja baraja = new Baraja();

        Scanner scan = new Scanner(System.in); // scanner
        boolean exit = false; // flag

        // loop menu
        do {
            System.out.println("\nMenú:" +
                    "\n a- Barajar" +
                    "\n b- Mostrar cartas disponibles de la baraja" +
                    "\n c- Siguiente carta" +
                    "\n d- Mostrar cantidad de cartas disponibles" +
                    "\n e- Adquirir cartas" +
                    "\n f- Mostrar cartas repartidas" +
                    "\n g- salir");
            String rta = scan.next().toLowerCase();
            switch (rta) {
                case "a":
                    baraja.barajar();
                    break;
                case "b":
                    baraja.mostrarDisponibles();
                    break;
                case "c":
                    baraja.siguienteCarta();
                    break;
                case "d":
                    baraja.cantidadDeCartasDisponibles();
                    break;
                case "e":
                System.out.print("Ingresa la cantidad de cartas que queres obtener: ");
                    baraja.adquirirCartas(scan.nextInt());
                    break;
                case "f":
                    baraja.mostrarCartasAdquiridas();
                    break;
                    case "g":
                    System.out.println("Exit");
                    exit = true;
                    break;
                default:
                    System.out.println("Debes ingresar una opción válida.");
                    break;
            }

        } while (!exit);

        scan.close();

    }
}