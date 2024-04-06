package com.app.services;

import com.app.entities.Camping;

public class CampingService {

    public Camping crear() {

        String nombre = "La Arbolada";
        String direccion = "Bella Vista 123";
        String localidad = "Rafael Castillo";
        String gerente = "El gerent";
        boolean esPrivado = true;
        boolean tieneRestaurante = true;
        double metrosCuadrados = 26.0;
        int capacidadCarpas = 25;
        int cantidadBanios = 15;

        Camping laArbolada = new Camping(nombre, direccion, localidad, gerente, esPrivado, metrosCuadrados,
                capacidadCarpas, cantidadBanios, tieneRestaurante);

        return laArbolada;
    }

}
