package com.lugowoy.tasks.arrays.onedimensional.determineWhetherItIsPossibleToSelectContiguousElementsInOneOfArraysByCondition;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

import java.util.Arrays;
import java.util.List;

/** Created by Konstantin Lugowoy on 22.06.2017. */

public class Main {

    private static FillingArray<Integer> fillingArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creatorArray = new CreatorArrayOfIntegerPrimitives();

    public static void main(String[] args) {

        int sizeToFirstArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray("Enter a value for the size of the first array : ");

        int sizeToSecondArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray("Enter a value for the size of second array : ");

        Array<Integer> firstArray = creatorArray.create(fillingArray.fillArray(new int[sizeToFirstArray], 100));
        Array<Integer> secondArray = creatorArray.create(fillingArray.fillArray(new int[sizeToSecondArray], 100));

        Determine<Array<Integer>> determine = Determine::determineWhetherItIsPossibleToSelectContiguousElements;
        List<Array<Integer>> arrayList = determine.determine(firstArray, secondArray);

        if (!arrayList.isEmpty()) {
            System.out.println("Result : ");
            arrayList.forEach(array -> System.out.println(Arrays.toString(array.getArrayOfIntegerPrimitives()) + " "));
        } else {
            System.out.println("Result array is empty.");
        }

    }

}
