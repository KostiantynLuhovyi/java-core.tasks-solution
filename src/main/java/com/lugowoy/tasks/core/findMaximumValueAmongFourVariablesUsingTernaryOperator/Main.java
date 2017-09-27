package com.lugowoy.tasks.core.findMaximumValueAmongFourVariablesUsingTernaryOperator;

import com.lugowoy.helper.factory.creator.CreatorOfArrayModels;
import com.lugowoy.helper.factory.models.array.FactoryOfIntegerArrayModels;
import com.lugowoy.helper.filling.FillingArrayIntegerRandomNumbers;
import com.lugowoy.helper.models.arrays.Array;

/** Created by Konstantin Lugowoy on 27.09.2017. */

public class Main {

    private static final int LENGTH_ARRAY = 4;
    private static final int MIN_BOUND = -20;
    private static final int MAX_BOUND = 20;

    public static void main(String[] args) {

        Array<Integer> array = new CreatorOfArrayModels<>(
                new FactoryOfIntegerArrayModels()).create(
                new FillingArrayIntegerRandomNumbers().fill(LENGTH_ARRAY, MIN_BOUND, MAX_BOUND));


        System.out.println(array.toString());

        int resultValue = findMaximumValueAmongFourVariablesUsingTernaryOperator(array);

        System.out.println(resultValue);

    }

    private static int findMaximumValueAmongFourVariablesUsingTernaryOperator(Array<Integer> array) {
        boolean checkValue;
        int resultValue = 0;
        int countCheckValue = 0;
        for (int i = 0; i < array.getArray().length; i++) {
            for (int j = 0; j < array.getArray().length; j++) {
                checkValue = array.getArray()[i] >= array.getArray()[j] ? true : false;
                if (checkValue) {
                    resultValue = array.getArray()[i];
                    countCheckValue++;
                } else {
                    resultValue = 0;
                    countCheckValue = 0;
                    break;
                }
            }
            if (countCheckValue == 4) {
                break;
            }
        }
        return resultValue;
    }

}
