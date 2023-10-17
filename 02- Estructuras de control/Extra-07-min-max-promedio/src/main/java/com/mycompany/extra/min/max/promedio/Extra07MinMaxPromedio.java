/*7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n números (n>0). 
El valor de n se solicitará al principio del programa y los números serán introducidos por el usuario.
Realice dos versiones del programa, una usando el bucle “while” y otra con el bucle “do - while”.*/
package com.mycompany.extra.min.max.promedio;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra07MinMaxPromedio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input, min = 0, max = 0, suma = 0, promedio;

        System.out.print("Cantidad de ingresos que se realizarán: ");
        int n = sc.nextInt();

        int contador = 0;

        do {
            System.out.print("Ingresa un nro entero: ");
            input = sc.nextInt();
            if (contador == 0) {
                min = input;
                max = input;
            }
            if (input < min) {
                min = input;
            }
            if (input > max) {
                max = input;
            }

            contador += 1;
            suma += input;

        } while (contador < n);

        promedio = (suma / n);

        System.out.println("El mínimo valor ingresado: " + min);
        System.out.println("El máximo valor ingresado: " + max);
        System.out.println("El promedio de los nros ingresados es: " + promedio);

    }
}
