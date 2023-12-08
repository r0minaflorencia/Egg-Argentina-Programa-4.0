/* 2. Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.*/
package com.mycompany.datos.personas;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        int N = 5;
        ingresarYMostrarDatos(N);

    }

    public static void ingresarYMostrarDatos(int N) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        String nombre, apellido, confirm;
        int edad;

        System.out.println("Ingresar " + N + " personas.");

        for (int i = 1; i <= N; i++) {
            System.out.println("Persona N° " + i);
            System.out.print("Nombre: ");
            nombre = sc.next();
            System.out.print("Apellido: ");
            apellido = sc.next();
            System.out.print("Edad: ");
            edad = sc.nextInt();

            System.out.print("¿Mostrar datos? (si/no): ");
            confirm = sc.next();
            if (confirm.equalsIgnoreCase("si")) {
                System.out.println(nombre + " " + " " + apellido + ": ");
                if (edad >= 18) {
                    System.out.println("Es mayor de edad.");
                } else {
                    System.out.println("Es menor de edad.");
                }
            }
        }

    }

}
