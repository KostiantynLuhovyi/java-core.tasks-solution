package com.lugowoy.tasks.arrays.onedimensional.replaceTheArrayNumbersOfLargerZ;

import com.lugowoy.util.filling.arrays.FillableArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Arrays;

/**Created by Konstantin Lugowoy on 13-Feb-17.*/

public class Main {

    private static final FillableArray<Integer> FILLING_ARRAY = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static final ReadingData<Integer> READING_DATA = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) {

        Numbers numbersSequence = new Numbers();

        numbersSequence.setNumbers(Arrays.stream(FILLING_ARRAY.fillArray(new Integer[20])).mapToInt(Integer::intValue).toArray());

        System.out.println("Enter number of replace : ");
        int numberToReplace = READING_DATA.read();

        System.out.println("Original array : ");
        Arrays.stream(numbersSequence.getNumbers()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

        Replace<Numbers, Integer> numbersReplace = (Numbers numbers, Integer numberToExchange) -> {
            int countToReplace = 0;
            for (int i = 0; i < numbers.getNumbers().length; i++) {
                if (numbers.getNumbers()[i] > numberToExchange) {
                    numbers.getNumbers()[i] = numberToExchange;
                    countToReplace++;
                }
            }
            System.out.print("Count number of replacements : " + countToReplace);
        };

        numbersReplace.replace(numbersSequence, numberToReplace);

        System.out.println();
        System.out.println("Result replace : ");
        Arrays.stream(numbersSequence.getNumbers()).forEachOrdered(value -> System.out.print(value + " "));

    }
}
