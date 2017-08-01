package com.lugowoy.helper.factory.models.points;

import com.lugowoy.helper.factory.FactorableOfPointsModels;
import com.lugowoy.helper.factory.models.FactoryOfModels;
import com.lugowoy.helper.models.points.Point;

/** Created by Konstantin Lugowoy on 01.08.2017. */

public abstract class FactoryOfPoints<T extends Number> extends FactoryOfModels<Point<T>> implements FactorableOfPointsModels<T> {

    @Override
    public abstract Point<T> create();

    @Override
    public abstract Point<T> create(T coordinateX, T coordinateY);

}
