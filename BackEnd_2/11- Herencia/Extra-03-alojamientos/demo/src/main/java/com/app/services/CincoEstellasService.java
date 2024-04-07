package com.app.services;

import java.util.ArrayList;

import com.app.entities.CincoEstrellas;

public class CincoEstellasService {

    private ArrayList<CincoEstrellas> hotelesCincoEstrellas;

    public CincoEstellasService() {
        this.hotelesCincoEstrellas = new ArrayList<>();
    }

    public CincoEstrellas crear() {
        String nombre = "Alvear Palace";
        String direccion = "Av Alvear 1891";
        String localidad = "CABA";
        String gerente = "Ana María";
        String gimnasio = "Acqua";
        String restaurante = "FoodHacks";
        int cantidadHabitaciones = 80;
        int cantidadCamas = 300;
        int cantidadPisos = 25;
        int capacidadRestaurante = 300;
        int cantidadSalonesConferencia = 7;
        int cantidadSuites = 20;
        int cantidadLimusinas = 8;
        double precio = 500;

        CincoEstrellas alvearPalace = new CincoEstrellas(nombre, direccion, localidad, gerente, cantidadHabitaciones, 
        cantidadCamas, cantidadPisos, precio, gimnasio, restaurante, capacidadRestaurante,
         cantidadSalonesConferencia, cantidadSuites, cantidadLimusinas);

        return alvearPalace;
    }

    public ArrayList<CincoEstrellas> lista() {
        hotelesCincoEstrellas.add(crear());
        return hotelesCincoEstrellas;
    }

}
