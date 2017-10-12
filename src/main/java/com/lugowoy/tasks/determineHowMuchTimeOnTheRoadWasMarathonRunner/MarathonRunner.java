package com.lugowoy.tasks.determineHowMuchTimeOnTheRoadWasMarathonRunner;

/** Created by Konstantin Lugowoy on 23.03.2017. */

public class MarathonRunner {

    private double distance;
    private double speed;

    private Time time;

    public MarathonRunner() {
    }

    public MarathonRunner(double distance, double speed) {
        this.distance = distance;
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Time getTime() {
        return time;
    }

}
