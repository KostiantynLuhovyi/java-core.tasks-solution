package com.lugowoy.tasks.printLongestNumber;

import com.lugowoy.helper.filling.array.numbers.FillingArrayRandomIntegerNumbers;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.models.Array;
import com.lugowoy.helper.other.LengthArray;
import com.lugowoy.tasks.printShortestNumber.DeterminantShortestNumber;

/** Created by Konstantin Lugowoy on 08.08.2018. */

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter length of the array : ");
        int lengthOfArray = LengthArray.getLengthOfArray(new ReadingConsole());

        Array<Integer> integerArray = Array.create(new FillingArrayRandomIntegerNumbers().fill(lengthOfArray, Integer.MAX_VALUE));

        System.out.println("Numbers in an array : " + integerArray);

        printShortestNumber(DeterminantLongestNumber::determineLongestNumberOfNumbers, integerArray);

    }

    private static void printShortestNumber(DeterminantLongestNumber determinantLongestNumber, Array<Integer> integerArray) {
        int defaultDigitToCount = 0;
        int resultNumber = determinantLongestNumber.determine(integerArray);
        System.out.println("Result number " + resultNumber);
        System.out.println("Length of the number : " + DeterminantShortestNumber.countDigitOfNumber(defaultDigitToCount, Math.abs(resultNumber)));
    }

}
