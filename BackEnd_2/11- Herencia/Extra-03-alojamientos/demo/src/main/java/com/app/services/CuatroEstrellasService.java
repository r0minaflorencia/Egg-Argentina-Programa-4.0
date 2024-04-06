package com.app.services;

import com.app.entities.CuatroEstrellas;

public class CuatroEstrellasService {

    public CuatroEstrellas crear() {

        String nombre = "4 Stars";
        String direccion = "Av Juramento 456";
        String localidad = "Belgrano";
        String gerente = "G-rente";
        int cantidadHabitaciones = 50;
        int cantidadCamas = 150;
        int cantidadPisos = 16;
        String gimnasio = "Good Life";
        String restaurante = "Food Hacks";

        CuatroEstrellas fourStars = new CuatroEstrellas(nombre, direccion, localidad, gerente, cantidadHabitaciones,
                cantidadCamas, cantidadPisos, cantidadCamas, gimnasio, restaurante, cantidadPisos);

        return fourStars;

    }

}
