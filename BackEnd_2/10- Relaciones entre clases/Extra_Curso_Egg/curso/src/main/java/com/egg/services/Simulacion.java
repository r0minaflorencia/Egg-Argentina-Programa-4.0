package com.egg.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import com.egg.entities.Alumno;
import com.egg.entities.Voto;

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

    public ArrayList<Voto> votacion(Set<Alumno> listaDeAlumnos) {
        ArrayList<Voto> padron = new ArrayList<>();
        Random random = new Random();

        for (Alumno alumno : listaDeAlumnos) {
            HashSet<Alumno> votados = new HashSet<>();
            votados.add(alumno); // Agrega al alumno actual a los votados

            while (votados.size() < 4) { // Cambiado a < 4 para incluir al propio alumno
                ArrayList<Alumno> lista = new ArrayList<>(listaDeAlumnos);
                Alumno alumnoElegido = lista.get(random.nextInt(listaDeAlumnos.size()));
                if (!votados.contains(alumnoElegido)) {
                    votados.add(alumnoElegido);
                }
            }

            for (Alumno alumnoVotado : votados) {
                alumnoVotado.setVotos(new Voto(alumno, votados));
            }

            padron.add(new Voto(alumno, new HashSet<>(votados)));
        }

        return padron;
    }


}
