package com.example.services;

import java.util.Date;
import java.util.Scanner;

import com.example.entities.Cliente;
import com.example.entities.Nave;

public class Alquiler {

    private Scanner scan;

    public Alquiler() {

    }

    public Alquiler(Scanner scan) {
        this.scan = new Scanner(System.in);
    }

    /*
     * Un alquiler se calcula multiplicando el número de días de ocupación
     * (calculado con la fecha de alquiler y devolución),
     * por un valor módulo de cada barco (obtenido simplemente
     * multiplicando por 10 los metros de eslora).
     */

    public double alquilar(Cliente cliente, Nave barco) {

        double precio = 0;

        System.out.print("Posición amarre: ");
        int posicionAmarre = scan.nextInt();
        System.out.print("Fecha alquiler: ");
        Date fechaAlquiler = new Date();
        System.out.print("Fecha devolución: ");
        Date fechaDevolucion = new Date();

        return precio;
    }

}
