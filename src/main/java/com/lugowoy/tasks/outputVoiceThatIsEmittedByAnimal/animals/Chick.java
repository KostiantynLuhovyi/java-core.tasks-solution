package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals;

import com.lugowoy.helper.other.DeepCloning;

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
        Chick chick = new Chick();
        try {
            chick = (Chick) super.clone();
            chick.setVoice(DeepCloning.CLONER.deepClone(this.getVoice()));
        } catch (CloneNotSupportedException ex) {
            new InternalError(ex.getMessage()).printStackTrace();
        }
        return chick;
    }

}
