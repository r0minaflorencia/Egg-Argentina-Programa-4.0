package com.egg.services;

import java.util.HashSet;
import java.util.Set;

import com.egg.entities.Alumno;

public class Simulacion {

    private Set<Alumno> listaDeAlumnos;

    public Simulacion() {
        this.listaDeAlumnos = new HashSet<>();
    }

    public Set<Alumno> generarListaDeAlumnos(int cantidad) {
        AlumnoService service = new AlumnoService();

        for (int i = 0; i < cantidad; i++) {
            listaDeAlumnos.add(service.crearAlumno());
        }

        return listaDeAlumnos;
    }

    public void mostrarListaDeAlumnos() {
        for (Alumno alumno : listaDeAlumnos) {
            System.out.println(alumno.toString());
        }
    }

   
}
