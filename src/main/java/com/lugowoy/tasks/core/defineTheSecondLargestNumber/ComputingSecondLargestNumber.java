package com.lugowoy.tasks.core.defineTheSecondLargestNumber;

/**Created by Konstantin Lugowoy on 14.11.2016.*/
/*
* Class "ComputingSecondLargestNumber" implements interface "Computable". Substituting type "NumberForComparison".
* */
class ComputingSecondLargestNumber implements Computable<NumbersForComparison> {

    /*
    * Overriding and implementation abstract method of interface "Computable<T>"
    * */
    @Override
    public int getSecondLargestNumber(NumbersForComparison numbersForComparison) {
        /*The local variable to save and return the value of the second-largest number*/
        int secondLargestNumber = 0;
        /*
        * We compare each number with the other two.
        * If this number is less than those which compare, this is the smallest number.
        * If the result of the comparison equal true,
        * if the result of the comparison is true, then we compare
        * (see method getSecondLargestNumber(int firstLargestNumberForComparing, int secondLargestNumberForComparing);)
        * these numbers and find less of them.
        * */
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

    /*The method returns the smaller of the two maximum numbers.*/
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
