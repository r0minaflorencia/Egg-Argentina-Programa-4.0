package com.app.services;

import java.util.ArrayList;

import com.app.entities.CuatroEstrellas;

public class CuatroEstrellasService {

    private ArrayList<CuatroEstrellas> hotelesCuatroEstrellas;

    public CuatroEstrellasService() {
        this.hotelesCuatroEstrellas = new ArrayList<>();
    }

    public CuatroEstrellas crear() {

        String nombre = "Four Seasons";
        String direccion = "Av Juramento 456";
        String localidad = "Belgrano";
        String gerente = "Gabriel Franco";
        int cantidadHabitaciones = 50;
        int cantidadCamas = 150;
        int cantidadPisos = 16;
        String gimnasio = "Good Life";
        String restaurante = "FoodHacks";

        CuatroEstrellas fourSeasons = new CuatroEstrellas(nombre, direccion, localidad, gerente, cantidadHabitaciones,
                cantidadCamas, cantidadPisos, cantidadCamas, gimnasio, restaurante, cantidadPisos);

        return fourSeasons;

    }

    public ArrayList<CuatroEstrellas> lista() {

        hotelesCuatroEstrellas.add(crear());

        return hotelesCuatroEstrellas;
    }

}
