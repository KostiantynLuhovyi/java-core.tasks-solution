package com.lugowoy.tasks.determineWhetherLineIsParallelToOrdinateOrToAbscissa;

import com.lugowoy.helper.models.Point;

/** Created by Konstantin Lugowoy on 28.09.2017. */

public class DeterminantOfLineParallelism {

    public static void determineWhetherLineIsParallelToOrdinateOrToAbscissa(Point<Integer> firstPoint, Point<Integer> secondPoint) {
        if (firstPoint.getCoordinateX().intValue() == secondPoint.getCoordinateX().intValue()
                    && firstPoint.getCoordinateY().intValue() != secondPoint.getCoordinateY().intValue()) {
            System.out.println("The straight line passing the point along the coordinates entered is parallel to the y-axis.");
        } else if (firstPoint.getCoordinateY().intValue() == secondPoint.getCoordinateY().intValue()
                    && firstPoint.getCoordinateX().intValue() != secondPoint.getCoordinateX().intValue()) {
            System.out.println("The straight line passing the point along the coordinates entered is parallel to the x-axis.");
        } else if (firstPoint.getCoordinateX().intValue() == secondPoint.getCoordinateX().intValue()
                    && firstPoint.getCoordinateY().intValue() == secondPoint.getCoordinateY().intValue()) {
            System.out.println("");
        } else {
            System.out.println("The straight line passing through the entered coordinates is not parallel to the axes.");
        }
    }

}
