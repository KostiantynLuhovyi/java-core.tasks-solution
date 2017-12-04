package com.lugowoy.tasks.convertKilometersToMilesOfSeaAndLand;

/**Created by Konstantin Lugowoy on 31-Dec-16.*/

public interface Convertable <T> {

    T convert(T t);

    double convert(double kilometers);

}
