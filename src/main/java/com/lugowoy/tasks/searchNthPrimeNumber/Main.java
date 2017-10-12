package com.lugowoy.tasks.searchNthPrimeNumber;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/**Created by Konstantin Lugowoy on 19.11.2016.*/

public class Main {

    private static final int MAX_ENTER_COUNTING_PRIME_NUMBER = 20001;

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        int number = reader.readInt();

        FindingPrimeNumber finding = new FindPrimeNumber();

        while (true) {
            if (number < MAX_ENTER_COUNTING_PRIME_NUMBER) {
                int findPrimeNumber = finding.findPrimeNumber(number);
                System.out.printf("%dth prime number is : %d", number, findPrimeNumber);
                break;
            } else {
                System.out.println("Not correct counting prime number.");
                System.out.println("Re-enter (0 ... 20000) : ");
                number = reader.readInt();
            }
        }

    }

}
