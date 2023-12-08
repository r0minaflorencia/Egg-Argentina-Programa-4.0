package com.mycompany.crear.rectangulo.entidades;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Rectangulo {

    private int base, altura;
    private Scanner scan;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public void crear() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Base: ");
        base = scan.nextInt();
        System.out.print("Altura: ");
        altura = scan.nextInt();
        System.out.println();
    }

    public void calcularSuperficie() {
        int superficie = base * altura;
        System.out.println("Superficie: " + superficie);
    }

    public void calcularPerimetro() {
        int  perimetro = (base + altura) * 2;
        System.out.println("Perímetro: " + perimetro);
    }

    public void dibujar() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altura - 1) {
                    System.out.print(" * ");
                } else {
                    if (j == 0 || j == base - 1) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

}
