package com.lugowoy.tasks.determineWhetherLineIsParallelToOrdinateOrToAbscissa;

import com.lugowoy.helper.factory.FactoryPoint;
import com.lugowoy.helper.factory.creator.CreatorPoint;
import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;
import com.lugowoy.helper.models.points.Point;

/** Created by Konstantin Lugowoy on 27.09.2017. */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());
    private static final FactoryPoint<Integer> FACTORY = FactoryPoint.getFactoryPoint(new CreatorPoint<>());

    public static void main(String[] args) {

        System.out.println("Enter the coordinates of the first point along the X axis : ");
        int firstPointCoordinateX = READER.readInt();
        System.out.println("Enter the coordinates of the first point along the Y axis : ");
        int firstPointCoordinateY = READER.readInt();

        Point<Integer> firstPoint = FACTORY.create(firstPointCoordinateX, firstPointCoordinateY);

        System.out.println("Enter the coordinates of the second point along the X axis : ");
        int secondPointCoordinateX = READER.readInt();
        System.out.println("Enter the coordinates of the second point along the Y axis : ");
        int secondPointCoordinateY = READER.readInt();

        Point<Integer> secondPoint = FACTORY.create(secondPointCoordinateX, secondPointCoordinateY);

        Determinator determinator = DeterminatorOfLineParallelism::determineWhetherLineIsParallelToOrdinateOrToAbscissa;
        determinator.determine(firstPoint, secondPoint);

    }

}
