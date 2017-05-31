package com.lugowoy.tasks.arrays.changeSequenceByMultiplyingTheElementsByTheSquareOfTheMinAndMaxNumbersByRule;

import com.lugowoy.util.filling.Fillable;
import com.lugowoy.util.filling.FillingArrayOfRandomNumber;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.Arrays;

/** Created by Konstantin Lugowoy on 25.03.2017. */

public class Main {

    private static final Fillable<Integer> FILLABLE = new FillingArrayOfRandomNumber<>(new ReadingRandomData()::readInt);

    private static final Changeable<Sequence, Integer> CHANGEABLE = Changeable::changeSequenceByMultiplyingTheElementsByTheSquareOfTheMinAndMaxNumberByRule;

    public static void main(String[] args) {

        Sequence<Integer> sequence = new Sequence<>(FILLABLE.fillArray(new Integer[20]));

        System.out.println("Original sequence : ");
        Arrays.stream(sequence.getSequence()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

        Findable<Integer> findable = Findable::findMinNumber;
        int squareMinNumberInTheSequence = (int) Math.pow(findable.find(sequence), 2);
        System.out.println("Square min number in the sequence is " + squareMinNumberInTheSequence + " .");
        findable = Findable::findMaxNumber;
        int squareMaxNumberInTheSequence = (int) Math.pow(findable.find(sequence), 2);
        System.out.println("Square max number in the sequence is " + squareMaxNumberInTheSequence + " .");

        CHANGEABLE.change(sequence, squareMinNumberInTheSequence, squareMaxNumberInTheSequence);

        System.out.println("Result sequence after changing : ");
        Arrays.stream(sequence.getSequence()).forEachOrdered(integer -> System.out.print(integer + " "));
        System.out.println();

    }
}
