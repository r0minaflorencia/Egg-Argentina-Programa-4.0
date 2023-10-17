/* 8. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package com.mycompany.dibujar.cuadrado;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un valor entero: ");
        int n = sc.nextInt();

        int i, j;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {

                if (j > 1 && j < n && i > 1 && i < n) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
