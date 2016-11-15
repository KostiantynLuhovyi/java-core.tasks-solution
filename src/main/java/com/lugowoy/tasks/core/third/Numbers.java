package com.lugowoy.tasks.core.third;

/**
 * Created by Konstantin on 14.11.2016.
 */

public class Numbers {

    private int[] numbers;
    private int maxNumberCount;

    public Numbers() {
    }

    public Numbers(int[] numbers) {
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
