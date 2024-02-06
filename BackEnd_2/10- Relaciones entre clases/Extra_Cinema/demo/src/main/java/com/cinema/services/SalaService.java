package com.cinema.services;

import java.util.ArrayList;
import java.util.List;
import com.cinema.entities.Pelicula;
import com.cinema.entities.Sala;
import com.cinema.enums.ButacaEnum;

public class SalaService {

    private Sala sala;
    private ArrayList<Pelicula> peliculas;
    private ArrayList<ButacaEnum> butacas;

    public SalaService() {
        this.sala = new Sala();
        this.butacas = new ArrayList<>();
        this.peliculas = new ArrayList<>();
    }

    public ArrayList<ButacaEnum> inicializarSala() {
        for (ButacaEnum butaca : ButacaEnum.values()) {
            butacas.add(butaca);
        }
        return butacas;
    }

    public Sala create() {
        inicializarSala();
        cargarPeliculasPorDefecto();
        System.out.println("Películas:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
        System.out.println("Butacas:");
        for (ButacaEnum butaca : butacas) {
            System.out.print("[" + butaca.name() + " - disponibilidad: " + butaca.getDisponibilidad() + "] ");
        }
        return new Sala(butacas, peliculas);
    }

    public List<Pelicula> cargarPeliculasPorDefecto() {
        peliculas.add(new Pelicula("Narnia: El León, la Bruja y el Ropero", "Andrew Adamson", 140, true));
        peliculas.add(new Pelicula("Narnia: El príncipe Caspian", "Andrew Adamson", 144, true));
        peliculas.add(new Pelicula("Narnia: La travesía del Viajero del Alba", "Michael Apted", 115, true));

        return peliculas;
    }

    public void mostrarCartelera() {
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }

    public void mostrarButacas(Sala sala) {
        System.out.println(sala.getButacas().toString());
    }

}
