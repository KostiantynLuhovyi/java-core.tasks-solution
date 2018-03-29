package com.lugowoy.tasks.determineWhetherPointBelongsToRectangle;

import com.lugowoy.helper.models.points.Point;

/** Created by Konstantin Lugowoy on 14.09.2017. */

@FunctionalInterface
public interface Determinant {

    boolean determine(Point<Double> point, Point<Double> pointFirst, Point<Double> pointSecond);

    static boolean determineWhetherPointBelongsToRectangle(Point<Double> concretePoint,
                                                           Point<Double> pointUpperLeft,
                                                           Point<Double> pointLowerRight) {
        return (((concretePoint.getCoordinateX() > pointUpperLeft.getCoordinateX())
                && (concretePoint.getCoordinateX() < pointLowerRight.getCoordinateX()))
                        &&
                ((concretePoint.getCoordinateY() < pointUpperLeft.getCoordinateY())
                && (concretePoint.getCoordinateY() > pointLowerRight.getCoordinateY())));
    }

}
