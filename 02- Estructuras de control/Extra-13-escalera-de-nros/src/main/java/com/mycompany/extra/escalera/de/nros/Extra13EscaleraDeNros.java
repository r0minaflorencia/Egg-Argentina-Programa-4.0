/*13.Crear un programa que dibuje una escalera de números, donde cada
línea de números comience en uno y termine en el número de la línea.
Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123 */
package com.mycompany.extra.escalera.de.nros;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra13EscaleraDeNros {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("¿Qué altura tendrá la escalera?: ");
        int altura = sc.nextInt();

        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 10);
            }
            System.out.println();
        }

    }
}
