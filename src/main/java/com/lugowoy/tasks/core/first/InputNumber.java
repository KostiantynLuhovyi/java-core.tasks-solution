package com.lugowoy.tasks.core.first;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Konstantin on 07.11.2016.
 */
class InputNumber implements UserInput, RandomInput{

    @Override
    public int getEnterValue() throws IOException {
        return new Scanner(System.in).nextInt();
    }

    @Override
    public int getRandomValue() {
        return new Random().nextInt();
    }
}
