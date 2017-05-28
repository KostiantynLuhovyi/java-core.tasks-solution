package com.lugowoy.tasks.arrays.determiningTheIndexOfPrimesInAnArray;

import java.util.Arrays;
import java.util.Random;

/** Created by Konstantin Lugowoy on 22.05.2017. */

public class Main {

    private static Random random = new Random();

    public static void main(String[] args) {

        Array array = new Array(Arrays.stream(new int[20])
                                      .map(operand -> operand = random.nextInt(100))
                                      .toArray());

        System.out.println("Original array : ");
        Arrays.stream(array.getArray()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

        System.out.println("The indexes of elements which are prime numbers : ");
        Determinable<Integer> determinable = Determinable::determineTheIndexOfPrimesInAnArray;
        for (int i = 0; i < array.getArray().length; i++) {
            if (determinable.determine(array.getArray()[i])) {
                System.out.print(i + " ");
            }
        }

    }

}
