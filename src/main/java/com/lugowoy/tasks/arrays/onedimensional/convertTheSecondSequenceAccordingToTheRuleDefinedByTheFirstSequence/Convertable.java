package com.lugowoy.tasks.arrays.onedimensional.convertTheSecondSequenceAccordingToTheRuleDefinedByTheFirstSequence;

import com.lugowoy.util.models.arrays.Array;

/** Created by Konstantin Lugowoy on 25.03.2017. */

@FunctionalInterface
public interface Convertable<T> {

    void convert(Array<T> firstArray, Array<T> secondArray);
    
    static void convertSecondSequenceAccordingToTheRuleDefinedByTheFirstSequence(Array<Integer> firstArray, Array<Integer> secondArray) {
        if (firstArray.getArrayOfIntegerPrimitives().length == secondArray.getArrayOfIntegerPrimitives().length) {
            for (int i = 0; i < firstArray.getArrayOfIntegerPrimitives().length; i++) {
                if (firstArray.getArrayOfIntegerPrimitives()[i] <= 0) {
                    secondArray.getArrayOfIntegerPrimitives()[i] *= 10;
                } else {
                    secondArray.getArrayOfIntegerPrimitives()[i] = 0;
                }
            }
        } else {
            System.out.println("Sequence sizes are not equal.");
        }
    }
}
