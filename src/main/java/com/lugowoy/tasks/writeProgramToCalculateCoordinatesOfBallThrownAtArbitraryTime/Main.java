package com.lugowoy.tasks.writeProgramToCalculateCoordinatesOfBallThrownAtArbitraryTime;

import com.lugowoy.helper.factory.creator.CreatorOfPointModels;
import com.lugowoy.helper.factory.models.points.FactoryOfPointsWithDoubleCoordinates;
import com.lugowoy.helper.models.points.Point;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 08.11.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    private static final double g = 9.832;

    public static void main(String[] args) {

        System.out.println("Enter the value of the initial speed (m/sec) : ");
        double initialSpeed = READER.readDouble();

        System.out.println("Enter the value of the angle (degree) under which the ball was thrown : ");
        double angle = Math.toRadians(READER.readDouble());

        System.out.println("Enter the time (seconds) value for which to calculate : ");
        double timeMoment = READER.readDouble();

        double momentOfLastImpactOnSurface = calculateMomentOfLastImpactOnSurface(calculateFlightTimeOfBallBeforeHittingHorizontalSurface(initialSpeed,
                                                                                        angle), timeMoment);

        Point<Double> ballPoint = new CreatorOfPointModels<>(new FactoryOfPointsWithDoubleCoordinates()).create();
        ballPoint.setCoordinateX(Math.round(100 * calculateCoorX(initialSpeed, angle, timeMoment)) / 100.0);
        ballPoint.setCoordinateY(Math.round(100 * calculateCoorY(initialSpeed, angle, timeMoment, momentOfLastImpactOnSurface)) / 100.0);

        System.out.printf("At the time %f, the position of the thrown ball is at the point with the coordinates : ", timeMoment);
        System.out.println(ballPoint);

    }

    private static double calculateFlightTimeOfBallBeforeHittingHorizontalSurface(double initialSpeed, double angle) {
        return 2 * initialSpeed * Math.sin(angle) / g;
    }

    private static double calculateMomentOfLastImpactOnSurface(double timeFlightBeforeHitting, double timeMoment) {
        return timeFlightBeforeHitting * Math.floor(timeMoment / timeFlightBeforeHitting);
    }

    private static double calculateCoorX(double initialSpeed, double angle, double timeMoment) {
        return initialSpeed * Math.cos(angle) * timeMoment;
    }

    private static double calculateCoorY(double initialSpeed, double angle, double timeMoment, double momentOfLastImpact) {
        return initialSpeed * Math.sin(angle) * (timeMoment - momentOfLastImpact) - g * (timeMoment - momentOfLastImpact) * (timeMoment - momentOfLastImpact) / 2;
    }

}
