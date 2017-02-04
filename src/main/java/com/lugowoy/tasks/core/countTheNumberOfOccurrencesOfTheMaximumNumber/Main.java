package com.lugowoy.tasks.core.countTheNumberOfOccurrencesOfTheMaximumNumber;

import com.lugowoy.util.fillable.FillableArray;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

/**
 * Created by Konstantin on 14.11.2016.
 */

public class Main {

    public static void main(String[] args) throws StoppingEnterValueException {

        /*
        *Instantiate integer array whose size is equal 10 elements.
        * */
        Integer[] numbersArray = new Integer[10];

        /*
        * Instantiate an object of class "Numbers", passing the argument integer array("numbersArray") of 10 elements.
        * */
        Numbers numbers = new Numbers();
        /*
        * Instantiate an object of class "CountableNumbers",
        * to find number of occurrences of the maximum entered number.
        * */
        Countable countable = new CountableNumbers();

        FillableArray<Integer> fillingArray = new FillableArray<>(new ReadingUserInputData()::readInt);

        numbers.setNumbers(fillingArray.fillArray(numbersArray));

        /*
        * Iteration for an array of integer values contained in the object class "Numbers".
        * */
        for (int i = 0; i < numbers.getNumbers().length; i++) {
            /*
            * On each iteration of the loop on the integer array, the method call getCountNumbers()
            * the class object "Countable" it sought the maximum integer value in the array and
            * calculated the number of times the maximum number of meets.
            *
            * The result is initialized the variable "maxNumberCount" object class "Numbers".
            * */
            numbers.setMaxNumberCount(countable.getCountMaximumNumbers(numbers.getNumbers()[i]));
        }

        /*
        * Output results in the console.
        * */
        System.out.printf("Count maximum number among the input : %d .", numbers.getMaxNumberCount());

    }
}