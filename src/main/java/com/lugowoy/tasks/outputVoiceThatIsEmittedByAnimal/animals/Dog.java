package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Dog extends Animal {

    public Dog() {
        super();
    }

    @Override
    public String getVoice() {
        return "Woof !";
    }
}
