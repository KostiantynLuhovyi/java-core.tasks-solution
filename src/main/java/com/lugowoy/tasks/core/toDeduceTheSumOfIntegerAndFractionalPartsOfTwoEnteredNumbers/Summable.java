package com.lugowoy.tasks.core.toDeduceTheSumOfIntegerAndFractionalPartsOfTwoEnteredNumbers;

/** Created by Konstantin Lugowoy on 25.03.2017. */

@FunctionalInterface
public interface Summable<T> {

    T summarize(T tFirst, T tSecond);

    static Double summarizeIntegerPartOfTwoNumbers(Double firstNumber, Double secondNumber) {
        return (double) (firstNumber.intValue() + secondNumber.intValue());
    }

    static Double summarizeFractionalPartOfTwoNumbers(Double firstNumber, Double secondNumber) {
        return (firstNumber - firstNumber.intValue()) + (secondNumber - secondNumber.intValue());
    }

}
