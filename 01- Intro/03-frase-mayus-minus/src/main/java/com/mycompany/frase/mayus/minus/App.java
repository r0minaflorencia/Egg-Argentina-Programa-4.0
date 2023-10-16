/* 3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java. */
package com.mycompany.frase.mayus.minus;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresá una frase: ");
        String frase = sc.nextLine();

        System.out.println("[ " + frase.toLowerCase() + " ]");
        System.out.println("[ " + frase.toUpperCase() + " ]");

    }
}
