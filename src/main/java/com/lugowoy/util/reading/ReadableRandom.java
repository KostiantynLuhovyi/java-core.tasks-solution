package com.lugowoy.util.reading;

import java.util.Random;

/**
 * Created by Konstantin on 11.11.2016.
 */
/*Interface "ReadableUserInput" announces contract to generated random number and read result.*/
public interface ReadableRandom extends Readable {

    /*
    * Instance of the class Random, for generating random numbers
    * */
    Random RANDOM = new Random();
    /*
    * Abstract method to generated and reading random value type integer.
    * */
    int readRandomInt();
    /*
    * Abstract method to generated and reading random value type integer.
    * Argument "bound" indicates the upper limit: 0 ... bound.
    * */
    int readRandomInt(int bound);
    /*
    * Abstract method to generated and reading random value type double.
    * */
    double readRandomDouble();
}
