package com.lugowoy.tasks.determineNumberThatContainsOnlyDifferentDigits;

import com.lugowoy.helper.filling.array.numbers.FillingArrayRandomIntegerNumbers;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.models.Array;
import com.lugowoy.helper.other.CheckerArray;
import com.lugowoy.helper.other.LengthArray;

/** Created by Konstantin Lugowoy on 12.09.2018 */

public class Main {

    private static final int BOUND = 100_000;

    public static void main(String[] args) {

        System.out.println("Enter length of the array : ");
        int lengthOfArray = LengthArray.getLengthOfArray(new ReadingConsole());

        Array<Integer> integerArray = Array.create(new FillingArrayRandomIntegerNumbers().fill(lengthOfArray, BOUND));

        System.out.println("Numbers in an array : " + integerArray);

        System.out.print("Result : ");
        int resultNumber = determineNumberThatContainsOnlyDifferentDigits(integerArray);
        if (resultNumber == 0) {
            System.out.print("No numbers corresponding to the condition");
        } else {
            System.out.println(resultNumber);
        }

    }

    private static int determineNumberThatContainsOnlyDifferentDigits(Array<Integer> integerArray) {
        int resultNumber = 0;
        int counterDifferentDigit = 0;
        int[] ints;
        if (CheckerArray.checkArrayNonNull(integerArray)
                && CheckerArray.checkLengthOfArrayIsGreaterZero(integerArray.getLength())) {
            for (int i = 0; i < integerArray.getLength(); i++) {
                int number = integerArray.get(i);
                ints = getIntNumbersOfNumber(number);
                for (int j = 0; j < ints.length; j++) {
                    for (int k = 0; k < ints.length; k++) {
                        if (j != k) {
                            if (ints[j] == ints[k]) {
                                counterDifferentDigit++;
                                if (counterDifferentDigit >= 2) {
                                    break;
                                }
                            } else {
                                resultNumber = number;
                            }
                        }
                    }
                }
                if (counterDifferentDigit >= 2) {
                    counterDifferentDigit = 0;
                    resultNumber = 0;
                } else {
                    break;
                }
            }
        } else {
            System.err.println("Incorrect arguments.");
        }
        return resultNumber;
    }

    private static int[] getIntNumbersOfNumber(int number) {
        int[] numbers = new int[String.valueOf(number).length()];
        int index = numbers.length - 1;
        while(number > 0) {
            numbers[index] = number % 10;
            number /= 10;
            index--;
        }
        return numbers;
    }

}
