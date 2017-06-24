package com.lugowoy.tasks.arrays.calculateTheSumOfArrayElementsLocatedBetweenTheMinAndMaxElementsInclusive;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

/** Created by Konstantin Lugowoy on 27.03.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>();
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> array = creator.create(fillArray.fillArray(new int[sizeArray]));

        System.out.println("Original array : " + array);
        System.out.println();

        Determinable determinable = Determinable::determineMinElementIndex;
        int indexMinElement = determinable.determine(array);
        System.out.println("Index min element in the array is : " + indexMinElement);

        determinable = Determinable::determineMaxElementIndex;
        int indexMaxElement = determinable.determine(array);
        System.out.println("Index max element in the array is : " + indexMaxElement);

        System.out.println();

        Calculable calculable = Calculable::calculateTheSumOfArrayElementsLocatedBetweenTheMinAndMaxElementsInclusive;
        int sumElements = calculable.calculate(array, indexMinElement, indexMaxElement);

        if (sumElements > 0) {
            System.out.println("Sum of arrayOfObjects elements located between the min and max elements inclusive is : " + sumElements);
        }

    }

}
