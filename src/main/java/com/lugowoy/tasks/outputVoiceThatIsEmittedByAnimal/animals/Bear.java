package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Bear extends Animal {

    public Bear() {
        super("Gr - Gr - Gr !");
    }

    @Override
    public String toString() {
        return this.getClass() + super.toString();
    }

    @Override
    public Bear clone() throws CloneNotSupportedException {
        return (Bear) super.clone();
    }

}
