package com.lugowoy.tasks.calculateTheArithmeticMeanOfTheNumberOf;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 03-Dec-16. */

public class Numbers {

    private Double[] numbers;

    private double resultArithmeticMeanNumbers;

    public Numbers() {
    }

    public Double[] getNumbers() {
        return Arrays.copyOf(this.numbers, this.numbers.length);
    }

    public void setNumbers(Double[] numbers) {
        this.numbers = Arrays.copyOf(numbers, numbers.length);
    }

    public double getResultArithmeticMeanNumbers() {
        return resultArithmeticMeanNumbers;
    }

    public void setResultArithmeticMeanNumbers(double resultArithmeticMeanNumbers) {
        this.resultArithmeticMeanNumbers = resultArithmeticMeanNumbers;
    }

}
