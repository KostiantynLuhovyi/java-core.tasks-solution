package com.lugowoy.tasks.algorithms.searching.findGreatestCommonDivisorOfEnteredNumbers;

import com.lugowoy.helper.factory.creator.CreatorOfArrayModels;
import com.lugowoy.helper.factory.models.array.FactoryOfIntegerArrayModels;
import com.lugowoy.helper.filling.FillingArrayIntegerUserInputNumbers;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;
import com.lugowoy.helper.util.DeterminatorSizeOfArray;

/** Created by Konstantin Lugowoy on 16.07.2017. */

public class Main {

    private static final FindableGreatestCommonDivisor FINDER = new FinderGreatestCommonDivisor();

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("The greatest common divisor of a set of numbers, enter 1 .");
        System.out.println("The greatest common divisor of two numbers, enter 2 . ");
        System.out.println("Make your choice : ");

        while (true) {
            int selection = reader.readInt();
            if (selection == 1) {
                int sizeArray = DeterminatorSizeOfArray.determineSizeOfArray();
                System.out.println("Enter numbers : ");
                Array<Integer> numbers = new CreatorOfArrayModels<>(
                                                new FactoryOfIntegerArrayModels()).create(
                                                        new FillingArrayIntegerUserInputNumbers().fill(sizeArray));
                System.out.println("Greatest common divisor of numbers : " + FINDER.findGreatestCommonDivisorOfEnteredNumbers(numbers));
                break;
            } else if (selection == 2) {
                System.out.println("Enter first number : ");
                int firstNumber = reader.readInt();
                System.out.println("Enter second number : ");
                int secondNumber = reader.readInt();
                System.out.println("Greatest common divisor of numbers : " + FINDER.findGreatestCommonDivisorOfEnteredNumbers(firstNumber, secondNumber));
                break;
            } else {
                System.out.println("Incorrect selection value. Re-enter value : ");
            }
        }

    }


}
