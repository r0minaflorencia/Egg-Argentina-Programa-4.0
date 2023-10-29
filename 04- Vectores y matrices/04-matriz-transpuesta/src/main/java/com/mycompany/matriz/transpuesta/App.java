/* 4. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. 
La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).*/
package com.mycompany.matriz.transpuesta;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        int matriz[][] = new int[4][4];

        llenar(matriz);
        transponer(matriz);

    }

    public static void llenar(int matriz[][]) {

        for (int i = 0; i < (matriz.length); i++) {
            for (int j = 0; j < (matriz.length); j++) {
                matriz[i][j] = (int) (Math.random() * 9 + 1);
            }
        }

        //mostrar original
        System.out.println("Matriz original (A): ");

        for (int i = 0; i < (matriz.length - 1); i++) {
            for (int j = 0; j < (matriz.length - 1); j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }

    public static void transponer(int matriz[][]) {

        System.out.println("Matriz transpuesta (B): ");
        for (int j = 0; j < (matriz.length - 1); j++) {
            for (int i = 0; i < (matriz.length - 1); i++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println();
        }
    }
}
