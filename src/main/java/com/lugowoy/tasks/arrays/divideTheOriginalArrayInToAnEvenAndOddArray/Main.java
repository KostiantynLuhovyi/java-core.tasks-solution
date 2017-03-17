package com.lugowoy.tasks.arrays.divideTheOriginalArrayInToAnEvenAndOddArray;

import java.util.Arrays;
import java.util.Random;

/** Created by Konstantin Lugowoy on 16.03.2017. */

public class Main {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {

        Integer[] integers = new Integer[40];

        integers = Arrays.stream(new Integer[40]).mapToInt(value -> RANDOM.nextInt(200)).boxed().toArray(Integer[]::new);

        Array<Integer> originalArray = new Array<>(integers);

        System.out.println("Original array : ");
        Arrays.stream(originalArray.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        Selectable<Integer> selectable = Selectable::selectableArray;

        Array<Integer> evenNumbersArray = new Array<>(selectable.select(originalArray.getArray(), Selectable.STATUS_EVEN_NUMBERS));
        Array<Integer> oddNumbersArray = new Array<>(selectable.select(originalArray.getArray(), Selectable.STATUS_ODD_NUMBERS));

        System.out.println("Even number array created based on the original array : ");
        Arrays.stream(evenNumbersArray.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        System.out.println("Odd number array created based on the original array : ");
        Arrays.stream(oddNumbersArray.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();
    }
}
