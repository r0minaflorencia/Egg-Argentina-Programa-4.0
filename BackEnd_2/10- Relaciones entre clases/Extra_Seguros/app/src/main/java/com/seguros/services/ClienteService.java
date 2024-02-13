package com.seguros.services;

import java.util.ArrayList;
import java.util.List;

import com.seguros.entities.Cliente;
import com.seguros.entities.Vehiculo;

public class ClienteService {

    public Cliente usuarioPredeterminado() {
        String nombre = "Romina";
        String apellido = "Avalos";
        Integer documento = 123456789;
        String mail = "asdasd@gmail.com";
        String tel = "01123456";
        String domicilio = "Calle falsa 123";
        List<Vehiculo> vehiculos = new ArrayList<>();

        return new Cliente(nombre, apellido, mail, domicilio, tel, documento, vehiculos);
    }

}
