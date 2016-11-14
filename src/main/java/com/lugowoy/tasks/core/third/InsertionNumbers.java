package com.lugowoy.tasks.core.third;

import com.lugowoy.util.reading.Reading;

import java.util.ArrayList;

/**
 * Created by Konstantin on 14.11.2016.
 */
public class InsertionNumbers implements Insertion<Numbers> {

    private static final Reading READING = new Reading();

    @Override
    public Numbers enterNumbers(Numbers numbers) {
        int number = 0;
        System.out.println("To exit, enter : -1");
            int arrayLength = 0;

            for (int i = 0; i <= numbers.getNumbers().length; i++) {
                    System.out.println("Enter the number : ");
                    number = READING.readInt();
                if (number == -1) break;
                if (arrayLength == numbers.getNumbers().length) numbers.setNumbers(this.increaseSizeOfTheArray(numbers));
                    numbers.getNumbers()[i] = number;
                    arrayLength++;
            }

        return numbers;
    }

    private int[] increaseSizeOfTheArray(Numbers numbers) {
        int[] intsArray = new int[numbers.getNumbers().length + 1];
        System.arraycopy(numbers.getNumbers(), 0, intsArray, 0, numbers.getNumbers().length);
        return intsArray;
    }
}
