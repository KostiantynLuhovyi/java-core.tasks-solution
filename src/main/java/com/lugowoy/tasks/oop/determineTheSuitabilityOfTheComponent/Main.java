package com.lugowoy.tasks.oop.determineTheSuitabilityOfTheComponent;

import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.ReadingRandomData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/** Created by Konstantin Lugowoy on 07.03.2017. */

public class Main {

    private static Reading<Integer> reading = new ReadingRandomData()::readInt;

    public static void main(String[] args) {

        System.out.println("Batch of component : ");
        BatchOfComponents batchOfComponents = new BatchOfComponents(fillBatchOfComponent(reading));
        batchOfComponents.getComponentsCollection().forEach(System.out::println);

        reading = new ReadingUserInputData()::readInt;
        System.out.println("Enter first interval :" );
        int firstInterval = reading.reading();
        System.out.println("Enter second interval : ");
        int secondInterval = reading.reading();


        DetermineSuitabilityOfComponent determineSuitabilityOfComponent =
                                                new DetermineSuitabilityOfComponent(firstInterval, secondInterval);

        determineSuitabilityOfComponent.determineSuitabilityOfComponent(batchOfComponents);
    }

    private static Collection<Component> fillBatchOfComponent(Reading<Integer> reading){
        ArrayList<Component> componentArrayList = new ArrayList<>(30);
        for (int i = 0; i < 30; i++) {
            componentArrayList.add(new Component(reading.reading()));
        }
        return componentArrayList;
    }
}
