package com.lugowoy.tasks.outputToConsoleTemperatureConformityOfCelsiusAndFahrenheit;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/** Created by Konstantin Lugowoy on 05.10.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());
    private static final int MIN_VALUE_FOR_CHECK_TEMPERATURE = -150;
    private static final int MAX_VALUE_FOR_CHECK_TEMPERATURE = 150;

    public static void main(String[] args) {

        System.out.println("Enter the lower boundary of temperature in Celsius : ");
        double lowerBoundInCelsius = getValueOfTemperatureCelsius();
        System.out.println("Enter the upper boundary of temperature in Celsius : ");
        double upperBoundInCelsius = getValueOfTemperatureCelsius();

        if (lowerBoundInCelsius < upperBoundInCelsius) {
            System.out.println("The output occurs every 5 degrees Celsius.");
            System.out.print("Celsius degrees" + "      " + "Fahrenheits degrees");
            System.out.println();
            for (int i = (int) lowerBoundInCelsius; i <= upperBoundInCelsius; i += 5) {

                System.out.println("      " + lowerBoundInCelsius + "          "
                                                + "        " + ((lowerBoundInCelsius * 1.8) + 32.0));
                lowerBoundInCelsius += 5.0;
            }
        } else {
            System.out.println("It is impossible to calculate as the values are not correct.");
        }

    }

    private static double getValueOfTemperatureCelsius() {
        double valueTemperature;
        while (true) {
            valueTemperature = READER.readDouble();
            if ((valueTemperature >= MIN_VALUE_FOR_CHECK_TEMPERATURE) && (valueTemperature <= MAX_VALUE_FOR_CHECK_TEMPERATURE)) {
                break;
            } else {
                System.out.println("Not correct value of temperature. Re-enter : ");
            }
        }
        return valueTemperature;
    }

}
