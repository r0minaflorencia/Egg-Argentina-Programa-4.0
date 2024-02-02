package com.cinema.entities;

import java.util.Set;

public class Sala {
    
    private Set<Butaca> butacas;
    private Pelicula pelicula;
    
    public Sala() {

    }

    public Sala(Set<Butaca> butacas, Pelicula pelicula) {
        this.butacas = butacas;
        this.pelicula = pelicula;
    }

    public Set<Butaca> getButacas() {
        return butacas;
    }

    public void setButacas(Set<Butaca> butacas) {
        this.butacas = butacas;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

}
