package com.lugowoy.tasks.oop.calculationOfVariousDataAboutThePlanetsOfTheSolarSystem.calculate;

import com.lugowoy.tasks.oop.calculationOfVariousDataAboutThePlanetsOfTheSolarSystem.model.Planet;

import java.math.BigDecimal;
import java.util.Collection;

/** Created by Konstantin Lugowoy on 07.03.2017. */

public class CalculateMassAllPlanets {

    public static BigDecimal calculateMassAllPlanets(Collection<Planet> collection) {
        BigDecimal resultCalculate = new BigDecimal(0);
        for (Planet planet : collection) {
            if (planet != null) {
                resultCalculate = resultCalculate.add(planet.getMassPlanet());
            }
        }
        return resultCalculate;
    }
}
