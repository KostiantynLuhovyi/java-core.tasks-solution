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

        temperature = setSelectionOfTemperatureScaleForInputTemperature(temperature);

        System.out.println("Enter the temperature value :");
        temperature.setDegreesTemperatures(READING.readDouble());

        if (temperature.getScale().equals(TemperatureScale.Celsius)) {
            choiceAndConvertCelsiusToOtherTemperatureScale(temperature);
        } else {
            Convertable<Temperature, TemperatureScale> convertable = new ConvertingOtherTemperaturesToCelsius();
            switch (temperature.getScale()) {
                case Fahrenheit:
                    System.out.printf("%f degrees Fahrenheit is equal to %f degrees Celsius.", temperature.getDegreesTemperatures(),
                            convertable.convert(temperature, TemperatureScale.Fahrenheit).getDegreesTemperatures());
                    break;
                case Kelvin:
                    System.out.printf("%f degrees Kelvin is equal to %f degrees Celsius.", temperature.getDegreesTemperatures(),
                            convertable.convert(temperature, TemperatureScale.Kelvin).getDegreesTemperatures());
                    break;
                case Reaumur:
                    System.out.printf("%f degrees Reaumur is equal to %f degrees Celsius.", temperature.getDegreesTemperatures(),
                            convertable.convert(temperature, TemperatureScale.Reaumur).getDegreesTemperatures());
                    break;
                case Delisle:
                    System.out.printf("%f degrees Delisle is equal to %f degrees Celsius.", temperature.getDegreesTemperatures(),
                            convertable.convert(temperature, TemperatureScale.Delisle).getDegreesTemperatures());
                    break;
            }
        }
    }

    private static void choiceAndConvertCelsiusToOtherTemperatureScale(Temperature temperature) throws ForStopingEnterValueException {
        System.out.println("Make a choice in what scale to convert degrees Celsius.");
        System.out.println(TemperatureScale.Fahrenheit + " - \"1\" ;");
        System.out.println(TemperatureScale.Kelvin + " - \"2\" ;");
        System.out.println(TemperatureScale.Reaumur + " - \"3\" ;");
        System.out.println(TemperatureScale.Delisle + " - \"4\" ;");

        int choice = READING.readInt();

        while (true) {
            if ((choice > 0) && (choice < 5)) {
                Convertable<Temperature, TemperatureScale> temperatureScaleConvertable = new ConvertingCelsiusTemperaturesToOther();
                switch (choice) {
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

    private static Temperature setSelectionOfTemperatureScaleForInputTemperature(Temperature temperature) throws ForStopingEnterValueException {
        System.out.println("Select what temperature scale will enter the temperature.Enter the number.");
        System.out.println(TemperatureScale.Celsius + " - \"1\" ;");
        System.out.println(TemperatureScale.Fahrenheit + " - \"2\" ;");
        System.out.println(TemperatureScale.Kelvin + " - \"3\" ;");
        System.out.println(TemperatureScale.Reaumur + " - \"4\" ;");
        System.out.println(TemperatureScale.Delisle + " - \"5\" ;");
        while (true) {
            int choice = READING.readInt();
            if ((choice > 0) && (choice < 6)) {
                switch (choice) {
                    case 1:
                        temperature.setScale(TemperatureScale.Celsius);
                        break;
                    case 2:
                        temperature.setScale(TemperatureScale.Fahrenheit);
                        break;
                    case 3:
                        temperature.setScale(TemperatureScale.Kelvin);
                        break;
                    case 4:
                        temperature.setScale(TemperatureScale.Reaumur);
                        break;
                    case 5:
                        temperature.setScale(TemperatureScale.Delisle);
                        break;
                }
                break;

            } else {
                System.out.println("Not correct selection. Re-entered choice : ");
            }
        }
        return temperature;
    }
}
