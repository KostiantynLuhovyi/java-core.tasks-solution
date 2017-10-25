package com.lugowoy.tasks.showRhombusFilledWithStars;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 25.10.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter value of diagonals of a rhombus : ");
        int diagonalsOfRhombus = getParam();

        System.out.println("Rhombus filled with stars : ");
        for (int i = 0; i <= (diagonalsOfRhombus / 2); i++) {
            for (int j = 0; j < diagonalsOfRhombus; j++) {
                if ((j <= (diagonalsOfRhombus / 2) + i) && (j >= (diagonalsOfRhombus / 2) - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = (diagonalsOfRhombus / 2); i < diagonalsOfRhombus; i++) {
            for (int j = 0; j < diagonalsOfRhombus; j++) {
                if ((j <= (diagonalsOfRhombus / 2) + diagonalsOfRhombus - i - 1) && (j >= i - (diagonalsOfRhombus / 2) + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Rhombus in which the stars are filled with only the boundary :");
        for (int i = 0; i <= (diagonalsOfRhombus / 2); i++) {

            for (int j = 0; j <= diagonalsOfRhombus; j++) {

                if ((j == (diagonalsOfRhombus / 2) + i) || (j == (diagonalsOfRhombus / 2) - i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = (diagonalsOfRhombus / 2); i < diagonalsOfRhombus; i++) {

            for (int j = 0; j < diagonalsOfRhombus; j++) {
                if ((j == (diagonalsOfRhombus / 2) + diagonalsOfRhombus - i - 1) || (j == i - (diagonalsOfRhombus / 2) + 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    private static int getParam() {
        int param;
        while (true) {
            param = READER.readInt();
            if ((param >= 10) && (param <= 20)) {
                break;
            } else {
                System.out.println("Incorrect value of parameter. Must be integer number from 10 to 20.");
                System.out.println("Re-enter : ");
            }
        }
        return param;
    }

}
