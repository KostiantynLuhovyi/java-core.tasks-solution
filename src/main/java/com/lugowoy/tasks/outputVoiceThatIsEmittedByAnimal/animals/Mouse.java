package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals;

import com.lugowoy.helper.other.DeepCloning;

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
    public Mouse clone() {
        Mouse mouse = new Mouse();
        try {
            mouse = (Mouse) super.clone();
            mouse.setVoice(DeepCloning.CLONER.deepClone(this.getVoice()));
        } catch (CloneNotSupportedException ex) {
            new InternalError(ex.getMessage()).printStackTrace();
        }
        return mouse;
    }

}
