package com.egg;

import java.util.Set;

import com.egg.entities.Alumno;
import com.egg.services.Simulador;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema de votos Egg");

        Simulador simulador = new Simulador();
        Set<Alumno> listaDeAlumnos = simulador.generarListaDeAlumnos(15);
        simulador.votacion(listaDeAlumnos);
        simulador.mostrarListaDeAlumnos();
        simulador.mostrarAlumnosVotados();
    }

}