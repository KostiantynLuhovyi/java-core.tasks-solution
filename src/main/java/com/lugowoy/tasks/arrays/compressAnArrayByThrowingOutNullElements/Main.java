package com.lugowoy.tasks.arrays.compressAnArrayByThrowingOutNullElements;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Created by Konstantin Lugowoy on 16.03.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> array = creator.create(fillArray.fillArray(new int[sizeArray]));

        System.out.println("Original array : " + array);
        System.out.println();

        COMPRESSIBLE.compress(array);

        System.out.println();
        System.out.println("\nResult array : " + array);
    }

    private static final Compressible<Integer> COMPRESSIBLE = array -> {
        int numberZeroElements = 0;
        if (Objects.nonNull(array)) {
            if ((Objects.nonNull(array.getArray())) && (array.getArray().length > 0)) {
                List<Integer> list = new ArrayList<>(0);
                for (int i = 0; i < array.getArray().length; i++) {
                    if (array.getArray()[i] != 0) {
                        list.add(array.getArray()[i]);
                    } else {
                        numberZeroElements++;
                    }
                }
                array.setArray(list.toArray(new Integer[list.size()]));
            } else {
                System.out.println("The array is not valid for any operations or calculations.");
            }
        } else {
            System.out.println("The array is not valid for any operations or calculations.");
        }

        System.out.printf("Number of zero elements in the array : %d .", numberZeroElements);
    };
}
