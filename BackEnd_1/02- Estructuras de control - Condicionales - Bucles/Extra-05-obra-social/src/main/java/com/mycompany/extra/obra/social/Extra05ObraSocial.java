/* 5. Una obra social tiene tres clases de socios:
○ Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
○ Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
○ Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
○ Solicite una letra (carácter) que representa la clase de un socio, y
luego un valor real que represente el costo del tratamiento (previo al descuento) 
y determine el importe en efectivo a pagar por dicho socio.*/
package com.mycompany.extra.obra.social;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra05ObraSocial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean exit = false;
        int opcion, cuota, precio = 0, conDescuento;
        String tipoDeSocio;

        System.out.println("Bienvenido/a a Obra Social Spring");

        do {

            System.out.println("°*°*°Menú°*°*°");
            System.out.println("");
            System.out.println("Elija una opción:");
            System.out.println("1 - Análisis de sangre");
            System.out.println("2 - Radiografía");
            System.out.println("3 - Ecografía");
            System.out.println("4 - Consulta");
            System.out.println("5 - Consultar precio de asociación mensual a la obra social Spring");
            System.out.println("6 - Salir");
            opcion = sc.nextInt();

            String tipoDeEstudio = null;

            //predefino el precio general de la consulta que quiera hacer el cliente;
            switch (opcion) {

                case 1:
                    tipoDeEstudio = "Análisis de sangre: ";
                    precio = 80;
                    break;
                case 2:
                    tipoDeEstudio = "Radiografía: ";
                    precio = 50;
                    break;
                case 3:
                    tipoDeEstudio = "Ecografía: ";
                    precio = 45;
                    break;
                case 4:
                    tipoDeEstudio = "Consulta general: ";
                    precio = 25;
                    break;
                case 6:
                    exit = true;
                    break;
            }

            //segun el tipo de socio le aplico descuentos y le muestro el precio final del estudio requerido;
            System.out.println(""
                    + "¿tipo de socio?");
            System.out.println("(A - B - C)");
            tipoDeSocio = sc.next();

            if (tipoDeSocio.equalsIgnoreCase("a") && opcion != 5) {
                cuota = 100;
                conDescuento = (precio - (precio * 50) / 100);
                if (opcion != 5) {
                    System.out.println(tipoDeEstudio);
                    System.out.println("$" + conDescuento);
                }

                //si el cliente quiere consultar cuánto abona mensualmente la suscripción;
                if (opcion == 5 && tipoDeSocio.equalsIgnoreCase("a")) {
                    System.out.println("El abono mensual a la obra social Spring es de $" + cuota);
                }

                break;
            } else if (tipoDeSocio.equalsIgnoreCase("b")) {
                cuota = 80;
                conDescuento = (precio - (precio * 35) / 100);
                if (opcion != 5) {
                    System.out.println(tipoDeEstudio);
                    System.out.println("$" + conDescuento);
                }

                //si el cliente quiere consultar cuánto abona mensualmente la suscripción;
                if (opcion == 5 && tipoDeSocio.equalsIgnoreCase("b")) {
                    System.out.println("El abono mensual a la obra social Spring es de $" + cuota);
                }

                break;
            }
            if (tipoDeSocio.equalsIgnoreCase("c")) {
                cuota = 50;
                if (opcion != 5) {
                    System.out.println(tipoDeEstudio);
                    System.out.println("$" + precio);
                }

                //si el cliente quiere consultar cuánto abona mensualmente la suscripción;
                if (opcion == 5 && tipoDeSocio.equalsIgnoreCase("c")) {
                    System.out.println("El abono mensual a la obra social Spring es de $" + cuota);
                }

                break;
            }

        } while (exit == true);

    }
}
