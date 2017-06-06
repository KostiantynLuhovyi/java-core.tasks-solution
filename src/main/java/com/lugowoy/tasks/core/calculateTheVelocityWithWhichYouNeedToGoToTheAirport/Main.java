package com.lugowoy.tasks.core.calculateTheVelocityWithWhichYouNeedToGoToTheAirport;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

/** Created by Konstantin Lugowoy on 06.06.2017. */

public class Main {

    private static final ReadingData<Double> readingData = new ReadingData<>(new ReadingUserInputData()::readDouble);

    public static void main(String[] args) {

        System.out.println("Enter the distance to the airport in kilometers : ");
        double S;
        while (true) {
            S = readingData.read();
            if (S > 0) {
                break;
            } else {
                System.out.println("Incorrect value. Re-enter : ");
            }
        }

        System.out.println("Enter the number of minutes for which you need to get to the airport : ");
        double time;
        while (true) {
            time = readingData.read();
            if (time > 0) {
                break;
            } else {
                System.out.println("Incorrect value. Re-enter : ");
            }
        }

        System.out.println(time + " - " +  S);

        double V = S / (time / 60);

        System.out.println("Speed from which you will reach the airport : " + V + "km/h .");

    }
}
