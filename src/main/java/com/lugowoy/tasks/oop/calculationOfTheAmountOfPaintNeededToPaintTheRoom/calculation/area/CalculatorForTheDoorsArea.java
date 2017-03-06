package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.area;

import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Door;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Room;

import java.math.BigDecimal;
import java.util.List;

/**Created by Konstantin Lugowoy on 22-Feb-17.*/

public class CalculatorForTheDoorsArea extends CalculatorForTheObjectArea<Door> implements CalculableTotalAreaOfTheObjectInTheRoom<Door> {

    @Override
    public void calculateArea(Door door) {
        BigDecimal areaDoor = new BigDecimal(door.getWidthDoor().multiply(door.getHeightDoor()).doubleValue());
        door.setAreaDoor(areaDoor);
    }

    @Override
    public BigDecimal calculateTotalAreaOfTheObjectInTheRoom(Room room) {
        BigDecimal totalAreaOfTheDoorsInTheRoom = new BigDecimal(0);
        for (Door door : room.getDoorListInTheFlat()) {
            this.calculateArea(door);
            totalAreaOfTheDoorsInTheRoom = new BigDecimal(totalAreaOfTheDoorsInTheRoom.add(door.getAreaDoor()).doubleValue());
        }
        return totalAreaOfTheDoorsInTheRoom;
    }

    @Override
    public BigDecimal calculateTotalAreaOfTheObjectInTheRoom(List<Door> doors) {
        BigDecimal totalAreaOfTheDoorsInTheRoom = new BigDecimal(0);
        for (Door door : doors) {
            this.calculateArea(door);
            totalAreaOfTheDoorsInTheRoom = new BigDecimal(totalAreaOfTheDoorsInTheRoom.add(door.getAreaDoor()).doubleValue());
        }
        return totalAreaOfTheDoorsInTheRoom;
    }


}
