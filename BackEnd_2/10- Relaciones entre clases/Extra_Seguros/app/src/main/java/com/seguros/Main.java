package com.seguros;

import java.util.ArrayList;
import java.util.List;

import com.seguros.entities.Cliente;
import com.seguros.entities.Company;
import com.seguros.entities.Poliza;
import com.seguros.entities.Vehiculo;
import com.seguros.services.ClienteService;
import com.seguros.services.CompanyService;
import com.seguros.services.PolizaService;
import com.seguros.services.VehiculoService;

public class Main {
    public static void main(String[] args) {

        CompanyService company = new CompanyService();
        Company empresa = company.crearEmpresa();
        ClienteService user = new ClienteService();
        Cliente cliente1 = user.usuarioPredeterminado();
        VehiculoService vehiculo = new VehiculoService();
        Vehiculo vehiculo1 = vehiculo.crearVehiculo();
        PolizaService poliza = new PolizaService();
        Poliza poliza1 = poliza.generarPoliza();

        simulacion(empresa, cliente1, vehiculo1, poliza1);
        mostrar(empresa, cliente1, vehiculo1, poliza1);

    }

    public static void simulacion(Company empresa, Cliente cliente1, Vehiculo vehiculo1, Poliza poliza1) {
        List<Poliza> polizas = new ArrayList<>();
        polizas.add(poliza1);
        empresa.setPolizas(polizas);
        cliente1.getVehiculos().add(vehiculo1);
        vehiculo1.setOwner(cliente1);
        poliza1.setCliente(cliente1);
        poliza1.setVehiculo(vehiculo1);
    }

    public static void mostrar(Company empresa, Cliente cliente1, Vehiculo vehiculo1, Poliza poliza1) {
        System.out.println(empresa.toString());
        System.out.println("Clientes:");
        System.out.println(cliente1.toString() + cliente1.getVehiculos());
        System.out.println("Vehiculos asegurados:");
        System.out.println(vehiculo1.toString());
        System.out.println("Polizas:");
        System.out.println(poliza1.toString());
    }

}