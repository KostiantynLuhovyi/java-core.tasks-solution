package com.lugowoy.tasks.arrays.onedimensional.findTwoNumbersWhoseArithmeticMeanIsClosestToTheNumberEntered;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfDoublePrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

/** Created by Konstantin Lugowoy on 12.04.2017. */

public class Main {

    private static FillingArray<Double> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readDouble);
    private static CreatorArray<Double> creator = new CreatorArrayOfDoublePrimitives();

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Double> array = creator.create(fillArray.fillArray(new double[sizeArray], 0, 200));


        System.out.println("Original array : " + array);
        System.out.println();

        System.out.println("Enter real number : ");
        double enterNumber = new ReadingUserInputData().readDouble();

        Findable<Double, Array<Double>> findable = Findable::findTwoNumbersWhoseArithmeticMeanIsClosestToTheNumber;
        findable.find(enterNumber, array);

    }

}
