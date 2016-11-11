package com.lugowoy.util.read;

import java.util.Random;

/**
 * Created by Konstantin on 11.11.2016.
 */
public interface ReadableRandom extends Readable {

    int readRandomInt();

    int readRandomInt(int bound);

    double readRandomDouble();
}
