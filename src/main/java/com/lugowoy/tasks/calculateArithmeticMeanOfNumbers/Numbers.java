package com.lugowoy.tasks.calculateArithmeticMeanOfNumbers;

import java.io.Serializable;
import java.util.Arrays;

/** Created by Konstantin Lugowoy on 03-Dec-16. */

public final class Numbers implements Serializable, Cloneable {

    private double[] numbers;

    public Numbers(double[] numbers) {
        //The setters are used in the constructor, since the class is declared with the modifier final.
        this.setNumbers(numbers);
    }

    public double[] getNumbers() {
        return Arrays.copyOf(this.numbers, this.numbers.length);
    }

    public void setNumbers(double[] numbers) {
        try {
            if (checkArrayNonNull(numbers)) {
                this.numbers = numbers;
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
    }

    private boolean checkArrayNonNull(double[] doubles) throws IllegalArgumentException {
        if (doubles != null) {
            return true;
        } else {
            throw new IllegalArgumentException(new NullPointerException("The array passed by argument is equal to null."));
        }
    }


}
