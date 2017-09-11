package com.lugowoy.tasks.core.implementAnElementaryConsoleCalculator;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 11.09.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter first real number : ");
        RealNumber firstNumber = new RealNumber(enterRealNumber());

        System.out.println("Enter second real number : ");
        RealNumber secondNumber = new RealNumber(enterRealNumber());

        Calculator calculator = selectArithmeticOperations();
        System.out.println("Result : " + calculator.calculate(firstNumber, secondNumber).getNumber());

    }

    private static double enterRealNumber() {
        double enterRealNumber;
        while (true) {
            enterRealNumber = READER.readDouble();
            if (enterRealNumber != 0) {
                if ((enterRealNumber >= Double.MIN_VALUE) && (enterRealNumber <= Double.MAX_VALUE)) {
                    break;
                } else {
                    System.out.println("The entered value of a number is less than or greater than the allowable value.");
                    System.out.println("Min value : " + Double.MIN_VALUE);
                    System.out.println("Max value : " + Double.MAX_VALUE);
                    System.out.println("Re-enter : ");
                }
            } else {
                System.out.println("The entered value of the number can not be zero. Re-enter : ");
            }
        }
        return enterRealNumber;
    }

    private static Calculator selectArithmeticOperations() {
        System.out.println("Select an arithmetic operations : ");
        System.out.println("Addition : 1 ;");
        System.out.println("Subtraction : 2 ;");
        System.out.println("Multiple : 3 ;");
        System.out.println("Divide : 4 ;");
        System.out.println("Remainder of divide : 5 .");

        Calculator calculator = null;

        int select = READER.readInt();

        if ((select >= 1) && (select <= 5)) {
            switch (select) {
                case 1 :
                    calculator = CalculatorOperations::addition;
                    System.out.println("The addition operation is selected.");
                    break;
                case 2 :
                    calculator= CalculatorOperations::substraction;
                    System.out.println("The subtraction operation is selected.");
                    break;
                case 3 :
                    calculator = CalculatorOperations::multiple;
                    System.out.println("The multiple operation is selected.");
                    break;
                case 4 :
                    calculator = CalculatorOperations::divide;
                    System.out.println("The divide operation is selected.");
                    break;
                case 5 :
                    calculator = CalculatorOperations::remainderOfDivision;
                    System.out.println("The remainder of divide operation is selected.");
                    break;
                default :
                    System.out.println("Not selected a suitable arithmetic operation. "); break;
            }
        }
        return calculator;
    }

}
