package com.lugowoy.tasks.core.first;

import java.io.IOException;

/**
 * Created by Konstantin on 07.11.2016.
 */
final class NumbersForComparison {

    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    public NumbersForComparison() {
    }

    public NumbersForComparison(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getThirdNumber() {
        return thirdNumber;
    }

    public void setThirdNumber(int thirdNumber) {
        this.thirdNumber = thirdNumber;
    }
}
