package com.lugowoy.tasks.arrays.createNewArrayWhoseElementsWillBeElementsOfSourceEndingInSpecificNumber;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.models.arrays.ArrayOfIntegerPrimitives;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

import java.util.ArrayList;
import java.util.List;

/** Created by Konstantin Lugowoy on 27.03.2017. */

public class Main {

    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array array = creator.create(new FillingArrayOfRandomNumber<Integer>().fillArray(new int[sizeArray], Integer.MAX_VALUE));

        System.out.println("Original array : " + array);
        System.out.println();

        System.out.println("Enter specific ending number : ");
        ReadingUserInputData readingUserInputData = new ReadingUserInputData();
        int specificEndingNumber = readingUserInputData.readInt();

        Array newArray = createNewArrayWhoseElementsWillBeElementsOfSourceEndingInSpecificNumber(array, specificEndingNumber);

        System.out.println("New array : " + newArray);
        System.out.println();

    }

    private static Array<Integer> createNewArrayWhoseElementsWillBeElementsOfSourceEndingInSpecificNumber(Array<Integer> array, int specificEndingNumber) {
        List<Integer> resultNewIntegerList = new ArrayList<>(0);

        if (array != null) {
            if ((array.getArray() != null) && (array.getArray().length > 0)) {
                for (int i : array.getArray()) {
                    if (Math.abs(i) % 10 == specificEndingNumber) {
                        resultNewIntegerList.add(i);
                    }
                }
            } else {
                System.out.println("Incorrect argument passed.");
            }
        } else {
            System.out.println("Incorrect argument passed.");
        }

        return new ArrayOfIntegerPrimitives(resultNewIntegerList.stream().mapToInt(Integer::intValue).toArray());
    }

}
