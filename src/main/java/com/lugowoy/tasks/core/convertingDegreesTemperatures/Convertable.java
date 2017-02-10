package com.lugowoy.tasks.core.convertingDegreesTemperatures;

/**
 * Created by Konstantin lugowoy on 11-Jan-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.0
 * @since 11.01.2017
 * <p>
 * This interface declares a contract for the implementation of the conversion temperatures.
 */
public interface Convertable<T> {
    /**
     * The method to convert temperatures.
     * @param t The initial temperature at which performs calculations to convert.
     * @param scale Constant enumeration "TemperatureScale" to determine how to convert the temperature scale.
     *              @see com.lugowoy.tasks.core.convertingDegreesTemperatures.TemperatureScale
     * @return The object encapsulates data about the result of the conversion temperature.
     * */
    T convert(T t, TemperatureScale scale);
}
