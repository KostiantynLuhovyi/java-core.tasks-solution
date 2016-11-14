package com.lugowoy.tasks.core.first;

import com.lugowoy.util.reading.Reading;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Konstantin on 07.11.2016.
 */
public class MainFirst {
    /*Constants for selection, program execution method.*/
    private static final int USER_ENTER_NUMBERS = 1;
    private static final int RANDOM_ENTER_NUMBERS = 2;
    private static final int EXIT = 3;

    /*The instance class.*/
    private static ComparingNumbers comparingNumbers = new ComparingNumbers();
    private static Reading reading = new Reading();

    public static void main(String[] args) throws IOException {

        NumbersForComparison numbersForComparison;

        /*The program is run in an infinite loop(true) do-while.*/
        do {
            System.out.println("User enter three integers numbers(signed and unsigned), press - \"1\".");
            System.out.println("Random enter three integers numbers(signed and unsigned), press - \"2\".");
            System.out.println("To exit, press - \"3\".");
            System.out.println("Make a choice : ");
            /*Local variable statusChoice it takes the value entered by the user to identify how the program will be carried out.*/
            int statusChoice = getCorrectStatusChoice();
            switch (statusChoice) {
                /* If statusChoice = 1, the user enters the number for comparison.*/
                case USER_ENTER_NUMBERS:
                    numbersForComparison = new NumbersForComparison();
                    System.out.println("Enter the first value : ");
                    numbersForComparison.setFirstNumber(reading.readInt());
                    System.out.println("Enter the second value : ");
                    numbersForComparison.setSecondNumber(reading.readInt());
                    System.out.println("Enter the third value : ");
                    numbersForComparison.setThirdNumber(reading.readInt());
                    comparingNumbers.compareNumbers(numbersForComparison);
                    break;
                case RANDOM_ENTER_NUMBERS:
                    /*If statusChoice = 2, the generated random number for comparison.*/
                    numbersForComparison = new NumbersForComparison();
                    numbersForComparison.setFirstNumber(reading.readRandomInt());
                    numbersForComparison.setSecondNumber(reading.readRandomInt());
                    numbersForComparison.setThirdNumber(reading.readRandomInt());
                    comparingNumbers.compareNumbers(numbersForComparison);
                    break;
                    /*If statusChoice = 3, to EXIT program.*/
                case EXIT:
                    return;
                default:
                    break;
            }
        } while (true);
    }

    /*
    * The method of reading user input to determine the progress of the program.
    * */
    private static int getCorrectStatusChoice() {
        int statusChoice = 0;
        String description = "Enter a number from 1 to 3\n";
        String inputValue = new Reading().readLine();
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

    /*
    * Check that the number of 1 to 3.
    * */
    private static boolean isCorrectRange(int value) {
        return ((value > 0) && (value < 4));
    }

    /*Check that the entries are numbers.*/
    private static boolean isDigit(String inputValue) {
        boolean statusDigit = false;
        if (inputValue.matches("\\d")) {
            statusDigit = true;
        }
        return statusDigit;
    }

}
