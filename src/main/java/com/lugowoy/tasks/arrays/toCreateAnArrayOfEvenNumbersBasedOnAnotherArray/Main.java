package com.lugowoy.tasks.arrays.toCreateAnArrayOfEvenNumbersBasedOnAnotherArray;

import com.lugowoy.util.filling.arrays.FillableArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.ArrayList;
import java.util.Arrays;

/**Created by Konstantin Lugowoy on 13-Feb-17.*/

public class Main {

    private static final FillableArray<Integer> FILLING_ARRAY = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        Numbers<Integer> numbers = new Numbers<>();

        numbers.setNumbers(FILLING_ARRAY.fillArray(new Integer[20]));

        System.out.println("Original array numbers.");
        Arrays.stream(numbers.getNumbers()).forEachOrdered(integer -> System.out.print(integer + " "));

        Integer[] evenNumbers = getEvenNumbersArray(numbers);

        System.out.println();
        System.out.println("Even numbers of original array.");
        Arrays.stream(evenNumbers).forEachOrdered(integer -> System.out.print(integer + " "));

    }

    private static Integer[] getEvenNumbersArray(Numbers<Integer> numbers) {
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < numbers.getNumbers().length; i++) {
            if (numbers.getNumbers()[i] % 2 == 0) integers.add(numbers.getNumbers()[i]);
        }
        return Arrays.stream(integers.stream()
                                     .mapToInt(Integer::intValue)
                                     .toArray())
                     .boxed()
                     .toArray(Integer[]::new);
    }

}
