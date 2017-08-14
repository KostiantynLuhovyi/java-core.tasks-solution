package com.lugowoy.tasks.algorithms.searching.findLeastCommonMultipleOfEnteredNumbers;

import com.lugowoy.helper.factory.creator.CreatorOfArrayModels;
import com.lugowoy.helper.factory.models.array.FactoryOfIntegerArrayModels;
import com.lugowoy.helper.filling.FillingArrayIntegerUserInputNumbers;
import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;
import com.lugowoy.helper.util.DeterminatorSizeOfArray;

/** Created by Konstantin Lugowoy on 13.08.2017. */

public class Main {

    private static final FindableLeastCommonMultiple FINDER = new FinderLeastCommonMultiple();

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("The least common multiple of a set of numbers, enter 1 .");
        System.out.println("The least common multiple of two numbers, enter 2 . ");
        System.out.println("Make your choice : ");

        while (true) {
            int selection;
            selection = reader.readInt();
            if (selection == 1) {
                int sizeArray = DeterminatorSizeOfArray.determineSizeOfArray();
                System.out.println("Enter numbers : ");
                Array<Integer> numbers = new CreatorOfArrayModels<>(new FactoryOfIntegerArrayModels()).create(new FillingArrayIntegerUserInputNumbers().fill(sizeArray));
                System.out.println("Least common multiple of numbers : " + FINDER.findLeastCommonMultipleOfEnteredNumbers(numbers));
                break;
            } else if (selection == 2) {
                System.out.println("Enter first number : ");
                int firstNumber = reader.readInt();
                System.out.println("Enter second number : ");
                int secondNumber = reader.readInt();
                System.out.println("Least common multiple of numbers : " + FINDER.findLeastCommonMultipleOfEnteredNumbers(firstNumber, secondNumber));
                break;
            } else {
                System.out.println("Incorrect selection value. Re-enter value : ");
            }
        }

    }

}
