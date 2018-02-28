package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Donkey extends Animal {

    public Donkey() {
        super("Hee-Haw !");
    }

    @Override
    public String toString() {
        return this.getClass() + super.toString();
    }

    @Override
    public Donkey clone() throws CloneNotSupportedException {
        return (Donkey) super.clone();
    }

}
