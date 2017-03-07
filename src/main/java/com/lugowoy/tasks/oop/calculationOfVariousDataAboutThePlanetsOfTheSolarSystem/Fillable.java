package com.lugowoy.tasks.oop.calculationOfVariousDataAboutThePlanetsOfTheSolarSystem;

import java.util.Collection;
import java.util.List;

/** Created by Konstantin Lugowoy on 07.03.2017. */

@FunctionalInterface
public interface Fillable<T> {

    void fill(Collection<T> tCollection);
}
