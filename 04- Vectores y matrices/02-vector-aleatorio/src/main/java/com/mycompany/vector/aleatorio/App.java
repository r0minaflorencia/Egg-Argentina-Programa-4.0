/* 2. Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector.
El programa mostrará dónde se encuentra el numero y si se encuentra repetido*/
package com.mycompany.vector.aleatorio;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        int vector[] = new int[10];

        llenarVector(vector);
        buscarNro(vector);
    }

    public static int[] llenarVector(int vector[]) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }

        return vector;
    }

    public static void buscarNro(int vector[]) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingresa un número del 0 al 10 a buscar en el vector: ");
        int n = scan.nextInt();

        boolean encontrado = false;

        for (int i = 0; i < (vector.length - 1); i++) {
            if (vector[i] == n) {
                System.out.println("Se encontró [" + n + "] ! en el índice " + i + " del vector.");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No se encontró [" + n + "] en el vector.");
        }

    }

}
