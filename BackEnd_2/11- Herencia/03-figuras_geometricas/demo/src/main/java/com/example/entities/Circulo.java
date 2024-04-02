package com.example.entities;

import java.util.Scanner;

import com.example.interfaces.calculosFormas;

public class Circulo implements calculosFormas {

    private double radio, diametro, area, perimetro;
    private Scanner scan;

    public Circulo() {

    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.area = diametro;
    }

    public Circulo crear() {
        scan = new Scanner(System.in);
        System.out.println("Circulo");
        System.out.print("Radio: ");
        radio = scan.nextDouble();
        System.out.print("Diametro: ");
        diametro = scan.nextDouble();

        return new Circulo(radio, diametro);
    }

    @Override
    public double calculaArea() {
        return (PI * radio) * 2;
    }

    @Override
    public double calcularPerimetro() {
        return calculosFormas.PI * diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString() {
        return "Circulo [radio: " + radio + ", diametro: " + diametro + "]";
    }

}
