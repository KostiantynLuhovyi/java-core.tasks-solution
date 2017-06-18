package com.lugowoy.tasks.arrays.findLengthOfLongestSequenceOfElementsEqualToZero;

import com.lugowoy.util.EnteringTheSizeOfTheArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

/** Created by Konstantin Lugowoy on 18.06.2017. */

public class Main {

    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);
    private static FillingArray<Integer> fillingArray = new FillingArrayOfRandomNumber<>();
    private static CreatorArray<Integer> creatorArray = new CreatorArrayOfIntegerPrimitives();

    private static EnteringTheSizeOfTheArray<Integer> enteringTheSizeOfTheArray = EnteringTheSizeOfTheArray::enterUserInputForSizeOfTheArray;

    public static void main(String[] args) {

        int sizeArray = enteringTheSizeOfTheArray.enter(readingData);

        Array<Integer> array = creatorArray.create(fillingArray.fillArray(new int[sizeArray], 3));

        System.out.println("Original " + array);
        System.out.println();

        Findable<Integer, Array<Integer>> findable = Findable::findLengthOfLongestSequenceOfElementsEqualToZero;
        int resultZeroElementsToCount = findable.find(array);

        System.out.println("The longest sequence of consecutive array elements equal to zero is equal to " + resultZeroElementsToCount);

    }

}
