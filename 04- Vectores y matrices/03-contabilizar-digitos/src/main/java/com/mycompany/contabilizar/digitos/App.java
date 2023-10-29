/* 3. Recorrer un vector de N enteros contabilizando cuántos números son de
1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).*/
package com.mycompany.contabilizar.digitos;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        int vector[] = new int[10];

        //llenar
        for (int i = 0; i < (vector.length); i++) {
            vector[i] = (int) (Math.random() * 10000);
        }

        //mostrar
        for (int i = 0; i < (vector.length); i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println();

        //llamar a la funcion encargada de contabilizar
        contabilizarYMostrar(vector);
    }

    public static void contabilizarYMostrar(int vector[]) {

        int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0;

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] / 10 < 1) {
                d1++;
            } else {
                if (vector[i] / 10 < 10) {
                    d2++;
                } else {
                    if ((vector[i] / 10) / 10 < 10) {
                        d3++;
                    } else {
                        if (((vector[i] / 10) / 10) / 10 < 10) {
                            d4++;
                        } else {
                            if ((((vector[i] / 10) / 10) / 10) / 10 < 10) {
                                d5++;
                            }
                        }
                    }
                }
            }
        }

        System.out.println("El vector tiene " + d1 + " números de 1 dígito. \n"
                + d2 + " números de 2 dígitos. \n"
                + d3 + " números de 3 dígitos. \n"
                + d4 + " números de 4 dígitos. \n"
                + d5 + " números de 5 dígitos. \n");
    }
}
