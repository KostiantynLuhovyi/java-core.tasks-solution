package com.lugowoy.tasks.core.cyclicallyShiftTheDigitsOfFiveDigitNumber;

/** Created by Konstantin Lugowoy on 06.03.2017. */

@FunctionalInterface
public interface Shiftable<T> {

    void shift(T t);

}
