package com.lugowoy.tasks.core.fourth;

/**
 * Created by Konstantin on 19.11.2016.
 */

//Class "FindPrimeNumber" realizes a contract to search for a particular prime number.
public class FindPrimeNumber implements FindingPrimeNumber {
    //Limit the search to a prime number.
    private static final int LIMIT_SEARCH_PRIME_NUMBER = 224738;

    //Implementation of the contract announced in the interface "FindingPrimeNumber"
    /*
    * Overriding and implementing an abstract method declared in an interface "FindingPrimeNumber",
	* for a finding of a specific prime number.
	* The parameter method "countingNumber", assumes the value of the counting prime numbers you need to find.
	* */
    @Override
    public int findPrimeNumber(int countingNumber) {
        //Local variable "count" which necessary to tracking desired prime number.
        //The value of "count" is incremented by one when finding a prime number.
        int count = 0;
        //Local variable "resultNumber" value to save result prime number.
        int resultPrimeNumber = 0;
        //Loop fingering numbers to find a prime number.
        for (int i = 2; i < LIMIT_SEARCH_PRIME_NUMBER; i++) {
            //The variable "isPrime" for determining a prime number.
            boolean isPrime = true;
			/*
			* The value of "" is compared with the value of a variable "" on each iteration of the inner loop,
			* to determine how much the value of the variable "" dividers.
			* */
            for (int j = 2; j < i; j++) {
				/*Checks if the value of the variable "" evenly divisible by the value of the variable "".
				Thus verified as dividers in the values of "" variable.*/
                if (i % j == 0) {
					/*Number is a not prime.*/
                    isPrime = false;
                    break;
                }
            }
            //If the number is prime . . .
            if (isPrime) {
                //The value of the variable is incremented by one in order to calculate a counting is a prime number.
                count++;
                //If the value of a variable "" equal to the number passed into the method parameter . . .
                if (count == countingNumber) {
                    //The value of a prime number which is equal to the counting value
                    // of the variable "countingNumber" passed into the method parameter,
                    // is issued on the result variable "resultPrimeNumber".
                    resultPrimeNumber = i;
                    break;
                }
            }
        }
        //Return result counting prime number.
        return resultPrimeNumber;
    }
}

