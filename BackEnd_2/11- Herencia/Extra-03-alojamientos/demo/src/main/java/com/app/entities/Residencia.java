package com.app.entities;

public final class Residencia extends ExtraHotel {

    private int cantidadHabitaciones;
    private boolean tieneDescuento, tieneCampoDeportivo;

    public Residencia() {
    }

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean esPrivado,
            double metrosCuadrados, int cantidadHabitaciones, boolean tieneDescuento, boolean tieneCampoDeportivo) {
        super(nombre, direccion, localidad, gerente, esPrivado, metrosCuadrados);
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.tieneDescuento = tieneDescuento;
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public boolean isTieneDescuento() {
        return tieneDescuento;
    }

    public void setTieneDescuento(boolean tieneDescuento) {
        this.tieneDescuento = tieneDescuento;
    }

    public boolean isTieneCampoDeportivo() {
        return tieneCampoDeportivo;
    }

    public void setTieneCampoDeportivo(boolean tieneCampoDeportivo) {
        this.tieneCampoDeportivo = tieneCampoDeportivo;
    }

    @Override
    public String toString() {
        return ", cantidad de habitaciones: " + cantidadHabitaciones + ", ¿tiene descuento?" + tieneDescuento
                + ", ¿tiene campo deportivo?" + tieneCampoDeportivo + "]";
    }

}
