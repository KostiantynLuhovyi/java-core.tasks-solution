package com.lugowoy.tasks.core.computationTheArithmeticMeanOfTheNumberOf;

/**
 * Created by Konstantin on 14.11.2016.
 */

/*
* Interface "Insertion" announces contract and abstract method to enter numbers to count.
* */
interface Insertion<T> {

    /*
    * Abstract method to implement filling array of integers.
    * */
    T enterNumbers(T t);

}
