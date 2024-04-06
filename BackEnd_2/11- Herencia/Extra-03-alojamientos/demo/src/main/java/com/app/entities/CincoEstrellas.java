package com.app.entities;

public final class CincoEstrellas extends CuatroEstrellas {

    private int cantidadSalonesConferencia, cantidadSuites, cantidadLimusinas;

    public CincoEstrellas() {

    }

    public int getCantidadSalonesConferencia() {
        return cantidadSalonesConferencia;
    }

    public void setCantidadSalonesConferencia(int cantidadSalonesConferencia) {
        this.cantidadSalonesConferencia = cantidadSalonesConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public int getCantidadLimusinas() {
        return cantidadLimusinas;
    }

    public void setCantidadLimusinas(int cantidadLimusinas) {
        this.cantidadLimusinas = cantidadLimusinas;
    }

    @Override
    public String toString() {
        return super.toString() + "[cantidad de salones de conferencia: " + cantidadSalonesConferencia
                + ", cantidad de suites: " + cantidadSuites + ", cantidad de limusinas: " + cantidadLimusinas + "]";
    }

}
