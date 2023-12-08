/* 1. Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.*/
package com.mycompany.vector.nros;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        int vector[] = new int[100];

        //llenar
        for (int i = 0; i <= (vector.length - 1); i++) {
            vector[i] = (i+1);
        }

        //mostrar
        for (int i = (vector.length - 1); i >= 0; i--) {
            System.out.print("[" + vector[i] + "]");
        }

    }

}
