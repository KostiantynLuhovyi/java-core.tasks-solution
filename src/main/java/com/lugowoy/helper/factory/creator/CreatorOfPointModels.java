package com.lugowoy.helper.factory.creator;

import com.lugowoy.helper.factory.FactorableOfPointsModels;
import com.lugowoy.helper.factory.models.points.FactoryOfPoints;
import com.lugowoy.helper.models.points.Point;

/** Created by Konstantin Lugowoy on 01.08.2017. */

public class CreatorOfPointModels<T extends Number> extends CreatorOfModels<Point<T>> implements FactorableOfPointsModels<T> {

    public CreatorOfPointModels(FactoryOfPoints<T> factory) {
        super(factory);
    }

    @Override
    Point<T> create() {
        return super.getFactory().create();
    }

    @Override
    public Point<T> create(T coordinateX, T coordinateY) {
        return ((FactoryOfPoints<T>)super.getFactory()).create(coordinateX, coordinateY);
    }

}
