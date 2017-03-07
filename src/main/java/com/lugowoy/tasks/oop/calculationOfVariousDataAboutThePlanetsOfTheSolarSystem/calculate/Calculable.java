package com.lugowoy.tasks.oop.calculationOfVariousDataAboutThePlanetsOfTheSolarSystem.calculate;

import java.util.Collection;

/** Created by Konstantin Lugowoy on 07.03.2017. */

@FunctionalInterface
public interface Calculable<T, V> {

    T calculate(Collection<V> collection);
}
