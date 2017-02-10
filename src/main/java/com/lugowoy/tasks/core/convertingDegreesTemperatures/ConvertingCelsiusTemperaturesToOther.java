package com.lugowoy.tasks.core.convertingDegreesTemperatures;

/**
 * Created by Konstantin Lugowoy on 11-Jan-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @see com.lugowoy.tasks.core.convertingDegreesTemperatures.Convertable
 * <p>
 * The class implements the functionality for converting Celsius temperature to another.
 * @since 11.01.2017
 */
public class ConvertingCelsiusTemperaturesToOther implements Convertable<Temperature> {

    /**
     * The overridden method implements the conversion temperature in Celsius to another.
     * */
    @Override
    public Temperature convert(final Temperature temperature, final TemperatureScale temperatureScale) {
        Temperature resultTemperature = null;
        if (temperature.getScale().equals(TemperatureScale.Celsius)) {
            switch (temperatureScale) {
                case Fahrenheit:
                    resultTemperature = new Temperature();
                    resultTemperature.setDegreesTemperatures((temperature.getDegreesTemperatures() * 9 / 5) + 32);
                    resultTemperature.setScale(TemperatureScale.Fahrenheit);
                    break;
                case Kelvin:
                    resultTemperature = new Temperature();
                    resultTemperature.setDegreesTemperatures(temperature.getDegreesTemperatures() + 273.15);
                    resultTemperature.setScale(TemperatureScale.Kelvin);
                    break;
                case Reaumur:
                    resultTemperature = new Temperature();
                    resultTemperature.setDegreesTemperatures(temperature.getDegreesTemperatures() * 4 / 5);
                    resultTemperature.setScale(TemperatureScale.Reaumur);
                    break;
                case Delisle:
                    resultTemperature = new Temperature();
                    resultTemperature.setDegreesTemperatures((100 - temperature.getDegreesTemperatures()) * 3 / 2);
                    resultTemperature.setScale(TemperatureScale.Delisle);
                    break;
            }
        }
        return resultTemperature;
    }

}
