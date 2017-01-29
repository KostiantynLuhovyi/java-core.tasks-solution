package com.lugowoy.tasks.core.countTheNumberOfOccurrencesOfTheMaximumNumber;

/**
 * Created by Konstantin on 14.11.2016.
 */

/*
* Class "Numbers" is a set of attributes for the implementation of the counting and storage elements.
* */
class Numbers {

    private Integer[] numbers;
    private int maxNumberCount;

    public Numbers() {
    }

    public int getMaxNumberCount() {
        return maxNumberCount;
    }

    public void setMaxNumberCount(int maxNumberCount) {
        this.maxNumberCount = maxNumberCount;
    }

    public Integer[] getNumbers() {
        return numbers;
    }

    public void setNumbers(Integer[] numbers) {
        this.numbers = numbers;
    }
}
