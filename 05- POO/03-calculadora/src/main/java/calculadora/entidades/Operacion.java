package calculadora.entidades;

import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class Operacion {

    private double numero1, numero2;
    private int numero1Int, numero2Int;
    private Scanner scan;

    public Operacion() {
    }

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public void crearOperacion() {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingrese el 1° número: ");

        //condicion para almacenar el número en double o int depende del ingreso del usuario.
        if (scan.hasNextDouble()) {
            numero1 = scan.nextDouble();
        } else if (scan.hasNextInt()) {
            numero1Int = (int) Math.round(numero1);
            numero1 = numero1Int;
        }

        System.out.print("2° número: ");

        //condicion para almacenar el número en double o int depende del ingreso del usuario.
         if (scan.hasNextDouble()) {
            numero2 = scan.nextDouble();
        } else if (scan.hasNextInt()) {
            numero2Int = (int) Math.round(numero2);
            numero2 = numero1Int;
        }
    }

    public void sumar() {
        System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
    }

    public void restar() {
        System.out.println(numero1 + " - " + numero2 + " = " + (numero1 - numero2));
    }

    public void multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Multiplicación * 0.");
        } else {
            System.out.println(numero1 + " * " + numero2 + " = " + (numero1 * numero2));
        }
    }

    public void dividir() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("División por cero.");
        } else {
            System.out.println(numero1 + " / " + numero2 + " = " + (numero1 / numero2));
        }
    }

}
