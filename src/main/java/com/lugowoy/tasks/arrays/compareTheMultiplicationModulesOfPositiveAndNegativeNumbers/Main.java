package com.lugowoy.tasks.arrays.compareTheMultiplicationModulesOfPositiveAndNegativeNumbers;

import com.lugowoy.tasks.arrays.compareTheMultiplicationModulesOfPositiveAndNegativeNumbers.multiplicate.Multipliable;
import com.lugowoy.tasks.arrays.compareTheMultiplicationModulesOfPositiveAndNegativeNumbers.multiplicate.MultipliableNegativeNumbers;
import com.lugowoy.tasks.arrays.compareTheMultiplicationModulesOfPositiveAndNegativeNumbers.multiplicate.MultipliablePositiveNumbers;
import com.lugowoy.util.fillable.Fillable;
import com.lugowoy.util.fillable.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 11.03.2017. */

public class Main {

    private static final Fillable<Integer> FILLABLE = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        Numbers numbers = new Numbers(FILLABLE.fillArray(new Integer[30]));

        System.out.println("Original array : ");
        Arrays.stream(numbers.getIntegers()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        Multipliable<Integer> multipliable = MultipliableNegativeNumbers::multiplication;
        Integer resultModuleOfNegativeNumbers = Math.abs(multipliable.multiplication(numbers.getIntegers()));

        multipliable = MultipliablePositiveNumbers::multiplication;
        Integer resultModuleOfPositiveNumbers = Math.abs(multipliable.multiplication(numbers.getIntegers()));

        if (resultModuleOfNegativeNumbers > resultModuleOfPositiveNumbers) {
            System.out.println("Multiplication negative numbers on the module larger positive numbers.");
        } else if (resultModuleOfPositiveNumbers > resultModuleOfNegativeNumbers) {
            System.out.println("Multiplication positive numbers on the module larger negative numbers.");
        }

    }
}
