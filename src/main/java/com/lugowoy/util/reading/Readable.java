package com.lugowoy.util.reading;

/**
 * @author Konstantin
 * @version 1.1
 *
 *
 *
 */

@FunctionalInterface
interface Readable<T, V> {

    T reading(V v);
}
