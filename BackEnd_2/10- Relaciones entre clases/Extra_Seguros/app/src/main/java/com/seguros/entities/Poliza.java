package com.seguros.entities;

import java.util.Date;

import com.seguros.enums.FormaDePago;
import com.seguros.enums.TipoDeCobertura;

public class Poliza {

    private Vehiculo vehiculo;
    private Cliente cliente;
    private TipoDeCobertura cobertura;
    private int nroPoliza;
    private Date fechaInicio, fechaFin;
    private FormaDePago formaDePago;
    private double montoTotalAsegurado, montoMaximoGranizo;
    private boolean incluyeGranizo;

    public Poliza() {

    }

    public Poliza(Vehiculo vehiculo, Cliente cliente, TipoDeCobertura cobertura, int nroPoliza, Date fechaInicio,
            Date fechaFin, FormaDePago formaDePago, double montoTotalAsegurado, double montoMaximoGranizo, boolean incluyeGranizo) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.cobertura = cobertura;
        this.nroPoliza = nroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.formaDePago = formaDePago;
        this.montoTotalAsegurado = montoTotalAsegurado;
        this.montoMaximoGranizo = montoMaximoGranizo;
        this.incluyeGranizo = incluyeGranizo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public TipoDeCobertura getCobertura() {
        return cobertura;
    }

    public void setCobertura(TipoDeCobertura cobertura) {
        this.cobertura = cobertura;
    }

    public FormaDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public double getMontoMaximoGranizo() {
        return montoMaximoGranizo;
    }

    public void setMontoMaximoGranizo(double montoMaximoGranizo) {
        this.montoMaximoGranizo = montoMaximoGranizo;
    }

    public double getMontoTotalAsegurado() {
        return montoTotalAsegurado;
    }

    public void setMontoTotalAsegurado(double montoTotalAsegurado) {
        this.montoTotalAsegurado = montoTotalAsegurado;
    }

    public int getNroPoliza() {
        return nroPoliza;
    }

    public void setNroPoliza(int nroPoliza) {
        this.nroPoliza = nroPoliza;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public boolean getIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    @Override
    public String toString() {
        return "N°: " + nroPoliza + " - tipo de cobertura: " + cobertura;
    }

}
