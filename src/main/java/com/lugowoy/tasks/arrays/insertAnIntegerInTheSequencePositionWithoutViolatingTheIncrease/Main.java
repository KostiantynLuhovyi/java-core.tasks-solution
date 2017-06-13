package com.lugowoy.tasks.arrays.insertAnIntegerInTheSequencePositionWithoutViolatingTheIncrease;

import com.lugowoy.util.factory.creating.arrays.CreatorArray;
import com.lugowoy.util.factory.creating.arrays.CreatorArrayOfIntegerPrimitives;
import com.lugowoy.util.filling.Fillable;
import com.lugowoy.util.filling.arrays.FillingArray;
import com.lugowoy.util.filling.arrays.FillingArrayOfRandomNumber;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 11.03.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creator = new CreatorArrayOfIntegerPrimitives();
    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) {

        System.out.println("Enter a value for the size of the array : ");
        int sizeArray = readingData.read();

        Array<Integer> array = creator.create(fillArray.fillArray(new int[sizeArray]));

        System.out.println("Original sequence : ");
        Arrays.stream(array.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        System.out.println("Sorted sequence : ");
        Sortable<Integer> sortable = Sortable::sortingIntegerSequence;
        sortable.sort(array.getArray());
        Arrays.stream(array.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        System.out.println("Enter numbers to insert : ");
        ReadingData<Integer> reading = new ReadingData<>(new ReadingUserInputData()::readInt);
        int insertNumber = reading.read();
        System.out.println();

        System.out.println("Result sequence : ");
        Insertable<Integer> insertable = Insertable::insertElement;
        insertable.insert(insertNumber, array);
        Arrays.stream(array.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
    }

}
