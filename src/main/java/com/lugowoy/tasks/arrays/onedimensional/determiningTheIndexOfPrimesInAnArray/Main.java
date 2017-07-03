package com.lugowoy.tasks.arrays.onedimensional.determiningTheIndexOfPrimesInAnArray;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

/** Created by Konstantin Lugowoy on 22.05.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> array = creator.create(fillArray.fillArray(new int[sizeArray], 100));

        System.out.println("Original array : " + array);
        System.out.println();

        System.out.println("The indexes of elements which are prime numbers : ");
        Determinable<Integer> determinable = Determinable::determineTheIndexOfPrimesInAnArray;
        for (int i = 0; i < array.getArray().length; i++) {
            if (determinable.determine(array.getArray()[i])) {
                System.out.print(i + " ");
            }
        }

    }

}
