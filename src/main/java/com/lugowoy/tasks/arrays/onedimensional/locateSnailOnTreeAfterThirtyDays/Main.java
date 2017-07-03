package com.lugowoy.tasks.arrays.onedimensional.locateSnailOnTreeAfterThirtyDays;

import com.lugowoy.tasks.arrays.onedimensional.locateSnailOnTreeAfterThirtyDays.entity.Snail;
import com.lugowoy.tasks.arrays.onedimensional.locateSnailOnTreeAfterThirtyDays.entity.Tree;
import com.lugowoy.tasks.arrays.onedimensional.locateSnailOnTreeAfterThirtyDays.entity.Weather;
import com.lugowoy.tasks.arrays.onedimensional.locateSnailOnTreeAfterThirtyDays.entity.WeatherArray;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.Arrays;
import java.util.Random;

/** Created by Konstantin Lugowoy on 11.05.2017. */

public class Main {

    private static ReadingData<Integer> readingData = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) {

        System.out.println("Enter the height of the tree : ");
        Tree tree = new Tree(readingData.read());

        System.out.println("Enter the starting location of a snail on the tree : ");
        Snail snail = new Snail(readingData.read());

        tree.setSnail(snail);

        System.out.println("Enter the number of days of observation : ");
        WeatherArray weatherArray = new WeatherArray(readingData.read());

        weatherArray.setWeathers(Arrays.stream(new Weather[weatherArray.getNumberOfDaysOfWeatherObservation()])
                                       .map(weather -> weather = new Weather())
                                       .toArray(Weather[]::new));

        fillWeatherCloudinessInTheWeatherArray(weatherArray);

        Determinable<Tree, WeatherArray> determinable = Determinable::determine;
        Determinable.determine(tree, weatherArray);

    }

    private static void fillWeatherCloudinessInTheWeatherArray(WeatherArray weatherArray) {
        Random random = new Random();

        Arrays.stream(weatherArray.getWeathers()).forEachOrdered(weather -> {
            int tmp = random.nextInt();
            if (tmp > 0) {
                weather.setCloudiness(true);
            }
        });

    }
}
