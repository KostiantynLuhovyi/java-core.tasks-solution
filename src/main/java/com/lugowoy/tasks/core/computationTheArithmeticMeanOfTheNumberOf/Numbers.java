package com.lugowoy.tasks.core.computationTheArithmeticMeanOfTheNumberOf;

/**
 * Created by Konstantin on 03-Dec-16.
 */

public class Numbers {

    private int [] numbers;
    private double resultArithmeticMeanNumbers;

    public Numbers(int[] numbers) {
        this.numbers = numbers;
    }

    public Numbers() {
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public double getResultArithmeticMeanNumbers() {
        return resultArithmeticMeanNumbers;
    }

    public void setResultArithmeticMeanNumbers(double resultArithmeticMeanNumbers) {
        this.resultArithmeticMeanNumbers = resultArithmeticMeanNumbers;
    }
}
