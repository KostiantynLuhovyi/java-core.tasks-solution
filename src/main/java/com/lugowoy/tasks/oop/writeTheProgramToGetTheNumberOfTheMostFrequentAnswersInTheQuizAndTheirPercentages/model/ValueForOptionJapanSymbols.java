package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public enum ValueForOptionJapanSymbols /*implements PossibleableValueForOption */{
    Tanuki(0), Kiji(1), Tantyo(2), Deer(3), Cat(4);

    public static final int QUANTITY_VALUE_FOR_OPTION = 4;

    private int index;

    ValueForOptionJapanSymbols(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public static ValueForOptionJapanSymbols getValueForOption(int indexValue) {
        ValueForOptionJapanSymbols valueForOptionJapanSymbols;

        switch (indexValue) {
            case 0: valueForOptionJapanSymbols = ValueForOptionJapanSymbols.Tanuki; break;
            case 1: valueForOptionJapanSymbols = ValueForOptionJapanSymbols.Kiji; break;
            case 2: valueForOptionJapanSymbols = ValueForOptionJapanSymbols.Tantyo; break;
            case 3: valueForOptionJapanSymbols = ValueForOptionJapanSymbols.Deer; break;
            case 4: valueForOptionJapanSymbols = ValueForOptionJapanSymbols.Cat; break;
            default: throw new IllegalArgumentException("Incorrect index value.");
        }
        return valueForOptionJapanSymbols;
    }
}
