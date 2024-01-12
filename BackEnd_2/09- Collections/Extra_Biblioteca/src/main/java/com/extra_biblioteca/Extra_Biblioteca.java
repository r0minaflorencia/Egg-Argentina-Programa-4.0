package com.extra_biblioteca;

import com.extra_biblioteca.servicios.LibroServicio;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra_Biblioteca {

    public static void main(String[] args) {

        //welcome
        System.out.println("/// Biblioteca ///");

        //instance of services
        LibroServicio serviceClass = new LibroServicio();

        //scanner
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        //flag
        boolean salir = false;

        //loop
        do {
            //menu
            System.out.println(); //space
            System.out.println("    Menu    "
                    + "\n a- Ingresar ítems"
                    + "\n b- Rentar"
                    + "\n c- Devolver"
                    + "\n d- Mostrar libros"
                    + "\n e- Salir");
            switch (scan.next().toLowerCase()) {
                case "a" ->
                    serviceClass.guardar();
                case "b" ->
                    serviceClass.alquilar();
                case "c" ->
                    serviceClass.devolver();
                case "d" ->
                    serviceClass.mostrar();
                case "e" ->
                    salir = true;
                default ->
                    System.out.println("Debes ingresar una respuesta válida.");
            }
            System.out.println(); //space
        } while (!salir);

    }
}
