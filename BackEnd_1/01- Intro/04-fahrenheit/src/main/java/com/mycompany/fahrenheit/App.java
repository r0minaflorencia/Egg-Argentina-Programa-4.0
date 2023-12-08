/* 4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
La fórmula correspondiente es: F = 32 + (9 * C / 5). */
package com.mycompany.fahrenheit;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresá la temperatura en grados °C y se convertirá a Fahrenheit: ");
        Double centigrados = sc.nextDouble();
        
        Double fahrenheit = 32 + (9 * centigrados / 5);
        
        System.out.println("La temperatura en Fahrenheit es de: " + fahrenheit + "°F");
        
    }
}
