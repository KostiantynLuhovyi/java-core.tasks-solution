package com.lugowoy.tasks.scalarAndVectorProductOfVectors;

import com.lugowoy.helper.factory.creator.CreatorOfArrayModels;
import com.lugowoy.helper.factory.models.array.FactoryOfIntegerArrayModels;
import com.lugowoy.helper.filling.FillingArrayIntegerRandomNumbers;
import com.lugowoy.helper.models.arrays.Array;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 14.11.2017. */

public class Main {

    private static final CreatorOfArrayModels<Integer> CREATOR = new CreatorOfArrayModels<>(new FactoryOfIntegerArrayModels());

    private static final int LENGTH_ARRAY = 5;
    private static final int MIN_BOUND = -5;
    private static final int MAX_BOUND = 5;

    public static void main(String[] args) {

        Array<Integer> firstArray = CREATOR.create(new FillingArrayIntegerRandomNumbers().fill(LENGTH_ARRAY, MIN_BOUND, MAX_BOUND));
        System.out.println("First array : " + firstArray);
        Array<Integer> secondArray = CREATOR.create(new FillingArrayIntegerRandomNumbers().fill(LENGTH_ARRAY, MIN_BOUND, MAX_BOUND));
        System.out.println("Second array : " + secondArray);

        Array<Integer> vectorProductOfVectors = CREATOR.create(LENGTH_ARRAY);

        double resultScalarProductOfVectors = 0;

        System.out.println();
        System.out.println("Result of vector product of vectors : ");
        for (int i = 0; i < LENGTH_ARRAY; i++) {
            resultScalarProductOfVectors += firstArray.getArray()[i] * secondArray.getArray()[i];
            vectorProductOfVectors.getArray()[i] = firstArray.getArray()[(i + 1) % 3] * secondArray.getArray()[(i + 2) % 3]
                                                        - firstArray.getArray()[(i + 2) % 3] * secondArray.getArray()[(i + 1) % 3];
        }

        System.out.println(Arrays.toString(vectorProductOfVectors.getArray()));
        System.out.println("Result of scalar product of vectors : " + resultScalarProductOfVectors);

    }

}
