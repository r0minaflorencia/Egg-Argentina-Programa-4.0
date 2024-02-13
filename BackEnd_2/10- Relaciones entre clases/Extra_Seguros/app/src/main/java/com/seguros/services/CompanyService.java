package com.seguros.services;


import com.seguros.entities.Company;

public class CompanyService {

    public Company crearEmpresa() {
        String nombreEmpresa = "La tercera seguros";
        
        return new Company(nombreEmpresa, null);
    }

}
