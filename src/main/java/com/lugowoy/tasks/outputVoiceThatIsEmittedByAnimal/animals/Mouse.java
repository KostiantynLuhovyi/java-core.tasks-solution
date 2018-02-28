package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Mouse extends Animal {

    public Mouse() {
        super("Squeak, squeak !");
    }

    @Override
    public String toString() {
        return this.getClass() + super.toString();
    }

    @Override
    public Mouse clone() throws CloneNotSupportedException {
        return (Mouse) super.clone();
    }

}
