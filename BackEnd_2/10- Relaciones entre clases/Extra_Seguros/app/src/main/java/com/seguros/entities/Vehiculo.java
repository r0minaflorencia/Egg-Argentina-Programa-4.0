package com.seguros.entities;

import com.seguros.enums.Color;
import com.seguros.enums.Marca;

public class Vehiculo {

    private Cliente owner;
    private Color color;
    private Marca marca;
    private String modelo, chasis, tipo, dominio;
    private int anio;
    private double motor;


    public Vehiculo() {

    }

    public Vehiculo(Cliente owner, Color color, Marca marca, String modelo, String chasis, String tipo, int anio,
           double motor, String dominio) {
        this.owner = owner;
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.chasis = chasis;
        this.tipo = tipo;
        this.anio = anio;
        this.motor = motor;
        this.dominio = dominio;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }

    public void setMotor(double motor) {
        this.motor = motor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Cliente getOwner() {
        return owner;
    }

    public void setOwner(Cliente owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " " + anio + " " + color + ", tipo: " + tipo + ", chasis: " +
                chasis + ", nro motor: " + motor + " - propietario: " + owner + " - dominio: " + dominio;
    }

}
