package com.lugowoy.tasks.calculateHeightOfSatellitesOrbitAboveEarthsSurface;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 07.11.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    private static final double G = 6.672E-11;
    private static final double EARTH_MASS = 5.96e24;
    private static final double EARTH_RADIUS = 6.37E6;

    public static void main(String[] args) {

        System.out.println("Enter the satellite orbital period (hours) : ");
        double orbitalPeriod = READER.readDouble();
        orbitalPeriod *= 3600;

        double heightOfSatellitesOrbitInMeters = Math.pow(G * EARTH_MASS * orbitalPeriod * orbitalPeriod / 4 / Math.PI / Math.PI, (double) 1 / 3) - EARTH_RADIUS;

        double heightOfSatellitesOrbitInKilometers = (double)(Math.round(heightOfSatellitesOrbitInMeters)) / 1000;

        System.out.println("The height of the satellite's orbit : " + heightOfSatellitesOrbitInKilometers);

    }

}
