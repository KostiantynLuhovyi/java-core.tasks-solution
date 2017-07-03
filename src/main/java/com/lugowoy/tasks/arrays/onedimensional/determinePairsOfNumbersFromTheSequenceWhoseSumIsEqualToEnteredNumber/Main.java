package com.lugowoy.tasks.arrays.onedimensional.determinePairsOfNumbersFromTheSequenceWhoseSumIsEqualToEnteredNumber;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

/** Created by Konstantin Lugowoy on 19.03.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();

    private static final Determinable<Integer> DETERMINABLE = Determinable::determinePairsOfNumbersFromTheSequenceWhoseSumIsEqualToEnteredNumber;

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> array = creator.create(fillArray.fillArray(new int[sizeArray], 100));

        System.out.println(array);
        System.out.println();

        int sumNumber = enterNumber();

        DETERMINABLE.determine(array, sumNumber);

    }

    private static int enterNumber() {
        ReadingData<Integer> reading = new ReadingData<>(new ReadingUserInputData()::readInt);

        System.out.println("Enter number : ");
        return reading.read();
    }

}
