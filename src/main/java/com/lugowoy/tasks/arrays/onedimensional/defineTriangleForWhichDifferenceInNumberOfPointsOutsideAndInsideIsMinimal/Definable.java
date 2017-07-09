package com.lugowoy.tasks.arrays.onedimensional.defineTriangleForWhichDifferenceInNumberOfPointsOutsideAndInsideIsMinimal;

import com.lugowoy.util.factory.creating.arrays.CreatorArraysOfObjects;
import com.lugowoy.util.models.arrays.Array;
import com.lugowoy.util.models.other.Point;

import java.util.Objects;

/** Created by Konstantin Lugowoy on 03.07.2017. */

@FunctionalInterface
public interface Definable<T> {

    T define(T t);

    static Array<Point<Double>> defineTriangle(Array<Point<Double>> pointArray) {
        Array<Point<Double>> resultPointOfTriangle = new CreatorArraysOfObjects<Point<Double>>().create(new Point[3]);
        CheckInsidablePoint checkInsidablePoint = CheckInsidablePoint::isInsideTrianglePoints;
        if (Objects.nonNull(pointArray)) {
            if ((Objects.nonNull(pointArray.getArray())) && (pointArray.getArray().length > 0)) {
                int lengthArray = pointArray.getArray().length;
                for (int i = 0; i < lengthArray; i++) {
                    for (int j = i + 1; j < lengthArray; j++) {
                        for (int k = j + 1; k < lengthArray; k++) {
                            int countLength = 0;

                            for (int l = 0; l < lengthArray; l++) {

                                if (i == l || j == l || k == l) {
                                    continue;
                                }

                                countLength += checkInsidablePoint.isInside(pointArray.getArray()[l],
                                        pointArray.getArray()[i], pointArray.getArray()[j], pointArray.getArray()[k]);

                            }

                            countLength = Math.abs(countLength);

                            if (countLength < lengthArray) {
                                lengthArray = countLength;
                                resultPointOfTriangle.getArray()[0] = pointArray.getArray()[i];
                                resultPointOfTriangle.getArray()[1] = pointArray.getArray()[j];
                                resultPointOfTriangle.getArray()[2] = pointArray.getArray()[k];
                            }

                        }
                    }
                }


            } else {
                System.out.println("The array is not valid for any operations or calculations.");
            }
        } else {
            System.out.println("The array is not valid for any operations or calculations.");
        }

        return resultPointOfTriangle;

    }


}
