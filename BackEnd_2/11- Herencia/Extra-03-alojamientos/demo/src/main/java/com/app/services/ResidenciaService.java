package com.app.services;

import java.util.ArrayList;

import com.app.entities.Residencia;

public class ResidenciaService {

    private ArrayList<Residencia> residencias;

    public ResidenciaService() {
        this.residencias = new ArrayList<>();
    }

    public Residencia crear() {
        String nombre = "Del Sol";
        String direccion = "Solar 789";
        String localidad = "Ramos Mejía";
        String gerente = "Martina Ramirez";
        boolean esPrivado = true;
        double metrosCuadrados = 26.6;
        int cantidadHabitaciones = 20;

        Residencia delSol = new Residencia(nombre, direccion, localidad, gerente, esPrivado,
                metrosCuadrados, cantidadHabitaciones, esPrivado, esPrivado);

        return delSol;
    }

    public ArrayList<Residencia> lista() {
        residencias.add(crear());

        residencias.add(new Residencia("Nuevo Día", "Tte Donato Alvarez 745", "Haedo", 
        "Javier Gonzalez", false, 80, 12, false, true));

        return residencias;
    }

}
