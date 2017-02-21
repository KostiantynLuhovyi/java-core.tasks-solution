package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.factory;

import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.ReadingUserInputData;

/**Created by Konstantin Lugowoy on 21-Feb-17.*/

public abstract class FactoryModel<T> {

    private Reading<T> reading;

    public FactoryModel(Reading<T> reading) {
        this.reading = reading;
    }

    public Reading<T> getReadingData() {
        return this.reading;
    }
}
