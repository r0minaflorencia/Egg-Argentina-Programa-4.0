/*1. Crear un programa que dado un número determine si es par o impar.*/
package com.mycompany.par.o.impar;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresá un nro entero y se determinará si es par o impar: ");
        int nro = sc.nextInt();
        
        if (nro % 2 == 0) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        }
        
    }
}
