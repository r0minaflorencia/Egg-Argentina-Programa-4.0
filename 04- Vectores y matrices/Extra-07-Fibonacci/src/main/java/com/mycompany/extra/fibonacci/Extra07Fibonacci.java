/* 7. Realizar un programa que complete un vector con los N primeros
números de la sucesión de Fibonacci. 
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula:
fibonacci = (fibonacci1 + fibonacci2); para todo N > 1.
fibonacci = 1; para todo N <= 1.
Por lo tanto, si queremos calcular el término “N” debemos escribir una función que 
reciba como parámetro el valor de “N” y que calcule la serie hasta llegar a ese valor. */
package com.mycompany.extra.fibonacci;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra07Fibonacci {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Cantidad de valores para la sucesión Fibonacci: ");
        int n = scan.nextInt();

        int vector[] = new int[n];

        int a = 0, b = 1, c;

        for (int i = 0; i < vector.length; i++) {

            //comienzo llenando el vector con 'a' que inicia en 0;
            vector[i] = a;

            //'c' contiene en la primer iteracion (0+1);
            c = a + b;

            //en la segunda iteracion (i=1): 'a' toma el valor de 1;
            a = b;

            //'b' tiene el valor en aumento de 'a' + 'b';
            b = c;

            System.out.print(vector[i] + "- ");

        }

    }
}
