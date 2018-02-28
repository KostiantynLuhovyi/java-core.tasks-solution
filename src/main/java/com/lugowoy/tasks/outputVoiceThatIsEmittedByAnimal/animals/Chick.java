package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Chick extends Animal {

    public Chick() {
        super("Cheep-cheep !");
    }

    @Override
    public String toString() {
        return this.getClass() + super.toString();
    }

    @Override
    public Chick clone() throws CloneNotSupportedException {
        return (Chick) super.clone();
    }

}
