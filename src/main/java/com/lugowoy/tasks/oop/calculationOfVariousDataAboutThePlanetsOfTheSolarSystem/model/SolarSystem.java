package com.lugowoy.tasks.oop.calculationOfVariousDataAboutThePlanetsOfTheSolarSystem.model;

import java.util.List;

/** Created by Konstantin Lugowoy on 07.03.2017. */

public class SolarSystem {

    public static final int PLANETS_IN_THE_SOLAR_SYSTEM = 8;

    private List<Planet> planetList;

    public List<Planet> getPlanetList() {
        return planetList;
    }

    public void setPlanetList(List<Planet> planetList) {
        this.planetList = planetList;
    }
}
