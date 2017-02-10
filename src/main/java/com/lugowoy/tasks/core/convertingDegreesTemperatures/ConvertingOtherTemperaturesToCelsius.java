package com.lugowoy.tasks.core.convertingDegreesTemperatures;

/**
 * Created by Konstantin Lugowoy on 17-Jan-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @see com.lugowoy.tasks.core.convertingDegreesTemperatures.Convertable
 * The class implements the functionality for the conversion temperature in the temperature scales other to temperature in Celsius.
 * @since 11.01.2017
 */
public class ConvertingOtherTemperaturesToCelsius implements Convertable<Temperature> {

    /**
    * The overridden method for converting temperatures in other temperature scale in Celsius temperature.
    * */
    @Override
    public Temperature convert(Temperature temperature, TemperatureScale temperatureScale) {
        Temperature resultTemperature = new Temperature();
        resultTemperature.setScale(TemperatureScale.Celsius);
        if (!temperature.getScale().equals(TemperatureScale.Celsius)) {
            switch (temperatureScale) {
                case Fahrenheit:
                    resultTemperature.setDegreesTemperatures((temperature.getDegreesTemperatures() - 32) * 5 / 9);
                    break;
                case Kelvin:
                    resultTemperature.setDegreesTemperatures(temperature.getDegreesTemperatures() - 273.15);
                    break;
                case Reaumur:
                    resultTemperature.setDegreesTemperatures(temperature.getDegreesTemperatures() * 5 / 4);
                    break;
                case Delisle:
                    resultTemperature.setDegreesTemperatures(100 - temperature.getDegreesTemperatures() * 2 / 3);
            }
        } else {
            System.out.println("It is impossible to translate the temperature in Celsius.");
        }
        return resultTemperature;
    }
}
