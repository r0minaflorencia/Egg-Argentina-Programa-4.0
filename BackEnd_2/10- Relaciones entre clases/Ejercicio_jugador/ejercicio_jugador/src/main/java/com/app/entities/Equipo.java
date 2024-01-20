package com.app.entities;

import java.util.HashSet;
import java.util.Set;

public class Equipo {

    private Set<Jugador> players;

    public Equipo() {
        this.players = new HashSet<>();
    }

    public Equipo(Set<Jugador> players) {
        this.players = players;
    }

    public Set<Jugador> getPlayers() {
        return players;
    }

    public void setPlayers(Set<Jugador> players) {
        this.players = players;
    }



    @Override
    public String toString() {
        System.out.println("Equipo");
        StringBuilder stringBuilder = new StringBuilder("Jugadores: {");

        for (Jugador jugador : players) {
            stringBuilder.append(jugador).append(", ");
        }

        if (!players.isEmpty()) {
            // Elimina la última coma y espacio si hay jugadores
            stringBuilder.setLength(stringBuilder.length() - 2);
        }

        stringBuilder.append("}");

        return stringBuilder.toString();
    }
}
