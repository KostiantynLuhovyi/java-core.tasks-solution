package com.lugowoy.tasks.core.second;

import com.lugowoy.util.reading.Reading;

/**
 * Created by Konstantin on 14.11.2016.
 */


public class MainSecond {
    /*
    * Class object "Reading" reads the user input data to the console.
    * See package com.lugowoy.util.reading.
    * */
    private static Reading reading = new Reading();

    public static void main(String[] args) {

        /*
        * Entering data and calculating the second-largest number.
        * */
        NumbersForComparison numbersForComparison = new NumbersForComparison();

        System.out.println("Enter the first value : ");
        numbersForComparison.setFirstNumber(reading.readInt());

        System.out.println("Enter the second value : ");
        numbersForComparison.setSecondNumber(reading.readInt());

        System.out.println("Enter the third value : ");
        numbersForComparison.setThirdNumber(reading.readInt());

        ComputingSecondLargestNumber computingSecondLargestNumber = new ComputingSecondLargestNumber();
        computingSecondLargestNumber.getSecondLargestNumber(numbersForComparison);

    }
}
