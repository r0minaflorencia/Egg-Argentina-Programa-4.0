package com.app;

import java.util.Scanner;
import java.util.Set;

import com.app.entities.Player;
import com.app.services.PlayerService;
import com.app.services.WaterGunService;

public class Main {
    public static void main(String[] args) {
        System.out.println(" /// Welcome /// ");

        WaterGunService gunService = new WaterGunService();
        PlayerService playerService = new PlayerService();
        Set<Player> players = playerService.loadPlayers();

        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        do {

            System.out.println("Menú" +
                    "\n a_ load water" +
                    "\n b_ shoot" +
                    "\n c_ show" +
                    "\n d_ exit");

            switch (scan.next().toLowerCase()) {
                case "a":
                    gunService.load();
                    break;
                case "b":
                    playGame(players, gunService);
                    break;
                case "c":
                    gunService.show();
                    break;
                case "d":
                    System.out.println("exit");
                    exit = true;
                    break;
                default:
                    System.out.println("you must enter a valid option");
                    break;
            }
        } while (!exit);

        scan.close();

    }

    public static void playGame(Set<Player> players, WaterGunService gunService) {
        for (Player player : players) {
            if (gunService.shoot()) {
                System.out.println(player.getName() + " You lose!");
                player.setAlive(false);
                System.out.println(player.toString());
                gunService.show();
                return;
            } else {
                System.out.println(player.getName() + " Congrats! You're still dry!");
                gunService.next();
            }
        }

    }

}