package com.lugowoy.test.util.streamJava8.fillable;

/**
 * Created by Konstantin on 19-Jan-17.
 */
@FunctionalInterface
public interface Fillable<T> {

    T[] filling(Fillable<T> fillable);

}
