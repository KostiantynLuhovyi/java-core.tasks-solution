package com.lugowoy.tasks.arrays.determineTheNumbersOfPointsThatCanBeTheVerticesOfSquare;

/** Created by Konstantin Lugowoy on 16.05.2017. */

@FunctionalInterface
public interface Determinable<T> {

    T determine(ArrayOfCoordinates<T> arrayOfCoordinates);

    static Integer[] determineTheNumbersOfPointsThatCanBeTheVerticesOfSquare(ArrayOfCoordinates<Integer> arrayOfCoordinates) {
        Integer[] pointsOfCoordinates = new Integer[0];
        if (arrayOfCoordinates != null) {
            if (arrayOfCoordinates.getArrayOfCoordinates() != null) {
                if ((arrayOfCoordinates.getArrayOfCoordinates().length > 8)
                        || (arrayOfCoordinates.getArrayOfCoordinates().length % 2 == 0)) {
                    for (int i = 0; i < arrayOfCoordinates.getArrayOfCoordinates().length - 6; i++) {
                        for (int j = 0; j < arrayOfCoordinates.getArrayOfCoordinates().length - 4; j++) {
                            for (int k = 0; k < ; k++) {
                                
                            }
                        }
                    }
                }
            }
        }

    }

}
