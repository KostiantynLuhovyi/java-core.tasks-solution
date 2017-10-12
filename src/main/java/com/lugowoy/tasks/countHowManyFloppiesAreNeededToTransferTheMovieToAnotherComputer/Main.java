package com.lugowoy.tasks.countHowManyFloppiesAreNeededToTransferTheMovieToAnotherComputer;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 17.06.2017. */

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    private static final double SIZE_OF_FLOPPY_DISK_IN_MB = 1.44;

    public static void main(String[] args) {

        double sizeMovieInTheGb = getSizeMovieInTheGb();

        int numberOfFloppyNeedsToTransferMovie = (int) (sizeMovieInTheGb * 1024 / SIZE_OF_FLOPPY_DISK_IN_MB);

        System.out.printf("To transfer a movie to another computer, you need %d floppy disk.", numberOfFloppyNeedsToTransferMovie);

    }

    private static double getSizeMovieInTheGb() {
        double sizeMovieInTheGb;
        System.out.println("Enter size movie in the gigabytes : ");
        sizeMovieInTheGb = reader.readDouble();
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
