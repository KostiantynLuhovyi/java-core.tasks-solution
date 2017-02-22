package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.area;

import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Door;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Room;

import java.math.BigDecimal;
import java.util.List;

/**Created by Konstantin Lugowoy on 22-Feb-17.*/

public class CalculatorForTheDoorsArea extends CalculatorForTheObjectArea<Door> implements CalculableTotalAreaOfTheObjectInTheRoom<Door> {

    @Override
    public Door calculateArea(Door door) {
        BigDecimal areaDoor = new BigDecimal(door.getWidthDoor().multiply(door.getHeightDoor()).doubleValue());
        door.setAreaDoor(areaDoor);
        return door;
    }

    @Override
    public BigDecimal calculateTotalAreaOfTheObjectInTheRoom(Room room) {
        BigDecimal totalAreaOfTheDoorsInTheRoom = new BigDecimal(0);
        BigDecimal resultTotalArea = null;
        for (Door door : room.getDoorListInTheFlat()) {
            resultTotalArea = new BigDecimal(totalAreaOfTheDoorsInTheRoom.add(this.calculateArea(door).getAreaDoor()).doubleValue());
        }
        return resultTotalArea;
    }

    @Override
    public BigDecimal calculateTotalAreaOfTheObjectInTheRoom(List<Door> doors) {
        BigDecimal totalAreaOfTheDoorsInTheRoom = new BigDecimal(0);
        BigDecimal resultTotalArea = null;
        for (Door door : doors) {
            resultTotalArea = new BigDecimal(totalAreaOfTheDoorsInTheRoom.add(this.calculateArea(door).getAreaDoor()).doubleValue());
        }
        return resultTotalArea;
    }


}
