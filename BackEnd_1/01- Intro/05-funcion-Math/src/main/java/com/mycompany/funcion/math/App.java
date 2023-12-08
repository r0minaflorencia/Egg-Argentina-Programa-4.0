/*5. Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
Nota: investigar la función Math.sqrt().*/
package com.mycompany.funcion.math;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresá un nro entero: ");
        int nro = sc.nextInt();

        int doble = nro * 2;
        int triple = nro * 3;
        Double raizCuadrada = Math.sqrt(nro);
        
        System.out.println("El doble de " + nro + " es: " + doble);
        System.out.println("El triple de " + nro + " es: " + triple);
        System.out.println("La raiz cuadrada de " + nro + " es: " + raizCuadrada);
        

    }
}
