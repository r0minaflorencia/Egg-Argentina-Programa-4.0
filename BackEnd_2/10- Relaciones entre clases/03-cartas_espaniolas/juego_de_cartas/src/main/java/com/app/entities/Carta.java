package com.app.entities;

import com.app.utilities.PalosEnum;
import com.app.utilities.ValoresEnum;

public class Carta {

    private PalosEnum palo;
    private ValoresEnum valor;

    public Carta() {

    }

    public Carta(ValoresEnum valor, PalosEnum palo) {
        this.valor = valor;
        this.palo = palo;
    }

    public ValoresEnum getValor() {
        return valor;
    }

    public void setValor(ValoresEnum valor) {
        this.valor = valor;
    }

    public PalosEnum getPalo() {
        return palo;
    }

    public void setPalo(PalosEnum palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return valor + " de " + palo;
    }

}
