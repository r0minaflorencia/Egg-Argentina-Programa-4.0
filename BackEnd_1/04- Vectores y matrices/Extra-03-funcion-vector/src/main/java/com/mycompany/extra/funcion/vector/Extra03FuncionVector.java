/*3. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro.
Después haremos otra función o procedimiento que imprima el vector.*/
package com.mycompany.extra.funcion.vector;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra03FuncionVector {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Cantidad de filas de la matriz: ");
        int filas = scan.nextInt();
        System.out.print("Cantidad de columnas: ");
        int columnas = scan.nextInt();
        int array[][] = new int[filas][columnas];

        llenar(array, filas, columnas);
        imprimir(array, filas, columnas);

    }

    public static int[][] llenar(int array[][], int filas, int columnas) {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = (int) (Math.random() * 9 + 1);
            }
        }
        return array;
    }

    public static void imprimir(int array[][], int filas, int columnas) {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("[%02d]", array[i][j]);
            }
            System.out.println();
        }
    }
}
