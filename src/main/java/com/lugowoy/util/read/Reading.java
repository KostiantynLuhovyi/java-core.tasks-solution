package com.lugowoy.util.read;

/**
 * Created by Konstantin on 11.11.2016.
 */
public class Reading implements ReadableRandom, ReadableUserInput {

    @Override
    public int readRandomInt() {
        return RANDOM.nextInt();
    }

    @Override
    public int readRandomInt(int bound) {
        return RANDOM.nextInt(bound);
    }

    @Override
    public double readRandomDouble() {
        return RANDOM.nextDouble();
    }

    @Override
    public int readInt() {
        return SCANNER.nextInt();
    }

    @Override
    public int readInt(int radix) {
        return SCANNER.nextInt(radix);
    }

    @Override
    public double readDouble() {
        return SCANNER.nextDouble();
    }

    @Override
    public String readLine() {
        return SCANNER.nextLine();
    }

}
