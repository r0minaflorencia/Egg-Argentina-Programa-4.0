package com.cinema.entities;

public class Pelicula {
    private String titulo, director;
    private int duracion;
    private boolean atp;

    public Pelicula() {

    }

    public Pelicula(String titulo, String director, int duracion, boolean atp) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.atp = atp;
    }

    public boolean getAtp() {
        return atp;
    }

    public void setAtp(boolean atp) {
        this.atp = atp;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return titulo + " - by: " + director + " - duración: " + duracion + " minutos.";
    }
}
