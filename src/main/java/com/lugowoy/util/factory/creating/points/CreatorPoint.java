package com.lugowoy.util.factory.creating.points;

import com.lugowoy.util.factory.FactoryPoint;
import com.lugowoy.util.factory.creating.Creator;
import com.lugowoy.util.models.other.Point;

/** Created by Konstantin Lugowoy on 02.07.2017. */

public abstract class CreatorPoint<T> extends Creator implements FactoryPoint<T> {

    @Override
    public abstract Point<T> create();

    @Override
    public abstract Point<T> create(T coordinateX, T coordinateY);

}
