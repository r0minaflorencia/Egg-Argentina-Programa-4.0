/* Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios. */
package com.mycompany.reemplazar.caracteres;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class ReemplazarCaracteres {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String frase;

        //validación del input que debe terminar en punto
        do {
            System.out.print("Ingresa una frase o palabra que termine en punto (.): ");
            frase = sc.nextLine();
        } while (!frase.substring(frase.length() - 1, frase.length()).equals("."));

        //mostramos la frase modificada en la funcion:
        System.out.println(devolverFraseModificada(frase));

    }

    public static String devolverFraseModificada(String frase) {
        String retorno = "";

        for (int i = 0; i < frase.length(); i++) {

            if (frase.substring(i, i + 1).equalsIgnoreCase("a") || frase.substring(i, i + 1).equalsIgnoreCase("e") || frase.substring(i, i + 1).equalsIgnoreCase("i") || frase.substring(i, i + 1).equalsIgnoreCase("o") || frase.substring(i, i + 1).equalsIgnoreCase("u")) {

                switch (frase.substring(i, i + 1)) {
                    case "a":
                        retorno = retorno + "@";
                        break;
                    case "e":
                        retorno = retorno + "#";
                        break;
                    case "i":
                        retorno = retorno + "$";
                        break;
                    case "o":
                        retorno = retorno + "%";
                        break;
                    case "u":
                        retorno = retorno + "*";
                        break;
                }
            } else {
                retorno = retorno + frase.substring(i, i + 1);
            }
        }
        return retorno;
    }

}
