package com.lugowoy.tasks.arrays.onedimensional.changeSequenceByMultiplyingTheElementsByTheSquareOfTheMinAndMaxNumbersByRule;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

/** Created by Konstantin Lugowoy on 25.03.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();

    private static final Changeable<Array<Integer>, Integer> CHANGEABLE = Changeable::changeSequenceByMultiplyingTheElementsByTheSquareOfTheMinAndMaxNumberByRule;

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> array = creator.create(fillArray.fillArray(new Integer[sizeArray]));

        System.out.println("Original sequence : " + array);
        System.out.println();

        int squareMinNumberInTheSequence = getSquareMinNumberInTheSequence(array, Findable::findMinNumber);

        int squareMaxNumberInTheSequence = getSquareMaxNumberInTheSequence(array, Findable::findMaxNumber);

        CHANGEABLE.change(array, squareMinNumberInTheSequence, squareMaxNumberInTheSequence);

        System.out.println();
        System.out.println("Result sequence after changing : " + array);
        System.out.println();

    }

    private static int getSquareMaxNumberInTheSequence(Array<Integer> array, Findable<Integer> findable) {
        int squareMaxNumberInTheSequence = (int) Math.pow(findable.find(array), 2);
        System.out.println("Square max number in the array is " + squareMaxNumberInTheSequence + " .");

        return squareMaxNumberInTheSequence;

    }

    private static int getSquareMinNumberInTheSequence(Array<Integer> array, Findable<Integer> findable) {
        int squareMinNumberInTheSequence = (int) Math.pow(findable.find(array), 2);
        System.out.println("Square min number in the array is " + squareMinNumberInTheSequence + " .");

        return squareMinNumberInTheSequence;

    }

}
