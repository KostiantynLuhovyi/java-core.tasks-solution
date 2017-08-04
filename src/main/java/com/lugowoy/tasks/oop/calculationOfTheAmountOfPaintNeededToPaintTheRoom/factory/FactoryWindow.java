package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.factory;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.Window;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 21-Feb-17.*/

public class FactoryWindow extends FactoryModel<Double> {

    public FactoryWindow(Reader reader) {
        super(reader);
    }

    public Window createWindow() {
        System.out.println("Enter the width of the window : ");
        BigDecimal widthWindow = new BigDecimal(super.getReader().readDouble());

        System.out.println("Enter the height of the window : ");
        BigDecimal heightWindow = new BigDecimal(super.getReader().readDouble());

        System.out.println();

        return new Window(widthWindow, heightWindow);
    }

}
