package com.lugowoy.tasks.calculateArithmeticMeanOfNumbers;

/** Created by Konstantin Lugowoy on 03-Dec-16. */

@FunctionalInterface
public interface CalculatingArithmeticMeanNumber {

    double calculate(Numbers numbers);

    static double calculateArithmeticMeanNumber(Numbers numbers) {
        Double resultArithmeticMeanNumber = 0d;

        try {
            if (checkNumbersNonNull(numbers) && checkArrayNumbersOfObjectNumbersClassNonNull(numbers)) {
                for (Double number : numbers.getNumbers()) {
                    if (number != null) {
                        resultArithmeticMeanNumber += number;
                    }
                }
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        resultArithmeticMeanNumber /= (numbers.getNumbers().length - 1);

        return resultArithmeticMeanNumber;
    }

    private static boolean checkNumbersNonNull(Numbers numbers) {
        if (numbers != null) {
            return true;
        } else {
            throw new IllegalArgumentException(
                    new NullPointerException("The object of Numbers class passed by argument is equal to null."));
        }
    }

    private static boolean checkArrayNumbersOfObjectNumbersClassNonNull(Numbers numbers) {
        if (numbers.getNumbers() != null) {
            return true;
        } else {
            throw new IllegalArgumentException(
                    new NullPointerException("The array of the object of Numbers class passed by argument is equal to null."));
        }
    }

}
