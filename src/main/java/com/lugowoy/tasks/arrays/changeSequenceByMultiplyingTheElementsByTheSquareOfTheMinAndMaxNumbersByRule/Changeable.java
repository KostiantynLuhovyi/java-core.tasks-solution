package com.lugowoy.tasks.arrays.changeSequenceByMultiplyingTheElementsByTheSquareOfTheMinAndMaxNumbersByRule;

import com.lugowoy.util.models.arrays.Array;

import java.util.Objects;

/** Created by Konstantin Lugowoy on 25.03.2017. */

@FunctionalInterface
public interface Changeable<T, V> {

    void change(T t, V firstArg, V secondArg);

    static void changeSequenceByMultiplyingTheElementsByTheSquareOfTheMinAndMaxNumberByRule(Array<Integer> array, int squareMinNumber, int squareMaxNumber) {
        if (Objects.nonNull(array)) {
            if ((Objects.nonNull(array.getArrayOfIntegerPrimitives()) && (array.getArrayOfIntegerPrimitives().length > 0))) {
                for (int i = 0; i < array.getArrayOfIntegerPrimitives().length; i++) {
                    if (array.getArrayOfIntegerPrimitives()[i] >= 0) {
                        array.getArrayOfIntegerPrimitives()[i] *= squareMinNumber;
                    } else if (array.getArrayOfIntegerPrimitives()[i] <= 0) {
                        array.getArrayOfIntegerPrimitives()[i] *= squareMaxNumber;
                    }
                }
            } else {
                System.out.println("The array is not valid for any operations or calculations.");
            }
        } else {
            System.out.println("The array is not valid for any operations or calculations.");
        }
    }

}
