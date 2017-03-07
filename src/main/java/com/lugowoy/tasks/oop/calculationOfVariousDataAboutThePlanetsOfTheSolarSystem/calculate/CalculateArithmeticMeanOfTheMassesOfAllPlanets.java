package com.lugowoy.tasks.oop.calculationOfVariousDataAboutThePlanetsOfTheSolarSystem.calculate;

import com.lugowoy.tasks.oop.calculationOfVariousDataAboutThePlanetsOfTheSolarSystem.model.Planet;

import java.math.BigDecimal;
import java.util.Collection;

import static com.lugowoy.tasks.oop.calculationOfVariousDataAboutThePlanetsOfTheSolarSystem.model.SolarSystem.PLANETS_IN_THE_SOLAR_SYSTEM;

/** Created by Konstantin Lugowoy on 07.03.2017. */

public class CalculateArithmeticMeanOfTheMassesOfAllPlanets {

    public static BigDecimal calculateArithmeticMeanOfTheMassesOfAllPlanets(Collection<Planet> collection) {
        return CalculateMassAllPlanets.calculateMassAllPlanets(collection).divide(new BigDecimal(PLANETS_IN_THE_SOLAR_SYSTEM), 2, BigDecimal.ROUND_DOWN);
    }
}
