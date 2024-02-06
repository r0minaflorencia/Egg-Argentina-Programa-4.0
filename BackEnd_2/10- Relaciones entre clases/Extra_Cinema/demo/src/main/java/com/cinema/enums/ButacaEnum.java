package com.cinema.enums;

public enum ButacaEnum {
    A1(true), A2(true), A3(true), A4(true), A5(true), A6(true), A7(true), A8(true),
    B1(true), B2(true), B3(true), B4(true), B5(true), B6(true), B7(true), B8(true),
    C1(true), C2(true), C3(true), C4(true), C5(true), C6(true), C7(true), C8(true),
    D1(true), D2(true), D3(true), D4(true), D5(true), D6(true), D7(true), D8(true),
    E1(true), E2(true), E3(true), E4(true), E5(true), E6(true), E7(true), E8(true),
    F1(true), F2(true), F3(true), F4(true), F5(true), F6(true), F7(true), F8(true);

    private boolean disponibilidad;

    ButacaEnum(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

}
