package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.factory;

import com.lugowoy.helper.reading.Reader;

/**Created by Konstantin Lugowoy on 21-Feb-17.*/

public abstract class FactoryModel<T> {

    private Reader reader;

    public FactoryModel(Reader reader) {
        this.reader = reader;
    }

    public Reader getReader() {
        return reader;
    }

}
