package com.lugowoy.tasks.arrays.countingTheNumberOfPeopleWhoseAgeIsInGivenInterval;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Random;

/** Created by Konstantin Lugowoy on 14.05.2017. */

public class Main {

    private static final Random RANDOM_AGE = new Random();

    private static final ReadingData<Integer> READING_DATA = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) {

        ArrayOfHumans humans = null;

        System.out.println("Enter the quantity number of people to count : ");
        while(true) {
            int quantityNumber = READING_DATA.read();
            if (quantityNumber > 0) {
                humans = createArrayOfHumans(quantityNumber);
                break;
            } else {
                System.out.println("The number of people for counting is less than or equal to zero. Re-enter : ");
            }
        }

        System.out.println("Enter start age interval : ");
        int startAgeInterval;
        while(true) {
            startAgeInterval = READING_DATA.read();
            if ((startAgeInterval >= 0 ) && (startAgeInterval <= 140)) {
                break;
            } else {
                System.out.println("Not correct value of start age interval. Re-enter : ");
            }
        }

        System.out.println("Enter finish age interval : ");
        int finishAgeInterval;
        while(true) {
            finishAgeInterval = READING_DATA.read();
            if ((finishAgeInterval > 0) && (finishAgeInterval <= 150)) {
                break;
            } else {
                System.out.println("Not correct value of finish age interval. Re-enter : ");
            }
        }

        Counting counting = Counting::countingTheNumberOfPeopleWithAgeInGivenInterval;
        counting.counting(humans, startAgeInterval, finishAgeInterval);

    }

    private static ArrayOfHumans createArrayOfHumans(int quantityHumans) {
        ArrayOfHumans arrayOfHumans = new ArrayOfHumans();
        arrayOfHumans.setHumans(new Human[quantityHumans]);
        for (int i = 0; i < arrayOfHumans.getHumans().length; i++) {
            arrayOfHumans.getHumans()[i] = new Human();
            arrayOfHumans.getHumans()[i].setAge(RANDOM_AGE.nextInt(150));
        }
        return arrayOfHumans;
    }
}
