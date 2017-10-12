package com.lugowoy.tasks.findAllRootsOfQuadraticEquation;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 09.07.2017. */

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter number first ('a') number for quadratic equation : ");
        double a = getNumber();

        System.out.println("Enter number second (\'b\') number for quadratic equation : ");
        double b = getNumber();

        System.out.println("Enter number third (\'c\') number for quadratic equation : ");
        double c = getNumber();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double firstX = (-b - Math.sqrt(discriminant)) / (2 * a);
            double secondX = (-b + Math.sqrt(discriminant)) / (2 * a);

            System.out.printf("First root is %f, second root is %f", firstX, secondX);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);

            System.out.printf("Root is %f", x);
        } else {
            System.out.println("Equation not have root.");
        }

    }

    private static double getNumber() {
        double number;
        while (true) {
            number = new Reader(new ReadingDataUserInputInConsole()).readInt();
                if (number > 0) {
                    break;
                } else {
                    System.out.println("Number must be a positive real number.");
                    System.out.println("Re-enter : ");
                }
        }
        return number;
    }

}
