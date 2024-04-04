package com.app.entities;

public class EdificioDeOficinas extends Edificio {

    private int cantidadOficinas, personasPorOficina, cantidadPisos;

    public EdificioDeOficinas() {

    }

    public EdificioDeOficinas(double ancho, double largo, double alto, int cantidadOficinas, int personasPorOficina,
            int cantidadPisos) {
        super(ancho, largo, alto);
        this.cantidadOficinas = cantidadOficinas;
        this.personasPorOficina = personasPorOficina;
        this.cantidadPisos = cantidadPisos;
    }

    public void cantPersonas() {
        /*
         * Crear el método cantPersonas(), que muestre
         * cuantas personas entrarían en un piso y cuantas en todo el edificio.
         */
    }

    @Override
    public void calcularSuperficie() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
                "Unimplemented method 'calcularSuperficie'");
    }

    @Override
    public void calcularVolumen() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException(
                "Unimplemented method 'calcularVolumen'");
    }

    public int getCantidadOficinas() {
        return cantidadOficinas;
    }

    public void setCantidadOficinas(int cantidadOficinas) {
        this.cantidadOficinas = cantidadOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public int getCantidadPisos() {
        return cantidadPisos;
    }

    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }

    @Override
    public String toString() {
        return super.toString() + ", cantidad de oficinas: " + cantidadOficinas + ", personas por oficina: " + personasPorOficina
                + ", cantidad de pisos: " + cantidadPisos + "]";
    }

    
}
