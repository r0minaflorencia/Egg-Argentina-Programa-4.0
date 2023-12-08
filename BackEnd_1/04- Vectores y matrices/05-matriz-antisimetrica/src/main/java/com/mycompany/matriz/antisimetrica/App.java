/* 5. Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo.
Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).*/
package com.mycompany.matriz.antisimetrica;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        int array[][] = new int[3][3];
        boolean simetrica = true;
        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        //llenar:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < (array[i].length); j++) {
                System.out.print("valor para fila [" + (i + 1) + "], columna [" + (j + 1) + "]: ");
                array[i][j] = scan.nextInt();
            }
        }

        //mostrar:  
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(" [%02d] ", array[i][j]);
            }
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(" [%02d] ", array[j][i]);
            }
            System.out.println("");
        }

        //comprobar simetría:
        for (int i = 0; i < array.length && simetrica; i++) {
            for (int j = 0; j < (array[i].length) && simetrica; j++) {
                if (array[i][j] != array[j][i]) {
                    simetrica = false;
                }
            }
            System.out.println();
        }

        //mostrar resultado:
        if (simetrica) {
            System.out.println("La matriz es simétrica");
        } else {
            System.out.println("La matriz es antisimétrica");
        }
    }
}
