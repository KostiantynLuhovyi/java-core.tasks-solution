package com.lugowoy.util.read;

import java.util.Scanner;

/**
 * Created by Konstantin on 11.11.2016.
 */
public interface ReadableUserInput extends Readable {

    Scanner SCANNER = new Scanner(System.in);

    String readLine();

    @Override
    default int readInt() {
        return SCANNER.nextInt();
    }

    @Override
    default int readInt(int radix) {
        return SCANNER.nextInt(radix);
    }

    @Override
    default double readDouble() {
        return SCANNER.nextDouble();
    }

}
