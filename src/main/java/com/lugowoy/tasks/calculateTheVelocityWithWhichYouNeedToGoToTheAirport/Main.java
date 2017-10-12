package com.lugowoy.tasks.calculateTheVelocityWithWhichYouNeedToGoToTheAirport;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 06.06.2017. */

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        double S = getDistance();

        double minutesOfTime = getMinutesOfTime();

        System.out.println(minutesOfTime + " - " +  S);

        double V = S / (minutesOfTime / 60);

        System.out.println("Speed from which you will reach the airport : " + V + "km/h .");

    }

    public static double getMinutesOfTime() {
        System.out.println("Enter the number of minutes for which you need to get to the airport : ");
        double minutesOfTime;
        while (true) {
            minutesOfTime = reader.readDouble();
            if (minutesOfTime > 0) {
                break;
            } else {
                System.out.println("Incorrect value. Re-enter : ");
            }
        }
        return minutesOfTime;
    }

    public static double getDistance() {
        System.out.println("Enter the distance to the airport in kilometers : ");
        double S;
        while (true) {
            S = reader.readDouble();
            if (S > 0) {
                break;
            } else {
                System.out.println("Incorrect value. Re-enter : ");
            }
        }
        return S;
    }

}
