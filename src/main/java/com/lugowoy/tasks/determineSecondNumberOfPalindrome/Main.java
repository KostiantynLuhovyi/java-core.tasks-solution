package com.lugowoy.tasks.determineSecondNumberOfPalindrome;

import com.lugowoy.helper.factory.FactoryArray;
import com.lugowoy.helper.factory.creator.CreatorArrayNumbers;
import com.lugowoy.helper.filling.array.numbers.FillingArrayReadIntegerNumbers;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.other.ArrayChecker;
import com.lugowoy.helper.other.ArrayLength;

/** Created by Konstantin Lugowoy on 13.09.2018 */

public class Main {

    private static final int BOUND = 1_000_000;

    public static void main(String[] args) {

        System.out.println("Enter length of the array : ");
        int lengthArray = ArrayLength.getLengthArray(new ReadingConsole());

        Array<Integer> integerArray = FactoryArray.getFactoryArray(new CreatorArrayNumbers<Integer>()).create(
                                                                        new FillingArrayReadIntegerNumbers(new ReadingConsole()).fill(lengthArray, BOUND));

        System.out.println("Numbers in an array : " + integerArray);

        System.out.print("Result : ");
        int numberOfPolindrome = determineSecondNumberOfPolindrome(integerArray);
        if (numberOfPolindrome == 0) {
            System.out.print("No value matching the condition of the task was found.");
        } else if (numberOfPolindrome > 0) {
            System.out.print(numberOfPolindrome);
        }

    }

    private static int determineSecondNumberOfPolindrome(Array<Integer> integerArray) {
        ArrayChecker.checkArrayNonNull(integerArray);
        ArrayChecker.checkLengthOfArrayIsEqualToOrGreaterThanZero(integerArray.getLength());
        int resultNumber = 0;
        int counterPolindromeNumber = 0;
        for (int i = 0; i < integerArray.getLength(); i++) {
            int number = integerArray.get(i);
            String numberValue = Integer.toString(number);
            int duplicateNumber = number;
            int reverseNumber = 0;
            for (int j = 0; j < numberValue.length(); j++) {
                reverseNumber = reverseNumber * 10 + (duplicateNumber % 10);
                duplicateNumber /= 10;
            }
            if (number == reverseNumber) {
                counterPolindromeNumber++;
            }
            if (counterPolindromeNumber == 2) {
                resultNumber = number;
            }
        }
        return resultNumber;
    }

}
