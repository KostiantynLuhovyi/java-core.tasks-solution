package com.lugowoy.tasks.core.countHowManyFloppiesAreNeededToTransferTheMovieToAnotherComputer;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

/** Created by Konstantin Lugowoy on 17.06.2017. */

public class Main {

    private static final ReadingData<Double> READING_DATA = new ReadingData<>(new ReadingUserInputData()::readDouble);

    private static final double SIZE_OF_FLOPPY_DISK_IN_MB = 1.44;

    public static void main(String[] args) {

        double sizeMovieInTheGb = getSizeMovieInTheGb();

        int numberOfFloppyNeedsToTransferMovie = (int) (sizeMovieInTheGb * 1024 / SIZE_OF_FLOPPY_DISK_IN_MB);

        System.out.printf("To transfer a movie to another computer, you need %d floppy disk.", numberOfFloppyNeedsToTransferMovie);

    }

    private static double getSizeMovieInTheGb() {
        double sizeMovieInTheGb;
        System.out.println("Enter size movie in the gigabytes : ");
        sizeMovieInTheGb = READING_DATA.read();
        while (true) {
            if (sizeMovieInTheGb > 0) {
                break;
            } else {
                System.out.println("Size movie must be a positive number.");
                System.out.println("Re-enter : ");
            }
        }
        return sizeMovieInTheGb;

    }

}
