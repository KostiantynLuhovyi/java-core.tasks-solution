package com.lugowoy.tasks.core.computationTheArithmeticMeanOfTheNumberOf;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.factory.creating.arrays.CreatorArraysOfObjects;
import com.lugowoy.util.filling.Fillable;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.filling.arrays.FillingArrayOfUserInput;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;

/**Created by Konstantin Lugowoy on 03-Dec-16.*/

public class Main {

    private static FillingArray<Double> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readDouble);
    private static CreatorArray<Double> creator = new CreatorArraysOfObjects<>();

    public static void main(String[] args) {

        Array<Double> array = creator.create(fillArray.fillArray(new Double[2]));

        Double[] doubleNumbers = new Double[2];

        for (int i = 0; i < array.getArray().length; i++) {
            System.out.println(array.getArray()[i]);
        }

        ComputationArithmeticMeanNumbers arithmeticMeanNumbers = new ComputationArithmeticMeanNumbers();

        double resultComputationArithmeticMeanNumber = arithmeticMeanNumbers.computationArithmeticMeanNumber(array.getArray());

        System.out.printf("The arithmetic mean of the entered real numbers equals %f", resultComputationArithmeticMeanNumber);

    }

}
