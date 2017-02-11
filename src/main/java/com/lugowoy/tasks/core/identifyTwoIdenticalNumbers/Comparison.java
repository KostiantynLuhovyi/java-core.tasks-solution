package com.lugowoy.tasks.core.identifyTwoIdenticalNumbers;

/**Created by Konstantin Lugowoy on 08.11.2016.*/

/*Interface "Comparison" announces contract for comparing numerical values.*/
interface Comparison<T> {

    /*The constant indicating and used, if among the entered number is not equal.*/
    String NO_EQUAL_NUMBERS = "Among the three numbers is not equal.\n";

    /*Abstract method for finding equal numbers.
    * It takes a class object parameter T, encapsulates the entered numbers.
    * */
    String compareNumbers(T t);

}
