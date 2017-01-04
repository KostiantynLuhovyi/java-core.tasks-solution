package com.lugowoy.tasks.core.convertKilometersToMilesOfSeaAndLand;

/**
 * Created by Konstantin on 31-Dec-16.
 */

public interface Convertable <T> {

    T convert(T t);

    double convert(double kilometers);
}
