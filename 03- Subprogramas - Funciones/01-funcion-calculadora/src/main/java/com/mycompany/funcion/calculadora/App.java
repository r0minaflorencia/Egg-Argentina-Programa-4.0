/* 1. Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main.*/
package com.mycompany.funcion.calculadora;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*°*° Calculadora °*°*");
        System.out.print("Ingresa el primer nro: ");
        Double n1 = sc.nextDouble();
        System.out.print("Ingresa el segundo nro: ");
        Double n2 = sc.nextDouble();
        System.out.println("Ingresa una operación a realizar con los números ingresados: ");
        System.out.println("a- Sumar");
        System.out.println("b- Restar");
        System.out.println("c- Multiplicar");
        System.out.println("d- Dividir");

        //en la variable 'opcion' guardo lo que ingresa el usuario
        //y anticipando que quizá el usuario escriba en mayúscula lo convierto a minúscula
        //para luego operar en un switch;
        String opcion = sc.next().toLowerCase();

        switch (opcion) {

            case "a":
                System.out.println(n1 + " + " + n2);
                System.out.println(suma(n1, n2));
                break;
            case "b":
                System.out.println(n1 + " - " + n2);
                System.out.println(resta(n1, n2));
                break;
            case "c":
                System.out.println(n1 + " * " + n2);
                System.out.println(multiplicacion(n1, n2));
                break;
            case "d":
                System.out.println(n1 + " / " + n2);
                System.out.println(division(n1, n2));
                break;

        }
    }

    //las siguientes funciones se encargarán de tomar como parámetros los números ingresados,
    //realizar la operación solicitada y retornar un resultado;
    public static Double suma(Double n1, Double n2) {
        return (n1 + n2);
    }

    public static Double resta(Double n1, Double n2) {
        return (n1 - n2);
    }

    public static Double multiplicacion(Double n1, Double n2) {
        return (n1 * n2);
    }

    public static Double division(Double n1, Double n2) {
        return (n1 / n2);
    }

}
