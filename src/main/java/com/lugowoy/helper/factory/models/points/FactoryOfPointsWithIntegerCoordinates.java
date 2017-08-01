package com.lugowoy.helper.factory.models.points;

import com.lugowoy.helper.models.points.Point;
import com.lugowoy.helper.models.points.PointOfIntegerCoordinates;

/** Created by Konstantin Lugowoy on 01.08.2017. */

public class FactoryOfPointsWithIntegerCoordinates extends FactoryOfPoints<Integer> {

    @Override
    public Point<Integer> create() {
        return PointOfIntegerCoordinates.getInstancePointOfIntegerCoordinates();
    }

    @Override
    public Point<Integer> create(Integer coordinateX, Integer coordinateY) {
        return PointOfIntegerCoordinates.getInstancePointOfIntegerCoordinates(coordinateX, coordinateY);
    }

}
