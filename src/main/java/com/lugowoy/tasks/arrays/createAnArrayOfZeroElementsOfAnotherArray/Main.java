package com.lugowoy.tasks.arrays.createAnArrayOfZeroElementsOfAnotherArray;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**Created by Konstantin Lugowoy on 12-Feb-17.*/

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> originalIntegerArray = creator.create(fillArray.fillArray(new int[sizeArray], 50));

        System.out.println("Elements of of the original array : " + originalIntegerArray);
        System.out.println();

        Array<Integer> integerArrayIndexZero = creator.create();

        FillingArrayOfAnotherArrayElementsZero<Integer> fillingArrayOfAnotherArrayElementsZero = originalArray -> {
            ArrayList<Integer> integers = new ArrayList<>();
            Integer[] resultArray;
            if (Objects.nonNull(originalArray)) {
                for (int i = 0; i < originalArray.length; i++) {
                    if (originalArray[i] == 0) {
                        integers.add(i);
                    }
                }
            } else {
                System.out.println("The array is not valid for any operations or calculations.");
            }

            if (integers.isEmpty()) {
                resultArray = new Integer[0];
            } else {
                resultArray = Arrays.stream(
                                        integers
                                                .stream()
                                                .mapToInt(Integer::intValue)
                                                .toArray())
                                    .boxed()
                                    .toArray(Integer[]::new);

            }
            return resultArray;
        };

        integerArrayIndexZero.setArray(fillingArrayOfAnotherArrayElementsZero.fillArrayOfAnotherArrayElementsZero(originalIntegerArray.getArray()));

        System.out.print("Index of zero elements of the original array : ");
        if (integerArrayIndexZero.getArray().length != 0) {
            for (int i = 0; i < integerArrayIndexZero.getArray().length; i++) {
                System.out.print(integerArrayIndexZero.getArray()[i] + " ");
            }
        } else {
            System.out.println("It does not contain zero elements.");
        }
    }

}
