/* 6. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5
caracteres y, a medida que el usuario las va ingresando, construya una
“sopa de letras para niños” de tamaño de 10 x 10 caracteres. 
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio del 0 al 9. 
Finalmente imprima por pantalla la sopa de letras creada. Nota: Para resolver el ejercicio 
deberá investigar cómo se utilizan las siguientes funciones de Java substring(), Length() y Math.random().*/
package com.mycompany.extra.sopa.de.letras;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra06SopaDeLetras {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        String matriz[][] = new String[10][10];
        String palabra;

        System.out.println("Ingresa palabras que contengan como mínimo 3 caracteres y máximo 5");

        for (int inputs = 5; inputs > 0;) {

            System.out.print("Ingresa " + (inputs) + " palabra/s: ");
            palabra = scan.next();

            boolean validInput = palabra.length() >= 3 && palabra.length() <= 5;

            //si la palabra ingresada cumple con las condiciones:
            if (validInput) {

                boolean espacioDisponible = true;

                //agrego valores aleatorios para filas y columnas,
                int filaRandom, columnaRandom;

                do {
                    filaRandom = (int) (Math.random() * 10);
                    columnaRandom = (int) (Math.random() * 10);

                    for (int j = columnaRandom; j < (columnaRandom + palabra.length()); j++) {
                        if (j >= 10 || matriz[filaRandom][j] != null) {

                            espacioDisponible = false;
                            break;
                            //si el espacio está ocupado ya salgo del bucle y switcheo el boolean;
                        }
                    }
                    //salgo y vuelvo a generar nuevos índices aleatorios;
                } while (!espacioDisponible);

                //pongo cada letra de la palabra a partir de los índices proporcionados aleatoriamente
                for (int k = 0; k < palabra.length(); k++) {
                    matriz[filaRandom][columnaRandom] = palabra.substring(k, k + 1).toLowerCase();
                    columnaRandom++;
                }
                
                //resto un input
                inputs--;
            }
        }

        //mostrar
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                //a los espacios nulos de la matriz se le añade un valor random entre 1 y 9
                if (matriz[i][j] == null) {
                    System.out.print("[" + (int) (Math.random() * 9) + "]");
                } else {
                    //los espacios ocupados se muestran con el valor/String asignado previamente
                    System.out.print("[" + matriz[i][j] + "]");
                }
                
            }
            System.out.println("");
        }

    }

}
