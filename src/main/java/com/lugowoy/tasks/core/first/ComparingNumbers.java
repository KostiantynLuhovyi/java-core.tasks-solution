package com.lugowoy.tasks.core.first;

/**
 * Created by Konstantin on 08.11.2016.
 */

/*Class "ComparingNumbers" implements contract interface "Comparison" with a generic type <NumberForComparison>.
* Class "NumberForComparison" encapsulates (has attributes) in the field itself for comparison.*/
class ComparingNumbers implements Comparison<NumbersForComparison> {

    /*Override abstract method compareNumber() from the interface "Comparison".
    * The argument of the method is a class object "NumberForComparison".*/
    @Override
    public String compareNumbers(NumbersForComparison numbersForComparison) {
        /*local variable - statusCompare, needed to display the correct result.*/
        String statusCompare = null;
        /*Check that the object is passed to the parameter is not equal to null.*/
        if ((numbersForComparison != null)) {
            /*Checking the first number is equal to the second.*/
            if (numbersForComparison.getFirstNumber() == numbersForComparison.getSecondNumber()) {
                statusCompare = String.format("The first(%d) and second(%d) numbers are equal." + "\n",
                                            numbersForComparison.getFirstNumber(), numbersForComparison.getSecondNumber());
                System.out.println(statusCompare);
                /*Checking the first number is equal to the third.*/
            }else if(numbersForComparison.getFirstNumber() == numbersForComparison.getThirdNumber()) {
                statusCompare = String.format("The first(%d) and third(%d) numbers are equal." + "\n",
                        numbersForComparison.getFirstNumber(), numbersForComparison.getThirdNumber());
                System.out.println(statusCompare);
                /*Checking the second number is equal to the third.*/
            }else if(numbersForComparison.getSecondNumber() == numbersForComparison.getThirdNumber()) {
                statusCompare = String.format("The second(%d) and third(%d) numbers are equal." + "\n",
                        numbersForComparison.getSecondNumber(), numbersForComparison.getThirdNumber());
                System.out.println(statusCompare);
            } else {/*No equal numbers*/
                statusCompare = NO_EQUAL_NUMBERS;
                System.out.println(statusCompare);
            }
        }
        return statusCompare;
    }
}
