package com.lugowoy.tasks.core.determineTheTimeForWhichTheMovieIsDownloaded;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/** Created by Konstantin Lugowoy on 16.06.2017. */

public class Main {

    private static final ReadingData<Double> READING_DATA = new ReadingData<>(new ReadingUserInputData()::readDouble);

    private static final double BITS_IN_GB = 8590e+6;

    public static void main(String[] args) {

        Movie movie = new Movie(new Random().nextInt(10), "Terminator", getSizeFilmInGb());
        System.out.println(movie);

        double speedInternetConnection = getSpeedInternetConnection();

        long secondsForCalculationTimeOfDownloadMovie = (long) (movie.getSizeMovieInGb() / speedInternetConnection * BITS_IN_GB);

        long hours = secondsForCalculationTimeOfDownloadMovie / 3600;
        long minutes = secondsForCalculationTimeOfDownloadMovie / 60 % 60;
        long seconds = secondsForCalculationTimeOfDownloadMovie % 60;

        System.out.printf("Downloading the movie will last : %d hours, %d minutes, %d seconds.", hours, minutes, seconds);

    }

    private static double getSizeFilmInGb() {
        System.out.println("Enter size film in the Gb : ");
        double sizeFilm;
        while (true) {
            sizeFilm = READING_DATA.read();
            if (sizeFilm > 0) {
                break;
            } else {
                System.out.println("Size film must be a positive real number.");
                System.out.println("Re-enter : ");
            }
        }
        return sizeFilm;

    }

    private static double getSpeedInternetConnection() {
        System.out.println("Enter speed(bits/second) internet connection : ");
        double speedInternetConnection;
        while (true) {
            speedInternetConnection = READING_DATA.read();
            if (speedInternetConnection > 0) {
                break;
            } else {
                System.out.println("Speed internet connection must be a positive real number : ");
                System.out.println("Re-enter : ");
            }
        }
        return speedInternetConnection;

    }

}
