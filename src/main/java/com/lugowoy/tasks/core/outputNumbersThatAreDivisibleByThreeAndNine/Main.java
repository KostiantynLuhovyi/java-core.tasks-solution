package com.lugowoy.tasks.core.outputNumbersThatAreDivisibleByThreeAndNine;

import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.models.arrays.ArrayOfIntegerPrimitives;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Created by Konstantin Lugowoy on 13.07.2017. */

public class Main {

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> array = new CreatorArrayOfIntegerPrimitives().create(new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt).fillArray(new int[sizeArray]));

        System.out.println("Numbers : ");
        Arrays.stream(array.getArrayOfIntegerPrimitives()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

        System.out.println("Numbers that are divisible by 3 and by 9 : ");
        Array<Integer> resultNumbers = printNumbersThatAreDivisibleByThreeAndNine(array);
        if (resultNumbers.getArrayOfIntegerPrimitives().length == 0) {
            System.out.print("There are no such numbers.");
        } else {
            Arrays.stream(resultNumbers.getArrayOfIntegerPrimitives()).forEachOrdered(value -> System.out.print(value + " "));
        }


    }

    private static Array<Integer> printNumbersThatAreDivisibleByThreeAndNine(Array<Integer> array) {
        List<Integer> integerList = new ArrayList<>();
        Arrays.stream(array.getArrayOfIntegerPrimitives()).forEachOrdered(value -> {
            if ((value % 3 == 0) && (value % 9 == 0)) {
                integerList.add(value);
            }
        });
        return new ArrayOfIntegerPrimitives(Arrays.stream(integerList.toArray()).toArray(Integer[]::new));
    }

}
