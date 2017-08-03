package com.lugowoy.tasks.core.outputNumbersThatAreDivisibleByThreeAndNine;

import com.lugowoy.helper.factory.creator.CreatorOfArrayModels;
import com.lugowoy.helper.factory.models.array.FactoryOfIntegerArrayModels;
import com.lugowoy.helper.filling.FillingArrayIntegerRandomNumbers;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.util.DeterminatorSizeOfArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Created by Konstantin Lugowoy on 13.07.2017. */

public class Main {

    public static void main(String[] args) {

        int sizeArray = DeterminatorSizeOfArray.determineSizeOfArray();

        Array<Integer> array = new CreatorOfArrayModels<Integer>(new FactoryOfIntegerArrayModels()).create(new FillingArrayIntegerRandomNumbers().fill(sizeArray));

        System.out.println("Numbers : ");
        Arrays.stream(array.getArray()).forEachOrdered(value -> System.out.print(value + " "));
        System.out.println();

        System.out.println("Numbers that are divisible by 3 and by 9 : ");
        Array<Integer> resultNumbers = printNumbersThatAreDivisibleByThreeAndNine(array);
        if (resultNumbers.getArray().length == 0) {
            System.out.print("There are no such numbers.");
        } else {
            Arrays.stream(resultNumbers.getArray()).forEachOrdered(value -> System.out.print(value + " "));
        }

    }

    private static Array<Integer> printNumbersThatAreDivisibleByThreeAndNine(Array<Integer> array) {
        List<Integer> integerList = new ArrayList<>();
        Arrays.stream(array.getArray()).forEachOrdered(value -> {
            if ((value % 3 == 0) && (value % 9 == 0)) {
                integerList.add(value);
            }
        });
        return new CreatorOfArrayModels<>(new FactoryOfIntegerArrayModels()).create(integerList.toArray(new Integer[integerList.size()]));
    }

}
