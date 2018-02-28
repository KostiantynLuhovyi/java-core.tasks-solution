package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Bee extends Animal {

    public Bee() {
        super("Z - Z - Z !");
    }

    @Override
    public String toString() {
        return this.getClass() + super.toString();
    }

    @Override
    public Bee clone() throws CloneNotSupportedException {
        return (Bee) super.clone();
    }

}
