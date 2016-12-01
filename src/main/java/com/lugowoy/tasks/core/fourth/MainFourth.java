package com.lugowoy.tasks.core.fourth;

import com.lugowoy.util.reading.Reading;

/**
 * Created by Konstantin on 19.11.2016.
 */

public class MainFourth {

    private static final Reading READING = new Reading();

    public static void main(String[] args) {
		/*int countMaxPrime = 0;*/

		int number = READING.readInt();

        FindingPrimeNumber finding = new FindPrimeNumber();

        System.out.println(finding.findPrimeNumber(number));

		//loop through the numbers one by one
		/*for(int i=1; i < Integer.MAX_VALUE; i++){

			boolean isPrime = true;


			//check to see if the number is prime
			for(int j=2; j < i ; j++){

				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			// print the number
			if(isPrime)
				countMaxPrime++;
				System.out.println(i + "  -  " + countMaxPrime);
		}*/
    }

}
