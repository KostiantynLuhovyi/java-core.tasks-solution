package com.lugowoy.helper.factory.models.array;

import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.models.arrays.ArrayOfIntegerCoordinatesPoints;
import com.lugowoy.helper.models.points.Point;
import com.lugowoy.helper.models.points.PointOfIntegerCoordinates;

/** Created by Konstantin Lugowoy on 01.08.2017. */

public class FactoryOfIntegerCoordinatesPointsOfArrayModels extends FactoryOfPointsOfArrayModels<Integer> {

    @Override
    public Array<Point<Integer>> create() {
        return ArrayOfIntegerCoordinatesPoints.getInstanceArrayOfIntegerCoordinatesPoints();
    }

    @Override
    public Array<Point<Integer>> create(Point<Integer>[] array) {
        return ArrayOfIntegerCoordinatesPoints.getInstanceArrayOfIntegerCoordinatesPoints(array);
    }

    @Override
    public Array<Point<Integer>> create(int lengthArray) {
        return ArrayOfIntegerCoordinatesPoints.getInstanceArrayOfIntegerCoordinatesPoints(new PointOfIntegerCoordinates[lengthArray]);
    }

}
