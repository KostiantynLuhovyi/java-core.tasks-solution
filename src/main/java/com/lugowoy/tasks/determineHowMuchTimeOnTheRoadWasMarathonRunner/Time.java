package com.lugowoy.tasks.determineHowMuchTimeOnTheRoadWasMarathonRunner;

import java.util.Calendar;

/** Created by Konstantin Lugowoy on 23.03.2017. */

public class Time {

    private int hour;
    private int minutes;
    private int second;

    private Calendar time;

    public Time(int hour, int minutes, int second) {
        this.time = Calendar.getInstance();

        this.hour = hour;
        this.time.add(Calendar.HOUR_OF_DAY, hour);

        this.minutes = minutes;
        this.time.add(Calendar.MINUTE, minutes);

        this.second = second;
        this.time.add(Calendar.SECOND, second);
    }

    public Time(Calendar time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Time[" +
                "hour=" + hour +
                ", minutes=" + minutes +
                ", second=" + second +
                ']';
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public Calendar getTime() {
        return time;
    }

    public void setTime(Calendar time) {
        this.time = time;
    }

}
