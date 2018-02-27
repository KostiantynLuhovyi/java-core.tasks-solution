package com.lugowoy.tasks.defineSecondLargestNumber;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

/**Created by Konstantin Lugowoy on 14.11.2016.*/

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

    public static void main(String[] args) {

        Numbers numbers = new Numbers();

        System.out.println("Enter the first value : ");
        numbers.setFirstNumber(READER.readInt());

        System.out.println("Enter the second value : ");
        numbers.setSecondNumber(READER.readInt());

        System.out.println("Enter the third value : ");
        numbers.setThirdNumber(READER.readInt());

        Computing<Numbers> computing = ComputingSecondLargestNumber::computeSecondLargestNumber;
        computing.coumpute(numbers);

    }

}
