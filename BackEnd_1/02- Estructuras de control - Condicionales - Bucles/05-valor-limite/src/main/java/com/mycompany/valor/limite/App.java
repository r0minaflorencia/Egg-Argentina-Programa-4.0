/*5. Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.*/
package com.mycompany.valor.limite;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un valor límite (positivo): ");
        Double limite = sc.nextDouble();

        Double suma = 0.0;
        Double valores = 0.0;
        
        do {
            System.out.print("Ingresa un valor: ");
            valores = sc.nextDouble();

            suma = suma + valores;

            if (suma >= limite) {
                System.out.println("Se alcanzó o superó el valor límite.");
                System.out.println("La suma de valores ingresados es: " + suma);
            }
            
        } while (suma < limite);

    }
}
