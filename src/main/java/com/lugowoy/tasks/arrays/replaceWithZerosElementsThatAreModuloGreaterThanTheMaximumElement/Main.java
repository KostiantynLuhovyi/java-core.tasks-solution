package com.lugowoy.tasks.arrays.replaceWithZerosElementsThatAreModuloGreaterThanTheMaximumElement;

import com.lugowoy.util.filling.Fillable;
import com.lugowoy.util.filling.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 11.03.2017. */

public class Main {

    private static final Fillable<Integer> FILLABLE = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        Integer[] integers = FILLABLE.fillArray(new Integer[30]);

        Numbers numbers = new Numbers(integers);

        System.out.println("Original sequence : ");
        Arrays.stream(numbers.getIntNumbers()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        int maximumNumberElement = 0;

        if (Arrays.stream(numbers.getIntNumbers()).max(Integer::compareTo).isPresent()) {
            maximumNumberElement = Arrays.stream(numbers.getIntNumbers()).max(Integer::compareTo).get();
        }

        System.out.println("Result sequence : ");
        int finalMaximumNumberElement = maximumNumberElement;
        Arrays.stream(numbers.getIntNumbers()).forEachOrdered(integer -> {
            if (finalMaximumNumberElement != 0) {
                if (Math.abs(integer) > finalMaximumNumberElement) {
                    integer = 0;
                }
            }
            System.out.print(integer + " ");
        });
    }
}
