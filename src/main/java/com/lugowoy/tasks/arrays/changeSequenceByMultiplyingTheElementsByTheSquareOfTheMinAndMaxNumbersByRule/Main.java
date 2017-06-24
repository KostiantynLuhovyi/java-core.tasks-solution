package com.lugowoy.tasks.arrays.changeSequenceByMultiplyingTheElementsByTheSquareOfTheMinAndMaxNumbersByRule;

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

        Findable<Integer> findable = Findable::findMinNumber;
        int squareMinNumberInTheSequence = (int) Math.pow(findable.find(array), 2);
        System.out.println("Square min number in the sequence is " + squareMinNumberInTheSequence + " .");

        findable = Findable::findMaxNumber;
        int squareMaxNumberInTheSequence = (int) Math.pow(findable.find(array), 2);
        System.out.println("Square max number in the sequence is " + squareMaxNumberInTheSequence + " .");

        CHANGEABLE.change(array, squareMinNumberInTheSequence, squareMaxNumberInTheSequence);

        System.out.println("Result sequence after changing : " + array);
        System.out.println();

    }

}
