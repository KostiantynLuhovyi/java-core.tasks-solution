package com.lugowoy.tasks.arrays.specifySetOfTrianglesWithVerticesAtGivenPointsThatIntersectWithCircle;

import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.models.other.Point;

import static java.lang.Math.*;

/** Created by Konstantin Lugowoy on 03.07.2017. */

public interface TrigonometricDeterminable<T, V> {

    void determine(T t, V v);

    static void determineSetOfTrianglesWithVerticesAtGivenPointsThatIntersectWithCircle(Array<Point<Integer>> pointArray, double radius) {
        int countTriangle = 0;
        for (int i = 0; i < pointArray.getArray().length - 2; i++) {
            for (int j = i + 1; j < pointArray.getArray().length - 1; j++) {
                for (int k = j + 1; k < pointArray.getArray().length; k++) {
                    if (((sqrt(pow(pointArray.getArray()[i].getCoordinateX(), 2) + pow(pointArray.getArray()[i].getCoordinateY(), 2))) <= radius)
                            && ((sqrt(pow(pointArray.getArray()[j].getCoordinateX(), 2) + pow(pointArray.getArray()[i].getCoordinateY(), 2))) <= radius)
                            && ((sqrt(pow(pointArray.getArray()[k].getCoordinateX(), 2) + pow(pointArray.getArray()[k].getCoordinateY(), 2)) <= radius))) {
                        countTriangle++;
                        System.out.print(pointArray.getArray()[i] + "; ");
                        System.out.print(pointArray.getArray()[j] + "; ");
                        System.out.print(pointArray.getArray()[k] + "; ");
                        System.out.print(" are the vertices of a triangle inscribed or intersecting with a circle.");
                        System.out.println();
                    }
                }
            }
        }
        System.out.printf("The total number of triangles inscribed and intersecting with the circle is %d .", countTriangle);
    }

}
