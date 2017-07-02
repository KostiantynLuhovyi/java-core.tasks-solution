package com.lugowoy.util.factory;

import com.lugowoy.util.models.other.Point;

/** Created by Konstantin Lugowoy on 02.07.2017. */

public interface FactoryPoint<T> extends Factory<Point<T>> {

    Point<T> create();

    Point<T> create(T coordinateX, T coordinateY);

}
