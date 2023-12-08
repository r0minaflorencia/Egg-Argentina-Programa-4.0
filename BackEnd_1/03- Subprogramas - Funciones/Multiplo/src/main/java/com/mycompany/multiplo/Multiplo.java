/* Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son.*/
package com.mycompany.multiplo;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Multiplo {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //solicito los nros desde el main
        System.out.print("Ingresa un primer nro: ");
        int n1 = sc.nextInt();
        
        System.out.print("Ingresa un segundo nro: ");
        int n2 = sc.nextInt();
        
        System.out.println("Se verificará si " + n1 + " es multiplo de " + n2 + " o no...");
        
        esMultiplo(n1,n2);
        
    }
    
    //realizo un procedimiento que recibe los datos que necesito y muestre una respuesta
    public static void esMultiplo(int n1, int n2) {
        
        if (n1 % n2 == 0) {
            System.out.println("Si!, " + n1 + " es multiplo de " + n2);
        } else {
            System.out.println("No, " + n1 + " no es multiplo de " + n2);
        }
        
    }
}
