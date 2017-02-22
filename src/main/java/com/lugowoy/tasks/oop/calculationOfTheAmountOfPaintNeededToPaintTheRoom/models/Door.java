package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 21-Feb-17.*/

public class Door {

    private BigDecimal widthDoor;
    private BigDecimal heightDoor;

    private BigDecimal areaDoor;

    public Door(BigDecimal widthDoor, BigDecimal heightDoor) {
        this.widthDoor = widthDoor;
        this.heightDoor = heightDoor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Door)) return false;

        Door door = (Door) o;

        if (getWidthDoor() != null ? !getWidthDoor().equals(door.getWidthDoor()) : door.getWidthDoor() != null)
            return false;
        if (getHeightDoor() != null ? !getHeightDoor().equals(door.getHeightDoor()) : door.getHeightDoor() != null)
            return false;
        return getAreaDoor() != null ? getAreaDoor().equals(door.getAreaDoor()) : door.getAreaDoor() == null;

    }

    @Override
    public int hashCode() {
        int result = getWidthDoor() != null ? getWidthDoor().hashCode() : 0;
        result = 31 * result + (getHeightDoor() != null ? getHeightDoor().hashCode() : 0);
        result = 31 * result + (getAreaDoor() != null ? getAreaDoor().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Door[" +
                "widthDoor=" + widthDoor +
                ", heightDoor=" + heightDoor +
                ", areaDoor=" + areaDoor +
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

    public BigDecimal getAreaDoor() {
        return areaDoor;
    }

    public void setAreaDoor(BigDecimal areaDoor) {
        this.areaDoor = areaDoor;
    }
}
