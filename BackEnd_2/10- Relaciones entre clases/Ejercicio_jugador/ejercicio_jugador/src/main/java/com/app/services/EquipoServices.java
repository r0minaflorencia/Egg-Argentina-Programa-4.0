package com.app.services;

import java.util.Scanner;

import com.app.entities.Equipo;

public class EquipoServices {

    private Equipo team;
    private JugadorServices player;
    private Scanner scan;

    public EquipoServices() {
        this.team = new Equipo();
        this.player = new JugadorServices();
        this.scan = new Scanner(System.in);
    }

    public Equipo load() {
        boolean exit = false; // flag

        do {

            System.out.print("¿Cargar jugadores? (s/n): ");
            String confirm = scan.next().toLowerCase();

            switch (confirm) {
                case "s":
                    team.getPlayers().add(player.create());
                    break;
                case "n":
                    System.out.println("Fin");
                    exit = true;
                    break;
                default:
                    System.out.println("Debes ingresar una respuesta válida.");
                    exit = false;
                    break;
            }

        } while (!exit);

        return team;
    }

    public void showAllPlayers() {
        System.out.println(team.toString());
    }

}
