package com.lugowoy.util.read;

import java.util.Random;

/**
 * Created by Konstantin on 11.11.2016.
 */
public class ReadingRandom implements Readable {

    private Random RANDOM = new Random();

    @Override
    public int readInt() {
        return RANDOM.nextInt();
    }

    @Override
    public int readInt(int bound) {
        return RANDOM.nextInt(bound);
    }

    @Override
    public double readDouble() {
        return RANDOM.nextDouble();
    }
}
