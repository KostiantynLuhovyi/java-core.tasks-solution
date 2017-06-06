package com.lugowoy.util;

import com.lugowoy.util.reading.ReadingData;

/** Created by Konstantin Lugowoy on 03.06.2017. */

@FunctionalInterface
public interface EnteringTheSizeOfTheArray<T> {

    T enter(ReadingData<T> readingData);

    static int enterUserInputForSizeOfTheArray(ReadingData<Integer> readingData) {
        int sizeArray;

        System.out.println("Enter a value for the size of the array : ");
        while (true) {
            sizeArray = readingData.read();
            if (sizeArray >= 2) {
                break;
            } else {
                System.out.println("Not correct of size array. Re-enter : ");
            }
        }

        return sizeArray;
    }

}
