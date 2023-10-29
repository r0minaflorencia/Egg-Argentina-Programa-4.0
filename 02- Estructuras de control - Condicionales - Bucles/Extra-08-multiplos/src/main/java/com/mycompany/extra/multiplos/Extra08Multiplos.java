/*8. Escriba un programa que lea números enteros. Si el número es múltiplo
de cinco debe detener la lectura y mostrar la cantidad de números
leídos, la cantidad de números pares y la cantidad de números impares.
Al igual que en el ejercicio anterior los números negativos no deben sumarse. 
Nota: recordar el uso de la sentencia break.*/
package com.mycompany.extra.multiplos;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra08Multiplos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, cant = 0, par = 0, impar = 0;

        do {

            System.out.print("Ingresa un nro entero: ");
            num = sc.nextInt();

            if (num % 2 == 0) {
                par++;
                cant++;
                continue;
            } else if (num % 2 != 0) {
                impar++;
                cant++;
                continue;
            } else if (num < 1) {
                break;
            }

        } while (!(num % 5 == 0));
        
        System.out.println("Cantidad de nros ingresados: " + cant);
        System.out.println("[Cantidad de nros pares: " + par + " ]," + "[Cantidad de nros impares: " + impar +" ]");

    }
}
