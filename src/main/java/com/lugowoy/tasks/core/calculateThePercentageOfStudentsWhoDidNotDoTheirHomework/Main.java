package com.lugowoy.tasks.core.calculateThePercentageOfStudentsWhoDidNotDoTheirHomework;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

/** Created by Konstantin Lugowoy on 17.06.2017. */

public class Main {

    private static final ReadingData<Integer> READING_DATA = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) {

        int numberOfStudentsWhoDidTheirHomework = getNumberOfStudents("Enter the number of students who did their homework :");

        int numberOfStudentsWhoDidNotDoTheirHomework = getNumberOfStudents("Enter the number of students who did not do their homework :");

        double percentageOfStudentsWhoDidNotDoTheirHomework = (double) (numberOfStudentsWhoDidTheirHomework + numberOfStudentsWhoDidNotDoTheirHomework) * numberOfStudentsWhoDidNotDoTheirHomework / 100;

        System.out.printf("Percentage of students who did not do their homework : %.2f", percentageOfStudentsWhoDidNotDoTheirHomework);

    }

    private static int getNumberOfStudents(String msg) {
        int numberOfStudents;
        System.out.println(msg);
        while (true) {
            numberOfStudents = READING_DATA.read();
            if (numberOfStudents >= 0) {
                break;
            } else {
                System.out.println("Number of students must be a positive number or is equal zero.");
                System.out.println("Re-enter : ");
            }
        }
        return numberOfStudents;

    }

}

