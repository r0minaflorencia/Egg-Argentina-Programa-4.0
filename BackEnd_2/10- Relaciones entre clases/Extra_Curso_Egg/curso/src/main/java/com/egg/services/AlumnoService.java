package com.egg.services;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.egg.entities.Alumno;
import com.egg.enums.Apellido;
import com.egg.enums.Nombre;

public class AlumnoService {

    private List<Nombre> nombres;
    private List<Apellido> apellidos;

    public AlumnoService() {
        this.nombres = Arrays.asList(Nombre.values());
        this.apellidos = Arrays.asList(Apellido.values());
    }

    public Alumno crearAlumno() {
        Random random = new Random();
        Collections.shuffle(nombres);
        Collections.shuffle(apellidos);

        String nombre = nombres.get(random.nextInt(nombres.size())).toString();
        String apellido = apellidos.get(random.nextInt(apellidos.size())).toString();
        Integer dni = random.nextInt(100000000); //numero de 8 dígitos

        return new Alumno(nombre, apellido, dni, 0);
    }
}