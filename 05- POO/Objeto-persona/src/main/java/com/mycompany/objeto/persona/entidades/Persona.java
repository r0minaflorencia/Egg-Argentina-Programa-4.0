package com.mycompany.objeto.persona.entidades;

import java.util.Date;

/**
 *
 * @author Romina
 */
public class Persona {

    private Integer id;
    private Date fechaNacimiento;
    private String nombre;

    public Persona() {
    }

    public Persona(Integer id, Date fechaNacimiento, String nombre) {
        this.id = id;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona {" + "nombre: " + nombre + ", fecha de nacimiento: " + fechaNacimiento.getDate() + "/" + fechaNacimiento.getMonth() + "/" + fechaNacimiento.getYear() + ", ID: " + id + '}';
    }

}
