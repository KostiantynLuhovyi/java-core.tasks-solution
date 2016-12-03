package com.lugowoy.tasks.core.сountTheNumberOfOccurrencesOfTheMaximumNumber;

/**
 * Created by Konstantin on 14.11.2016.
 */

/*
* Class "Numbers" is a set of attributes for the implementation of the counting and storage elements.
* */
class Numbers {

    private int[] numbers;
    private int maxNumberCount;

    public Numbers() {
    }

    /*
    * The constructor parameter is an array of integer values.
    * */
    public Numbers(int[] numbers) {
        /*
        * Initialize reference variable integer copy of the array,
        * the array passed to the constructor argument.
        * */
        this.numbers = numbers;
    }


    public int getMaxNumberCount() {
        return maxNumberCount;
    }

    public void setMaxNumberCount(int maxNumberCount) {
        this.maxNumberCount = maxNumberCount;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
