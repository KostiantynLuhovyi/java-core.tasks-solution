package com.lugowoy.tasks.arrays.toCreateAnArrayOfEvenNumbersBasedOnAnotherArray;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**Created by Konstantin Lugowoy on 13-Feb-17.*/

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Numbers<Integer> numbers = new Numbers<>();

        numbers.setNumbers(Arrays.stream(new int[20]).map(operand -> RANDOM.nextInt(100)).boxed().toArray(Integer[]::new));

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
        return Arrays.stream(
                            integers
                                    .stream()
                                    .mapToInt(Integer::intValue)
                                    .toArray())
                     .boxed()
                     .toArray(Integer[]::new);
    }

}
