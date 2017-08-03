package com.lugowoy.tasks.core.defineTheSecondLargestNumber;

/**Created by Konstantin Lugowoy on 14.11.2016.*/

class ComputingSecondLargestNumber implements Computable<NumbersForComparison> {

    @Override
    public int getSecondLargestNumber(NumbersForComparison numbersForComparison) {

        int secondLargestNumber = 0;

        if ((numbersForComparison.getFirstNumber() < numbersForComparison.getSecondNumber())
                &&
                (numbersForComparison.getFirstNumber() < numbersForComparison.getThirdNumber())) {

            secondLargestNumber = this.getSecondLargestNumber(numbersForComparison.getSecondNumber(),
                    numbersForComparison.getThirdNumber());

        } else if ((numbersForComparison.getSecondNumber() < numbersForComparison.getFirstNumber())
                &&
                (numbersForComparison.getSecondNumber() < numbersForComparison.getThirdNumber())) {

            secondLargestNumber = this.getSecondLargestNumber(numbersForComparison.getFirstNumber(),
                    numbersForComparison.getThirdNumber());

        } else if ((numbersForComparison.getThirdNumber() < numbersForComparison.getFirstNumber())
                &&
                (numbersForComparison.getThirdNumber() < numbersForComparison.getSecondNumber())) {

            secondLargestNumber = this.getSecondLargestNumber(numbersForComparison.getFirstNumber(),
                    numbersForComparison.getSecondNumber());

        } else {
            System.out.println("Can not find the second largest number of. The numbers are equal. ");
        }
        return secondLargestNumber;
    }

    private int getSecondLargestNumber(int firstLargestNumberForComparing, int secondLargestNumberForComparing) {
        int secondLargestNumber = 0;
        if (firstLargestNumberForComparing < secondLargestNumberForComparing) {
            secondLargestNumber = firstLargestNumberForComparing;
        } else if (secondLargestNumberForComparing < firstLargestNumberForComparing) {
            secondLargestNumber = secondLargestNumberForComparing;
        } else {
            System.out.println("Can not find the second largest number of. The numbers are equal.");
        }
        return secondLargestNumber;
    }

}
