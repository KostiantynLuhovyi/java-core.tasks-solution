package com.lugowoy.tasks.core.third;

/**
 * Created by Konstantin on 14.11.2016.
 */

public class Numbers {

    private int [] numbers;
    private int countMaxNumbers;

    public Numbers() {
    }

    public Numbers(int[] numbers) {
        this.numbers = numbers;
    }

    public int getCountMaxNumbers() {
        return countMaxNumbers;
    }

    public void setCountMaxNumbers(int countMaxNumbers) {
        this.countMaxNumbers = countMaxNumbers;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
