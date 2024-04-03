package com.example.services;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import com.example.entities.Cliente;
import com.example.entities.Nave;

public class Alquiler {

    public Alquiler() {

    }

    /*
     * Un alquiler se calcula multiplicando el número de días de ocupación
     * (calculado con la fecha de alquiler y devolución),
     * por un valor módulo de cada barco (obtenido simplemente
     * multiplicando por 10 los metros de eslora).
     */
    public double pedido(Cliente cliente, Nave barco) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Posición amarre: ");
        int posicionAmarre = scan.nextInt();
        cliente.setPosicionAmarre(posicionAmarre);
        System.out.print("Fecha alquiler (ddMMaaaa): ");
        String fechaAlquilerString = scan.next();
        System.out.print("Fecha devolución (ddMMaaaa): ");
        String fechaDevolucionString = scan.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("ddMMyyyy"); // le doy un formato a la fecha
        LocalDate fechaAlquiler = LocalDate.parse(fechaAlquilerString, formatter);
        System.out.println("Fecha de alquiler: " + fechaAlquiler); // informo
        LocalDate fechaDevolucion = LocalDate.parse(fechaDevolucionString, formatter);
        System.out.println("Fecha devolución: " + fechaDevolucion); // informo

        // setteo
        cliente.setFechaAlquiler(fechaAlquiler);
        cliente.setFechaDevolucion(fechaDevolucion);

        // comienzo a calcular el valor del alquiler:
        int valorModulo = (barco.getEslora() * 10);
        long diferenciaDias = ChronoUnit.DAYS.between(fechaAlquiler, fechaDevolucion); // calcula la diferencia en días
        int cantidadDiasInt = (int) diferenciaDias; // convierto a entero
        double subTotal = valorModulo * cantidadDiasInt;

        scan.close();

        return subTotal;
    }

}
