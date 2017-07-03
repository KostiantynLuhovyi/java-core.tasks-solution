package com.lugowoy.tasks.arrays.onedimensional.outputElementsIncludedInTheInterval;

import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 06.03.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) {

        System.out.println("Enter a value for the size of the array : ");
        int sizeArray = readingData.read();

        Integer[] integers = fillArray.fillArray(new Integer[sizeArray]);

        System.out.println("Original sequence : ");
        Arrays.stream(integers).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        ReadingData<Integer> reading = new ReadingData<>(new ReadingUserInputData()::readInt);
        System.out.println("Enter the value of the start of the segment : ");
        int startOfInterval = reading.read();
        System.out.println("Enter the value of the finish of the segment : ");
        int finishOfInterval = reading.read();

        System.out.println("Elements entering the sequence of numbers from a segment : ");
        Arrays.stream(integers).forEachOrdered(integer -> {
            if ((integer > startOfInterval) && (integer < finishOfInterval)) {
                System.out.print(integer + " ");
            }
        });

    }
}
