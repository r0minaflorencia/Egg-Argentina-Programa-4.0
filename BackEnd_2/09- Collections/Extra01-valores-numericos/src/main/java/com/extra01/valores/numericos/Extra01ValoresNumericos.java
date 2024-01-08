package com.extra01.valores.numericos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado
y los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
programa mostrará por pantalla el número de valores que se han leído, su suma y su
media (promedio).*/
/**
 *
 * @author Romina
 */
public class Extra01ValoresNumericos {

    public static void main(String[] args) {

        System.out.println("/// Welcome ///");
        List<Integer> valores = new ArrayList();

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int suma = 0, contador = 0;
        boolean salir = false;

        do {
            System.out.print("Ingresa un nro entero: ");
            int nro = scan.nextInt();

            if (nro == -99) {
                salir = true;
            } else {
                valores.add(nro);
                suma = suma + nro;
                contador ++;
            }
        } while (!salir);

        System.out.println("Lista de valores ingresados:");
        for (Integer aux : valores) {
            System.out.print("[" + aux + "]");
        }
        
        System.out.println(); //space

        System.out.println("Suma de valores: " + suma);
        
        System.out.println("Promedio: " + (suma / contador));

    }
}
