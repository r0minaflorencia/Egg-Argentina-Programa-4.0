/* 6. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del
1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir, están entre el 1 y el 9.*/
package com.mycompany.cuadrado.magico;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");
        int size = 3;
        int array[][] = new int[size][size];

        llenar(array, scan);
        validar(array);
    }

    public static void llenar(int array[][], Scanner scan) {
        System.out.println("LLenar matriz con valores entre 1 y 9");

        //llenar y validar entrada:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                boolean valido = false;

                while (!valido) {
                    System.out.print("Valor para fila [" + (i + 1) + "], columna [" + (j + 1) + "]: ");
                    int valor = scan.nextInt();

                    if (valor >= 1 && valor <= 9) {
                        array[i][j] = valor;
                        valido = true;
                    } else {
                        System.out.println("Ingresa un valor válido entre 1 y 9! ");
                    }
                }
            }
        }

        //mostrar:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("[" + array[i][j] + "]");
            }
            System.out.println();
        }
    }
    
    //////////////////////////////////////INCOMPLETO
    public static boolean validar(int array[][]) {
        
        
        return false;
        
        
    }
}
