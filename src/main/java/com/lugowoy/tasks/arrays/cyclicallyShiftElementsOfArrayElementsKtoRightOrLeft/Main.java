package com.lugowoy.tasks.arrays.cyclicallyShiftElementsOfArrayElementsKtoRightOrLeft;

import com.lugowoy.util.EnteringTheSizeOfTheArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

/** Created by Konstantin Lugowoy on 19.06.2017. */

public class Main {

    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);
    private static FillingArray<Integer> fillingArray = new FillingArrayOfRandomNumber<>();
    private static CreatorArray<Integer> creatorArray = new CreatorArrayOfIntegerPrimitives();

    private static EnteringTheSizeOfTheArray<Integer> enteringTheSizeOfTheArray = EnteringTheSizeOfTheArray::enterUserInputForSizeOfTheArray;

    public static void main(String[] args) {

        int sizeArray = enteringTheSizeOfTheArray.enter(readingData);

        Array<Integer> array = creatorArray.create(fillingArray.fillArray(new int[sizeArray], 100));

        System.out.println("Original " + array);

        int numberK = getNumberK(array.getArray().length);

        System.out.println("Number : " + numberK);

        Shiftable<Array> shiftable = Shiftable::shiftElementsOfArrayElementsToRightOrLeft;
        shiftable.shift(array, numberK);

        System.out.println("Result after shifting elements : ");
        System.out.println(array);

    }

    private static int getNumberK(int sizeArray) {
        System.out.println("Enter integer number : ");
        int numberK;
        while (true) {
            numberK = readingData.read();
            if (numberK == 0) {
                System.out.println("The number must not be zero.");
                System.out.println("Re-enter : ");
            } else if ((numberK <= (sizeArray - 2)) && (numberK >= (-sizeArray + 2))) {
                break;
            } else {
                System.out.println("The number does not match the condition.");
                System.out.println("Re-enter : ");
            }
        }
        return numberK;

    }

}
