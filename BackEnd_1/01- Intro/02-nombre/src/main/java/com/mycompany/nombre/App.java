/* 2. Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla. */
package com.mycompany.nombre;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa tu nombre: ");
        String nombre = sc.next();
        
        System.out.println("El nombre que ingresaste es: " + nombre);
        
        
    }
}
