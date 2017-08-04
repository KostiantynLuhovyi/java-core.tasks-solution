package com.lugowoy.tasks.oop.determineTheSuitabilityOfTheComponent;

import java.util.Iterator;

/** Created by Konstantin Lugowoy on 07.03.2017. */

public class DetermineSuitabilityOfComponent {

    private int firstInterval, secondInterval;

    public DetermineSuitabilityOfComponent(int firstInterval, int secondInterval) {
        this.firstInterval = firstInterval;
        this.secondInterval = secondInterval;
    }

    public void determineSuitabilityOfComponent(BatchOfComponents batchOfComponents) {
        int resultSuitabilityOfComponent = 0;
        int resultNotSuitabilityOfComponent = 0;

        for (Component component : batchOfComponents.getComponentsCollection()) {
            if ((component.getSize() > (this.firstInterval - this.secondInterval))
                    && (component.getSize() < (this.firstInterval + this.secondInterval))) {
                resultSuitabilityOfComponent++;
            } else {
                resultNotSuitabilityOfComponent++;
            }
        }
        System.out.printf("The number of suitable component : %d , not suitable : %d", resultSuitabilityOfComponent, resultNotSuitabilityOfComponent);
    }

    public int getFirstInterval() {
        return firstInterval;
    }

    public int getSecondInterval() {
        return secondInterval;
    }

}
