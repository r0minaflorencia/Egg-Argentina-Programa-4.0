package com.seguros.services;

import java.util.Date;

import com.seguros.entities.Poliza;
import com.seguros.enums.FormaDePago;
import com.seguros.enums.TipoDeCobertura;

public class PolizaService {

    public Poliza generarPoliza() {

        TipoDeCobertura cobertura = TipoDeCobertura.B1;
        int nroPoliza = 123456;
        Date fechaInicio = new Date(28 - 04 - 2024);
        Date fechaFin = new Date(28 - 05 - 2024);
        FormaDePago formaDePago = FormaDePago.EFECTIVO;
        double montoTotalAsegurado = 10000.50;
        double montoMaximoGranizo = 500.00;
        boolean incluyeGranizo = false;

        return new Poliza(null, null, cobertura, nroPoliza, fechaInicio, fechaFin, formaDePago,
         montoTotalAsegurado, montoMaximoGranizo, incluyeGranizo);
    }

    public void renovarPoliza() {

    }

    public void cancelarPoliza() {
        
    }

}
