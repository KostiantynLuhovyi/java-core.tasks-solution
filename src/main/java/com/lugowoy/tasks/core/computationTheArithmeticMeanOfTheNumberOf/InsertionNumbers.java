package com.lugowoy.tasks.core.computationTheArithmeticMeanOfTheNumberOf;

import com.lugowoy.util.reading.Reading;

/**
 * Created by Konstantin on 14.11.2016.
 */

/*
* Class "InsertionNumbers" implements input numbers.
* The generalized type is represented by a class type "Numbers".
* */
class InsertionNumbers implements Insertion<Numbers> {

    /*
    * A class variable (constant) for reading user input.
    * */
    private static final Reading READING = new Reading();

    /*
    * Implementation of an abstract method to fill an array of numbers.
    * The method returns an object of class "Numbers".
    * The method takes the parameter object of the type class "Numbers".
    * */
    @Override
    public Numbers enterNumbers(Numbers numbers) {
        /*
        * Local variable "number" takes an integer value that the user enters into the console.
        * */
        int number = 0;
        /*
        * A local variable "arrayLength" is needed to determine the number of elements in the array of filled.
        * */
        int arrayLength = 0;

        System.out.println("To exit, enter : -1");

        /*
        * Iterate over the array of elements to fill the integer array.
        * */
        for (int i = 0; i <= numbers.getNumbers().length; i++) {
            /*
            * It compares the value of a variable "arrayLength" with the value of the array size.
            * If the values are equal, the size of the array is incremented.
            * */
            if (arrayLength == numbers.getNumbers().length)
                numbers.setNumbers(this.increaseSizeOfTheArray(numbers.getNumbers()));

            System.out.println("Enter the number : ");
            //Reading the values entered by the user.
            number = READING.readInt();

            /*
            * If the value of a variable "number"(the value entered by the user) equal to -1.
            * Get out of the loop. The filling of the array is completed.
            * */
            if (number == -1) {
                break;
            } else {//Otherwise assign a value entered by the user to assign an array element.
                numbers.getNumbers()[i] = number;
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
        return numbers;
    }


    /*
    * Private method for extending an array of dimension per unit.
    * The method receives the parameter "numbers" array,
    * on the basis of which will be the expansion of the size of the array by one.
    * */
    private int[] increaseSizeOfTheArray(int[] numbers) {
        /*
        * Instantiate integer array whose size is equal to the array("numbers") of arguments passed and increased by one.
        * */
        int[] intsArray = new int[numbers.length + 1];
        /*
        * Using a class method (static native) System.arrayCopy(Object src,  int  srcPos,
                                                                Object dest, int destPos,
                                                                             int length),
        * make a copy of all the elements of the array of arguments passed to a local instance of the integer array.
        * */
        System.arraycopy(numbers, 0, intsArray, 0, numbers.length);

        /*
        * Method returns a reference to an array which is larger by one
        * and contains all the elements of the array elements is copied.
        * */
        return intsArray;
    }
}
