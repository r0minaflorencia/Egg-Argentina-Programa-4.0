package mycompany.circunferencia.entidades;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Circunferencia {

    private double radio;
    private Scanner scan;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    //método para solicitar datos al usuario:
    public void crearCircunferencia() {
        //scanner
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingresar radio: ");
        radio = scan.nextDouble();
    }

    //método para calcular area:
    public double area() {
        //(Area = 〖 π*radio〗^2)
        return Math.PI * (Math.pow(radio, 2));
    }

    //método para calcular el perímetro:
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    //getter & setters:
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circunferencia {" + "radio: " + radio + '}';
    }

}
