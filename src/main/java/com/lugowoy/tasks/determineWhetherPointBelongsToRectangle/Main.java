package com.lugowoy.tasks.determineWhetherPointBelongsToRectangle;

import com.lugowoy.helper.factory.creator.CreatorOfPointModels;
import com.lugowoy.helper.factory.models.points.FactoryOfPointsWithDoubleCoordinates;
import com.lugowoy.helper.models.points.Point;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 14.09.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    private static final CreatorOfPointModels<Double> CREATOR = new CreatorOfPointModels<>(new FactoryOfPointsWithDoubleCoordinates());

    public static void main(String[] args) {

        System.out.println("Enter coordinates of point the upper left.");
        System.out.println("Coordinates x :");
        double xCoorUpperLeft = READER.readDouble();
        System.out.println("Coordinates y :");
        double yCoorUpperLeft = READER.readDouble();

        Point<Double> pointUpperLeft = CREATOR.create(xCoorUpperLeft, yCoorUpperLeft);

        System.out.println("Enter coordinates of point the lower right.");
        System.out.println("Coordinates x : ");
        double xCoorLowerRight = READER.readDouble();
        System.out.println("Coordinates y : ");
        double yCoorLowerRight = READER.readDouble();

        Point<Double> pointLowerRight = CREATOR.create(xCoorLowerRight, yCoorLowerRight);

        System.out.println("Enter the coordinates of the point to define.");
        System.out.println("Coordinates x :");
        double xCoorPoint = READER.readDouble();
        System.out.println("Coordinates y :");
        double yCoorPoint = READER.readDouble();

        Point<Double> point = CREATOR.create(xCoorPoint, yCoorPoint);

        Determinator determinator = Determinator::determineWhetherPointBelongsToRectangle;
        if (determinator.determine(point, pointUpperLeft, pointLowerRight)) {
            System.out.println("The entered point belongs to the rectangle.");
        } else {
            System.out.println("The entered point does not belong to the rectangle.");
        }

    }



}
