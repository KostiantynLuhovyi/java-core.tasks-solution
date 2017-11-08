package com.lugowoy.tasks.writeSolutionOfTrigonometricEquationOfCertainType;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 08.11.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter the value of a : ");
        double a = READER.readDouble();
        System.out.println("Enter the value of b : ");
        double b = READER.readDouble();
        System.out.println("Enter the value of c : ");
        double c = READER.readDouble();

        double supportVariable = Math.asin(a / Math.sqrt(a * a + b * b));

        boolean state = a * a + b * b >= c * c;

        System.out.println("The result of an equation of the form : a*cos(x) + b*sin(x) = c");
        System.out.println("Entered parameters : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("Result : ");
        System.out.println(state ? Math.asin(c / Math.sqrt(a * a + b * b)) - supportVariable : "No solution!");

    }


}
