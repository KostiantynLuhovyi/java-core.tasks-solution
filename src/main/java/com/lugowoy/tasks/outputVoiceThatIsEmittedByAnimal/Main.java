package com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;
import com.lugowoy.tasks.outputVoiceThatIsEmittedByAnimal.animals.*;

import java.util.ArrayList;
import java.util.List;

/** Created by Konstantin Lugowoy on 04.10.2017. */

public class Main {

    private static final Reader READER = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        List<Animal> animalList = fillArrayListAnimal();

        int number = getSelectAnimal(animalList);

        Voice voice = new Voice();
        voice.getVoice(animalList.get(number));

    }

    private static int getSelectAnimal(List<Animal> animalList) {
        System.out.println("Enter number animal : ");
        int number;
        while (true) {
            number = READER.readInt();
            if ((number >= 0) && (number <= animalList.size())) {
                break;
            } else {
                System.out.println("Not correct number. Re-enter : ");
            }
        }
        return number;
    }

    private static List<Animal> fillArrayListAnimal() {
        List<Animal> animalList = new ArrayList<>(0);
        animalList.add(new Bear());
        animalList.add(new Bee());
        animalList.add(new Cat());
        animalList.add(new Chick());
        animalList.add(new Cow());
        animalList.add(new Crow());
        animalList.add(new Dog());
        animalList.add(new Donkey());
        animalList.add(new Elephant());
        animalList.add(new Mouse());
        animalList.add(new Owl());
        animalList.add(new Rooster());
        return animalList;
    }

}
