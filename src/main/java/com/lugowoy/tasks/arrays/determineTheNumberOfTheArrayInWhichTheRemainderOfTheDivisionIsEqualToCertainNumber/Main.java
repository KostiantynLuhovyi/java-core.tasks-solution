package com.lugowoy.tasks.arrays.determineTheNumberOfTheArrayInWhichTheRemainderOfTheDivisionIsEqualToCertainNumber;

import com.lugowoy.util.fillable.FillableArray;
import com.lugowoy.util.fillable.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Arrays;
import java.util.Random;

/**Created by Konstantin Lugowoy on 14-Feb-17.*/

public class Main {

    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);

    private static final FillableArray<Integer> FILLING_ARRAY = new FillingArrayOfRandomNumber<>(() -> new Random().nextInt(200) - 100);

    private static Integer[] integers = FILLING_ARRAY.fillArray(new Integer[20]);

    public static void main(String[] args) {

        Numbers numbers = new Numbers(Arrays.stream(integers).mapToInt(Integer::intValue).toArray());

        System.out.println("Original array : ");
        Arrays.stream(numbers.getNumbers()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

        System.out.println("Enter number to the modulo : ");
        int numberToModulo = readingData.read();

        System.out.println("Enter result to the modulo : ");
        int resultModulo = readingData.read();

        DETERMINABLE.determinate(numbers.getNumbers(), numberToModulo, resultModulo);
    }

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
}
