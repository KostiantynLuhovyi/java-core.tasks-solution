package com.lugowoy.tasks.core.computationTheArithmeticMeanOfTheNumberOf;

/**
 * Created by Konstantin on 03-Dec-16.
 */

public class Main {

    private static final InsertionNumbers INSERTION_NUMBERS = new InsertionNumbers();

    public static void main(String[] args) {

        int [] intsNumbers = new int[5];

        Numbers numbers = new Numbers(intsNumbers);

        INSERTION_NUMBERS.enterNumbers(numbers);

        ComputationArithmeticMeanNumbers arithmeticMeanNumbers = new ComputationArithmeticMeanNumbers();

        numbers.setResultArithmeticMeanNumbers(arithmeticMeanNumbers.computationArithmeticMeanNumber(numbers.getNumbers()));

        System.out.println(numbers.getResultArithmeticMeanNumbers());
    }

}
