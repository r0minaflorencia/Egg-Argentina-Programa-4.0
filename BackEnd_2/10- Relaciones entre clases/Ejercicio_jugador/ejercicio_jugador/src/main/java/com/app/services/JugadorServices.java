package com.app.services;

import java.util.Scanner;

import com.app.entities.Jugador;

public class JugadorServices {

    private Scanner scan;

    public JugadorServices() {
        this.scan = new Scanner(System.in);
    }

    public Jugador create() {
        System.out.print("Nombre: ");
        String nombre = scan.next();
        System.out.print("Apellido: ");
        String apellido = scan.next();
        int nro = (int) (Math.random() * 9 + 1);
        int posicion = 0;

        return new Jugador(nombre, apellido, posicion, nro);
    }
}
