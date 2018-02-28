package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Dog extends Animal {

    public Dog() {
        super("Woof !");
    }

    @Override
    public String toString() {
        return this.getClass() + super.toString();
    }

    @Override
    public Dog clone() throws CloneNotSupportedException {
        return (Dog) super.clone();
    }

}
