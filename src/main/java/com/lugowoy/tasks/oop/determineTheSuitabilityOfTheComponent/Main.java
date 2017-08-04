package com.lugowoy.tasks.oop.determineTheSuitabilityOfTheComponent;

import com.lugowoy.helper.generating.GeneratorDataRandomInteger;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

import java.util.ArrayList;
import java.util.Collection;

/** Created by Konstantin Lugowoy on 07.03.2017. */

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        System.out.println("Batch of component : ");
        BatchOfComponents batchOfComponents = new BatchOfComponents(fillBatchOfComponent());
        batchOfComponents.getComponentsCollection().forEach(System.out::println);

        System.out.println("Enter first interval :" );
        int firstInterval = reader.readInt();
        System.out.println("Enter second interval : ");
        int secondInterval = reader.readInt();


        DetermineSuitabilityOfComponent determineSuitabilityOfComponent =
                                                new DetermineSuitabilityOfComponent(firstInterval, secondInterval);

        determineSuitabilityOfComponent.determineSuitabilityOfComponent(batchOfComponents);

    }

    private static Collection<Component> fillBatchOfComponent() {
        ArrayList<Component> componentArrayList = new ArrayList<>(30);
        for (int i = 0; i < 30; i++) {
            componentArrayList.add(new Component(GeneratorDataRandomInteger.generateInt()));
        }
        return componentArrayList;
    }

}
