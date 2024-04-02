package com.egg.entities;

import java.util.Scanner;

public class Electrodomestico {

    protected char tipo;
    protected double precio, precioFinal, peso;
    protected String color;
    protected Scanner scan;
    protected int carga;

    public Electrodomestico() {

    }

    public Electrodomestico(char tipo, double precio, double peso, String color) {
        this.tipo = tipo;
        this.precio = precio;
        this.peso = peso;
        this.color = color;
    }

    protected void precioFinal() {
        double precioFinal = precio;
        switch (tipo) {
            case 'a':
                precioFinal = precio + 1000;
                break;
            case 'b':
                precioFinal = precio + 800;
                break;
            case 'c':
                precioFinal = precio + 600;
                break;
            case 'd':
                precioFinal = precio + 500;
                break;
            case 'e':
                precioFinal = precio + 300;
                break;
            case 'f':
                precioFinal = precio + 100;
                break;
        }

        if (peso >= 1 && peso <= 19) {
            precioFinal += 100;
        } else if (peso >= 20 && peso <= 49) {
            precioFinal += 500;
        } else if (peso >= 50 && peso <= 79) {
            precioFinal += 800;
        } else if (peso >= 80) {
            precioFinal += 1000;
        }

        setPrecioFinal(precioFinal);

    }

    protected Electrodomestico crearElectrodomestico() {
        scan = new Scanner(System.in);
        System.out.print("Color: ");
        color = scan.next();
        if (!comprobarColor(color)) {
            color = "blanco";
        }
        System.out.print("Tipo: ");
        tipo = scan.next().toLowerCase().charAt(0);
        if (!comprobarConsumoEnergetico(tipo)) {
            tipo = 'f';
        }
        System.out.print("Precio: ");
        precio = scan.nextInt();
        System.out.print("Peso: ");
        peso = scan.nextDouble();

        return new Electrodomestico(tipo, precio, peso, color);
    }

    protected boolean comprobarConsumoEnergetico(char tipo) {
        boolean verificarTipo = false;

        switch (tipo) {
            case 'a':
                verificarTipo = true;
                break;
            case 'b':
                verificarTipo = true;
                break;
            case 'c':
                verificarTipo = true;
                break;
            case 'd':
                verificarTipo = true;
                break;
            case 'e':
                verificarTipo = true;
                break;
            case 'f':
                verificarTipo = true;
                break;
            default:
                verificarTipo = false;
                break;
        }

        return verificarTipo;
    }

    protected boolean comprobarColor(String color) {
        boolean verificarColor = false;

        switch (color.toLowerCase()) {
            case "blanco":
                verificarColor = true;
                break;
            case "negro":
                verificarColor = true;
                break;
            case "rojo":
                verificarColor = true;
                break;
            case "azul":
                verificarColor = true;
                break;
            case "gris":
                verificarColor = true;
                break;
            default:
                verificarColor = false;
                break;
        }
        return verificarColor;

    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return (getClass().getSimpleName() + " [ tipo: " + tipo + ", precio: $" + precio + ", color: " + color
                + ", peso: " + peso + " ]");
    }

}
