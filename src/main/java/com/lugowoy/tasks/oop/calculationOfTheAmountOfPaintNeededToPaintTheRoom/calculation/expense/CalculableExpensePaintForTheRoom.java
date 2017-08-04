package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.expense;

import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.CalculableExpense;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Paint;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Room;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 22-Feb-17. */

public interface CalculableExpensePaintForTheRoom extends CalculableExpense {

    BigDecimal calculateExpensePaintForTheRoom(Room room, Paint paint);

}
