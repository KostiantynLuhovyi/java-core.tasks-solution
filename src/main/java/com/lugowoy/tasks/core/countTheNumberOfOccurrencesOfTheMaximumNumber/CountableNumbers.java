package com.lugowoy.tasks.core.countTheNumberOfOccurrencesOfTheMaximumNumber;

/**Created by Konstantin Lugowoy on 14.11.2016.*/

class CountableNumbers implements Countable {

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
