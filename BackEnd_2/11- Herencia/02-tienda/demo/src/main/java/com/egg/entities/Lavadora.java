package com.egg.entities;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {

    private int carga;
    private Scanner scan;

    public Lavadora() {

    }

    public Lavadora(char tipo, double precio, double peso, String color, int carga) {
        super(tipo, precio, peso, color);
        this.carga = carga;
    }

    public Lavadora crearLavadora() {
        Electrodomestico e = crearElectrodomestico();
        scan = new Scanner(System.in);
        System.out.print("Carga: ");
        carga = scan.nextInt(); 

        this.precioFinal();

        return new Lavadora(e.tipo, e.precio, e.peso, e.color, carga);
    }

    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            setPrecioFinal(getPrecioFinal() + 500);
        }
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + ", carga: " + carga;
    }

}
