package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.area;

import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Room;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Window;

import java.math.BigDecimal;
import java.util.List;

/**Created by Konstantin Lugowoy on 22-Feb-17.*/

public class CalculatorForTheWindowsArea extends CalculatorForTheObjectArea<Window>
                                                            implements CalculableTotalAreaOfTheObjectInTheRoom<Window> {

    @Override
    public void calculateArea(Window window) {
        BigDecimal areaWindow = new BigDecimal(window.getWidthWindow().multiply(window.getHeightWindow()).doubleValue());
        window.setAreaWindow(areaWindow);
    }

    @Override
    public BigDecimal calculateTotalAreaOfTheObjectInTheRoom(Room room) {
        BigDecimal totalAreaOfTheWindowsInTheRoom = new BigDecimal(0);
        for (Window window : room.getWindowListInTheFlat()) {
            this.calculateArea(window);
            totalAreaOfTheWindowsInTheRoom = new BigDecimal(totalAreaOfTheWindowsInTheRoom.add(window.getAreaWindow()).doubleValue());
        }
        return totalAreaOfTheWindowsInTheRoom;
    }

    @Override
    public BigDecimal calculateTotalAreaOfTheObjectInTheRoom(List<Window> windowList) {
        BigDecimal totalAreaOfTheWindowsInTheRoom = new BigDecimal(0);
        for (Window window : windowList) {
            this.calculateArea(window);
            totalAreaOfTheWindowsInTheRoom = new BigDecimal(totalAreaOfTheWindowsInTheRoom.add(window.getAreaWindow()).doubleValue());
        }
        return totalAreaOfTheWindowsInTheRoom;
    }

}
