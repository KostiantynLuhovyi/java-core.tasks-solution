package com.lugowoy.tasks.arrays.createAnArrayOfZeroElementsOfAnotherArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**Created by Konstantin Lugowoy on 12-Feb-17.*/

public class Main {

    private static final Random RANDOM_NUMBER = new Random();

    public static void main(String[] args) {

        Array<Integer> originalIntegerArray = new Array<>(new Integer[30]);

        System.out.println("Elements of of the original array : ");
        for (int i = 0; i < originalIntegerArray.getArray().length; i++) {
            originalIntegerArray.getArray()[i] = RANDOM_NUMBER.nextInt(20);
            System.out.print(originalIntegerArray.getArray()[i] + " ");
        }
        System.out.println();

        ArrayIndexZero<Integer> integerArrayIndexZero = new ArrayIndexZero<>();

        FillingArrayOfAnotherArrayElementsZero<Integer> fillingArray = originalArray -> {
            ArrayList<Integer> integers = new ArrayList<>();
            Integer[] resultArray;
            for (int i = 0; i < originalArray.length; i++) {
                if (originalArray[i] == 0) {
                    integers.add(i);
                }
            }
            if (integers.isEmpty()) {
                resultArray = new Integer[0];
            } else {
                resultArray = Arrays.stream(
                                        integers
                                                .stream()
                                                .mapToInt(Integer::intValue)
                                                .toArray())
                                    .boxed()
                                    .toArray(Integer[]::new);

            }
            return resultArray;
        };

        integerArrayIndexZero.setArrayIndexZero(fillingArray.fillArrayOfAnotherArrayElementsZero(originalIntegerArray.getArray()));

        System.out.print("Index of zero elements of the original array : ");
        if (integerArrayIndexZero.getArrayIndexZero().length != 0) {
            for (int i = 0; i < integerArrayIndexZero.getArrayIndexZero().length; i++) {
                System.out.print(integerArrayIndexZero.getArrayIndexZero()[i] + " ");
            }
        } else {
            System.out.println("It does not contain zero elements.");
        }
    }
}
