/* 3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String. */
package com.mycompany.extra.validar.vocales;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra03ValidarVocales {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una letra: ");
        String letra = sc.next();

        if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e")
                || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o")
                || letra.equalsIgnoreCase("u")) {
            System.out.println("Ingresaste una vocal.");
        } else {
            System.out.println("La letra ingresada NO es una vocal.");
        }

    }
}
