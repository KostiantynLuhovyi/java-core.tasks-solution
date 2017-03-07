package com.lugowoy.tasks.oop.determineTheSuitabilityOfTheComponent;

/** Created by Konstantin Lugowoy on 07.03.2017. */

public class Component {

    private int size;

    public Component(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Component)) return false;

        Component component = (Component) o;

        return getSize() == component.getSize();
    }

    @Override
    public int hashCode() {
        return getSize();
    }

    @Override
    public String toString() {
        return "Component[" +
                "size=" + size +
                ']';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
