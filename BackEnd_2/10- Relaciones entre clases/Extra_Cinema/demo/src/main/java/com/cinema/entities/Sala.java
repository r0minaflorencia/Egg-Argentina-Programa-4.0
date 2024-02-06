package com.cinema.entities;

import java.util.List;

import com.cinema.enums.ButacaEnum;

public class Sala {

    private List<ButacaEnum> butacas;
    private List<Pelicula> peliculas;

    public Sala() {
    }

    public Sala(List<ButacaEnum> butacas, List<Pelicula> peliculas) {
        this.butacas = butacas;
        this.peliculas = peliculas;
    }
    
    public List<ButacaEnum> getButacas() {
        return butacas;
    }

    public void setButacas(List<ButacaEnum> butacas) {
        this.butacas = (List<ButacaEnum>) butacas;
    }

    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPelicula(List<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

}
