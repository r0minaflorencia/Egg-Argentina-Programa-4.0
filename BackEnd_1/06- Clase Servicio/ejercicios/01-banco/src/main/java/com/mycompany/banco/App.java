package com.mycompany.banco;

import com.mycompany.banco.entidades.CuentaBancaria;
import com.mycompany.banco.servicios.CuentaBancariaServicio;

/**
 *
 * @author Romina
 */
public class App {

    public static void main(String[] args) {

        System.out.println("Bienvenido/a - Banco Greenner");
        CuentaBancariaServicio serviceClass = new CuentaBancariaServicio();

        System.out.println("Crear cuenta");
        CuentaBancaria account = serviceClass.crearCuenta();

        //ingresar saldo
        serviceClass.ingresar(account);

        //extraccion
        serviceClass.retirar(account);

        //extracción rápida
        serviceClass.extraccionRapida(account);

        //consultar saldo
        serviceClass.consultarSaldo(account);

        //consultar datos
        System.out.println(account.toString());

    }
}
