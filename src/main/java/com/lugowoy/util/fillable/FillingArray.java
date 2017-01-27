package com.lugowoy.util.fillable;

import com.lugowoy.util.reading.ReadableUserInputData;
import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

/**
 * Created by Konstantin on 04-Dec-16.
 */

public class FillingArray<T> implements FillableArrayInt<T>, FillableArrayDouble<T> {

    @Override
    public double[] fillArrayDoubleNumbers(double[] arrayDouble) {
        /*
        * Local variable "number" takes an integer value that the user enters into the console.
        * */
        double doubleNumber;
        /*
        * A local variable "arrayLength" is needed to determine the number of elements in the array of filled.
        * */
        int arrayLength = 0;

        System.out.println("To exit, enter : 'stop'.");

        /*
        * Iterate over the array of elements to fill the integer array.
        * */
        for (int i = 0; i <= arrayDouble.length; i++) {
            /*
            * It compares the value of a variable "arrayLength" with the value of the array size.
            * If the values are equal, the size of the array is incremented.
            * */
            if (arrayLength == arrayDouble.length)
                arrayDouble = this.increaseSizeOfTheArray(arrayDouble);

            System.out.println("Enter the number : ");
            //Readable the values entered by the user.
            try {
                Reading<Double> reading = new ReadingUserInputData()::readDouble;
                doubleNumber = reading.reading();
                arrayDouble[i] = doubleNumber;
            } catch (StoppingEnterValueException e) {
                break;
            }


            /*
            * If the value of a variable "number"(the value entered by the user) equal to -1.
            * Get out of the loop. The filling of the array is completed.
            * */
            /*if (doubleNumber == -1) {
                break;*/
            /*} else {*///Otherwise assign a value entered by the user to assign an array element.
               /* arrayDouble[i] = doubleNumber;
            }*/
            /*
            * At each iteration of the loop, the variable is incremented by one,
             * in order to determine how many elements in the array is filled.
            * */
            arrayLength++;
        }
        /*
        * Returns an object class "Numbers" that contains an array of filled.
        * */
        return arrayDouble;
    }

    /*
    * Private method for extending an array of dimension per unit.
    * The method receives the parameter "numbers" array,
    * on the basis of which will be the expansion of the size of the array by one.
    * */
    private double[] increaseSizeOfTheArray(double[] arrayDouble) {
        /*
        * Instantiate integer array whose size is equal to the array("numbers") of arguments passed and increased by one.
        * */
        double[] doubles = new double[arrayDouble.length + 1];
        /*
        * Using a class method (static native) System.arrayCopy(Object src,  int  srcPos,
                                                                Object dest, int destPos,
                                                                             int length),
        * make a copy of all the elements of the array of arguments passed to a local instance of the integer array.
        * */
        System.arraycopy(arrayDouble, 0, doubles, 0, arrayDouble.length);

        /*
        * Method returns a reference to an array which is larger by one
        * and contains all the elements of the array elements is copied.
        * */
        return doubles;
    }


    @Override
    public int[] fillArrayIntNumbers(int[] arrayInt) {
        /*
        * Local variable "number" takes an integer value that the user enters into the console.
        * */
        int number;
        /*
        * A local variable "arrayLength" is needed to determine the number of elements in the array of filled.
        * */
        int arrayLength = 0;

        System.out.println("To exit, enter : -1");

        /*
        * Iterate over the array of elements to fill the integer array.
        * */
        for (int i = 0; i <= arrayInt.length; i++) {
            /*
            * It compares the value of a variable "arrayLength" with the value of the array size.
            * If the values are equal, the size of the array is incremented.
            * */
            if (arrayLength == arrayInt.length)
                arrayInt = this.increaseSizeOfTheArray(arrayInt);

            System.out.println("Enter the number : ");
            //Readable the values entered by the user.
            try {
                Reading<Integer> reading = new ReadingUserInputData()::readInt;
                number = reading.reading();
                arrayInt[i] = number;
            } catch (StoppingEnterValueException e) {
                break;
            }

            /*
            * At each iteration of the loop, the variable is incremented by one,
             * in order to determine how many elements in the array is filled.
            * */
            arrayLength++;
        }
        /*
        * Returns an object class "Numbers" that contains an array of filled.
        * */
        return arrayInt;
    }

    /*
    * Private method for extending an array of dimension per unit.
    * The method receives the parameter "numbers" array,
    * on the basis of which will be the expansion of the size of the array by one.
    * */
    private int[] increaseSizeOfTheArray(int[] arrayInt) {
        /*
        * Instantiate integer array whose size is equal to the array("numbers") of arguments passed and increased by one.
        * */
        int[] intsArray = new int[arrayInt.length + 1];
        /*
        * Using a class method (static native) System.arrayCopy(Object src,  int  srcPos,
                                                                Object dest, int destPos,
                                                                             int length),
        * make a copy of all the elements of the array of arguments passed to a local instance of the integer array.
        * */
        System.arraycopy(arrayInt, 0, intsArray, 0, arrayInt.length);

        /*
        * Method returns a reference to an array which is larger by one
        * and contains all the elements of the array elements is copied.
        * */
        return intsArray;
    }
}
