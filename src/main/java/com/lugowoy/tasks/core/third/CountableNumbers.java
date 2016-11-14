package com.lugowoy.tasks.core.third;

/**
 * Created by Konstantin on 14.11.2016.
 */

public class CountableNumbers implements Countable {

    private static int maxNumberElement = 0;

    @Override
    public int getCountMaximumNumbers(int number) {
        int countMaxNumbers = 0;

        if (number > maxNumberElement) {
            maxNumberElement = number;
            countMaxNumbers = 1;
        } else if (number == maxNumberElement) {
            countMaxNumbers++;
        }
        return countMaxNumbers;
    }


}
