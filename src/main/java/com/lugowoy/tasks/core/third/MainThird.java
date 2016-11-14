package com.lugowoy.tasks.core.third;

import java.util.Scanner;

/**
 * Created by Konstantin on 14.11.2016.
 */

public class MainThird {

    public static void main(String[] args) {

        int[] numbersArray = new int[10];

        Numbers numbers = new Numbers(numbersArray);
        Countable countable = new CountableNumbers();
        InsertionNumbers insertion = new InsertionNumbers();

        insertion.enterNumbers(numbers);

        for (int i = 0; i < numbers.getNumbers().length; i++) {
            numbers.setCountMaxNumbers(countable.getCountMaximumNumbers(numbers.getNumbers()[i]));
        }

        for (int i = 0; i < numbers.getNumbers().length; i++) {
            System.out.println(numbers.getNumbers()[i]);
        }

        /*System.out.printf("The maximum number of met %d times", numbers.getCountMaxNumbers());*/
    }
}