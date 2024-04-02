package com.example.entities;

import java.util.Scanner;

import com.example.interfaces.calculosFormas;

public class Rectangulo implements calculosFormas {

    private double base, altura, area, perimetro;
    private Scanner scan;

    public Rectangulo() {

    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo crear() {
        scan = new Scanner(System.in);
        System.out.println("Rectangulo");
        System.out.print("Base: ");
        base = scan.nextDouble();
        System.out.print("Altura: ");
        altura = scan.nextDouble();

        return new Rectangulo(base, altura);
    }

    @Override
    public double calculaArea() {
        return (base * altura);
    }

    @Override
    public double calcularPerimetro() {
        return ((base + altura) * 2);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
        return "Rectangulo [base: " + base + ", altura: " + altura + "]";
    }

}
