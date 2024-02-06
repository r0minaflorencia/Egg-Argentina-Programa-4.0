package com.cinema;

import com.cinema.entities.Sala;
//import com.cinema.services.PeliculaService;
import com.cinema.services.SalaService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Cinema!");

        //PeliculaService movieService = new PeliculaService();
        SalaService salaService = new SalaService();
        Sala sala = salaService.create();

        salaService.mostrarButacas(sala);


    }
}