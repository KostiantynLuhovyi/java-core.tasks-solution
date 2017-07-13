package com.lugowoy.tasks.algorithms.sorting.sortElementsInDescendingOrderOfNumberModules;

import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillableArrayOfRandomNumber;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 13.07.2017. */

public class Main {

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> array = new CreatorArrayOfIntegerPrimitives().create(new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt).fillArray(new int[sizeArray]));

        System.out.println("Numbers : ");
        Arrays.stream(array.getArrayOfIntegerPrimitives()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

        Sortable<Array<Integer>> arraySortable = Sortable::bubbleSortDescendingOfNumberModules;
        arraySortable.sort(array);

        System.out.println("Sort result : ");
        Arrays.stream(array.getArrayOfIntegerPrimitives()).forEachOrdered(value -> System.out.print(value + " "));

    }

}
