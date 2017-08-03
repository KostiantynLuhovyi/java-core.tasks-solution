package com.lugowoy.tasks.core.defineTheSecondLargestNumber;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/**Created by Konstantin Lugowoy on 14.11.2016.*/

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        NumbersForComparison numbersForComparison = new NumbersForComparison();
        System.out.println("Enter the first value : ");
        numbersForComparison.setFirstNumber(reader.readInt());

        System.out.println("Enter the second value : ");
        numbersForComparison.setSecondNumber(reader.readInt());

        System.out.println("Enter the third value : ");
        numbersForComparison.setThirdNumber(reader.readInt());
        ComputingSecondLargestNumber computingSecondLargestNumber = new ComputingSecondLargestNumber();
        computingSecondLargestNumber.getSecondLargestNumber(numbersForComparison);

    }

}
