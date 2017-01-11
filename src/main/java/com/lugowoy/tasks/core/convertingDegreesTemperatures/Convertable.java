package com.lugowoy.tasks.core.convertingDegreesTemperatures;

/**
 * Created by Konstantin on 11-Jan-17.
 */

public interface Convertable<T, V> {

    T convert(T t, V v);
}
