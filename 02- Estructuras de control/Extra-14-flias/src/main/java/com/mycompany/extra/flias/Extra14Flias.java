/* 14.Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de hijos.
Escriba un programa que pida la cantidad de familias y para cada familia la cantidad de hijos 
para averiguar la media de edad de los hijos de todas las familias.*/
package com.mycompany.extra.flias;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra14Flias {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cantidad de familias: ");
        int familias =sc.nextInt();
        
        int hijos, totalHijos = 0, edad, sumaEdades = 0;
        
        for (int i = 1; i <= familias; i++) {
            System.out.print("Cantidad de hijos de la familia N° " + i + ": ");
            hijos = sc.nextInt();
            totalHijos = totalHijos + hijos;
            
            for (int j = 1; j <= hijos; j++) {
                System.out.print("Edad hijo/a N° " + j + ": ");
                edad = sc.nextInt();
                sumaEdades = sumaEdades + edad;
            }
        }
        
        System.out.println("La media de edad de los hijos de todas las familias es de: " + (sumaEdades/totalHijos) + " años.");

    }
}
