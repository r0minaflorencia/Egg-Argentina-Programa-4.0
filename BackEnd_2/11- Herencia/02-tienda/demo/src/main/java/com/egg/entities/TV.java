package com.egg.entities;

import java.util.Scanner;

public class TV extends Electrodomestico {

    private Scanner scan;
    private int pulgadas;
    private boolean sintonizaTDT;

    public TV() {

    }

    public TV(char tipo, double precio, double peso, String color, int pulgadas, boolean sintonizaTDT) {
        super(tipo, precio, peso, color);
        this.pulgadas = pulgadas;
        this.sintonizaTDT = sintonizaTDT;
    }

    public TV crearTV() {
        Electrodomestico e = crearElectrodomestico();
        scan = new Scanner(System.in);
        System.out.print("Pulgadas: ");
        pulgadas = scan.nextInt();
        System.out.print("¿Tiene sintonizador TDT? (s/n): ");
        char rta = scan.next().toLowerCase().charAt(0);
        if (rta == 's') {
            sintonizaTDT = true;
        } else {
            sintonizaTDT = false;
        }

        this.precioFinal();

        return new TV(e.getTipo(), e.getPrecio(), e.getPeso(), e.getColor(), pulgadas, sintonizaTDT);
    }

    public void precioFinal() {
        super.precioFinal();
        if (pulgadas >= 40) {
            setPrecioFinal(((getPrecioFinal() * 30) / 100));
        }

        if (sintonizaTDT) {
            setPrecioFinal(getPrecioFinal() + 500);
        }

    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizaTDT() {
        return sintonizaTDT;
    }

    public void setSintonizaTDT(boolean sintonizaTDT) {
        this.sintonizaTDT = sintonizaTDT;
    }

    @Override
    public String toString() {
        return super.toString() + ", pulgadas: " + pulgadas + ", ¿tiene sintonizador TDT? " + sintonizaTDT;
    }

}
