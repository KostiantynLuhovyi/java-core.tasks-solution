package com.lugowoy.tasks.core.convertKilometersToMilesOfSeaAndLand;

/**
 * Created by Konstantin on 31-Dec-16.
 */

public class Length {

    private double kilometers;
    private double milesOfSea;
    private double milesOfLand;

    public Length() {
    }

    public double getKilometers() {
        return kilometers;
    }

    public void setKilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    public double getMilesOfSea() {
        return milesOfSea;
    }

    public void setMilesOfSea(double milesOfSea) {
        this.milesOfSea = milesOfSea;
    }

    public double getMilesOfLand() {
        return milesOfLand;
    }

    public void setMilesOfLand(double milesOfLand) {
        this.milesOfLand = milesOfLand;
    }
}
