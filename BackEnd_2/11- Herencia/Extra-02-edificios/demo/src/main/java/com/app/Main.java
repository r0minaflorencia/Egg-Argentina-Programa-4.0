package com.app;

import java.util.ArrayList;

import com.app.entities.Edificio;
import com.app.entities.EdificioDeOficinas;
import com.app.entities.Polideportivo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Edificios!");

        EdificioDeOficinas edif1 = new EdificioDeOficinas(15.0, 20.0, 5.5, 10, 2, 10);
        EdificioDeOficinas edif2 = new EdificioDeOficinas(12.0, 18.0, 6.5, 7, 1, 8);

        Polideportivo poli1 = new Polideportivo(100.0, 200.0, 10.0, false);
        Polideportivo poli2 = new Polideportivo(70.0, 85.0, 5, true);

        ArrayList<Edificio> edificios = new ArrayList<>();
        edificios.add(edif1);
        edificios.add(edif2);
        edificios.add(poli1);
        edificios.add(poli2);

        int cantidadTechados = 0;

        for (Edificio e : edificios) {
            System.out.println(e.toString());
            e.calcularSuperficie();
            e.calcularVolumen();
            if (e instanceof EdificioDeOficinas) {
               ((EdificioDeOficinas) e).cantPersonas();
            } else if (e instanceof Polideportivo) {
                if (((Polideportivo) e).isTechado()) {
                    cantidadTechados ++;
                }
            }
            System.out.println("\n");
        }

        System.out.println("Cantidad de polideportivos techados: " + cantidadTechados);

    }
}