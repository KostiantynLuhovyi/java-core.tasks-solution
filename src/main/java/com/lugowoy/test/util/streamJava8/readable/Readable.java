package com.lugowoy.test.util.streamJava8.readable;

/**
 * Created by Konstantin on 19-Jan-17.
 */

@FunctionalInterface
public interface Readable<T> {

    T read(T t);
}
