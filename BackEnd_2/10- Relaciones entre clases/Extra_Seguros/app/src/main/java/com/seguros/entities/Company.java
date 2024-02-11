package com.seguros.entities;

import java.util.List;

public class Company {
    
    private String nombreEmpresa;
    private List<Poliza> polizas;
    
    public Company() {
    
    }

    public Company (String nombreEmpresa, List<Poliza> polizas) {
        this.nombreEmpresa = nombreEmpresa;
        this.polizas = polizas;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public List<Poliza> getPolizas() {
        return polizas;
    }

    public void setPolizas(List<Poliza> polizas) {
        this.polizas = polizas;
    }

    @Override
    public String toString() {
        return nombreEmpresa;
    }

}
