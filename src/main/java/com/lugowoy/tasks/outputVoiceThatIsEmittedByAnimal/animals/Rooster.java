package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Rooster extends Animal {

    public Rooster() {
        super("Cock-a-doodle-doo !");
    }

    @Override
    public String toString() {
        return this.getClass() + super.toString();
    }

    @Override
    public Rooster clone() throws CloneNotSupportedException {
        return (Rooster) super.clone();
    }

}
