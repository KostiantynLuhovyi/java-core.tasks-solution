package com.lugowoy.helper.factory.models.points;

import com.lugowoy.helper.models.points.Point;
import com.lugowoy.helper.models.points.PointOfDoubleCoordinates;

/** Created by Konstantin Lugowoy on 01.08.2017. */

public class FactoryOfPointsWithDoubleCoordinates extends FactoryOfPoints<Double> {

    @Override
    public Point<Double> create() {
        return PointOfDoubleCoordinates.getInstancePointOfDoubleCoordinates();
    }

    @Override
    public Point<Double> create(Double coordinateX, Double coordinateY) {
        return PointOfDoubleCoordinates.getInstancePointOfDoubleCoordinates(coordinateX, coordinateY);
    }

}
