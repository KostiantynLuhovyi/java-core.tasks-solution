package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Owl extends Animal {

    public Owl() {
        super("To - who !");
    }

    @Override
    public String toString() {
        return this.getClass() + super.toString();
    }

    @Override
    public Owl clone() throws CloneNotSupportedException {
        return (Owl) super.clone();
    }

}
