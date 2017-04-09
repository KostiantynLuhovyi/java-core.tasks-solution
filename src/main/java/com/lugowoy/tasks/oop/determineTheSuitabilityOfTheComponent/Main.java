package com.lugowoy.tasks.oop.determineTheSuitabilityOfTheComponent;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingRandomData;

import java.util.ArrayList;
import java.util.Collection;

/** Created by Konstantin Lugowoy on 07.03.2017. */

public class Main {

    private static ReadingData<Integer> reading = new ReadingData<>(new ReadingRandomData()::readInt);

    public static void main(String[] args) {

        System.out.println("Batch of component : ");
        BatchOfComponents batchOfComponents = new BatchOfComponents(fillBatchOfComponent(reading));
        batchOfComponents.getComponentsCollection().forEach(System.out::println);

        System.out.println("Enter first interval :" );
        int firstInterval = reading.read();
        System.out.println("Enter second interval : ");
        int secondInterval = reading.read();


        DetermineSuitabilityOfComponent determineSuitabilityOfComponent =
                                                new DetermineSuitabilityOfComponent(firstInterval, secondInterval);

        determineSuitabilityOfComponent.determineSuitabilityOfComponent(batchOfComponents);
    }

    private static Collection<Component> fillBatchOfComponent(ReadingData<Integer> reading) {
        ArrayList<Component> componentArrayList = new ArrayList<>(30);
        for (int i = 0; i < 30; i++) {
            componentArrayList.add(new Component(reading.read()));
        }
        return componentArrayList;
    }
}
