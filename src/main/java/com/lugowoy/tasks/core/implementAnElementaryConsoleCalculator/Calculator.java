package com.lugowoy.tasks.core.implementAnElementaryConsoleCalculator;

/** Created by Konstantin Lugowoy on 11.09.2017. */

@FunctionalInterface
public interface Calculator {

    RealNumber calculate(RealNumber firstNumber, RealNumber secondNumber);

}
