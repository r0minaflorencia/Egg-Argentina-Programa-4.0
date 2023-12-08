/* 2. Escriba un programa que averigüe si dos vectores de N enteros son
iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).*/
package com.mycompany.extra.vectores.iguales;

/**
 *
 * @author Romina
 */
public class Extra02VectoresIguales {

    public static void main(String[] args) {

        int size = 5;
        int vector1[] = new int[size];
        int vector2[] = new int[size];

        //llenar con valores aleatorios:
        for (int i = 0; i < vector1.length; i++) {
            vector1[i] = (int) (Math.random() * 9 + 1);
        }

        for (int i = 0; i < vector2.length; i++) {
            vector2[i] = (int) (Math.random() * 9 + 1);
        }

        //comprobar:
        boolean iguales = true;

        for (int i = 0; i < size; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false;
            }
        }

        //mostrar vectores:
        for (int i = 0; i < vector1.length; i++) {
            System.out.printf("[%02d]", vector1[i]);
        }
        System.out.print("\t");
        for (int i = 0; i < vector2.length; i++) {
            System.out.printf("[%02d]", vector2[i]);
        }
        
        System.out.println();
        
        System.out.println("¿Son iguales?: " + iguales);
    }
}
