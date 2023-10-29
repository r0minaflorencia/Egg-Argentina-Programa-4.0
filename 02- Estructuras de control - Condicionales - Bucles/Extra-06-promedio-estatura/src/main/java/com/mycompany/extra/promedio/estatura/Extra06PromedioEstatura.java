/* 6. Leer la altura de N personas y determinar el promedio de estaturas que
se encuentran por debajo de 1.60 mts. y el promedio de estaturas en general. */
package com.mycompany.extra.promedio.estatura;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra06PromedioEstatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean salir = false;
        double estatura, sumaEstaturas = 0, promedio, contador = 0;
        String rta;

        System.out.println("Bienvenido/a");

        do {
            System.out.print("Ingresá una estatura: ");
            estatura = sc.nextDouble();
            sumaEstaturas += estatura;
            contador += 1;

            System.out.println("Ingresar otra? (s/n)");
            rta = sc.next();
            if (rta.equalsIgnoreCase("n")) {
                salir = true;
            } 

        } while (salir == false);

        promedio = (sumaEstaturas / contador);

        System.out.println("Cantidad de estaturas ingresadas: " + Math.round(contador));
        System.out.println("Promedio estaturas: " + promedio);

    }
}
