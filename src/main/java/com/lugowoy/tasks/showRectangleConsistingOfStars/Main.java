package com.lugowoy.tasks.showRectangleConsistingOfStars;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 25.10.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter parameter M for rectangle : ");
        int M = getParam();

        System.out.println("Enter parameter N for rectangle : ");
        int N = getParam();

        System.out.println("Rectangle filled with stars : ");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("Rectangle in which the stars are filled with only the boundary : ");
        for (int i = 0; i <= M; i++) {
            for (int j = 0; j <= N; j++) {
                if ((j == 0 && i <= M) || (i == 0 && j <= N)
                        || (i <= M && j == N) || (i == M && j <= N)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }

    private static int getParam() {
        int param;
        while (true) {
            param = READER.readInt();
            if ((param >= 10) && (param <= 40)) {
                break;
            } else {
                System.out.println("Incorrect value of parameter. Must be integer number from 10 to 40.");
                System.out.println("Re-enter : ");
            }
        }
        return param;
    }

}
