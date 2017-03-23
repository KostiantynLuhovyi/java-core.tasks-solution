package com.lugowoy.tasks.core.determineHowMuchTimeOnTheRoadWasMarathonRunner;

import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.ReadingUserInputData;

/** Created by Konstantin Lugowoy on 23.03.2017. */

public class Main {

    private static final Reading<Double> READING = new ReadingUserInputData()::readDouble;

    private static final Determinable<Time, MarathonRunner> DETERMINABLE = Determinable::determineHowMuchTimeOnTheRoadWasMarathonRunner;

    public static void main(String[] args) {

        System.out.println("Input distance (kilometers) to marathon runner : ");
        double distance = READING.reading();
        System.out.println();

        System.out.println("Input speed (m/s) to marathon runner : ");
        double speed = READING.reading();
        System.out.println();

        MarathonRunner marathonRunner = new MarathonRunner(distance, speed);

        marathonRunner.setTime(DETERMINABLE.determine(marathonRunner));

        System.out.println(marathonRunner.getTime());
    }
}
