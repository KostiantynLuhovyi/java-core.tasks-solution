package com.lugowoy.tasks.core.convertingDegreesTemperatures;

/** Created by Konstantin lugowoy on 11-Jan-17. */

public interface Convertable<T> {

    T convert(T t, TemperatureScale scale);

}
