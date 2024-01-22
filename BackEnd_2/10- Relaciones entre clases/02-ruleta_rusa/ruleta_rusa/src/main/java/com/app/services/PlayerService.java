package com.app.services;

import java.util.HashSet;
import java.util.Set;

import com.app.entities.Player;

public class PlayerService {

    private Set<Player> players;
    private WaterGunService wGun;

    public PlayerService() {
        this.players = new HashSet<>();
        this.wGun = new WaterGunService();
    }

    public Set<Player> loadPlayers() {
        players.add(new Player(123, "Angela", true));
        players.add(new Player(456, "Javier", true));
        players.add(new Player(789, "Patricia", true));
        players.add(new Player(1011, "Gabriel", true));
        return players;
    }

    public void shoot(Set<Player> players) {

        for (Player player : players) {
            if (!wGun.shoot()) {
                System.out.println(player.getName() + " You lose!");
                player.setAlive(false);
            } else {
                System.out.println(player.getName() + " Congrats! You're still dry!");
            }
        }

    }

}
