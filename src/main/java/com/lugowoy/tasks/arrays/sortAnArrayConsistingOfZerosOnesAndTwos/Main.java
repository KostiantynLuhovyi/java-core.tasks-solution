package com.lugowoy.tasks.arrays.sortAnArrayConsistingOfZerosOnesAndTwos;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingUserInputSizeOfTheArray;

/** Created by Konstantin Lugowoy on 17.06.2017. */

public class Main {

    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();
    private static FillingArray<Integer> filling = new FillingArrayOfRandomNumber<>();

    public static void main(String[] args) {

        int sizeArray = ReadingUserInputSizeOfTheArray.enterUserInputForSizeOfTheArray();

        Array<Integer> array = creator.create(filling.fillArray(new int[sizeArray], 3));

        System.out.println("Original " + array);

        Sortable<Array<Integer>> sortable = Sortable::sortArray;
        sortable.sort(array);

        System.out.println("After sort " + array);

    }

}
