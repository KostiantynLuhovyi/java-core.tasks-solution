package com.lugowoy.tasks.algorithms.sorting.sortNumbersDescendingFrequencyOfOccurrenceOfNumbers;

import com.lugowoy.helper.models.arrays.Array;

import java.util.*;

/** Created by Konstantin Lugowoy on 22.08.2017. */

public class SorterNumbers {

    public void sortNumbersDescendingFrequencyOfOccurrenceOfNumbers(Array<Integer> array) {
        if (Objects.nonNull(array)) {
            if ((Objects.nonNull(array.getArray())) && (array.getArray().length > 2)) {

                this.sort(array);

                int[] arrayCountOfOccurrenceNumbers = this.getArrayCountOfOccurrenceNumbers(array);

                for (int i = 0; i < array.getArray().length - 1; i++) {
                    for (int j = i + 1; j < array.getArray().length; j++) {
                        if (arrayCountOfOccurrenceNumbers[j] > arrayCountOfOccurrenceNumbers[i]) {
                            int tmp = arrayCountOfOccurrenceNumbers[i];
                            arrayCountOfOccurrenceNumbers[i] = arrayCountOfOccurrenceNumbers[j];
                            arrayCountOfOccurrenceNumbers[j] = tmp;
                            tmp = array.getArray()[i];
                            array.getArray()[i] = array.getArray()[j];
                            array.getArray()[j] = tmp;
                        } else if (arrayCountOfOccurrenceNumbers[i] == arrayCountOfOccurrenceNumbers[j]
                                                && array.getArray()[i] > array.getArray()[j]) {
                            int tmp = array.getArray()[i];
                            array.getArray()[i] = array.getArray()[j];
                            array.getArray()[j] = tmp;
                        }
                    }
                }
            }
        }
    }

    private int[] getArrayCountOfOccurrenceNumbers(Array<Integer> array) {
        int[] arrayCountOfOccurrenceNumbers = new int[array.getArray().length];

        int countFrequencyOfOccurrence = 0;
        for (int i = 0; i < array.getArray().length - 1; i++) {
            for (int j = 0; j < array.getArray().length - 1; j++) {
                if (array.getArray()[i].intValue() == array.getArray()[j].intValue()) {
                    countFrequencyOfOccurrence ++;
                }
            }
            arrayCountOfOccurrenceNumbers[i] = countFrequencyOfOccurrence;
            countFrequencyOfOccurrence = 0;
        }
        return arrayCountOfOccurrenceNumbers;
    }

    private void sort(Array<Integer> array) {
        Arrays.sort(array.getArray());
    }

}
