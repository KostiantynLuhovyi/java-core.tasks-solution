package com.lugowoy.tasks.core.defineTheSecondLargestNumber;

/**
 * Created by Konstantin on 14.11.2016.
 */

/*
* nterface "Computable" announces contract to find the second-largest number. Interface generic type T.
* */
interface Computable<T> {
    /*
    * Abstract method to search for the second largest number of three.
    * Return value second largest number.
    * */
    int getSecondLargestNumber(T t);
}
