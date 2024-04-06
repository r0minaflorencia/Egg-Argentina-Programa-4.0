package com.app.services;

import java.util.Scanner;

public class Menu {

    private Scanner scan;

    public Menu() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
    }

    public void mostrarMenu() {

        System.out.println("Menú");
        boolean salir = false;

        do {
            System.out.println("Buscar alojamiento en" +
                    "\n a- Hoteles" +
                    "\n b- Alojamientos alternativos");
            char buscar = scan.next().toLowerCase().charAt(0);
            switch (buscar) {
                case 'a':

                    break;

                case 'b':

                    break;

                default:
                    System.out.println("Debes seleccionar una opción válida.");
                    break;
            }
        } while (!salir);

    }

}
