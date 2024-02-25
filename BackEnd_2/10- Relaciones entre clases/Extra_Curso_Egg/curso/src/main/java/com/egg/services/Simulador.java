package com.egg.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.egg.entities.Alumno;
import com.egg.entities.Voto;

public class Simulador {
    private Set<Alumno> listaDeAlumnos;
    private Random random;
    private List<Voto> padron;

    public Simulador() {
        this.listaDeAlumnos = new HashSet<>();
        this.random = new Random();
        this.padron = new ArrayList<>();
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

    public List<Voto> votacion(Set<Alumno> listaDeAlumnos) {

        for (Alumno alumno : listaDeAlumnos) {
            HashSet<Alumno> votados = new HashSet<>();
            votados.add(alumno); // Agrega al alumno actual a los votados

            while (votados.size() < 4) { // Cambiado a < 4 para incluir al propio alumno
                ArrayList<Alumno> lista = new ArrayList<>(listaDeAlumnos);
                Alumno alumnoElegido = lista.get(random.nextInt(lista.size()));
                if (!votados.contains(alumnoElegido) && alumno != alumnoElegido) {
                    votados.add(alumnoElegido);
                    alumnoElegido.incrementarVotos(); // Incrementa el contador de votos del alumno elegido
                }
                ArrayList<Alumno> arrayVotados = new ArrayList<>(votados);
                Voto aux = new Voto(alumnoElegido, arrayVotados);
                padron.add(aux);
            }

        }

        return padron;
    }

    public void mostrarAlumnosVotados() {
        for (Voto voto : padron) {
            System.out.println("\n" + voto.getAlumno().getNombre() + " " + voto.getAlumno().getApellido()
                    + ", DNI: " + voto.getAlumno().getDni() + " votó a: " + voto.getAlumnosVotados().toString());
        }
    }

}
