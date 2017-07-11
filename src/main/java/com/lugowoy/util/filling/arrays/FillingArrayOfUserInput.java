package com.lugowoy.util.filling.arrays;

import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.StoppingEnterValueException;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

/**Created by Konstantin Lugowoy on 15-Feb-17.*/

public class FillingArrayOfUserInput<T extends Number> extends FillingArray<T> {

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
                try {
                    tArray[i] = super.getReadingData().read();
                    arrayLength++;
                } catch (StoppingEnterValueException ex) {
                    tArray = Arrays.copyOf(tArray, arrayLength);
                    break;
                }
            }
        } else {
            System.out.println("Incorrect value for the array.");
            System.out.println("The array must not be equal to null.");
        }
        return tArray;
    }

    @Override
    public int[] fillArray(int[] intArray) {
        Integer[] tmpIntegersArray = (Integer[]) Arrays.stream(intArray).boxed().toArray();
        tmpIntegersArray = (Integer[]) this.fillArray((T[]) tmpIntegersArray);
        return Arrays.stream(tmpIntegersArray).mapToInt(Integer::intValue).toArray();
    }

    @Override
    public double[] fillArray(double[] doubleArray) {
        Double[] tmpDoublesArray = (Double[]) Arrays.stream(doubleArray).boxed().toArray();
        tmpDoublesArray = (Double[]) this.fillArray((T[]) tmpDoublesArray);
        return Arrays.stream(tmpDoublesArray).mapToDouble(Double::doubleValue).toArray();
    }

    private T[] increaseSizeOfTheArray(T[] t) {
        return copyOf(t, t.length + 1);
    }
}
