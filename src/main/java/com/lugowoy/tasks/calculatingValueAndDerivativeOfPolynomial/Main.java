package com.lugowoy.tasks.calculatingValueAndDerivativeOfPolynomial;

import com.lugowoy.helper.factory.creator.CreatorOfArrayModels;
import com.lugowoy.helper.factory.models.array.FactoryOfIntegerArrayModels;
import com.lugowoy.helper.filling.FillingArrayIntegerRandomNumbers;
import com.lugowoy.helper.models.arrays.Array;

/** Created by Konstantin Lugowoy on 14.11.2017. */

public class Main {

    private static final CreatorOfArrayModels<Integer> CREATOR = new CreatorOfArrayModels<>(new FactoryOfIntegerArrayModels());
    private static final int LENGTH_ARRAY = 5;
    private static final int MIN_BOUND = -5;
    private static final int MAX_BOUND = 5;

    public static void main(String[] args) {

        Array<Integer> polynomialCoefficients = CREATOR.create(new FillingArrayIntegerRandomNumbers().fill(LENGTH_ARRAY, MIN_BOUND, MAX_BOUND));
        System.out.println(polynomialCoefficients);

        Array<Integer> derivativeCoefficients = CREATOR.create(LENGTH_ARRAY - 1);

        double resultPolynomial = 0;
        double resultDerivative = 0;

        double argument = 2.0;
        double factor = 1;

        for(int i = 0; i < derivativeCoefficients.getArray().length; i++){
            resultPolynomial += polynomialCoefficients.getArray()[i] * factor;
            derivativeCoefficients.getArray()[i] = (i + 1) * polynomialCoefficients.getArray()[i + 1];
            resultDerivative += derivativeCoefficients.getArray()[i] * factor;
            factor *= argument;
        }
        resultPolynomial += polynomialCoefficients.getArray()[polynomialCoefficients.getArray().length - 1] * factor;

        System.out.println();
        System.out.println("Result polynomial : " + resultPolynomial);
        System.out.println("Result derivative : " + resultDerivative);

    }

}

