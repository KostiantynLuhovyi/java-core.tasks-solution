package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 21-Feb-17.*/

public class Door {

    private BigDecimal widthDoor;
    private BigDecimal heightDoor;

    public Door(BigDecimal widthDoor, BigDecimal heightDoor) {
        this.widthDoor = widthDoor;
        this.heightDoor = heightDoor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Door)) return false;

        Door door = (Door) o;

        if (widthDoor != null ? !widthDoor.equals(door.widthDoor) : door.widthDoor != null) return false;
        return heightDoor != null ? heightDoor.equals(door.heightDoor) : door.heightDoor == null;

    }

    @Override
    public int hashCode() {
        int result = widthDoor != null ? widthDoor.hashCode() : 0;
        result = 31 * result + (heightDoor != null ? heightDoor.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Door[" +
                "widthDoor=" + widthDoor +
                ", heightDoor=" + heightDoor +
                ']';
    }

    public BigDecimal getWidthDoor() {
        return widthDoor;
    }

    public void setWidthDoor(BigDecimal widthDoor) {
        this.widthDoor = widthDoor;
    }

    public BigDecimal getHeightDoor() {
        return heightDoor;
    }

    public void setHeightDoor(BigDecimal heightDoor) {
        this.heightDoor = heightDoor;
    }
}
