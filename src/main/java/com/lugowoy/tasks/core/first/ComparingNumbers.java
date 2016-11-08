package com.lugowoy.tasks.core.first;

/**
 * Created by Konstantin on 08.11.2016.
 */
class ComparingNumbers implements Comparison<NumbersForComparison> {

    @Override
    public String compareNumbers(NumbersForComparison numbersForComparison) {
        String statusCompare = null;
        if (numbersForComparison != null) {
            if (numbersForComparison.getFirstNumber() == numbersForComparison.getSecondNumber()) {
                statusCompare = String.format("The first(%d) and second(%d) numbers are equal",
                                            numbersForComparison.getFirstNumber(), numbersForComparison.getSecondNumber());
                System.out.println(statusCompare);
            }else if(numbersForComparison.getFirstNumber() == numbersForComparison.getThirdNumber()) {
                statusCompare = String.format("The first(%d) and third(%d) numbers are equal",
                        numbersForComparison.getFirstNumber(), numbersForComparison.getThirdNumber());
                System.out.println(statusCompare);
            }else if(numbersForComparison.getSecondNumber() == numbersForComparison.getThirdNumber()) {
                statusCompare = String.format("The second(%d) and third(%d) numbers are equal",
                        numbersForComparison.getSecondNumber(), numbersForComparison.getThirdNumber());
                System.out.println(statusCompare);
            } else {
                statusCompare = NO_EQUAL_NUMBERS;
                System.out.println(statusCompare);
            }
        }
        return statusCompare;
    }
}