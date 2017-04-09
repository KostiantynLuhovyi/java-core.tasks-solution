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
        BigDecimal widthDoor = setWidthOfDoor();

        BigDecimal heightDoor = setHeightOfDoor();

        System.out.println();

        return new Door(widthDoor, heightDoor);
    }

    private BigDecimal setHeightOfDoor() {
        System.out.println("Enter the height of the door : ");
        return new BigDecimal(super.getReadingData().reading());
    }

    private BigDecimal setWidthOfDoor() {
        System.out.println("Enter the width of the door : ");
        return new BigDecimal(super.getReadingData().reading());
    }
}
