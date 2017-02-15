package com.lugowoy.tasks.arrays.findTheSumOfAnArrayOfMultipleElementsToThisPresent;

import com.lugowoy.util.fillable.FillableArray;
import com.lugowoy.util.fillable.FillingArrayOfUserInput;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

/**Created by Konstantin Lugowoy on 12-Feb-17.*/

public class Main {

    private static final FindingSumElements FINDING_SUM_ELEMENTS = numbers -> {
        int sumElements = 0;
        for (int i = 0; i < numbers.getSourceArray().length; i++) {
            if (numbers.getSourceArray()[i] != null) {
                if (numbers.getSourceArray()[i] % numbers.getPresentK() == 0) {
                    sumElements += numbers.getSourceArray()[i];
                }
            }
        }
        return sumElements;
    };

    private static final FillableArray<Integer> INTEGER_FILLABLE_ARRAY = new FillingArrayOfUserInput<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) throws StoppingEnterValueException {

        Integer[] integers = INTEGER_FILLABLE_ARRAY.fillArray(new Integer[20]);

        Numbers numbers = new Numbers();
        numbers.setSourceArray(integers);

        System.out.println("Result fill arrays randomly integers : ");
        for (int i = 0; i < numbers.getSourceArray().length; i++) {
            if (numbers.getSourceArray()[i] != null) {
                System.out.print(numbers.getSourceArray()[i] + " ");
            }
        }
        System.out.println();

        System.out.println("Enter K number : ");
        numbers.setPresentK(new ReadingUserInputData().readInt());

        numbers.setResultOfSumNumbersOfMultipleElement(FINDING_SUM_ELEMENTS.getSumElements(numbers));

        System.out.println("Result : " + numbers.getResultOfSumNumbersOfMultipleElement());
    }
}
