package com.lugowoy.tasks.algorithms.searching.findGreatestCommonDivisorOfEnteredNumbers;

import com.lugowoy.helper.models.arrays.Array;

import static java.lang.Math.abs;

/** Created by Konstantin Lugowoy on 12.08.2017. */

public class FinderGreatestCommonDivisor implements FindableGreatestCommonDivisor {

    @Override
    public int findGreatestCommonDivisorOfEnteredNumbers(int firstNumber, int secondNumber) {
        return this.findGreatestCommonDivisorForTwoNumbers(firstNumber, secondNumber);
    }

    @Override
    public int findGreatestCommonDivisorOfEnteredNumbers(Array<Integer> numbers) {
        int result = numbers.getArray()[0];
        for (int i = 1; i < numbers.getArray().length; i++) {
            result = this.findGreatestCommonDivisorForTwoNumbers(result, numbers.getArray()[i]);
        }
        return result;
    }

    private int findGreatestCommonDivisorForTwoNumbers(int firstNumber, int secondNumber) {
        int result = 0;

        int moduleFirstNumber = abs(firstNumber);
        int moduleSecondNumber = abs(secondNumber);

        while ((moduleFirstNumber != 0) && (moduleSecondNumber != 0)) {
            int tmp = moduleFirstNumber % moduleSecondNumber;
            moduleFirstNumber = moduleSecondNumber;
            moduleSecondNumber = tmp;
            result = moduleFirstNumber;
        }
        return result;
    }

}
