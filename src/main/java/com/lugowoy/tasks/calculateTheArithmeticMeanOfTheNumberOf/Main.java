package com.lugowoy.tasks.calculateTheArithmeticMeanOfTheNumberOf;

import com.lugowoy.helper.filling.FillingArrayDoubleUserInputNumbers;

/** Created by Konstantin Lugowoy on 03-Dec-16. */

public class Main {

    private static final int LENGTH_ARRAY = 10;

    public static void main(String[] args) {

        Numbers numbers = new Numbers();
        numbers.setNumbers(new FillingArrayDoubleUserInputNumbers().fill(LENGTH_ARRAY));

        System.out.println();
        System.out.println("You entered the numbers : ");
        for (int i = 0; i < numbers.getNumbers().length; i++) {
            if (numbers.getNumbers()[i] != null) System.out.print(numbers.getNumbers()[i] + " ");
        }

        System.out.println();

        CalculatingArithmeticMeanNumber calculating = CalculatingArithmeticMeanNumber::calculateArithmeticMeanNumber;
        numbers.setResultArithmeticMeanNumbers(calculating.calculate(numbers.getNumbers()));

        System.out.printf("The arithmetic mean of the entered real numbers equals %f", numbers.getResultArithmeticMeanNumbers());

    }

}
