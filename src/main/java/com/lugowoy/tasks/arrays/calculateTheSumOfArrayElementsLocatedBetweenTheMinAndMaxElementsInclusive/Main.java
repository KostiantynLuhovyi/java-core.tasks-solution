package com.lugowoy.tasks.arrays.calculateTheSumOfArrayElementsLocatedBetweenTheMinAndMaxElementsInclusive;

import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;
import java.util.Random;

/** Created by Konstantin Lugowoy on 27.03.2017. */

public class Main {

    private static final Random RANDOM = new Random();

    private static Determinable determinable;
    private static Calculable calculable;

    public static void main(String[] args) {

        Array array = new Array(Arrays.stream(new int[30]).map(operand -> RANDOM.nextInt(100)).toArray());

        System.out.println("Original array : ");
        Arrays.stream(array.getArray()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

        determinable = Determinable::determineMinElementIndex;
        int indexMinElement = determinable.determine(array);
        System.out.println("Index min element in the array is : " + indexMinElement);
        System.out.println();

        determinable = Determinable::determineMaxElementIndex;
        int indexMaxElement = determinable.determine(array);
        System.out.println("Index max element in the array is : " + indexMaxElement);
        System.out.println();

        calculable = Calculable::calculateTheSumOfArrayElementsLocatedBetweenTheMinAndMaxElementsInclusive;
        int sumElements = calculable.calculate(array, indexMinElement, indexMaxElement);
        System.out.println("Sum of array elements located between the min and max elements inclusive is : " + sumElements);
        System.out.println();


    }
}
