package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.area;

import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.CalculableArea;

/**Created by Konstantin Lugowoy on 22-Feb-17.*/

public interface CalculableForTheObjectArea<T> extends CalculableArea {

    void calculateArea(T t);

}
