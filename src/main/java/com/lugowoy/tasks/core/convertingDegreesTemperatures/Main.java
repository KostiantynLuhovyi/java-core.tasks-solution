package com.lugowoy.tasks.core.convertingDegreesTemperatures;

import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

/**
 * Created by Konstantin Lugowoy on 11-Jan-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 11.01.2017
 * <p>
 * This class is required for startup.
 */
public class Main {
    //Instantiation of a functional interface initializing its reference to the method for reading the real numbers entered by the user.
    private static final Reading<Double> DOUBLE_READING = new ReadingUserInputData()::readDouble;
    //Instantiation of a functional interface initializing its reference to the method for reading the integer numbers entered by the user.
    private static final Reading<Integer> INTEGER_READING = new ReadingUserInputData()::readInt;

    public static void main(String[] args) throws StoppingEnterValueException {
        //Instantiation object class "Temperature".
        Temperature temperature = new Temperature();
        /*
         * The user makes a choice which temperature scale is used for conversion.
         * The result of selection is assigned to the field "scale" encapsulated in an object of class "Temperature"
         */
        temperature.setScale(setSelectionOfTemperatureScaleForInputTemperature());
        //The user enters the temperature of a real number in the temperature scale he chose in the previous step.
        System.out.println("Enter the temperature value :");
        temperature.setDegreesTemperatures(DOUBLE_READING.reading());
        /*
        * If the user-selected temperature scale Celsius, then he is given a choice in what kind of temperature scale it converted.
        * If the selected user is different from the temperature scale Celsius,
        * the temperature conversion takes place in the actual stored in the temperature scale in Celsius temperature scale.
        * */
        if (temperature.getScale().equals(TemperatureScale.Celsius)) {
            choiceAndConvertCelsiusToOtherTemperatureScale(temperature);
        } else {
            Convertable<Temperature> convertable = new ConvertingOtherTemperaturesToCelsius();
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

    /*
    * In the event that the user selected temperature is in Celsius temperature scale,
    * this method is invoked, and provides the user the choice of the temperature at which it converted scales.
    * */
    private static void choiceAndConvertCelsiusToOtherTemperatureScale(Temperature temperature) throws StoppingEnterValueException {
        System.out.println("Make a choice in what scale to convert degrees Celsius.");
        System.out.println(TemperatureScale.Fahrenheit + " - \"1\" ;");
        System.out.println(TemperatureScale.Kelvin + " - \"2\" ;");
        System.out.println(TemperatureScale.Reaumur + " - \"3\" ;");
        System.out.println(TemperatureScale.Delisle + " - \"4\" ;");

        int choice = INTEGER_READING.reading();

        while (true) {
            if ((choice > 0) && (choice < 5)) {
                Convertable<Temperature> temperatureScaleConvertable = new ConvertingCelsiusTemperaturesToOther();
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
                choice = INTEGER_READING.reading();
            }
        }
    }

    /*
    * The method is used for the user to select what he wants the temperature scale input temperature.
    * */
    private static TemperatureScale setSelectionOfTemperatureScaleForInputTemperature() throws StoppingEnterValueException {
        TemperatureScale temperatureScale = null;

        System.out.println("Select what temperature scale will enter the temperature.Enter the number.");
        System.out.println(TemperatureScale.Celsius + " - \"1\" ;");
        System.out.println(TemperatureScale.Fahrenheit + " - \"2\" ;");
        System.out.println(TemperatureScale.Kelvin + " - \"3\" ;");
        System.out.println(TemperatureScale.Reaumur + " - \"4\" ;");
        System.out.println(TemperatureScale.Delisle + " - \"5\" ;");
        while (true) {
            int choice = INTEGER_READING.reading();
            if ((choice > 0) && (choice < 6)) {
                switch (choice) {
                    case 1:
                        temperatureScale = TemperatureScale.Celsius;
                        break;
                    case 2:
                        temperatureScale = TemperatureScale.Fahrenheit;
                        break;
                    case 3:
                        temperatureScale = TemperatureScale.Kelvin;
                        break;
                    case 4:
                        temperatureScale = TemperatureScale.Reaumur;
                        break;
                    case 5:
                        temperatureScale = TemperatureScale.Delisle;
                        break;
                }
                break;

            } else {
                System.out.println("Not correct selection. Re-entered choice : ");
            }
        }
        return temperatureScale;
    }
}
