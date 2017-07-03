package com.lugowoy.tasks.arrays.onedimensional.findTheSumOfAnArrayOfMultipleElementsToThisPresent;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

/**Created by Konstantin Lugowoy on 12-Feb-17.*/

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();
    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> array = creator.create(fillArray.fillArray(new int[sizeArray]));

        System.out.println("Result fill arrays randomly integers : ");
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] != null) {
                System.out.print(array.getArray()[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Enter K number : ");
        int K = readingData.read();

        int resultOfSumNumbersOfMultipleElement = (FINDING_SUM_ELEMENTS.getSumElements(array, K));

        System.out.println("Result : " + resultOfSumNumbersOfMultipleElement);
    }

    private static final FindingSumElements FINDING_SUM_ELEMENTS = (array, k) -> {
        int sumElements = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            if (array.getArray()[i] != null) {
                if (array.getArray()[i] % k == 0) {
                    sumElements += array.getArray()[i];
                }
            }
        }
        return sumElements;

    };

}
