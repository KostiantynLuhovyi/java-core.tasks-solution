package com.lugowoy.tasks.arrays.determineTheNumberOfPairsOfPointsTheDistanceBetweenWhichIsMaximally;

/** Created by Konstantin Lugowoy on 27.03.2017. */

@FunctionalInterface
public interface Distanceable {

    double getDistance(Point thisPoint, Point thatPoint);

    static double getDistanceOfPairOfThePoints(Point thisPoint, Point thatPoint) {
        return Math.hypot(thisPoint.getX() - thatPoint.getX(), thisPoint.getY() - thatPoint.getY());
    }
}
