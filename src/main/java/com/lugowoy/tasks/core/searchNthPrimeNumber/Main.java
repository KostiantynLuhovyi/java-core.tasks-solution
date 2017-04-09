package com.lugowoy.tasks.core.searchNthPrimeNumber;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

/**Created by Konstantin Lugowoy on 19.11.2016.*/

//Class "Main" to run program.
public class Main {
    //Maximum enter counting to find prime number.
    private static final int MAX_ENTER_COUNTING_PRIME_NUMBER = 20001;

    private static final ReadingData<Integer> READING_DATA = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) {
        //Read and assignment value user input counting prime number.
        int number = 0;
        number = READING_DATA.read();

        FindingPrimeNumber finding = new FindPrimeNumber();

        while (true) {
            //If input correct counting number to find prime number . . .
            if (number < MAX_ENTER_COUNTING_PRIME_NUMBER) {
                //Searches for a prime number and the value assigned to the variable "findPrimeNumber".
                int findPrimeNumber = finding.findPrimeNumber(number);
                System.out.printf("%dth prime number is : %d", number, findPrimeNumber);
                break;
            } else {
                //If input number not correct value, must re-enter the number.
                System.out.println("Not correct counting prime number.");
                System.out.println("Re-enter (0 ... 20000) : ");
                number = READING_DATA.read();
            }
        }
    }

}
