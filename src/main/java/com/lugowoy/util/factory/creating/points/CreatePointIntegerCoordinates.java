package com.lugowoy.util.factory.creating.points;

import com.lugowoy.util.models.other.Point;
import com.lugowoy.util.models.other.PointIntegerCoordinates;

/** Created by Konstantin Lugowoy on 02.07.2017. */

public class CreatePointIntegerCoordinates extends CreatorPoint<Integer> {

    @Override
    public Point<Integer> create() {
        return new PointIntegerCoordinates();
    }

    @Override
    public Point<Integer> create(Integer coordinateX, Integer coordinateY) {
        return new PointIntegerCoordinates(coordinateX, coordinateY);
    }

}
