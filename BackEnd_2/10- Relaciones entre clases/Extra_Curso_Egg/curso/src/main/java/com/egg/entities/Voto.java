package com.egg.entities;

import java.util.List;

public class Voto {

    private Alumno alumno;
    private List<Alumno> alumnosVotados;

    public Voto() {
    }

    public Voto(Alumno alumno, List<Alumno> alumnosVotados) {
        this.alumno = alumno;
        this.alumnosVotados = alumnosVotados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Alumno> getAlumnosVotados() {
        return alumnosVotados;
    }

    public void setAlumnosVotados(List<Alumno> alumnosVotados) {
        this.alumnosVotados = alumnosVotados;
    }

    @Override
    public String toString() {
        return "Voto [alumno:" + alumno + ", alumnos votados: " + alumnosVotados + "]";
    }

}