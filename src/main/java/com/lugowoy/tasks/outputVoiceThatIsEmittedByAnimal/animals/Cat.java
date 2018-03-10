package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals;

import com.lugowoy.helper.other.DeepCloning;

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
    public Cat clone() {
        Cat cat = new Cat();
        try {
            cat = (Cat) super.clone();
            cat.setVoice(DeepCloning.CLONER.deepClone(this.getVoice()));
        } catch (CloneNotSupportedException ex) {
            new InternalError(ex.getMessage()).printStackTrace();
        }
        return cat;
    }

}
