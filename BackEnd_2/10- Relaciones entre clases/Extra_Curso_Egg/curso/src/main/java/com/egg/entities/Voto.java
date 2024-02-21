package com.egg.entities;

import java.util.Set;

public class Voto {

    private Alumno alumno;
    private Set<Alumno> alumnosVotados;

    public Voto(Alumno alumno, Set<Alumno> alumnosVotados) {
        this.alumno = alumno;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Set<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(Set<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    @Override
    public String toString() {
        return alumno + " ha votado a: " + alumnosVotados + "]";
    }

}