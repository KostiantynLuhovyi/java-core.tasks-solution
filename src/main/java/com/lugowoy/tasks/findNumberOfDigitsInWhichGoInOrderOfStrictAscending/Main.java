package com.lugowoy.tasks.findNumberOfDigitsInWhichGoInOrderOfStrictAscending;

import com.lugowoy.helper.factory.FactoryArray;
import com.lugowoy.helper.factory.creator.CreatorArrayNumbers;
import com.lugowoy.helper.filling.array.numbers.FillingArrayRandomIntegerNumbers;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.other.ArrayLength;

/** Created by Konstantin Lugowoy on 06.09.2018 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter length of the array : ");
        int lengthArray = ArrayLength.getLengthArray(new ReadingConsole());

        Array<Integer> integerArray = FactoryArray.getFactoryArray(new CreatorArrayNumbers<Integer>()).create(
                                                                       new FillingArrayRandomIntegerNumbers().fill(lengthArray, 1000));

        System.out.println("Numbers : " + integerArray);

        int resultNumber = findNumberOfDigitsInWhichGoInOrderOfStrictAscending(integerArray);
        if (resultNumber == 0) {
            System.out.println("No matching matched number.");
        } else {
            System.out.print("Result number : " + resultNumber);
        }
    }

    private static int findNumberOfDigitsInWhichGoInOrderOfStrictAscending(Array<Integer> integerArray) {
        int resultNumber = 0;
        boolean checkResult = false;
        int i = 0;
        while (i < integerArray.getLength()) {
            int number = integerArray.get(i);
            resultNumber = number;
            while (number != 0) {
                int tmpFirst = number % 10;
                int tmpSecond = number % 100 / 10;
                if (tmpFirst >= tmpSecond) {
                    number /= 10;
                    checkResult = true;
                } else {
                    resultNumber = 0;
                    checkResult = false;
                    break;
                }
            }
            if (checkResult) break;
            i++;
        }
        return resultNumber;
    }

}
