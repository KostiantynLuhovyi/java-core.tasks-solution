package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public enum ValueForOption {
    Tanuki(0), Kiji(1), Tantyo(2), Deer(3), Cat(4);

    public static final int QUANTITY_VALUE_FOR_OPTION = 4;

    private int index;

    ValueForOption() {
    }

    ValueForOption(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static ValueForOption getValueForOption(int indexValue) {
        ValueForOption valueForOption;

        switch (indexValue) {
            case 0: valueForOption = ValueForOption.Tanuki; break;
            case 1: valueForOption = ValueForOption.Kiji; break;
            case 2: valueForOption = ValueForOption.Tantyo; break;
            case 3: valueForOption = ValueForOption.Deer; break;
            case 4: valueForOption = ValueForOption.Cat; break;
            default: throw new IllegalArgumentException("Incorrect index value.");
        }
        return valueForOption;
    }
}
