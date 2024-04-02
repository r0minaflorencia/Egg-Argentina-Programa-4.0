package com.egg.services;

import java.util.ArrayList;

import com.egg.entities.Electrodomestico;

public class Compra {

    private double totalCompra;

    public Compra() {
        this.totalCompra = 0;
    }

    public Compra comprar(ArrayList<Electrodomestico> carrito) {

        for (Electrodomestico e : carrito) {
            totalCompra += e.getPrecioFinal();
            System.out.println(e.toString() + ". Precio final $" + e.getPrecioFinal());
        }

        System.out.println("El total de la compra es $" + totalCompra);

        return new Compra();
    }

}
