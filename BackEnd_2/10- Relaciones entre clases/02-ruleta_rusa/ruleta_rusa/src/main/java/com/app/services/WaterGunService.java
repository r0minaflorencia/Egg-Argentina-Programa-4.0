package com.app.services;

import com.app.entities.WaterGun;

public class WaterGunService {

    private WaterGun wGun;

    public WaterGunService() {
        this.wGun = new WaterGun();
    }

    public WaterGun load() {
        System.out.println("Loading...");
        wGun.setActualPosition((int) (Math.random() * 9) + 1);
        wGun.setWaterPosition((int) (Math.random() * 9) + 1);
        return wGun;
    }

    public boolean shoot() {

        if (wGun.getWaterPosition() == 0) {
            System.out.println("the gun is empty");
            return false;
        } else if (wGun.getActualPosition() == wGun.getWaterPosition() && wGun.getWaterPosition() != 0) {
            return true;
        } else {
            return false;
        }
    }

    public void next() {
        System.out.println("Next...");
        if (wGun.getActualPosition() <= 10) {
            wGun.setActualPosition(wGun.getActualPosition() + 1);
        } else {
            wGun.setActualPosition(1);
        }

    }

    public void show() {
        System.out.println(wGun.toString());
    }

}
