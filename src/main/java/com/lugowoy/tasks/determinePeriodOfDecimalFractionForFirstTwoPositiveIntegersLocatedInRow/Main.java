package com.lugowoy.tasks.determinePeriodOfDecimalFractionForFirstTwoPositiveIntegersLocatedInRow;

import com.lugowoy.helper.factory.FactoryArray;
import com.lugowoy.helper.factory.creator.CreatorArrayNumbers;
import com.lugowoy.helper.filling.array.numbers.FillingArrayRandomIntegerNumbers;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.other.ArrayLength;

/** Created by Konstantin Lugowoy on 03.09.2017. */

public class Main {

    private static final int START_BOUND = 0;
    private static final int END_BOUND = 2;

    public static void main(String[] args) {

        int lengthArray = ArrayLength.getLengthArray(new ReadingConsole());

        Array<Integer> array = FactoryArray.getFactoryArray(new CreatorArrayNumbers<Integer>()).create(
                                      new FillingArrayRandomIntegerNumbers().fill(lengthArray, START_BOUND, END_BOUND));

        Determinator determinator = Determinator::determinePeriodOfDecimalFractionForFirstTwoPositiveIntegersLocatedInRow;
        determinator.determine(array);

    }

}
