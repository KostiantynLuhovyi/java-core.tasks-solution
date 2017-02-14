package com.lugowoy.tasks.arrays.determineTheNumberOfTheArrayInWhichTheRemainderOfTheDivisionIsEqualToCertainNumber;

import com.lugowoy.tasks.arrays.interchangedMaximumAndMinimumElementOfTheArray.*;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

import java.util.Arrays;
import java.util.Random;

/**Created by Konstantin Lugowoy on 14-Feb-17.*/

public class Main {

    private static final Random RANDOM = new Random();
    private static final ReadingUserInputData READING_DATA = new ReadingUserInputData();

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

    public static void main(String[] args) throws StoppingEnterValueException {

        Numbers numbers = new Numbers(Arrays.stream(new Integer[20]).mapToInt(value -> RANDOM.nextInt(100)).toArray());

        System.out.println("Original array : ");
        Arrays.stream(numbers.getNumbers()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

        System.out.println("Enter number to the modulo : ");
        int numberToModulo = READING_DATA.readInt();

        System.out.println("Enter result to the modulo : ");
        int resultModulo = READING_DATA.readInt();


        DETERMINABLE.determinate(numbers.getNumbers(), numberToModulo, resultModulo);


    }
}
