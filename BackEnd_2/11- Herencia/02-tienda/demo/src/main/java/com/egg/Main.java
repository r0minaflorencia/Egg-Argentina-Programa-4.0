package com.egg;

import java.util.HashSet;
import java.util.Set;

import com.egg.entities.Electrodomestico;
import com.egg.entities.Lavadora;
import com.egg.entities.TV;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello tienda de electrodomesticos!");

    Electrodomestico lavadora = new Lavadora();
    Electrodomestico tv = new TV();

    System.out.println("Lavadora");
    ((Lavadora) lavadora).crearLavadora();
    System.out.println("TV");
    ((TV) tv).crearTV();

    Set<Electrodomestico> electrodomesticos = new HashSet<>();

    electrodomesticos.add(tv);
    electrodomesticos.add(lavadora);

    for (Electrodomestico e : electrodomesticos) {
      System.out.println(e.toString() + ". Precio final $" + e.getPrecioFinal());
    }

  }
}