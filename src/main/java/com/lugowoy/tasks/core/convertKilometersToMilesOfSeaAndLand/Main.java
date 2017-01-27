package com.lugowoy.tasks.core.convertKilometersToMilesOfSeaAndLand;

import com.lugowoy.util.reading.*;
import com.lugowoy.util.reading.Readable;

/**
 * Created by Konstantin on 31-Dec-16.
 */

public class Main {

    public static void main(String[] args) throws StoppingEnterValueException {

        ReadingData<Number> readingData = new ReadingData<>(new ReadingUserInputData()::readDouble);

        System.out.println("Enter the number of kilometers for conversion : ");
        Length length = new Length();
        length.setKilometers((Double) readingData.read());

        System.out.println("Convert entered number of kilometers, ");
        System.out.println("In nautical miles, enter : \"1\" .");
        System.out.println("In the statute miles, enter : \"2\" .");
        System.out.println("Nothing to convert, enter : \"3\" .");

        int selection = (int) readingData.read();

        if ((selection > 0) && (selection <= 3)) {
            Convertable<Length> lengthConvertable;
            switch (selection) {
                case 1:
                    lengthConvertable = new ConvertingKilometersToMilesOfSea();
                    lengthConvertable.convert(length);
                    System.out.printf("The result of the conversion of kilometers to nautical miles is %f",
                                            length.getMilesOfSea());
                    break;
                case 2:
                    lengthConvertable = new ConvertingKilometersToMilesOfLand();
                    lengthConvertable.convert(length);
                    System.out.printf("The result of the conversion of kilometers to miles of land is %f",
                                            length.getMilesOfLand());
                    break;
                case 3:
                    System.out.println("EXIT");
            }
        } else {
            System.out.println("Error when entering the action selection");
        }

    }
}
