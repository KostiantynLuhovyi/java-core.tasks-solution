package com.lugowoy.tasks.core.fourth;

/**
 * Created by Konstantin on 19.11.2016.
 */

public class FindPrimeNumber implements FindingPrimeNumber {
	private static final int LIMIT_SEARCH_PRIME_NUMBER = 224738;

	//Implementation of the contract announced in the interface "FindingPrimeNumber".

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
		int resultNumber = 0;

		for (int i = 2; i < LIMIT_SEARCH_PRIME_NUMBER; i++) {

			boolean isPrime = true;

			//check to see if the number is prime
			for (int j = 2; j < i; j++) {

				if (i % j == 0) {

					isPrime = false;
					break;
				}
			}
			// print the number
			if (isPrime) {
				count++;
				if (count == countingNumber) {
					resultNumber = i;
					System.out.println(resultNumber);
					break;
				}
			}
		}

		return resultNumber;
	}
}

