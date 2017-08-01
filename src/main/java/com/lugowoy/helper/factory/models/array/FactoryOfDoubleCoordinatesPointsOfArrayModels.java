package com.lugowoy.helper.factory.models.array;

import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.models.arrays.ArrayOfDoubleCoordinatesPoints;
import com.lugowoy.helper.models.points.Point;
import com.lugowoy.helper.models.points.PointOfDoubleCoordinates;

/** Created by Konstantin Lugowoy on 01.08.2017. */

public class FactoryOfDoubleCoordinatesPointsOfArrayModels extends FactoryOfPointsOfArrayModels<Double> {

    @Override
    public Array<Point<Double>> create() {
        return ArrayOfDoubleCoordinatesPoints.getInstanceArrayOfDoubleCoordinatesPoints();
    }

    @Override
    public Array<Point<Double>> create(Point<Double>[] array) {
        return ArrayOfDoubleCoordinatesPoints.getInstanceArrayOfDoubleCoordinatesPoints(array);
    }

    @Override
    public Array<Point<Double>> create(int lengthArray) {
        Array<Point<Double>> array = ArrayOfDoubleCoordinatesPoints.getInstanceArrayOfDoubleCoordinatesPoints();
        array.setArray(new PointOfDoubleCoordinates[lengthArray]);
        return array;
    }

}
