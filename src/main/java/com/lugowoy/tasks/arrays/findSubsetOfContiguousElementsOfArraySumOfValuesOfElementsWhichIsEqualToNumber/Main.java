package com.lugowoy.tasks.arrays.findSubsetOfContiguousElementsOfArraySumOfValuesOfElementsWhichIsEqualToNumber;

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

        Array<Integer> array = creatorArray.create(fillingArray.fillArray(new int[sizeArray], 0, 10));

        int number = getNumber();

        Findable<Array<Integer>, Integer> findable = Findable::findSubsetOfContiguousElementsOfArraySumOfValuesOfElementsWhichIsEqualToNumber;

        Array<Integer> resultArray = creatorArray.create(findable.find(array, number));
        if (resultArray.getArray() != null) {
            System.out.println("Result : " + resultArray);
        } else {
            System.out.println("An array does not contain such a sequence of elements.");
        }


    }

    private static int getNumber() {
        System.out.println("Enter number : ");
        int number;
        while (true) {
            number = readingData.read();
            if ((number > 0) && (number < 200)) {
                break;
            } else {
                System.out.println("Number must be a positive number.");
                System.out.println("Re-enter : ");
            }
        }
        return number;

    }

}
