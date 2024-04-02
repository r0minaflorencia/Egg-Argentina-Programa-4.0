package com.egg;

import java.util.ArrayList;

import com.egg.entities.Electrodomestico;
import com.egg.entities.Lavadora;
import com.egg.entities.TV;
import com.egg.services.Compra;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello tienda de electrodomesticos!");

    Electrodomestico lavadora = new Lavadora();
    Electrodomestico tv = new TV();

    System.out.println("Lavadora");
    ((Lavadora) lavadora).crearLavadora();
    System.out.println("TV");
    ((TV) tv).crearTV();

    ArrayList<Electrodomestico> carrito = new ArrayList<>();

    carrito.add(tv);
    carrito.add(lavadora);
 
    Compra compra = new Compra();

    compra.comprar(carrito);

  }
}