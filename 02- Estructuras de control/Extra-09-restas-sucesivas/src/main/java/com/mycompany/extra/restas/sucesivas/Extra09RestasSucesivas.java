/* 9. Simular la división usando solamente restas. Dados dos números enteros
mayores que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, 
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3. */
package com.mycompany.extra.restas.sucesivas;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra09RestasSucesivas {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int dividendo, divisor, cociente = 0, resto;
        
        System.out.print("Ingrese el dividendo: ");
        dividendo = sc.nextInt();
        
        System.out.print("Ahora el divisor: ");
        divisor = sc.nextInt();
        
        resto = dividendo;
        
        while (resto >= divisor) {
            resto = resto - divisor;
            cociente++;
        }
        System.out.println("El resultado de " + dividendo + "/" + divisor + "\nEl cociente queda en = " + cociente + "\nEl resto queda en = " + resto);

    }
}
