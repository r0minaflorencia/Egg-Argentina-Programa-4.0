/*Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.*/
package com.mycompany.funcion.substring;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa una frase o palabra que comience con 'A': ");
        String input = sc.nextLine();
        

        if (input.substring(0,1).equalsIgnoreCase("a")) {
            System.out.println("Correcto.");
        } else {
            System.out.println("Incorrecto.");
        }

    }
}
