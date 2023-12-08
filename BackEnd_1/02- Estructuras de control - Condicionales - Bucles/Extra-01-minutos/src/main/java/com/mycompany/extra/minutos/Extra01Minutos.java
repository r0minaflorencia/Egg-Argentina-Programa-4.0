/*1. Dado un tiempo en minutos, calcular su equivalente en días y horas. 
Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
package com.mycompany.extra.minutos;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra01Minutos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una cierta cantidad de minutos: ");
        int mm = sc.nextInt();

        int hh = mm / 60;
        int dd = hh / 24;

        System.out.println(mm + " minutos equivale a: " + hh+  "hs. ");
        System.out.println(mm + " minutos equivale a: " + dd + " día/s ");
        
    }
}
