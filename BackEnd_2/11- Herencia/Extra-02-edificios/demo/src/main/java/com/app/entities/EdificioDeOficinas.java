package com.app.entities;

public class EdificioDeOficinas extends Edificio {

    private int cantidadOficinas, personasPorOficina, cantidadPisos;

    public EdificioDeOficinas() {

    }

    public EdificioDeOficinas(double ancho, double largo, double altura, int cantidadOficinas, int personasPorOficina,
            int cantidadPisos) {
        super(ancho, largo, altura);
        this.cantidadOficinas = cantidadOficinas;
        this.personasPorOficina = personasPorOficina;
        this.cantidadPisos = cantidadPisos;
    }

    public void cantPersonas() {
        System.out.println("Cantidad de personas por piso: " + getPersonasPorOficina());
        System.out.println("Cantidad de personas en todo el edificio: " + (getPersonasPorOficina() * getCantidadPisos()));
    }

    public EdificioDeOficinas crear() {
        // TODO here
        return null;
    }

    @Override
    public void calcularSuperficie(double largo, double ancho) {
        System.out.println("La superficie del edificio de oficinas es de " + (largo * ancho));
    }

    @Override
    public void calcularVolumen(double largo, double ancho, double altura) {
        System.out.println("El volumen del edificio es de " + (largo * ancho * altura));
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
        return super.toString() + ", cantidad de oficinas: " + cantidadOficinas + ", personas por oficina: "
                + personasPorOficina
                + ", cantidad de pisos: " + cantidadPisos + "]";
    }

}
