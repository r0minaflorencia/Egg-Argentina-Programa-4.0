package com.example;

import com.example.entities.Cliente;
import com.example.entities.Nave;
import com.example.entities.Velero;
import com.example.services.Alquiler;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello Puerto!");

        Cliente cliente = new Cliente("John", "Snow", 123456);
        Nave velero = new Velero(12, 4567, 1994, 3);
        Alquiler alquiler = new Alquiler();

        System.out.println("El costo del alquiler es de $" + alquiler.pedido(cliente, velero));

    }
}