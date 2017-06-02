package com.lugowoy.tasks.arrays.convertTheSecondSequenceAccordingToTheRuleDefinedByTheFirstSequence;

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

/** Created by Konstantin Lugowoy on 25.03.2017. */

public class Main {

    private static FillingArray<Integer> fillArray = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);
    private static CreatorArray<Integer> creatorArray = new CreatorArrayOfIntegerPrimitives();
    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);

    private static final Convertable<Integer> CONVERTABLE = Convertable::convertSecondSequenceAccordingToTheRuleDefinedByTheFirstSequence;

    public static void main(String[] args) {

        System.out.println("Enter a value for the size of the first array : ");
        int sizeFirstArray = readingData.read();
        Array<Integer> firstArray = creatorArray.create(new int[sizeFirstArray]);
        System.out.println("Original first sequence : ");
        Arrays.stream(firstArray.getArrayOfIntegerPrimitives()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        System.out.println("Enter a value for the size of the first array : ");
        int sizeSecondArray = readingData.read();
        Array<Integer> secondArray = creatorArray.create(new int[sizeSecondArray]);
        System.out.println("Original second sequence : ");
        Arrays.stream(secondArray.getArrayOfIntegerPrimitives()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        CONVERTABLE.convert(firstArray, firstArray);

        System.out.println("Result second sequence after converting : ");
        Arrays.stream(secondArray.getArrayOfIntegerPrimitives()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

    }
}
