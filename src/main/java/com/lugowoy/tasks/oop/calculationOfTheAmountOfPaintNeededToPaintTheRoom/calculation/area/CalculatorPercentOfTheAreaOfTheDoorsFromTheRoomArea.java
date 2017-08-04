package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.area;

import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Room;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 06.03.2017. */

public class CalculatorPercentOfTheAreaOfTheDoorsFromTheRoomArea
        implements CalculablePercentOfTheAreaOfTheObjectsFromTheRoomArea {

    @Override
    public BigDecimal calculatePercentage(Room room) {
        return new BigDecimal(room.getTotalAreaRoom()
                        .multiply(new BigDecimal(room.getTotalAreaOfTheDoorsInTheRoom().doubleValue())
                        .divide(new BigDecimal(100), 2, BigDecimal.ROUND_DOWN)).doubleValue());
    }

}
