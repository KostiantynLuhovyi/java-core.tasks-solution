package com.lugowoy.tasks.core.identifyTwoIdenticalNumbers;

/**Created by Konstantin Lugowoy on 08.11.2016.*/

interface Comparison<T> {

    String NO_EQUAL_NUMBERS = "Among the three numbers is not equal.\n";

    String compareNumbers(T t);

}
