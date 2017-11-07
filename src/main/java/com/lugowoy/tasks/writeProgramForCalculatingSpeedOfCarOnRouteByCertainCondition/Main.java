package com.lugowoy.tasks.writeProgramForCalculatingSpeedOfCarOnRouteByCertainCondition;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 07.11.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Enter the distance value (km) from point A to point B : ");
        double distanceAtoB = READER.readDouble();
        System.out.println("Enter the distance value (km) from point B to point C : ");
        double distanceBtoC = READER.readDouble();

        System.out.println("Enter the speed value on the road section from point A to point B : ");
        double speedAtoB = READER.readDouble();
        System.out.println("Enter the average speed : ");
        double averageSpeed = READER.readDouble();

        double totalTravelTime = calculateTotalTravelTime(averageSpeed, distanceAtoB, distanceBtoC);

        double timeTravelOnFirstRoadSection = calculateTimeTravelOnFirstRoadSection(distanceAtoB, speedAtoB);

        double speedBtoC = calculateSpeedTravelOnSecondRoadSection(totalTravelTime, timeTravelOnFirstRoadSection, distanceAtoB, distanceBtoC);

        if (speedBtoC != -1) {
            System.out.println("The speed value on the road section from point A to point B : " + speedBtoC);
        } else {
            System.out.println("The speed value on the road section from point A to point B unacceptable.");
        }

    }

    private static double calculateTotalTravelTime(double averageSpeed, double... totalValueOfDistance) {
        double resultTotalTravelTime = 0.0;
        for (double valueDistance : totalValueOfDistance) {
            resultTotalTravelTime += valueDistance;
        }
        resultTotalTravelTime /= averageSpeed;
        return resultTotalTravelTime;
    }

    private static double calculateTimeTravelOnFirstRoadSection(double distanceOnFirstRoadSection, double speedOnFirstRoadSection) {
        return distanceOnFirstRoadSection / speedOnFirstRoadSection;
    }

    private static double calculateSpeedTravelOnSecondRoadSection(double totalTravelTime, double timeTravelOnFirstRoadSection,
                                                                        double... totalValueOfDistance) {
        double resultSumOfValuesTotalDistance = 0.0;
        for (double valueDistance : totalValueOfDistance) {
            resultSumOfValuesTotalDistance += valueDistance;
        }
        return totalTravelTime > timeTravelOnFirstRoadSection ? resultSumOfValuesTotalDistance / (totalTravelTime - timeTravelOnFirstRoadSection) : -1;
    }

}
