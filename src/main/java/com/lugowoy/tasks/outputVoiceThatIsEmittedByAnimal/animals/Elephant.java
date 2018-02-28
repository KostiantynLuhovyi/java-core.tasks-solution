package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Elephant extends Animal {

    public Elephant() {
        super("Ugh, ugh !");
    }


    @Override
    public String toString() {
        return this.getClass() + super.toString();
    }

    @Override
    public Elephant clone() throws CloneNotSupportedException {
        return (Elephant) super.clone();
    }

}
