package com.lugowoy.helper.factory;

import com.lugowoy.helper.models.points.Point;

/** Created by Konstantin Lugowoy on 01.08.2017. */

public interface FactorableOfPointsModels<T extends Number> extends FactorableOfModels<Point<T>> {

    Point<T> create(T coordinateX, T coordinateY);

}
