package com.lugowoy.tasks.core.countTheNumberOfOccurrencesOfTheMaximumNumber;

import com.lugowoy.helper.filling.FillerArrayNumbers;
import com.lugowoy.helper.filling.FillingArrayIntegerUserInputNumbers;
import com.lugowoy.helper.util.DeterminatorSizeOfArray;

/**Created by Konstantin Lugowoy on 14.11.2016.*/

public class Main {

    public static void main(String[] args) {

        int sizeOfArray = DeterminatorSizeOfArray.determineSizeOfArray();

        Numbers numbers = new Numbers();
        numbers.setNumbers(new FillerArrayNumbers<>(new FillingArrayIntegerUserInputNumbers()).fill(sizeOfArray));

        Countable countable = new CountableNumbers();

        for (int i = 0; i < numbers.getNumbers().length; i++) {
            numbers.setMaxNumberCount(countable.getCountMaximumNumbers(numbers.getNumbers()[i]));
        }

        System.out.printf("Count maximum number among the input : %d .", numbers.getMaxNumberCount());

    }

}
