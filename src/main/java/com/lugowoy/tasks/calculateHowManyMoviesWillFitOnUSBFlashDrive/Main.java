package com.lugowoy.tasks.calculateHowManyMoviesWillFitOnUSBFlashDrive;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 16.06.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    private static final String NAME_MOVIE = "Terminator";

    public static void main(String[] args) {

        FlashDriveUSB driveUSB = new FlashDriveUSB();
        driveUSB.setSizeFlashDriveUSB(getSizeFlashDriveUSB());

        Movie movie = new Movie(NAME_MOVIE, getSizeMovie());

        System.out.println("Number movie on the flash drive USB : " + (int)(driveUSB.getSizeFlashDriveUSB() * 1024 / movie.getSizeMovie()));

    }

    private static double getSizeFlashDriveUSB() {
        double sizeFlashDriveUSB;
        System.out.println("Enter the size of the flash drive USB : ");
        while (true) {
            sizeFlashDriveUSB = READER.readDouble();
            if (sizeFlashDriveUSB > 0) {
                break;
            } else {
                System.out.println("The size of the usb flash drive USB must be a positive number.");
                System.out.println("Re-enter : ");
            }
        }
        return sizeFlashDriveUSB;
    }

    private static double getSizeMovie() {
        double sizeMovie;
        System.out.println("Enter the size (Mb) of the movie : ");
        while (true) {
            sizeMovie = READER.readDouble();
            if (sizeMovie > 0) {
                break;
            } else {
                System.out.println("The size of the movie must be a positive number.");
                System.out.println("Re-enter : ");
            }
        }
        return sizeMovie;
    }

}
