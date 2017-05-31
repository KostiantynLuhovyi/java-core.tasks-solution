package com.lugowoy.util.filling;

import com.lugowoy.util.reading.Reading;

import static java.util.Arrays.copyOf;

/**Created by Konstantin Lugowoy on 15-Feb-17.*/

public class FillingArrayOfUserInput<T> extends FillableArray<T> {

    public FillingArrayOfUserInput(Reading<T> reading) {
        super(reading);
    }

    @Override
    public T[] fillArray(T[] tArray) {
        if (tArray != null) {
            int arrayLength = 0;
            System.out.println("To exit, enter \'stop\'.");
            for (int i = 0; i <= tArray.length; i++) {
                System.out.println("Enter the number : ");
                if (arrayLength == tArray.length) {
                    tArray = this.increaseSizeOfTheArray(tArray);
                }
                tArray[i] = super.getReading().reading();
                arrayLength++;
            }
        } else {
            throw new NullPointerException("The array must not be equal to null.");
        }
        return tArray;
    }

    private T[] increaseSizeOfTheArray(T[] t) {
        return copyOf(t, t.length + 1);
    }
}
