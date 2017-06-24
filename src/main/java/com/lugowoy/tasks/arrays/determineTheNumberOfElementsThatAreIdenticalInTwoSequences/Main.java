package com.lugowoy.tasks.arrays.determineTheNumberOfElementsThatAreIdenticalInTwoSequences;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

/** Created by Konstantin Lugowoy on 30.05.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();

    public static void main(String[] args) {

        int sizeToFirstArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray("Enter a value for the size of the first array : ");

        int sizeToSecondArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray("Enter a value for the size of the second array : ");

        Array<Integer> firstArray = creator.create(fillArray.fillArray(new int[sizeToFirstArray]));
        Array<Integer> secondArray = creator.create(fillArray.fillArray(new int[sizeToSecondArray]));

        System.out.println("Elements of the first array : " + firstArray);
        System.out.println();

        System.out.println("Elements of the second array : " + secondArray);
        System.out.println();

        Determinable<Array<Integer>> determinable = Determinable::determineTheNumberOfElementsThatAreIdenticalInTwoSequences;
        int numberOfIdenticalElementsInTheTwoSequence = determinable.determine(firstArray, secondArray);

        System.out.println("Number of identical elements in the two array : " + numberOfIdenticalElementsInTheTwoSequence);

    }

}
