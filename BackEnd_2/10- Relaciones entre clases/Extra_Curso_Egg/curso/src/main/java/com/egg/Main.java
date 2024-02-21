package com.egg;

import java.util.Set;

import com.egg.entities.Alumno;
import com.egg.services.Simulacion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de votos Egg");

        Simulacion simulacion = new Simulacion();
        Set<Alumno> listaDeAlumnos = simulacion.generarListaDeAlumnos(15);
        simulacion.mostrarListaDeAlumnos();
        simulacion.votacion(listaDeAlumnos);

    }

}