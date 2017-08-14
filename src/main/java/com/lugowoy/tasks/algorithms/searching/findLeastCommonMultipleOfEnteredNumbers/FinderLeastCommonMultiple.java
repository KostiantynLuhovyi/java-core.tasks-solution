package com.lugowoy.tasks.algorithms.searching.findLeastCommonMultipleOfEnteredNumbers;

import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.tasks.algorithms.searching.findGreatestCommonDivisorOfEnteredNumbers.FindableGreatestCommonDivisor;
import com.lugowoy.tasks.algorithms.searching.findGreatestCommonDivisorOfEnteredNumbers.FinderGreatestCommonDivisor;

import static java.lang.Math.abs;

/** Created by Konstantin Lugowoy on 14.08.2017. */

public class FinderLeastCommonMultiple implements FindableLeastCommonMultiple {

    private static final FindableGreatestCommonDivisor FINDER = new FinderGreatestCommonDivisor();

    @Override
    public int findLeastCommonMultipleOfEnteredNumbers(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber / FINDER.findGreatestCommonDivisorOfEnteredNumbers(firstNumber, secondNumber);
    }

    @Override
    public int findLeastCommonMultipleOfEnteredNumbers(Array<Integer> numbers) {
        int result = numbers.getArray()[0];
        for (int i = 1; i < numbers.getArray().length; i++) {
            result = this.findLeastCommonMultipleOfEnteredNumbers(result, numbers.getArray()[i]);
        }
        return result;
    }

}
