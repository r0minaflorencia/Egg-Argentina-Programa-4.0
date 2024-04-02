package com.example;

import com.example.entities.Circulo;
import com.example.entities.Rectangulo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello figuras geometricas!");

        Rectangulo r = new Rectangulo();
        r.crear();
        System.out.println(r.toString());
        System.out.println("Area: " + r.calculaArea());
        System.out.println("Perimetro: " + r.calcularPerimetro());

        System.out.println("\n");

        Circulo c = new Circulo();
        c.crear();
        System.out.println(c.toString());
        System.out.println("Area: " + c.calculaArea());
        System.out.println("Perimetro: " + c.calcularPerimetro());

    }
}