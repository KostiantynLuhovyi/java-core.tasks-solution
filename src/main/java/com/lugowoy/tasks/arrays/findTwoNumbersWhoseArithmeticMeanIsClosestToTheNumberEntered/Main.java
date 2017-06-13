package com.lugowoy.tasks.arrays.findTwoNumbersWhoseArithmeticMeanIsClosestToTheNumberEntered;

import com.lugowoy.util.EnteringTheSizeOfTheArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfDoublePrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.math.BigDecimal;
import java.util.Arrays;

/** Created by Konstantin Lugowoy on 12.04.2017. */

public class Main {

    private static FillingArray<Double> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readDouble);
    private static CreatorArray<Double> creator = new CreatorArrayOfDoublePrimitives();
    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);

    private static EnteringTheSizeOfTheArray<Integer> enterUserValueForSizeOfTheArray = EnteringTheSizeOfTheArray::enterUserInputForSizeOfTheArray;

    public static void main(String[] args) {

        int sizeArray = enterUserValueForSizeOfTheArray.enter(readingData);

        Array<Double> array = creator.create(fillArray.fillArray(new double[sizeArray], 0, 200));


        System.out.println("Original array : " + array);
        System.out.println();

        System.out.println("Enter real number : ");
        double enterNumber = new ReadingUserInputData().readDouble();

        Findable<Double, Array<Double>> findable = Findable::findTwoNumbersWhoseArithmeticMeanIsClosestToTheNumber;
        findable.find(enterNumber, array);

    }

}
