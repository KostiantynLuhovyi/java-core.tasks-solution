package com.lugowoy.tasks.printAllThreeDigitNumbersThatDoNotHaveSameDigits;

import com.lugowoy.helper.factory.FactoryArray;
import com.lugowoy.helper.factory.creator.CreatorArrayNumbers;
import com.lugowoy.helper.filling.array.numbers.FillingArrayRandomIntegerNumbers;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.other.ArrayLength;

/** Created by Konstantin Lugowoy on 13.07.2017. */

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter length of array : ");
        int lengthArray = ArrayLength.getLengthArray(new ReadingConsole());

        Array<Integer> array = FactoryArray.getFactoryArray(new CreatorArrayNumbers<Integer>()).create(
                                                                new FillingArrayRandomIntegerNumbers().fill(lengthArray));

        System.out.println("Numbers : " + array);
        System.out.println();

        Array<Integer> resultArray = getAllThreeDigitNumbersThatDoNotHaveSameDigits(array);
        if (resultArray.getLength() > 0) {
            System.out.println("Result numbers : " + resultArray);
        } else {
            System.out.println("No numbers are found that satisfy the condition.");
        }

    }

    private static Array<Integer> getAllThreeDigitNumbersThatDoNotHaveSameDigits(Array<Integer> array) {
        Array<Integer> resultArray = FactoryArray.getFactoryArray(new CreatorArrayNumbers<Integer>()).create(0);
        for (int i = 0; i < array.getLength(); i++) {
            String stringOfValue = Integer.toString(array.get(i));

            if ((stringOfValue.startsWith("-") && (stringOfValue.length() == 4)) || (stringOfValue.matches("\\d{3}"))) {
                int tmpValue = array.get(i);
                int firstDigit = tmpValue % 10;
                tmpValue /= 10;
                int secondDigit = tmpValue % 10;
                int thirdDigit = tmpValue / 10;

                if ( ! ((firstDigit == secondDigit) || (secondDigit == thirdDigit) || (thirdDigit == firstDigit))) {
                    resultArray.add(array.get(i));
                }
            }
        }
        return resultArray;
    }

}
