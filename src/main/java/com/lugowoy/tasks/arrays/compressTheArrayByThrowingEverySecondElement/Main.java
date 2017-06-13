package com.lugowoy.tasks.arrays.compressTheArrayByThrowingEverySecondElement;

import com.lugowoy.util.EnteringTheSizeOfTheArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/** Created by Konstantin Lugowoy on 13.03.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();
    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);

    private static EnteringTheSizeOfTheArray<Integer> enterUserValueForSizeOfTheArray = EnteringTheSizeOfTheArray::enterUserInputForSizeOfTheArray;

    public static void main(String[] args) {

        int sizeArray = enterUserValueForSizeOfTheArray.enter(readingData);

        Array<Integer> array = creator.create(fillArray.fillArray(new int[sizeArray]));

        System.out.println("Original array : " + array);
        System.out.println();

        ARRAY_COMPRESSIBLE.compress(array);

        System.out.println("Result array : " + array);
        System.out.println();

    }

    private static final Compressible<Array<Integer>> ARRAY_COMPRESSIBLE = array -> {
        if (Objects.nonNull(array)) {
            if ((Objects.nonNull(array.getArray())) && (array.getArray().length >= 2)) {
                List<Integer> integerList = new ArrayList<>(0);
                for (int i = 0; i < array.getArray().length; i++) {
                    if ((i % 2 == 0) || (i == 0)) {
                        integerList.add(array.getArray()[i]);
                    }
                }
                    array.setArray(integerList.stream().mapToInt(Integer::intValue).boxed().toArray(Integer[]::new));
            } else {
                System.out.println("The array is not valid for any operations or calculations.");
            }
        } else {
            System.out.println("The array is not valid for any operations or calculations.");
        }
    };

}
