package com.app;

import com.app.services.EquipoServices;

/* Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
esto, recorreremos el equipo mostrando la información de cada jugador.  */

public class Main {
    public static void main(String[] args) {

        System.out.println("Menú");

       EquipoServices eServices = new EquipoServices();

       eServices.load();
       eServices.showAllPlayers();

    }
}