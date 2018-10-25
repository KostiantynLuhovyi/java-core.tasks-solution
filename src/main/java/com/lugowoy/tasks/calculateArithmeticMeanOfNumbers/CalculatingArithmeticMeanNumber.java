package com.lugowoy.tasks.calculateArithmeticMeanOfNumbers;

/** Created by Konstantin Lugowoy on 03-Dec-16. */

@FunctionalInterface
public interface CalculatingArithmeticMeanNumber {

    double calculate(Numbers numbers);

    static double calculateArithmeticMeanNumber(Numbers numbers) {
        double resultArithmeticMeanNumber = 0d;
        if (checkNumbersNonNull(numbers) && checkArrayNumbersNonNull(numbers)) {
            for (double number : numbers.getNumbers()) {
                resultArithmeticMeanNumber += number;
            }
        }
        resultArithmeticMeanNumber /= (numbers.getNumbers().length - 1);
        return resultArithmeticMeanNumber;
    }

    private static boolean checkNumbersNonNull(Numbers numbers) {
        boolean resultOfCheck = false;
        if (numbers != null) {
            resultOfCheck = true;
        } else {
            System.err.println("The object of Numbers class passed by argument is equal to null.");
        }
        return resultOfCheck;
    }

    private static boolean checkArrayNumbersNonNull(Numbers numbers) {
        boolean resultOfCheck = false;
        if (numbers.getNumbers() != null) {
            resultOfCheck = true;
        }
        return resultOfCheck;
    }

}
