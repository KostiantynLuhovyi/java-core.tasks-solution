package com.lugowoy.tasks.core.identifyTwoIdenticalNumbers;

import com.lugowoy.helper.generating.GeneratorDataRandomInteger;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

import java.io.IOException;

/**Created by Konstantin Lugowoy on 07.11.2016.*/

public class Main {

    private static final int USER_ENTER_NUMBERS = 1;
    private static final int RANDOM_ENTER_NUMBERS = 2;
    private static final int EXIT = 3;

    private static ComparingNumbers comparingNumbers = new ComparingNumbers();

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) throws IOException {

        NumbersForComparison numbersForComparison;

        do {
            System.out.println("User enter three integers numbers(signed and unsigned), press - \"1\".");
            System.out.println("Random enter three integers numbers(signed and unsigned), press - \"2\".");
            System.out.println("To exit, press - \"3\".");
            System.out.println("Make a choice : ");
            int statusChoice = getCorrectStatusChoice();

            switch (statusChoice) {
                case USER_ENTER_NUMBERS:
                    numbersForComparison = new NumbersForComparison();
                    System.out.println("Enter the first value : ");
                    numbersForComparison.setFirstNumber(reader.readInt());
                    System.out.println("Enter the second value : ");
                    numbersForComparison.setSecondNumber(reader.readInt());
                    System.out.println("Enter the third value : ");
                    numbersForComparison.setThirdNumber(reader.readInt());
                    comparingNumbers.compareNumbers(numbersForComparison);
                    break;
                case RANDOM_ENTER_NUMBERS:
                    numbersForComparison = new NumbersForComparison();
                    numbersForComparison.setFirstNumber(GeneratorDataRandomInteger.generateInt());
                    numbersForComparison.setSecondNumber(GeneratorDataRandomInteger.generateInt());
                    numbersForComparison.setThirdNumber(GeneratorDataRandomInteger.generateInt());
                    comparingNumbers.compareNumbers(numbersForComparison);
                    break;
                case EXIT:
                    return;
                default:
                    break;
            }
        } while (true) ;

    }

    private static int getCorrectStatusChoice() {
        int statusChoice = 0;
        String description = "Enter a number from 1 to 3\n";
        String inputValue = reader.readString();
        if (isDigit(inputValue)) {
            if (isCorrectRange(Integer.parseInt(inputValue))) {
                statusChoice = Integer.parseInt(inputValue);
            } else {
                System.out.println(description);
            }
        } else {
            System.out.println(description);
        }
        return statusChoice;
    }

    private static boolean isCorrectRange(int value) {
        return ((value > 0) && (value < 4));
    }

    private static boolean isDigit(String inputValue) {
        boolean statusDigit = false;
        if (inputValue.matches("\\d")) {
            statusDigit = true;
        }
        return statusDigit;
    }

}
