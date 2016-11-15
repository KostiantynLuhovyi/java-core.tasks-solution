package com.lugowoy.tasks.core.third;

/**
 * Created by Konstantin on 14.11.2016.
 */

public class MainThird {

    public static void main(String[] args) {

        int[] numbersArray = new int[10];

        Numbers numbers = new Numbers(numbersArray);
        Countable countable = new CountableNumbers();
        Insertion<Numbers> insertion = new InsertionNumbers();

        insertion.enterNumbers(numbers);

        for (int i = 0; i < numbers.getNumbers().length; i++) {
            numbers.setMaxNumberCount(countable.getCountMaximumNumbers(numbers.getNumbers()[i]));
        }

        System.out.printf("Count maximum number among the input : %d .", numbers.getMaxNumberCount());

    }
}