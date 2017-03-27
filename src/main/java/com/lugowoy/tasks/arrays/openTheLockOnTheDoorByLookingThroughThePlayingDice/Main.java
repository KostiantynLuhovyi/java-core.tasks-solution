package com.lugowoy.tasks.arrays.openTheLockOnTheDoorByLookingThroughThePlayingDice;

import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Random;

/** Created by Konstantin Lugowoy on 27.03.2017. */

public class Main {

    private static final Fillable FILLABLE = Fillable::fillingDoorLock;

    private static final Openable OPENABLE = Openable::openDoorLock;

    public static void main(String[] args) {
        DoorLock doorLock = new DoorLock();
        System.out.println(doorLock);

        String resume = "";
        Reading<String> reading = new ReadingUserInputData()::readLine;
        do {
            FILLABLE.filling(doorLock);
            System.out.println(doorLock);
            if (OPENABLE.open(doorLock)) {
                System.out.println("Door open.");
                break;
            } else {
                System.out.println("Door not open. Do you want to repeat, press \'r\'.");
                System.out.println("If you do not want to repeat, press \'f\'.");
                System.out.println("Enter : ");
                resume = reading.reading();

                if (resume.equals("f")) break;
            }

        } while (resume.equals("r"));

    }
}
