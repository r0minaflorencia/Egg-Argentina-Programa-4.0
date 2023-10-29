/* Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y define su tipo de dato.
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros.*/
package com.mycompany.vector.equipo;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class VectorEquipo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("¿Cuántos integrantes tiene el equipo?: ");
        int integrantes = scan.nextInt();

        /*creo un vector y le doy la dimensión con la cantidad de integrantes proporcionada por el usuario:
        (es tipo String para luego alojar los nombres de los integrantes): */
        String equipo[] = new String[integrantes];

        //utilizo un procedimiento para llenar el vector:
        llenarVector(equipo, scan);

    }

    public static void llenarVector(String[] equipo, Scanner scan) {

        //cargar
        for (int i = 0; i < equipo.length; i++) {
            System.out.print("Nombre del integrante n° " + (i + 1) + ": ");
            String nombre = scan.next();
            equipo[i] = nombre;
        }

        //mostrar
        for (int i = 0; i < equipo.length; i++) {
            System.out.print("[ " + equipo[i] + " ]");
        }

    }

}
