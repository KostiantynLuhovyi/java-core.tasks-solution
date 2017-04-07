package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public class Option {

    private int countChoice;

    private ValueForOption valueForOption;

    public Option() {
    }

    public Option(ValueForOption valueForOption) {
        this.valueForOption = valueForOption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Option)) return false;

        Option option = (Option) o;

        if (countChoice != option.countChoice) return false;
        return getValueForOption() == option.getValueForOption();
    }

    @Override
    public int hashCode() {
        int result = countChoice;
        result = 31 * result + (getValueForOption() != null ? getValueForOption().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Option[" +
                "countChoice=" + countChoice +
                ", valueForOption=" + valueForOption +
                ']';
    }

    public int getCountChoice() {
        return countChoice;
    }

    public void setCountChoice(int countChoice) {
        this.countChoice = countChoice;
    }

    public ValueForOption getValueForOption() {
        return valueForOption;
    }

    public void setValueForOption(ValueForOption valueForOption) {
        this.valueForOption = valueForOption;
    }
}
