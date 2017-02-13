package com.lugowoy.tasks.arrays.replaceTheArrayNumbersOfLargerZ;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

import java.util.Arrays;
import java.util.Random;

/**Created by Konstantin Lugowoy on 13-Feb-17.*/

public class Main {

    private static final Random RANDOM = new Random();
    private static final ReadingData<Integer> READING_DATA = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) throws StoppingEnterValueException {

        Numbers numbersSequence = new Numbers();

        numbersSequence.setNumbers(Arrays
                                        .stream(new Integer[10])
                                        .mapToInt(value -> RANDOM.nextInt(50))
                                        .toArray());

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
