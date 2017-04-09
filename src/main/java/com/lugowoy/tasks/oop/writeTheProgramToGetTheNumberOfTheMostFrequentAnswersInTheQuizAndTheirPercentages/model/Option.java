package com.lugowoy.tasks.oop.writeTheProgramToGetTheNumberOfTheMostFrequentAnswersInTheQuizAndTheirPercentages.model;

/** Created by Konstantin Lugowoy on 07.04.2017. */

public class Option {

    private int countChoice;

    private Enum valueForOption;

    public Option() {
    }

    public Option(Enum valueForOption) {
        this.valueForOption = valueForOption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Option)) return false;

        Option option = (Option) o;

        if (getCountChoice() != option.getCountChoice()) return false;
        return getValueForOption() != null ? getValueForOption().equals(option.getValueForOption()) : option.getValueForOption() == null;
    }

    @Override
    public int hashCode() {
        int result = getCountChoice();
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

    public Enum getValueForOption() {
        return valueForOption;
    }

    public void setValueForOption(Enum valueForOption) {
        this.valueForOption = valueForOption;
    }
}
