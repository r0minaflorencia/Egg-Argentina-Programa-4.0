/* 4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su equivalente en romano.*/
package com.mycompany.extra.nro.romano;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Extra04NroRomano {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresa un número (entero) del 1 al 10: ");
        int nro = sc.nextInt();
        
        System.out.println("El equivalente en romano es: ");
        //primero validamos que el valor ingresado se encuentre dentro del rango solicitado mediante el condicional if;
        //luego utilizo un switch para asignarle una letra a cada posible valor.
        if (nro >= 1 && nro <= 10) {
            switch (nro) {
                case 1: 
                    System.out.println("I");
                    break;
                case 2: 
                    System.out.println("II");
                    break;
                case 3: 
                    System.out.println("III");
                    break;
                case 4: 
                    System.out.println("IV");
                    break;
                case 5: 
                    System.out.println("V");
                    break;
                case 6: 
                    System.out.println("VI");
                    break;
                case 7: 
                    System.out.println("VII");
                    break;
                case 8: 
                    System.out.println("VIII");
                    break;
                case 9: 
                    System.out.println("IX");
                    break;
                case 10: 
                    System.out.println("X");
                    break;
            }  
        } else {
            System.out.println("El valor ingresado se encuentra fuera del rango solicitado.");
        }
        
        
    }
}
