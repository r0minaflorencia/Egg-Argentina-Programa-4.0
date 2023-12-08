/*11. Escribir un programa que lea un número entero y devuelva el número de dígitos que componen ese número. 
Por ejemplo, si introducimos el número 12345, el programa deberá devolver 5. 
Calcular la cantidad de dígitos matemáticamente utilizando el operador de división. 
Nota: recordar que las variables de tipo entero truncan los números o resultados.*/
package com.mycompany.extra.devolver.cant.digitos;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra11DevolverCantDigitos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nro, cantidadDigitos, contador = 0;

        System.out.print("Ingresá un nro entero: ");
        nro = sc.nextInt();
        cantidadDigitos = nro;

        while (cantidadDigitos != 0) {
            cantidadDigitos = cantidadDigitos / 10;
            contador++;
        }
        
        System.out.println("[" + nro + "] tiene: " + contador + " dígito/s." );
    }
}