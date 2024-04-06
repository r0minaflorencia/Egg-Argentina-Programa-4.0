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
        String direccion = "Calle Solar 789";
        String localidad = "Ramos Mejía";
        String gerente = "Gerente2";
        boolean esPrivado = true;
        double metrosCuadrados = 26.6;
        int cantidadHabitaciones = 20;

        Residencia delSol = new Residencia(nombre, direccion, localidad, gerente, esPrivado,
                metrosCuadrados, cantidadHabitaciones, esPrivado, esPrivado);

        return delSol;
    }

    public ArrayList<Residencia> guardar() {
        // residencias.add();

        return residencias;
    }

}
