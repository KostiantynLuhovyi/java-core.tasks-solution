package com.lugowoy.tasks.arrays.onedimensional.determineWhetherItIsPossibleToSelectContiguousElementsInOneOfArraysByCondition;

import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.models.arrays.Array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/** Created by Konstantin Lugowoy on 24.06.2017. */

@FunctionalInterface
public interface Determine<T> {

    List<T> determine(T firstT, T secondT);

    static List<Array<Integer>> determineWhetherItIsPossibleToSelectContiguousElements(Array<Integer> firstArray, Array<Integer> secondArray) {
        List<Array<Integer>> resultList = new LinkedList<>();
        int n = 0, k = firstArray.getArrayOfIntegerPrimitives().length;

        while (n + 1 < k) {
            for (int i = 0; i < secondArray.getArrayOfIntegerPrimitives().length - (k - 1 - n); i++) {
                Array<Integer> tempResultArray = new CreatorArrayOfIntegerPrimitives().create(Arrays.copyOfRange(firstArray.getArrayOfIntegerPrimitives(), n, k));
                if (Arrays.equals(tempResultArray.getArrayOfIntegerPrimitives(), Arrays.copyOfRange(secondArray.getArrayOfIntegerPrimitives(), i, k - n + i))){
                    resultList.add(tempResultArray);
                }
            }
            if (n  + 1 == --k) {
                n++;
                k = firstArray.getArrayOfIntegerPrimitives().length;
            }
        }
        return resultList;

    }

}
