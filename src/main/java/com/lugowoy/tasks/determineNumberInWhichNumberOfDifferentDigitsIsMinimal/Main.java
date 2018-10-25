package com.lugowoy.tasks.determineNumberInWhichNumberOfDifferentDigitsIsMinimal;

import com.lugowoy.helper.filling.array.numbers.FillingArrayRandomIntegerNumbers;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.models.Array;
import com.lugowoy.helper.other.LengthArray;

/** Created by Konstantin Lugowoy on 03.09.2018 . */

public class Main {

    private static final int BOUND = 100000;

    public static void main(String[] args) {

        System.out.println("Enter length of the array : ");
        int lengthOfArray = LengthArray.getLengthOfArray(new ReadingConsole());

        Array<Integer> integerArray = Array.create(new FillingArrayRandomIntegerNumbers().fill(lengthOfArray, BOUND));

        System.out.println("Original integer array : " + integerArray);

        Determinant determinant = Determinant::determineNumberInWhichNumberOfDifferentDigitsIsMinimal;
        System.out.println("Result number : " + determinant.determineNumber(integerArray));

    }

}
