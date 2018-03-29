package com.lugowoy.tasks.outputNumbersThatAreDivisibleByThreeAndNine;

import com.lugowoy.helper.factory.FactoryArray;
import com.lugowoy.helper.factory.creator.CreatorArrayNumbers;
import com.lugowoy.helper.filling.array.numbers.FillingArrayRandomIntegerNumbers;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.other.ArrayLength;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Created by Konstantin Lugowoy on 13.07.2017. */

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter length of array : ");
        int lengthArray = ArrayLength.getLengthArray(new ReadingConsole());

        Array<Integer> array = FactoryArray.getFactoryArray(new CreatorArrayNumbers<Integer>()).create(
                                                                new FillingArrayRandomIntegerNumbers().fill(lengthArray));

        System.out.println("Numbers : " + array);

        System.out.println("Numbers that are divisible by 3 and by 9 : ");

        Array<Integer> resultNumbers = printNumbersThatAreDivisibleByThreeAndNine(array);

        if (resultNumbers.getLength() == 0) {
            System.out.print("There are no such numbers.");
        } else {
            System.out.println("Result " + resultNumbers);
        }

    }

    private static Array<Integer> printNumbersThatAreDivisibleByThreeAndNine(Array<Integer> array) {
        Array<Integer> resultArray = FactoryArray.getFactoryArray(new CreatorArrayNumbers<Integer>()).create(0);
        Arrays.stream(array.toArray()).forEachOrdered(value -> {
            if ((value % 3 == 0) && (value % 9 == 0)) {
                resultArray.add(value);
            }
        });
        return resultArray;
    }

}
