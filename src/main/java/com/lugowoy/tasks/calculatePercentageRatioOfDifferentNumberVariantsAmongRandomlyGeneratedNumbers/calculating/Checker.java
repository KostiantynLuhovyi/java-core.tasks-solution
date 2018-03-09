package com.lugowoy.tasks.calculatePercentageRatioOfDifferentNumberVariantsAmongRandomlyGeneratedNumbers.calculating;

import com.lugowoy.helper.models.arrays.Array;

public class Checker {

    static <T> boolean checkObjectOfArrayClassNonNull(Array<T> array) {
        boolean resultOfCheck = false;
        try {
            if (array != null) {
                resultOfCheck = true;
            } else {
                throw new IllegalArgumentException(
                        new NullPointerException("The object of Array class by passed to argument is equal null."));
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        return resultOfCheck;
    }

    static <T> boolean checkArrayNonNull(T[] array) {
        boolean resultOfCheck = false;
        try {
            if (array != null) {
                resultOfCheck = true;
            } else {
                throw new IllegalArgumentException(
                        new NullPointerException("The array by passed to argument is equal null."));
            }
        } catch (IllegalArgumentException ex) {
            System.err.println(ex.getMessage());
        }
        return resultOfCheck;
    }

}
