package com.lugowoy.tasks.core.determineWhetherLineIsParallelToOrdinateOrToAbscissa;

import com.lugowoy.helper.factory.creator.Creator;
import com.lugowoy.helper.factory.creator.CreatorOfPointModels;
import com.lugowoy.helper.factory.models.points.FactoryOfPointsWithIntegerCoordinates;
import com.lugowoy.helper.models.points.Point;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 27.09.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());
    private static final Creator<Point<Integer>> CREATOR = new CreatorOfPointModels<>(new FactoryOfPointsWithIntegerCoordinates());

    public static void main(String[] args) {

        System.out.println("Enter the coordinates of the first point along the X axis : ");
        int firstPointCoorX = READER.readInt();
        System.out.println("Enter the coordinates of the first point along the Y axis : ");
        int firstPointCoorY = READER.readInt();

        Point<Integer> firstPoint = ((CreatorOfPointModels<Integer>)CREATOR).create(firstPointCoorX, firstPointCoorY);

        System.out.println("Enter the coordinates of the second point along the X axis : ");
        int secondPointCoorX = READER.readInt();
        System.out.println("Enter the coordinates of the second point along the Y axis : ");
        int secondPointCoorY = READER.readInt();

        Point<Integer> secondPoint = ((CreatorOfPointModels<Integer>)CREATOR).create(secondPointCoorX, secondPointCoorY);

        Determinator determinator = DeterminatorOfLineParallelism::determineWhetherLineIsParallelToOrdinateOrToAbscissa;
        determinator.determine(firstPoint, secondPoint);

    }

}
