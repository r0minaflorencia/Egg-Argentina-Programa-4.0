package com.example.services;

import java.util.Scanner;

import com.example.entities.Cliente;

public class ClienteService {
    
    private Scanner scan;

    public ClienteService() {
        this.scan = new Scanner(System.in);
    }

    public Cliente cargarCliente() {
        System.out.println("Datos del cliente");
        System.out.print("Nombre: ");
        String nombre = scan.next();
        System.out.print("Apellido: ");
        String apellido = scan.next();
        System.out.print("DNI: ");
        int dni = scan.nextInt();

        return new Cliente(nombre, apellido, dni, 0, null, null, null);
    }
}
