package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.factory;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Door;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 21-Feb-17.*/

public class FactoryDoor extends FactoryModel<Double> {

    public FactoryDoor(Reader reader) {
        super(reader);
    }

    public Door createDoor() {
        BigDecimal widthDoor = setWidthOfDoor();
        BigDecimal heightDoor = setHeightOfDoor();
        return new Door(widthDoor, heightDoor);
    }

    private BigDecimal setHeightOfDoor() {
        System.out.println("Enter the height of the door : ");
        return new BigDecimal(super.getReader().readDouble());
    }

    private BigDecimal setWidthOfDoor() {
        System.out.println("Enter the width of the door : ");
        return new BigDecimal(super.getReader().readDouble());
    }

}
