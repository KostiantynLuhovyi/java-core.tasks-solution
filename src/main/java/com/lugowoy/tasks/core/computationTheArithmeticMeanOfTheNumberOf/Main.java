package com.lugowoy.tasks.core.computationTheArithmeticMeanOfTheNumberOf;

import com.lugowoy.helper.factory.creator.Creator;
import com.lugowoy.helper.factory.creator.CreatorOfArrayModels;
import com.lugowoy.helper.factory.models.array.FactoryOfDoubleArrayModels;
import com.lugowoy.helper.filling.FillingArrayDoubleRandomNumbers;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.util.DeterminatorSizeOfArray;

/**Created by Konstantin Lugowoy on 03-Dec-16.*/

public class Main {

    private static Creator<Array<Double>> creator = new CreatorOfArrayModels<>(new FactoryOfDoubleArrayModels());

    public static void main(String[] args) {

        int sizeOfArray = DeterminatorSizeOfArray.determineSizeOfArray();

        Array<Double> array = ((CreatorOfArrayModels<Double>)creator).create(new FillingArrayDoubleRandomNumbers().fill(sizeOfArray));

        for (int i = 0; i < array.getArray().length; i++) {
            System.out.println(array.getArray()[i]);
        }

        ComputationArithmeticMeanNumbers arithmeticMeanNumbers = new ComputationArithmeticMeanNumbers();

        double resultComputationArithmeticMeanNumber = arithmeticMeanNumbers.computationArithmeticMeanNumber(array.getArray());

        System.out.printf("The arithmetic mean of the entered real numbers equals %f", resultComputationArithmeticMeanNumber);

    }

}
