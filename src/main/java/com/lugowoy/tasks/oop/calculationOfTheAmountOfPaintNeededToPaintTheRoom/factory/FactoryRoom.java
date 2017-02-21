package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.factory;

import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Room;
import com.lugowoy.util.reading.Reading;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 21-Feb-17.*/

public class FactoryRoom extends FactoryModel<Double> {

    public FactoryRoom(Reading<Double> reading) {
        super(reading);
    }

    public Room createRoom() {
        System.out.println("Enter the width of the room : ");
        BigDecimal widthRoom = new BigDecimal(super.getReadingData().reading());

        System.out.println("Enter the length of the room : ");
        BigDecimal lengthRoom = new BigDecimal(super.getReadingData().reading());

        System.out.println("Enter the height of the room : ");
        BigDecimal heightRoom = new BigDecimal(super.getReadingData().reading());

        System.out.println();

        return new Room(widthRoom, lengthRoom, heightRoom);
    }
}
