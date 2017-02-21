package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.factory;

import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Door;
import com.lugowoy.util.reading.Reading;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 21-Feb-17.*/

public class FactoryDoor extends FactoryModel<Double> {

    public FactoryDoor(Reading<Double> reading) {
        super(reading);
    }

    public Door createDoor() {
        System.out.println("Enter the width of the door : ");
        BigDecimal widthDoor = new BigDecimal(super.getReadingData().reading());

        System.out.println("Enter the height of the door : ");
        BigDecimal heightDoor = new BigDecimal(super.getReadingData().reading());

        System.out.println();

        return new Door(widthDoor, heightDoor);
    }
}
