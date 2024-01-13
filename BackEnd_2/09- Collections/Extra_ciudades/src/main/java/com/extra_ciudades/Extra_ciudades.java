package com.extra_ciudades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra_ciudades {

    public static void main(String[] args) {

        System.out.println("/// Welcome ///");

        HashMap<Integer, String> codigosPostales = new HashMap();
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        //menu
        boolean exit = false; //flag menu
        do {
            System.out.println("\n Menu"
                    + "\n a- Ingresar ciudades"
                    + "\n b- Mostrar todas las ciudades"
                    + "\n c- Eliminar"
                    + "\n d- Buscar"
                    + "\n e- Salir");
            String selectMenu = scan.next().toLowerCase();

            switch (selectMenu) {

                case "a":
                    load(codigosPostales);
                    break;
                case "b":
                    if (!codigosPostales.isEmpty()) {
                        mostrar(codigosPostales);
                    } else {
                        System.out.println("Todavía no se han cargado ciudades.");
                    }
                    break;
                case "c":
                    if (!codigosPostales.isEmpty()) {
                        eliminar(codigosPostales);
                    } else {
                        System.out.println("Todavía no se han cargado ciudades.");
                    }
                    break;
                case "d":
                    if (!codigosPostales.isEmpty()) {
                        buscarPorCodigo(codigosPostales);
                    } else {
                        System.out.println("Todavía no se han cargado ciudades.");
                    }
                    break;
                case "e":
                    exit = true;
                    break;
                default:
                    System.out.println("Debes ingresar una opción válida.");
            }
        } while (!exit);

    }

    public static HashMap<Integer, String> load(HashMap<Integer, String> codigosPostales) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        String nombre;
        Integer cp;

        for (int i = 0; i <= 4; i++) {

            System.out.println((i + 1) + " / 5");
            System.out.print("Nombre de ciudad: ");
            nombre = scan.next();
            System.out.print("Código postal: ");
            cp = scan.nextInt();

            codigosPostales.put(cp.intValue(), nombre);
        }

        return codigosPostales;
    }

    public static void mostrar(HashMap<Integer, String> codigosPostales) {
        System.out.println("\n Lista de ciudades");
        for (Map.Entry<Integer, String> aux : codigosPostales.entrySet()) {
            System.out.println(aux.getKey() + " - " + aux.getValue());
        }
    }

    public static Integer buscarPorCodigo(HashMap<Integer, String> codigosPostales) {
        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Buscar ciudad");
        System.out.print("Ingresá el código postal: ");
        Integer buscarCodigo = scan.nextInt();
        boolean encontrada = false;

        for (Map.Entry<Integer, String> ciudad : codigosPostales.entrySet()) {

            if (ciudad.getKey().equals(buscarCodigo)) {
                System.out.println(ciudad.toString());
                encontrada = true;
                return ciudad.getKey();
            } else {
                encontrada = false;
            }
        }

        if (!encontrada) {
            System.out.println("No se ha encontrado la ciudad.");
        }

        return null;
    }

    public static void eliminar(HashMap<Integer, String> codigosPostales) {

        System.out.println("Eliminar ciudad por código postal");

        Integer remove = buscarPorCodigo(codigosPostales);

        if (remove != null) {
            codigosPostales.remove(remove);
            System.out.println("Se ha eliminado.");
            return;
        }

        //si llegamos hasta aca es porque no se ha eliminado
        System.out.println("No se ha podido eliminar.");

    }

}
