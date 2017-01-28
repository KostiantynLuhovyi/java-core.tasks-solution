package com.lugowoy.util.fillable;

import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.StoppingEnterValueException;

import static java.util.Arrays.copyOf;

/**
 * Created by Konstantin on 28-Jan-17.
 * @author Konstantin
 * @version 1.1
 * @since 1.1
 *
 * The class implements the functionality (interface "Fillable") to fill an array of values.
 *
 * @see com.lugowoy.util.fillable.Fillable
 */
public class FillableArray<T> implements Fillable<T> {

    /**
     * This field encapsulating functional interface for reading the values entered by the user to be filled with an array.
     * */
    private Reading<T> reading;

    public FillableArray(Reading<T> reading) {
        this.reading = reading;
    }

    /**
    * {@inheritDoc}
    * */
    @Override
    public T[] fillArray(T[] t) throws StoppingEnterValueException {
        if (t != null) {
            int arrayLength = 0;

            System.out.println("To exit, enter \'stop\'.");
            for (int i = 0; i <= t.length; i++) {
                System.out.println("Enter the number : ");
                try {
                    if (arrayLength == t.length) {
                        t = this.increaseSizeOfTheArray(t);
                    }

                    t[i] = reading.reading();

                    arrayLength++;

                } catch (StoppingEnterValueException e) {
                    break;
                }
            }
        } else {
            throw new NullPointerException("The array must not be equal to null.");
        }
        return t;
    }

    /**
    * This method increment array size.
    *
    * @param t The array to increase the size.
    * @return Array dimension is incremented by one.
    * */
    private T[] increaseSizeOfTheArray(T[] t) {
        return copyOf(t, t.length + 1);
    }

    public Reading getReading() {
        return this.reading;
    }
}
