package com.lugowoy.util.read;

/**
 * Created by Konstantin on 11.11.2016.
 */
public class ReadingUserInput implements ReadableUserInput {

    @Override
    public String readLine() {
        return SCANNER.nextLine();
    }
}
