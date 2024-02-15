package com.egg;

import com.egg.services.Simulacion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de votos Egg");

        Simulacion simulacion = new Simulacion();
        simulacion.generarListaDeAlumnos(15);
        simulacion.mostrarListaDeAlumnos();

    }
}