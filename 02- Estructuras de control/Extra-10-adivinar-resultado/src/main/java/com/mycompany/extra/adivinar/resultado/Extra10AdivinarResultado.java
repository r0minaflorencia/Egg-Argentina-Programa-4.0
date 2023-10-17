/* 10.Realice un programa para que el usuario adivine el resultado de una
multiplicación entre dos números generados aleatoriamente entre 0 y 10.
El programa debe indicar al usuario si su respuesta es o no correcta.
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente.
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.*/
package com.mycompany.extra.adivinar.resultado;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra10AdivinarResultado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = (int) (Math.random() * 10);
        int n2 = (int) (Math.random() * 10);
        boolean adivina = false;

        System.out.print("Adiviná el resultado de la multiplicación entre dos nros aleatorios (entre 0-10): ");
        int result = sc.nextInt();

        do {
            if (result == (n1 * n2)) {
                System.out.println("Adivinaste!");
                System.out.println(n1 + " * " + n2 + " = " + result);
                adivina = true;

            } else {
                System.out.println("Equivocado. Intentá de nuevo: ");
                result = sc.nextInt();
            }
        } while (adivina == false);

    }
}
