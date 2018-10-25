package com.lugowoy.tasks.countNumberOfOccurrencesOfMaximumNumber;

import com.lugowoy.helper.filling.array.FillerArray;
import com.lugowoy.helper.filling.array.numbers.FillingArrayReadIntegerNumbers;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.other.LengthArray;

/**Created by Konstantin Lugowoy on 14.11.2016.*/

public class Main {

    public static void main(String[] args) {

        int lengthOfArray = LengthArray.getLengthOfArray(new ReadingConsole());

        Numbers numbers = new Numbers(FillerArray.getFillerArray(new FillingArrayReadIntegerNumbers(
                                                                        new ReadingConsole())).fill(lengthOfArray));

        Counting counting = CountingNumbers::countMaximumNumbers;

        for (int i = 0; i < numbers.getNumbers().length; i++) {
            numbers.setMaxNumberCount(counting.countMaximumNumbers(numbers.getNumbers()[i]));
        }

        System.out.printf("Count maximum number among the input : %d .", numbers.getMaxNumberCount());

    }

}
