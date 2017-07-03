package com.lugowoy.tasks.arrays.onedimensional.determineTheNumberOfTheArrayInWhichTheRemainderOfTheDivisionIsEqualToCertainNumber;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

/**Created by Konstantin Lugowoy on 14-Feb-17.*/

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();
    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> array = creator.create(fillArray.fillArray(new int[sizeArray], -200, 300));

        System.out.println("Original array : " + array);
        System.out.println();

        System.out.println("Enter number to the modulo : ");
        int numberToModulo = readingData.read();

        System.out.println("Enter result to the modulo : ");
        int resultModulo = readingData.read();

        DETERMINABLE.determinate(array.getArrayOfIntegerPrimitives(), numberToModulo, resultModulo);
    }

    private static final Determinable DETERMINABLE = (numbers, numberToModulo, resultModulo) -> {
        System.out.println("Result to the modulo operation : ");
        int countResult = 0;
        for (int number : numbers) {
            if (number % numberToModulo == resultModulo) {
                System.out.print(number + " ");
            } else {
                countResult++;
            }
        }
        if (countResult == numbers.length) {
            System.out.println("No numbers which satisfy the condition.");
        }
    };

}
