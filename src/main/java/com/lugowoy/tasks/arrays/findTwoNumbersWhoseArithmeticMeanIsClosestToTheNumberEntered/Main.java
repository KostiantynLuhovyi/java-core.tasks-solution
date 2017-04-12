package com.lugowoy.tasks.arrays.findTwoNumbersWhoseArithmeticMeanIsClosestToTheNumberEntered;

import com.lugowoy.util.reading.ReadingUserInputData;

import java.math.BigDecimal;
import java.util.Arrays;

/** Created by Konstantin Lugowoy on 12.04.2017. */

public class Main {

    public static void main(String[] args) {

        Double[] doubles = Arrays.stream(new double[20]).map(value -> new BigDecimal(Math.abs(Math.random() * 200)).setScale(2, BigDecimal.ROUND_HALF_DOWN).doubleValue())
                                                        .boxed()
                                                        .toArray(Double[]::new);

        Array<Double> array = new Array<>(doubles);

        System.out.println("Original array : ");
        Arrays.stream(array.getArray()).forEachOrdered(valueDouble -> System.out.print(valueDouble + " "));
        System.out.println();

        System.out.println("Enter real number : ");
        double enterNumber = new ReadingUserInputData().readDouble();

        Findable<Double, Array<Double>> findable = Findable::findTwoNumbersWhoseArithmeticMeanIsClosestToTheNumber;
        findable.find(enterNumber, array);

    }

}
