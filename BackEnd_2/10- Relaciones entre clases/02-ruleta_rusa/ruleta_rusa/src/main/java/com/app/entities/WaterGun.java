package com.app.entities;

public class WaterGun {

    private int actualPosition, waterPosition;

    public WaterGun() {
    }

    public WaterGun(int actualPosition, int waterPosition) {
        this.actualPosition = actualPosition;
        this.waterPosition = waterPosition;
    }

    public int getActualPosition() {
        return actualPosition;
    }

    public void setActualPosition(int actualPosition) {
        this.actualPosition = actualPosition;
    }

    public int getWaterPosition() {
        return waterPosition;
    }

    public void setWaterPosition(int waterPosition) {
        this.waterPosition = waterPosition;
    }

    @Override
    public String toString() {
        return "Actual position: " + actualPosition + ". Water position: " + waterPosition;
    }

}
