package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.area;

/**Created by Konstantin Lugowoy on 22-Feb-17.*/

public abstract class CalculatorForTheObjectArea<T> implements CalculableForTheObjectArea<T> {

    @Override
    public abstract void calculateArea(T t);

}
