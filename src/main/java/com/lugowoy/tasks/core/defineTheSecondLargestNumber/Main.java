package com.lugowoy.tasks.core.defineTheSecondLargestNumber;

import com.lugowoy.util.reading.*;
import com.lugowoy.util.reading.Readable;

/**
 * Created by Konstantin Lugowoy on 14.11.2016.
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 14.11.2016
 *
 *
 */
public class Main {
    /*
    * Class object "Readable" reads the user input data to the console.
    * See package com.lugowoy.util.read.
    * */
    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) {

        /*
        * Entering data and calculating the second-largest number.
        * */
        NumbersForComparison numbersForComparison = new NumbersForComparison();
        try {
            System.out.println("Enter the first value : ");
            numbersForComparison.setFirstNumber(readingData.read());

            System.out.println("Enter the second value : ");
            numbersForComparison.setSecondNumber(readingData.read());

            System.out.println("Enter the third value : ");
            numbersForComparison.setThirdNumber(readingData.read());
        } catch (StoppingEnterValueException ex) {
            ex.printStackTrace();
        }
        ComputingSecondLargestNumber computingSecondLargestNumber = new ComputingSecondLargestNumber();
        computingSecondLargestNumber.getSecondLargestNumber(numbersForComparison);

    }
}
