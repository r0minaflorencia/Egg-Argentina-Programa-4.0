package com.cinema.services;

import java.util.Scanner;

import com.cinema.entities.Espectador;

public class EspectadorService {

    public static Espectador cargarUsuario() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = scan.nextLine();
        System.out.print("Edad: ");
        int edad = scan.nextInt();
        System.out.print("Saldo: $ ");
        double getDineroDisponible = scan.nextDouble();

        return new Espectador(nombre, edad, getDineroDisponible);
    }

}
