package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.calculation.area;

import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Room;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Window;

import java.math.BigDecimal;
import java.util.List;

/**Created by Konstantin Lugowoy on 22-Feb-17.*/

public class CalculatorForTheWindowsArea extends CalculatorForTheObjectArea<Window>
                                                            implements CalculableTotalAreaOfTheObjectInTheRoom<Window> {

    @Override
    public Window calculateArea(Window window) {
        BigDecimal areaWindow = new BigDecimal(window.getWidthWindow().multiply(window.getHeightWindow()).doubleValue());
        window.setAreaWindow(areaWindow);
        return window;
    }

    @Override
    public BigDecimal calculateTotalAreaOfTheObjectInTheRoom(Room room) {
        BigDecimal totalAreaOfTheDoorsInTheRoom = new BigDecimal(0);
        BigDecimal resultTotalArea = null;
        for (Window window : room.getWindowListInTheFlat()) {
            resultTotalArea = new BigDecimal(totalAreaOfTheDoorsInTheRoom.add(this.calculateArea(window).getAreaWindow()).doubleValue());
        }
        return resultTotalArea;
    }

    @Override
    public BigDecimal calculateTotalAreaOfTheObjectInTheRoom(List<Window> windowList) {
        BigDecimal totalAreaOfTheDoorsInTheRoom = new BigDecimal(0);
        BigDecimal resultTotalArea = null;
        for (Window window : windowList) {
            resultTotalArea = new BigDecimal(totalAreaOfTheDoorsInTheRoom.add(this.calculateArea(window).getAreaWindow()).doubleValue());
        }
        return resultTotalArea;
    }
}
