/* 6. Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú: 1) sumar, 2) restar, 3) multiplicar, 4) dividir, 5) salir.
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. 
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea salir del programa (S/N)?
Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú. */
package com.mycompany.menu.calculadora;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcMenu;
        String respuesta = "n";

        System.out.println("Ingresa valores enteros para operar");
        System.out.print("1er valor: ");
        int nro1 = sc.nextInt();
        System.out.print("2do valor: ");
        int nro2 = sc.nextInt();

        do {
            System.out.println("*°*°*°MENU°*°*°*");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            opcMenu = sc.nextInt();

            switch (opcMenu) {
                case 1:
                    System.out.println("La suma de los nros " + nro1 + " + " + nro2 + " es: " + (nro1 + nro2));
                    break;
                case 2:
                    System.out.println("El resultado de la resta " + nro1 + " - " + nro2 + " es: " + (nro1 - nro2));
                    break;
                case 3:
                    System.out.println("El resultado de la multiplicacion de " + nro1 + " * " + nro2 + " es: " + (nro1 * nro2));
                    break;
                case 4:
                    System.out.println("El resultado de la división de " + nro1 + " / " + nro2 + " es: " + (nro1 / nro2));
                    break;
                case 5:
                    System.out.println("Seguro desea salir? s/n");
                    respuesta = sc.next();
                    if (respuesta.equalsIgnoreCase("s")) {
                        System.out.println("Sesión finalizada");
                    }
            }
        } while (respuesta.equalsIgnoreCase("n"));
    }

}
