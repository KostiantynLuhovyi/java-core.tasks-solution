package com.lugowoy.tasks.calculateArithmeticMeanOfNumbers;

/** Created by Konstantin Lugowoy on 03-Dec-16. */

@FunctionalInterface
public interface CalculatingArithmeticMeanNumber {

    double calculate(Numbers numbers);

    static double calculateArithmeticMeanNumber(Numbers numbers) {
        Double resultArithmeticMeanNumber = 0d;
        if (checkNumbersNonNull(numbers) && checkArrayNumbersOfObjectNumbersClassNonNull(numbers)) {
            for (Double number : numbers.getNumbers()) {
                if (number != null) {
                    resultArithmeticMeanNumber += number;
                }
            }
        }
        resultArithmeticMeanNumber /= (numbers.getNumbers().length - 1);

         return resultArithmeticMeanNumber;
    }

    private static boolean checkNumbersNonNull(Numbers numbers) {
        boolean resultOfCheck = false;
        try {
            if (numbers != null) {
                resultOfCheck = true;
            } else {
                throw new IllegalArgumentException(
                          new NullPointerException("The object of Numbers class passed by argument is equal to null."));
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        return resultOfCheck;
    }

    private static boolean checkArrayNumbersOfObjectNumbersClassNonNull(Numbers numbers) {
        boolean resultOfCheck = false;
        try {
            if (numbers.getNumbers() != null) {
                resultOfCheck = true;
            } else {
                throw new IllegalArgumentException(new NullPointerException());
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        return resultOfCheck;
    }

}
