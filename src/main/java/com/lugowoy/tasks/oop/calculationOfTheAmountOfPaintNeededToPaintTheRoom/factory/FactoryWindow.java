package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.factory;

import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Window;
import com.lugowoy.util.reading.Reading;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 21-Feb-17.*/

public class FactoryWindow extends FactoryModel<Double> {

    public FactoryWindow(Reading<Double> reading) {
        super(reading);
    }

    public Window createWindow() {
        System.out.println("Enter the width of the window : ");
        BigDecimal widthWindow = new BigDecimal(super.getReadingData().reading());

        System.out.println("Enter the height of the window : ");
        BigDecimal heightWindow = new BigDecimal(super.getReadingData().reading());

        System.out.println();

        return new Window(widthWindow, heightWindow);

    }
}
