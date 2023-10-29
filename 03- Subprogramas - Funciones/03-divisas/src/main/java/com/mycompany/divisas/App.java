/* 3. Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras.
La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, 
este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
i. * 0.87 libras esterlinas es un 1 €
ii. * 1.06 dolares estadounidenses es un 1 €
iii. * 157.54 yenes es un 1 €*/
package com.mycompany.divisas;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Cantidad de €uro/s a convertir: ");
        int euro = scan.nextInt();
        System.out.print("A: \n Libra esterlina \n Dolar estadounidense \n Yen japonés\n");
        String moneda = scan.next();

        //llamado a la funcion con parámetros:
        convertir(euro, moneda);
    }

    public static void convertir(int euro, String moneda) {

        Double libra = (euro * 0.87);
        Double dolar = (euro * 1.06);
        Double yen = (euro * 157.54);

        switch (moneda.toLowerCase()) {
            case "libra":
                System.out.println(euro + " € = " + libra + " libra/s.");
                break;
            case "dolar":
                System.out.println(euro + " € = " + dolar + " dolar/es.");
                break;
            case "yen":
                System.out.println(euro + " € = " + yen + " yen/es.");
                break;
        }

    }
}
