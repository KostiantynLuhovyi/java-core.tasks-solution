package com.lugowoy.tasks.determineNumberInWhichNumberOfDifferentDigitsIsMinimal;

import com.lugowoy.helper.factory.FactoryArray;
import com.lugowoy.helper.factory.creator.CreatorArrayNumbers;
import com.lugowoy.helper.filling.array.numbers.FillingArrayRandomIntegerNumbers;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.other.ArrayLength;

/** Created by Konstantin Lugowoy on 03.09.2018 . */

public class Main {

    private static final int BOUND = 100000;

    public static void main(String[] args) {

        System.out.println("Enter length of the array : ");
        int lengthArray = ArrayLength.getLengthArray(new ReadingConsole());

        Array<Integer> integerArray = FactoryArray.getFactoryArray(new CreatorArrayNumbers<Integer>()).create(
                                                                       new FillingArrayRandomIntegerNumbers().fill(lengthArray, BOUND));

        System.out.println("Original integer array : " + integerArray);

        Determinant determinant = Determinant::determineNumberInWhichNumberOfDifferentDigitsIsMinimal;
        System.out.println("Result number : " + determinant.determineNumber(integerArray));

    }

}
