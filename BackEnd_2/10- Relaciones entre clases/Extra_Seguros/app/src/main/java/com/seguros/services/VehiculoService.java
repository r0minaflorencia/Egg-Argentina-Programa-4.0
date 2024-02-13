package com.seguros.services;

import com.seguros.entities.Vehiculo;
import com.seguros.enums.Color;
import com.seguros.enums.Marca;

public class VehiculoService {

    public Vehiculo crearVehiculo() {
     
        Color color = Color.BORDEAUX;
        Marca marca = Marca.RENAULT;
        String modelo = "Twingo";
        String chasis = "12345678910112598";
        String tipo = "sedan";
        int anio = 1994;
        int nroMotor = 00000;
        String dominio = "ABC-123";
        
        return new Vehiculo(null, color, marca, modelo, chasis, tipo, anio, nroMotor, dominio);
    }
    
}
