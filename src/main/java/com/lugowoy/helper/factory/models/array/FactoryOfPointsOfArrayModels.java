package com.lugowoy.helper.factory.models.array;

import com.lugowoy.helper.models.arrays.Array;
import com.lugowoy.helper.models.points.Point;

/** Created by Konstantin Lugowoy on 01.08.2017. */

public abstract class FactoryOfPointsOfArrayModels<T extends Number> extends FactoryOfArrayModels<Point<T>> {

    @Override
    public abstract Array<Point<T>> create();

    @Override
    public abstract Array<Point<T>> create(Point<T>[] array);

    @Override
    public abstract Array<Point<T>> create(int lengthArray);

}
