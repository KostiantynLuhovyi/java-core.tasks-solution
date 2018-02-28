package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Cow extends Animal {

    public Cow() {
        super("Moo-moo !");
    }

    @Override
    public String toString() {
        return this.getClass() + super.toString();
    }

    @Override
    public Cow clone() throws CloneNotSupportedException {
        return (Cow) super.clone();
    }

}
