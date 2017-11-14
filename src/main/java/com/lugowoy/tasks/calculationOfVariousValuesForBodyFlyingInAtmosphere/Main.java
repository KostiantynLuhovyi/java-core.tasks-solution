package com.lugowoy.tasks.calculationOfVariousValuesForBodyFlyingInAtmosphere;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 14.11.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    private static final double g = 9.832;

    public static void main(String[] args) {

        System.out.println("Enter body weight (kg) : ");
        double mass = READER.readDouble();
        System.out.println("Enter the initial speed (m/sec) : ");
        double V = READER.readDouble();
        System.out.println("Enter value of angle (degree) : ");
        double angle = READER.readDouble();

        System.out.println("Enter the length (m) of the airspace levels.");
        System.out.println("First the airspace level : ");
        double firstAirspaceLevel = READER.readDouble();
        System.out.println("Second the airspace level : ");
        double secondAirspaceLevel = READER.readDouble();

        System.out.println("Enter the value of the first resistance coefficient : ");
        double firstResistanceCoefficient = READER.readDouble();
        System.out.println("Enter the value of the second resistance coefficient");
        double secondResistanceCoefficient = READER.readDouble();

        System.out.println("Enter the time interval value (sec) : ");
        double timeInterval = READER.readDouble();

        double bodyCoorX = 0, bodyCoorY = 0;

        double horizontalProjectionOfSpeed, verticalProjectionOfSpeed;

        double projectionOfResistanceForceX, projectionOfResistanceForceY;

        double timeFlyingBody, distanceFlyingBody, heightFlyingBody = 0;

        int zoneNumberIndicator;

        angle = Math.toRadians(angle);

        horizontalProjectionOfSpeed = V * Math.cos(angle);
        verticalProjectionOfSpeed = V * Math.sin(angle);

        for (int i = 1; true; i++) {

            bodyCoorY += verticalProjectionOfSpeed * timeInterval;
            if (bodyCoorY < 0) {
                timeFlyingBody = Math.round((i - 1) * timeInterval * 100) / 100.0;
                distanceFlyingBody = Math.round(bodyCoorX * 100) / 100.0;
                heightFlyingBody = Math.round(heightFlyingBody * 100) / 100.0;
                break;
            }

            bodyCoorX += horizontalProjectionOfSpeed * timeInterval;
            if (bodyCoorY > heightFlyingBody) {
                heightFlyingBody = bodyCoorY;
            }

            zoneNumberIndicator = bodyCoorY < firstAirspaceLevel ? 1 : bodyCoorY < secondAirspaceLevel ? 2 : 3;

            switch (zoneNumberIndicator) {
                case 1 :
                    projectionOfResistanceForceX = firstResistanceCoefficient * horizontalProjectionOfSpeed
                            * Math.sqrt(horizontalProjectionOfSpeed * horizontalProjectionOfSpeed + verticalProjectionOfSpeed * verticalProjectionOfSpeed);
                    projectionOfResistanceForceY = firstResistanceCoefficient * verticalProjectionOfSpeed
                            * Math.sqrt(horizontalProjectionOfSpeed * horizontalProjectionOfSpeed + verticalProjectionOfSpeed * verticalProjectionOfSpeed);
                    break;
                case 2 :
                    projectionOfResistanceForceX = secondResistanceCoefficient * horizontalProjectionOfSpeed;
                    projectionOfResistanceForceY = secondResistanceCoefficient * verticalProjectionOfSpeed;
                    break;
                default :
                    projectionOfResistanceForceX = 0;
                    projectionOfResistanceForceY = 0;
                    break;
            }

            horizontalProjectionOfSpeed += -projectionOfResistanceForceX * timeInterval / mass;
            verticalProjectionOfSpeed += -g * timeInterval - projectionOfResistanceForceY * timeInterval / mass;
        }

        System.out.println("Time of flying of the body : " + timeFlyingBody + " seconds.");
        System.out.println("Distance of flying of the body : " + distanceFlyingBody + " metres.");
        System.out.println("Max height of flying of the body " + heightFlyingBody + " metres.");

    }

}
