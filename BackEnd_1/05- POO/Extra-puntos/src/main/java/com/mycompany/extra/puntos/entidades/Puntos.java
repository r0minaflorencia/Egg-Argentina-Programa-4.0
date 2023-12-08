package com.mycompany.extra.puntos.entidades;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Puntos {

    private int x1, y1, x2, y2;
    private Scanner scan;

    public Puntos() {
    }

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    //Métodos
    public void crear() {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Primer punto");
        System.out.print("Ingresa X: ");
        x1 = scan.nextInt();
        System.out.print("Y: ");
        y1 = scan.nextInt();

        System.out.println("Segundo punto");
        System.out.print("Ingresa X: ");
        x2 = scan.nextInt();
        System.out.print("Y: ");
        y2 = scan.nextInt();

    }

    public int calcularDistancia() {
        int distanciaX, distanciaY;

        if (x1 > x2) {
            distanciaX = x1 - x2;
        } else {
            distanciaX = x2 - x1;
        }
        if (y1 > y2) {
            distanciaY = y1 - y2;
        } else {
            distanciaY = y2 - y1;
        }
        
        return (distanciaX + distanciaY);
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    

}
