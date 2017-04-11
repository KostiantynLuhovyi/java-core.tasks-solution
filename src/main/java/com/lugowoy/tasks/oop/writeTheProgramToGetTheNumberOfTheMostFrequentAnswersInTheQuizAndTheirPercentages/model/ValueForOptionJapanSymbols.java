package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public enum ValueForOptionJapanSymbols {
    Tanuki(0), Kiji(1), Tantyo(2), Deer(3), Cat(4);

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

}
