package com.lugowoy.tasks.calculationOfCoordinatesOfBodyCastAtAngleToHorizon;

import com.lugowoy.helper.factory.creator.CreatorOfPointModels;
import com.lugowoy.helper.factory.models.points.FactoryOfPointsWithDoubleCoordinates;
import com.lugowoy.helper.models.points.Point;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 06.11.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    private static final double g = 9.832;

    public static void main(String[] args) {

        double angle = getAngle();
        angle = convertAngleFromDegreesToRadians(angle);

        double mass = getMass();

        double gamma = getGamma();

        double V = getSpeed();

        double t = getTime();

        System.out.println("The point in which there is a body having parameters entered by you : ");

        Point<Double> point = new CreatorOfPointModels<>(new FactoryOfPointsWithDoubleCoordinates()).create();
        point.setCoordinateX(calculateCoorX(V, mass, angle, gamma, t));
        point.setCoordinateY(calculateCoorY(V, mass, angle, gamma, t));

        System.out.println(point);

    }

    private static double getAngle() {
        System.out.println("Enter the angle at which the body was thrown : ");
        double resultAngle;
        while (true) {
            resultAngle = READER.readDouble();
            if ((resultAngle > 0) && (resultAngle < 180)) {
                break;
            } else {
                System.out.println("Incorrect entered value. Re-enter : ");
            }
        }
        return resultAngle;
    }

    private static double getMass() {
        System.out.println("Enter body weight (kg) : ");
        return READER.readDouble();
    }

    private static double getGamma() {
        System.out.println("Enter the air resistance factor to the body : ");
        return READER.readDouble();
    }

    private static double getSpeed() {
        System.out.println("Enter the speed (m/s) at which the body was thrown :");
        return READER.readDouble();
    }

    private static double getTime() {
        System.out.println("Enter the time (seconds) when you want to know the location of the body relative to the horizon : ");
        return READER.readDouble();
    }

    private static double convertAngleFromDegreesToRadians(double angle) {
        return angle / (180 / Math.PI);
    }

    private static double calculateCoorX(double speed, double mass,
                                                    double angle, double gamma, double time) {
        return (speed * mass * Math.cos(angle) / gamma * (1 - Math.exp( -gamma * time / mass)));
    }

    private static double calculateCoorY(double speed, double mass,
                                             double angle, double gamma, double time) {
        return mass * (speed * Math.sin(angle) * gamma + mass * gamma) / gamma / gamma * (1 - Math.exp(-gamma * time  / mass)) - mass * g * time / gamma;
    }

}
