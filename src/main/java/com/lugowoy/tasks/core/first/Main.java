package com.lugowoy.tasks.core.first;

import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Konstantin on 07.11.2016.
 */
public class Main {
    private static final int USER_ENTER_NUMBERS = 1;
    private static final int RANDOM_ENTER_NUMBERS = 2;
    private static final int EXIT = 3;

    private static ComparingNumbers comparingNumbers = new ComparingNumbers();
    private static InputNumber inputNumber = new InputNumber();

    public static void main(String[] args) throws IOException {

        System.out.println("User enter three integers numbers(signed and unsigned), press - \"1\".");
        System.out.println("Random enter three integers numbers(signed and unsigned), press - \"2\".");
        System.out.println("To exit, press - \"3\".");


        NumbersForComparison numbersForComparison;
        do {
            int statusChoice = new Scanner(System.in).nextInt();
            switch (statusChoice) {
                case USER_ENTER_NUMBERS:
                    numbersForComparison = new NumbersForComparison();
                    numbersForComparison.setFirstNumber(inputNumber.getEnterValue());
                    numbersForComparison.setSecondNumber(inputNumber.getEnterValue());
                    numbersForComparison.setThirdNumber(inputNumber.getEnterValue());
                    comparingNumbers.compareNumbers(numbersForComparison);
                    break;
                case RANDOM_ENTER_NUMBERS:
                    numbersForComparison = new NumbersForComparison();
                    numbersForComparison.setFirstNumber(inputNumber.getRandomValue());
                    numbersForComparison.setSecondNumber(inputNumber.getRandomValue());
                    numbersForComparison.setThirdNumber(inputNumber.getRandomValue());
                    comparingNumbers.compareNumbers(numbersForComparison);
                    break;
                case EXIT:
                    return;
                default:
                    break;
            }

        } while (true);

    }
}
