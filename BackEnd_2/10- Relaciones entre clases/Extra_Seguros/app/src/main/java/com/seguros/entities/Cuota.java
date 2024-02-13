package com.seguros.entities;

import java.util.Date;

import com.seguros.enums.FormaDePago;

public class Cuota {

    private Poliza poliza;
    private int nroCuota;
    private double montoTotal;
    private Date fechaVencimiento;
    private boolean cuotaCancelada;
    private FormaDePago formaDePago;

    public Cuota() {

    }

    public Cuota(Poliza poliza, int nroCuota, double montoTotal, Date fechaVencimiento, boolean cuotaCancelada,
            FormaDePago formaDePago) {
        this.poliza = poliza;
        this.nroCuota = nroCuota;
        this.montoTotal = montoTotal;
        this.fechaVencimiento = fechaVencimiento;
        this.cuotaCancelada = cuotaCancelada;
        this.formaDePago = formaDePago;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean getCuotaCancelada() {
        return cuotaCancelada;
    }

    public void setCuotaCancelada(boolean cuotaCancelada) {
        this.cuotaCancelada = cuotaCancelada;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public int getNroCuota() {
        return nroCuota;
    }

    public void setNroCuota(int nroCuota) {
        this.nroCuota = nroCuota;
    }

    public FormaDePago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormaDePago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    @Override
    public String toString() {
        return "Cuota n° " + nroCuota + ", forma de pago: " + formaDePago + " - ¿cuota cancelada? " + cuotaCancelada;
    }

}
