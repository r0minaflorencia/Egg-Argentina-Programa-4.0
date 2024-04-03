package com.example.services;

import com.example.entities.BarcoMotor;
import com.example.entities.Velero;
import com.example.entities.Yate;

public class NaveService {

    public NaveService() {

    }

    public BarcoMotor crearBarcoMotor() {

        return new BarcoMotor(15, 7895, 2015, 15.5);
    }

    public Velero crearVelero() {

        return new Velero(12, 4567, 1994, 3);
    }

    public Yate crearYate() {

        return new Yate(30, 6548, 2020, 25.0, 12);
    }
    
}
