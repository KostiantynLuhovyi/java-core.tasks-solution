package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.determine;

/**Created by Konstantin Lugowoy on 20-Feb-17.*/

@FunctionalInterface
public interface Determinable<T, V, Z> {

    T determine(V v, Z z);
}
