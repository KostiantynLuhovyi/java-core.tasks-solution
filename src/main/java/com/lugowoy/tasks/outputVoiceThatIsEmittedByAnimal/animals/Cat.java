package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Cat extends Animal {

    public Cat() {
        super("Meow !");
    }

    @Override
    public String toString() {
        return this.getClass() + super.toString();
    }

    @Override
    public Cat clone() throws CloneNotSupportedException {
        return (Cat) super.clone();
    }

}
