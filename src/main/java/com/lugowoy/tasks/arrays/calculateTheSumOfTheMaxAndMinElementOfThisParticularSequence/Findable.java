package com.lugowoy.tasks.arrays.calculateTheSumOfTheMaxAndMinElementOfThisParticularSequence;

/** Created by Konstantin Lugowoy on 01.03.2017. */

@FunctionalInterface
public interface Findable <T> {

    T find(T[] tArray);
}