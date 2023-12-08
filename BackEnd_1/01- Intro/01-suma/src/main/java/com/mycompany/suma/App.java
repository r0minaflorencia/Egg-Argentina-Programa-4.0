/*1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
El programa deberá después mostrar el resultado de la suma. */
package com.mycompany.suma;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese un nro entero: ");
        int n1 = sc.nextInt();
        System.out.print("Ingrese otro nro entero: ");
        int n2 = sc.nextInt();
        
        int resultado = n1 + n2;
        
        System.out.println("La suma de " + n1 + " + " + n2 + " es igual a: " + resultado);
        
    }
}
