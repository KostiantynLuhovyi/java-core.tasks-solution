package com.lugowoy.tasks.core.determineWhetherLineIsParallelToOrdinateOrToAbscissa;

import com.lugowoy.helper.models.points.Point;

/** Created by Konstantin Lugowoy on 28.09.2017. */

@FunctionalInterface
public interface Determinator {

    void determine(Point<Integer> firstPoint, Point<Integer> secondPoint);

}
