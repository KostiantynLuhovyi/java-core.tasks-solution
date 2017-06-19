package com.lugowoy.tasks.arrays.cyclicallyShiftElementsOfArrayElementsKtoRightOrLeft;

import com.lugowoy.util.models.arrays.Array;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 19.06.2017. */

@FunctionalInterface
public interface Shiftable<T> {

    void shift(T t, int numberK);

    static void shiftElementsOfArrayElementsToRightOrLeft(Array<Integer> array, int numberK) {
        numberK = numberK % array.getArrayOfIntegerPrimitives().length;

        if (numberK == 0) return;

        numberK = numberK < 0 ? (array.getArrayOfIntegerPrimitives().length + numberK) : numberK;

        int[] temp = new int[array.getArrayOfIntegerPrimitives().length];

        System.arraycopy(Arrays.copyOfRange(array.getArrayOfIntegerPrimitives(), array.getArrayOfIntegerPrimitives().length - numberK, array.getArrayOfIntegerPrimitives().length), 0, temp, 0, numberK);
        System.arraycopy(Arrays.copyOfRange(array.getArrayOfIntegerPrimitives(), 0, array.getArrayOfIntegerPrimitives().length - numberK), 0, temp, numberK, temp.length - numberK);

        array.setArrayOfIntegerPrimitives(temp);

        /*for (int i = 0; i < numberK; i++) {
            int temp = array.getArrayOfIntegerPrimitives()[array.getArrayOfIntegerPrimitives().length - 1];
            for (int j = array.getArrayOfIntegerPrimitives().length - 1; j > 0; j--) {
                array.getArrayOfIntegerPrimitives()[j] = array.getArrayOfIntegerPrimitives()[j - 1];
            }
            array.getArrayOfIntegerPrimitives()[0] = temp;
        }*/
    }

}
