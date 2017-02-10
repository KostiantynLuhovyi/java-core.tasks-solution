package com.lugowoy.tasks.core.calculateTheArithmeticMeanOfTheNumberOf;

import com.lugowoy.util.fillable.Fillable;
import com.lugowoy.util.fillable.FillableArray;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

/**
 * Created by Konstantin Lugowoy on 03-Dec-16.
 *
 * @author Konstantin Lugowoy.
 * @version 1.1
 * @since 03.12.2016
 * <p>
 * This class is required for startup.
 */
public class Main {
    /*
    * Instantiate the object to fill an array of real numbers.
    * Pass an argument to the constructor a reference to the method for reading the user input from the console.
    * */
    private static final Fillable<Double> DOUBLE_ARRAY_FILLABLE = new FillableArray<>(new ReadingUserInputData()::readDouble);

    public static void main(String[] args) throws StoppingEnterValueException {
        //Initialize an array of real numbers two dimension element.
        Double[] doubleNumbers = new Double[2];
        //Instantiate an object of class "Numbers".
        Numbers numbers = new Numbers();

        /*
        * Fill an array of values and assigning it to an attribute stored in the object class "Numbers".
        * */
        numbers.setNumbers(DOUBLE_ARRAY_FILLABLE.fillArray(doubleNumbers));

        /*
        * Print the filled array of the elements.
        * */
        System.out.println();
        System.out.println("You entered the numbers : ");
        for (int i = 0; i < numbers.getNumbers().length; i++) {
            if (numbers.getNumbers()[i] != null) System.out.print(numbers.getNumbers()[i] + " ");
        }

        System.out.println();

        //Instantiate an object that calculates the arithmetic mean.
        CalculableArithmeticMeanNumber calculableArithmeticMeanNumber = new CalculateArithmeticMeanNumbers();

        //Calculate the arithmetic mean of an array of real numbers, and the result is assigned to the field in the encapsulated object class "Numbers".
        numbers.setResultArithmeticMeanNumbers(calculableArithmeticMeanNumber.calculateArithmeticMeanNumber(numbers.getNumbers()));
        //Output result.
        System.out.printf("The arithmetic mean of the entered real numbers equals %f", numbers.getResultArithmeticMeanNumbers());

    }

}
