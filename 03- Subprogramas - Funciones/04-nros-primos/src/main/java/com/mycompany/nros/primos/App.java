/* 4. Crea una aplicación que nos pida un número por teclado y con una
función se lo pasamos por parámetro para que nos indique si es o no un número primo, 
debe devolver true si es primo, sino false. Un número primo es aquel que solo puede dividirse entre 1 y sí mismo.
Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo. */
package com.mycompany.nros.primos;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingresa un número y se verificará si es primo o no: ");
        int nro = scan.nextInt();

        //llamado a la funcion con el número pasado por parámetro:
        System.out.println(esPrimo(nro));

    }

    public static boolean esPrimo(int nro) {
        boolean primo = true;

        for (int divisor = 2; divisor <= nro / 2; divisor++) {
            if (nro % divisor == 0) {
                primo = false;
            }
        }

        return primo;
    }
}
