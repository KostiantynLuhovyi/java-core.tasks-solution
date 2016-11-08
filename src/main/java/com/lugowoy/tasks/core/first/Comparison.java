package com.lugowoy.tasks.core.first;

/**
 * Created by Konstantin on 08.11.2016.
 */
interface Comparison<T> {
    String NO_EQUAL_NUMBERS = "Among the three numbers is not equal.";


    String compareNumbers(T t);
}
