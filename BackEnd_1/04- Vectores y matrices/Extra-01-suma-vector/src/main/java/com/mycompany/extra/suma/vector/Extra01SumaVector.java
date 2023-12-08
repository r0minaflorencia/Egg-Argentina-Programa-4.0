/*1. Realizar un algoritmo que calcule la suma de todos los elementos de un
vector de tamaño N, con los valores ingresados por el usuario.*/
package com.mycompany.extra.suma.vector;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra01SumaVector {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("¿Tamaño del vector? ");
        int size = scan.nextInt();

        int vector[] = new int[size];
        int suma = 0;

        for (int i = 0; i < vector.length; i++) {
            System.out.print("valor para el índice [" + (i + 1) + "]: ");
            vector[i] = scan.nextInt();
            suma += vector[i];
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.printf("[%02d]", vector[i]);
        }
        
        System.out.println();

        System.out.println("La suma de los valores del vector es de: " + suma);

    }
}
