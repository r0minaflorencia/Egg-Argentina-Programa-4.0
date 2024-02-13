package com.seguros.entities;

import java.util.List;

public class Cliente {

    private String nombre, apellido, mail, domicilio, tel;
    private Integer documento;
    private List<Vehiculo> vehiculos;

    public Cliente() {

    }

    public Cliente(String nombre, String apellido, String mail, String domicilio, String tel, Integer documento,
            List<Vehiculo> vehiculos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.domicilio = domicilio;
        this.tel = tel;
        this.documento = documento;
        this.vehiculos = vehiculos;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(List<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    @Override
    public String toString() {
        return nombre + " " + apellido + ": documento: " + documento + ", dirección: " + domicilio + ". Contacto: " + mail +
        ", tel: " + tel;
    }

}
