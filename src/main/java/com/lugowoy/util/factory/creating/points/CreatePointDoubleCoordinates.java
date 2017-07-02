package com.lugowoy.util.factory.creating.points;

import com.lugowoy.util.models.other.Point;
import com.lugowoy.util.models.other.PointDoubleCoordinates;

/** Created by Konstantin Lugowoy on 02.07.2017. */

public class CreatePointDoubleCoordinates extends CreatorPoint<Double> {

    @Override
    public Point<Double> create() {
        return new PointDoubleCoordinates();
    }

    @Override
    public Point<Double> create(Double coordinateX, Double coordinateY) {
        return new PointDoubleCoordinates(coordinateX, coordinateY);
    }

}
