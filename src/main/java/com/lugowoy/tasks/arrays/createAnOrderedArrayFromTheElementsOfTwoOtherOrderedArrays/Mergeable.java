package com.lugowoy.tasks.arrays.createAnOrderedArrayFromTheElementsOfTwoOtherOrderedArrays;

import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.models.arrays.Array;

import java.util.Objects;

/** Created by Konstantin Lugowoy on 30.05.2017. */

@FunctionalInterface
public interface Mergeable<T> {

    T merge(T firstT, T secondT);

    static Array<Integer> mergeArrays(Array<Integer> firstArray, Array<Integer> secondArray) {
        Array<Integer> resultArray = null;

        if ((Objects.nonNull(firstArray)) && (Objects.nonNull(secondArray))) {
            if (((Objects.nonNull(firstArray.getArray())) && (firstArray.getArray().length > 0))
                    && ((Objects.nonNull(secondArray.getArray())) && (secondArray.getArray().length > 0))) {

                resultArray = new CreatorArrayOfIntegerPrimitives().create(new int[firstArray.getArray().length + secondArray.getArray().length]);

                int indexFirstArray = 0, indexSecondArray = 0;

                for (int i = 0; i < resultArray.getArrayOfIntegerPrimitives().length; i++) {
                    if ((indexFirstArray < firstArray.getArrayOfIntegerPrimitives().length)
                            && (indexSecondArray < secondArray.getArrayOfIntegerPrimitives().length)) {
                        if (firstArray.getArrayOfIntegerPrimitives()[indexFirstArray] > secondArray.getArrayOfIntegerPrimitives()[indexSecondArray]) {
                            resultArray.getArrayOfIntegerPrimitives()[i] = secondArray.getArrayOfIntegerPrimitives()[indexSecondArray++];
                        } else {
                            resultArray.getArrayOfIntegerPrimitives()[i] = firstArray.getArrayOfIntegerPrimitives()[indexFirstArray++];
                        }
                    } else if (indexSecondArray < secondArray.getArrayOfIntegerPrimitives().length) {
                        resultArray.getArrayOfIntegerPrimitives()[i] = secondArray.getArrayOfIntegerPrimitives()[indexSecondArray++];
                    } else {
                        resultArray.getArrayOfIntegerPrimitives()[i] = firstArray.getArrayOfIntegerPrimitives()[indexFirstArray++];
                    }
                }
            } else {
                System.out.println("The array is not valid for any operations or calculations.");
            }
        } else {
            System.out.println("The array is not valid for any operations or calculations.");
        }

        return resultArray;
    }

}
