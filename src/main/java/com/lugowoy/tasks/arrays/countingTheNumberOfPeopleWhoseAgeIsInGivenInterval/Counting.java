package com.lugowoy.tasks.arrays.countingTheNumberOfPeopleWhoseAgeIsInGivenInterval;

/** Created by Konstantin Lugowoy on 14.05.2017. */

@FunctionalInterface
public interface Counting {

    void counting(ArrayOfHumans humans, int startAgeInterval, int finishAgeInterval);

    static void countingTheNumberOfPeopleWithAgeInGivenInterval(ArrayOfHumans humans, int startAgeInterval, int finishAgeInterval) {
        int resultCount = 0;

        if (startAgeInterval < finishAgeInterval) {
            for (Human human : humans.getHumans()) {
                if ((human.getAge() >= startAgeInterval) && (human.getAge() <= finishAgeInterval)) {
                    resultCount++;
                }
            }
            System.out.printf("The number of people whose age is in the range from %d to %d is equal to %d",
                    startAgeInterval, finishAgeInterval, resultCount);
        } else {
            System.out.println("Incorrect data. Can not count.");
        }


    }
}
