package com.lugowoy.util.read;

import java.util.Scanner;

/**
 * Created by Konstantin on 11.11.2016.
 */
public interface ReadableUserInput extends Readable {

    int readInt();

    double readDouble();

    String readLine();

}
