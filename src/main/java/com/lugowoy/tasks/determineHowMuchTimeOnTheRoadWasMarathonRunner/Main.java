package com.lugowoy.tasks.determineHowMuchTimeOnTheRoadWasMarathonRunner;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 23.03.2017. */

public class Main {

    private static final Determinable<Time, MarathonRunner> DETERMINABLE = Determinable::determineHowMuchTimeOnTheRoadWasMarathonRunner;

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Input distance (kilometers) to marathon runner : ");
        double distance = reader.readDouble();
        System.out.println();

        System.out.println("Input speed (m/s) to marathon runner : ");
        double speed = reader.readDouble();
        System.out.println();

        MarathonRunner marathonRunner = new MarathonRunner(distance, speed);

        marathonRunner.setTime(DETERMINABLE.determine(marathonRunner));

        System.out.println(marathonRunner.getTime());

    }

}
