package com.lugowoy.tasks.core.third;

/**
 * Created by Konstantin on 14.11.2016.
 */

/*
* Class "CountableNumbers" implements interface "Countable" and implements abstract method
* to a count occurrences of the maximum number.
* */
class CountableNumbers implements Countable {


    private int maxNumberElement;
    private int countMaxNumbers;

    /*
    * Implementation of an abstract method for counting the occurrences of the maximum number.
    * Parameter "number" a number that is verified and are counted.
    * */
    @Override
    public int getCountMaximumNumbers(int number) {
        /*
        * If the parameter "number" does not occur for the first time,
        * the value of the variable countMaxNumbers incremented.
        * */
        if (number == maxNumberElement) {
            countMaxNumbers++;
        /*
        * If the parameter "number" > "maxNumberElement", then set a new maximum value assigned to the variable.
        * A counter "countMaxNumbers" is reset and assigns a value of 1.
        * */
        } else if (number > maxNumberElement) {
            maxNumberElement = number;
            countMaxNumbers = 1;
        }
        /*
        * The method returns the value of the variable "countMaxNumbers",
        * the value which is equal to the count number of occurrences of the maximum number.
        * */
        return countMaxNumbers;
    }

}
