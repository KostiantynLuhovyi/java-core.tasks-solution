package com.lugowoy.tasks.core.third;

/**
 * Created by Konstantin on 14.11.2016.
 */

public class CountableNumbers implements Countable {

    private int maxNumberElement;
    private int countMaxNumbers;

    @Override
    public int getCountMaximumNumbers(int number) {

        if (number == maxNumberElement) {
            countMaxNumbers++;

        } else if (number > maxNumberElement) {
            maxNumberElement = number;
            countMaxNumbers = 1;
        }

        return countMaxNumbers;
    }

}
