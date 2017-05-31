package com.lugowoy.tasks.arrays.insertAnIntegerInTheSequencePositionWithoutViolatingTheIncrease;

import com.lugowoy.util.filling.Fillable;
import com.lugowoy.util.filling.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 11.03.2017. */

public class Main {

    private static final Fillable<Integer> FILLABLE = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        Numbers<Integer> numbers = new Numbers<>();
        numbers.setArray(FILLABLE.fillArray(new Integer[20]));

        System.out.println("Original sequence : ");
        Arrays.stream(numbers.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        System.out.println("Sorted sequence : ");
        Sortable<Integer> sortable = Sortable::sortingIntegerSequence;
        sortable.sort(numbers.getArray());
        Arrays.stream(numbers.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        System.out.println("Enter numbers to insert : ");
        ReadingData<Integer> reading = new ReadingData<>(new ReadingUserInputData()::readInt);
        int insertNumber = reading.read();
        System.out.println();

        System.out.println("Result sequence : ");
        Insertable<Integer> insertable = Insertable::insertElement;
        insertable.insert(insertNumber, numbers);
        Arrays.stream(numbers.getArray()).forEachOrdered(integer -> System.out.print(integer + " "));
    }
}
