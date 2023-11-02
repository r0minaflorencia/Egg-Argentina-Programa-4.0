/* Agregar la clase CuentaBancariaServicio en el paquete Servicios que
contenga:
a) Método para crear cuenta pidiéndole los datos al usuario.
b) Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
c) Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. 
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la cuenta.*/
package com.mycompany.banco.servicios;

import com.mycompany.banco.entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author Romina
 */
public class CuentaBancariaServicio {

    private Scanner scan;

    public CuentaBancaria crearCuenta() {

        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingresa DNI: ");
        int dniCliente = scan.nextInt();
        System.out.print("Apellido: ");
        String apellido = scan.next();
        System.out.print("Nombre: ");
        String nombre = scan.next();
        int nroCuenta = dniCliente;

        return new CuentaBancaria(nroCuenta, dniCliente, nombre, apellido, 0);
    }

    public double ingresar(CuentaBancaria cuenta) {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Ingresar $ ");
        double ingreso = scan.nextDouble();

        cuenta.setSaldoActual(ingreso);

        return ingreso;
    }

    public double retirar(CuentaBancaria cuenta) {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.print("Extraer $ ");
        double extraer = scan.nextDouble();

        //validar si hay fondos suficientes
        if (extraer <= cuenta.getSaldoActual()) {
            cuenta.setSaldoActual((cuenta.getSaldoActual() - extraer));
        } else {
            System.out.println("Fondos insuficientes.");
        }

        return extraer;
    }

    public int extraccionRapida(CuentaBancaria cuenta) {
        this.scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Extracción rápida");
        int extraccionRapida = (int) Math.round((cuenta.getSaldoActual() * 20 / 100));

        cuenta.setSaldoActual((cuenta.getSaldoActual() - extraccionRapida));

        System.out.println("Retiraste $" + extraccionRapida);

        return extraccionRapida;
    }

    public void consultarSaldo(CuentaBancaria cuenta) {
        System.out.println("Saldo actual $" + cuenta.getSaldoActual());
    }

    public void consultarDatos(CuentaBancaria cuenta) {
        System.out.println(cuenta.toString());
    }

}
