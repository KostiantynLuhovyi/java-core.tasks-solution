package com.lugowoy.tasks.core.outputVoiceThatIsEmittedByAnimal.animals;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Cat extends Animal {

    public Cat() {
        super();
    }

    @Override
    public String getVoice() {
        return "Meow !";
    }
}
