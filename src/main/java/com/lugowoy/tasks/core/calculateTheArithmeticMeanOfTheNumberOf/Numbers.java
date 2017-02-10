package com.lugowoy.tasks.core.calculateTheArithmeticMeanOfTheNumberOf;

/**
 * Created by Konstantin Lugowoy on 03-Dec-16.
 *
 * @author Konstantin
 * @version 1.0
 * @since 03.12.2016
 * <p>
 * Class encapsulates an array of numbers on which to calculate the arithmetic mean of the numbers.
 */
public class Numbers {

    /**
     * An array of numbers used to calculate the arithmetic mean of these numbers.
     * */
    private Double[] numbers;
    /**
     * The result of calculating the mean value.
     * */
    private double resultArithmeticMeanNumbers;

    /**
     * Default constructor.
     * */
    public Numbers() {
    }

    /**
     * Get array of real numbers.
     * */
    public Double[] getNumbers() {
        return numbers;
    }

    /**
     * Set array of real numbers.
     * */
    public void setNumbers(Double[] numbers) {
        this.numbers = numbers;
    }

    /**
     * Get the result of calculating the mean value.
     * */
    public double getResultArithmeticMeanNumbers() {
        return resultArithmeticMeanNumbers;
    }

    /**
     * Set the result of calculating the mean value.
     * */
    public void setResultArithmeticMeanNumbers(double resultArithmeticMeanNumbers) {
        this.resultArithmeticMeanNumbers = resultArithmeticMeanNumbers;
    }

}
