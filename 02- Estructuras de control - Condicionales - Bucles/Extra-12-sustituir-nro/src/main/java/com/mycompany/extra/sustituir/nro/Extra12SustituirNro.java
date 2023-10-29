/* 12.Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-0 al 9-9-9, 
con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. */
package com.mycompany.extra.sustituir.nro;

/**
 *
 * @author Romina
 */
public class Extra12SustituirNro {

    public static void main(String[] args) {
        /* for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    //Funcionamiento ===> replace("reemplazaEsto", "porEsto")
                    System.out.println((i + "-" + j + "-" + k).replace("3", "E"));
                }
            }
        }*/

        int i = 0, j = 0, k = 0;

        for (int l = 0; l < 10; l++) {
            i = (int) (Math.random() * 10);
            j = (int) (Math.random() * 10);
            k = (int) (Math.random() * 10);
        }

        System.out.println((i + "-" + j + "-" + k).replace("3", "E"));

    }
}
