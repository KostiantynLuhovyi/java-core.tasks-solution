package com.lugowoy.tasks.core.first;

import java.io.IOException;

/**
 * Created by Konstantin on 07.11.2016.
 */

/*Class "NumberForComparison" it contains instance variables, three numbers for comparison.*/
final class NumbersForComparison {

    private int firstNumber;
    private int secondNumber;
    private int thirdNumber;

    NumbersForComparison() {
    }

    public NumbersForComparison(int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    int getFirstNumber() {
        return firstNumber;
    }

    void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    int getSecondNumber() {
        return secondNumber;
    }

    void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    int getThirdNumber() {
        return thirdNumber;
    }

    void setThirdNumber(int thirdNumber) {
        this.thirdNumber = thirdNumber;
    }
}
