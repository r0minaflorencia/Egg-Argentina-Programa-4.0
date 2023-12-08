/* 5. Realizar un programa que llene una matriz de tamaño NxM con valores
aleatorios y muestre la suma de sus elementos.*/
package com.mycompany.extra.sumar.valores.matriz;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra05SumarValoresMatriz {

    public static void main(String[] args) {

        int[][] matriz;

        //en la variable matriz tengo el retorno de la funcion que es un array;
        matriz = definirYLlenar();
        sumar(matriz);

    }

    public static int[][] definirYLlenar() {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Cantidad de filas: ");
        int n = scan.nextInt();
        System.out.print("Cantidad de columnas: ");
        int m = scan.nextInt();

        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 9 + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
        return matriz;
    }

    public static void sumar(int[][] matriz) {

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                suma = suma + matriz[i][j];

            }
        }

        System.out.println("La suma de los elementos es: " + suma);
    }
}
