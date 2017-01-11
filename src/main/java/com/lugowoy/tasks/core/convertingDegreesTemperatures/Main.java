package com.lugowoy.tasks.core.convertingDegreesTemperatures;

import com.lugowoy.util.reading.ForStopingEnterValueException;
import com.lugowoy.util.reading.Reading;

/**
 * Created by Konstantin on 11-Jan-17.
 */

public class Main {

    private static final Reading READING = new Reading();

    public static void main(String[] args) throws ForStopingEnterValueException {

        Temperature temperature = new Temperature();
        temperature.setScale(TemperatureScale.Celsius);

        System.out.println("Enter the number of degrees Celsius : ");
        temperature.setDegreesTemperatures(READING.readDouble());

        System.out.println("Make a choice in what scale to convert degrees Celsius.");
        System.out.println(TemperatureScale.Fahrenheit + "  - 1 ;");
        System.out.println(TemperatureScale.Kelvin + " - 2 ;");
        System.out.println(TemperatureScale.Reaumur + " - 3 ;");
        System.out.println(TemperatureScale.Delisle + " - 4 ;");

        int choice = READING.readInt();

        while(true) {
            if ((choice > 0) && (choice < 5)) {
                Convertable<Temperature, TemperatureScale> temperatureScaleConvertable = new ConvertingCelsiusTemperaturesToOther();
                switch(choice) {
                    case 1:
                        System.out.printf("%f degrees Celsius is equal to %f degrees Fahrenheit.", temperature.getDegreesTemperatures(),
                                temperatureScaleConvertable.convert(temperature, TemperatureScale.Fahrenheit).getDegreesTemperatures());
                        break;
                    case 2:
                        System.out.printf("%f degrees Celsius is equal to %f degrees Kelvin.", temperature.getDegreesTemperatures(),
                                temperatureScaleConvertable.convert(temperature, TemperatureScale.Kelvin).getDegreesTemperatures());
                        break;
                    case 3:
                        System.out.printf("%f degrees Celsius is equal to %f degrees Reaumur.", temperature.getDegreesTemperatures(),
                                temperatureScaleConvertable.convert(temperature, TemperatureScale.Reaumur).getDegreesTemperatures());
                        break;
                    case 4:
                        System.out.printf("%f degrees Celsius is equal to %f degrees Delisle.", temperature.getDegreesTemperatures(),
                                temperatureScaleConvertable.convert(temperature, TemperatureScale.Delisle).getDegreesTemperatures());
                        break;

                }
                break;
            } else {
                System.out.println("Invalid selection. \n Re-enter : ");
                choice = READING.readInt();
            }
        }



    }
}
