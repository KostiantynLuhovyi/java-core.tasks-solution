package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.expense;

import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Paint;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Room;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 22-Feb-17. */

public class CalculatorExpensePaintForTheRoom implements CalculableExpensePaintForTheRoom {

    @Override
    public BigDecimal calculateExpensePaintForTheRoom(Room room, Paint paint) {
        return room.getAreaRoomWithoutAreaDoorsAndWindows().multiply(new BigDecimal(paint.getExpenseOfThePaintPerSquareMeter().doubleValue())).setScale(2, BigDecimal.ROUND_DOWN);
    }

}
