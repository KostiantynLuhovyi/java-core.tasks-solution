package com.lugowoy.tasks.oop.calculationOfVariousDataAboutThePlanetsOfTheSolarSystem;

import com.lugowoy.tasks.oop.calculationOfVariousDataAboutThePlanetsOfTheSolarSystem.calculate.Calculable;
import com.lugowoy.tasks.oop.calculationOfVariousDataAboutThePlanetsOfTheSolarSystem.calculate.CalculateArithmeticMeanOfTheMassesOfAllPlanets;
import com.lugowoy.tasks.oop.calculationOfVariousDataAboutThePlanetsOfTheSolarSystem.calculate.CalculateMassAllPlanets;
import com.lugowoy.tasks.oop.calculationOfVariousDataAboutThePlanetsOfTheSolarSystem.model.Planet;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.lugowoy.tasks.oop.calculationOfVariousDataAboutThePlanetsOfTheSolarSystem.model.SolarSystem.PLANETS_IN_THE_SOLAR_SYSTEM;

/** Created by Konstantin Lugowoy on 07.03.2017. */

public class Main {

    private static final Fillable<Planet> FILLABLE = planets -> {
        for (int i = 0; i < PLANETS_IN_THE_SOLAR_SYSTEM; i++) {
            Planet planet = new Planet();
            Planet.DataOfPlanet dataOfPlanet = Planet.DataOfPlanet.getDataOfPlanet(i);
            planet.setNamePlanet(dataOfPlanet.name());
            planet.setMassPlanet(new BigDecimal(dataOfPlanet.getMass()));
            planets.add(planet);
        }
    };

    public static void main(String[] args) {

        List<Planet> planetsList = new ArrayList<>(PLANETS_IN_THE_SOLAR_SYSTEM);

        FILLABLE.fill(planetsList);

        planetsList.stream().filter(Objects::nonNull).forEachOrdered(System.out::println);
        System.out.println();

        Calculable<BigDecimal, Planet> calculable = CalculateMassAllPlanets::calculateMassAllPlanets;

        BigDecimal sumMassAllPlanetsInTheSolarSystem = new BigDecimal(calculable.calculate(planetsList).doubleValue());

        System.out.println("The mass of all planets is : " + sumMassAllPlanetsInTheSolarSystem);
        System.out.println();

        calculable = CalculateArithmeticMeanOfTheMassesOfAllPlanets::calculateArithmeticMeanOfTheMassesOfAllPlanets;
        BigDecimal arithmeticMeanOfTheMassesOfAllPlanets = calculable.calculate(planetsList);

        System.out.println("The arithmetic mean of the masses of all planets is : " + arithmeticMeanOfTheMassesOfAllPlanets);
        System.out.println();

        System.out.println("The mass of each planet in percentages, if we take as 100% the total mass of all the planets.");
        planetsList.forEach(planet -> {
            System.out.println(planet.getNamePlanet() + " = " + new BigDecimal(100).multiply(planet.getMassPlanet().divide(sumMassAllPlanetsInTheSolarSystem, 5, BigDecimal.ROUND_HALF_DOWN)));
        });

    }
}
