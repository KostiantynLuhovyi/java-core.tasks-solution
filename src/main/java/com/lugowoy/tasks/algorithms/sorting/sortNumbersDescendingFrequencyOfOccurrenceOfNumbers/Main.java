package com.lugowoy.tasks.algorithms.sorting.sortNumbersDescendingFrequencyOfOccurrenceOfNumbers;

import com.lugowoy.helper.factory.creator.CreatorOfArrayModels;
import com.lugowoy.helper.factory.models.array.FactoryOfIntegerArrayModels;
import com.lugowoy.helper.filling.FillingArrayIntegerRandomNumbers;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.util.DeterminatorSizeOfArray;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 21.08.2017. */

public class Main {

    private static final int BOUND = 20;

    public static void main(String[] args) {

        int sizeArray = DeterminatorSizeOfArray.determineSizeOfArray();

        Array<Integer> array = new CreatorOfArrayModels<>(
                                    new FactoryOfIntegerArrayModels()).create(
                                            new FillingArrayIntegerRandomNumbers().fill(sizeArray, BOUND));

        Sortable sorter = new SorterNumbers()::sortNumbersDescendingFrequencyOfOccurrenceOfNumbers;
        sorter.sort(array);

        System.out.println("Sorting result in descending frequency of numbers : ");
        System.out.println(Arrays.toString(array.getArray()));

    }

}
