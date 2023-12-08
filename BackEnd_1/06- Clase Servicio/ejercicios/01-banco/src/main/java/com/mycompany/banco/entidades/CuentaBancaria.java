/*Realizar una clase llamada CuentaBancaria en el paquete Entidades con
los siguientes atributos: numeroCuenta(entero), dniCliente(entero largo), saldoActual. 
Agregar constructor vacío, con parámetros, getters y setters.*/
package com.mycompany.banco.entidades;

/**
 *
 * @author Romina
 */
public class CuentaBancaria {
    
    private int nroCuenta, dniCliente;
    private String nombre, apellido;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int nroCuenta, int dniCliente, String nombre, String apellido, double saldoActual) {
        this.nroCuenta = nroCuenta;
        this.dniCliente = dniCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.saldoActual = saldoActual;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public int getDniCliente() {
        return dniCliente;
    }

    public void setDniCliente(int dniCliente) {
        this.dniCliente = dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    @Override
    public String toString() {
        return "Cuenta " + "N°: " + nroCuenta + " {" + apellido + " " + nombre + ", DNI: " + dniCliente + ", saldo actual: $" + saldoActual + '}';
    }
    
    
    
}
