package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom;

import java.math.BigDecimal;
import java.util.List;

/**Created by Konstantin Lugowoy on 17-Feb-17.*/

public class Room {

    private BigDecimal widthRoom;
    private BigDecimal lengthRoom;
    private BigDecimal heightRoom;

    private BigDecimal percentageOfWindowsInTheRoom;
    private List<Window> windowListInTheFlat;

    public Room() {
    }

    public Room(BigDecimal widthRoom, BigDecimal lengthRoom, BigDecimal heightRoom) {
        this.widthRoom = widthRoom;
        this.lengthRoom = lengthRoom;
        this.heightRoom = heightRoom;
    }

    public Room(BigDecimal widthRoom, BigDecimal lengthRoom, BigDecimal heightRoom, BigDecimal percentageOfWindowsInTheRoom) {
        this.widthRoom = widthRoom;
        this.lengthRoom = lengthRoom;
        this.heightRoom = heightRoom;
        this.percentageOfWindowsInTheRoom = percentageOfWindowsInTheRoom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;

        Room room = (Room) o;

        if (getWidthRoom() != null ? !getWidthRoom().equals(room.getWidthRoom()) : room.getWidthRoom() != null)
            return false;
        if (getLengthRoom() != null ? !getLengthRoom().equals(room.getLengthRoom()) : room.getLengthRoom() != null)
            return false;
        if (getHeightRoom() != null ? !getHeightRoom().equals(room.getHeightRoom()) : room.getHeightRoom() != null)
            return false;
        if (getPercentageOfWindowsInTheRoom() != null ? !getPercentageOfWindowsInTheRoom().equals(room.getPercentageOfWindowsInTheRoom()) : room.getPercentageOfWindowsInTheRoom() != null)
            return false;
        return getWindowListInTheFlat() != null ? getWindowListInTheFlat().equals(room.getWindowListInTheFlat()) : room.getWindowListInTheFlat() == null;
    }

    @Override
    public int hashCode() {
        int result = getWidthRoom() != null ? getWidthRoom().hashCode() : 0;
        result = 31 * result + (getLengthRoom() != null ? getLengthRoom().hashCode() : 0);
        result = 31 * result + (getHeightRoom() != null ? getHeightRoom().hashCode() : 0);
        result = 31 * result + (getPercentageOfWindowsInTheRoom() != null ? getPercentageOfWindowsInTheRoom().hashCode() : 0);
        result = 31 * result + (getWindowListInTheFlat() != null ? getWindowListInTheFlat().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Room[" +
                "widthRoom=" + widthRoom +
                ", lengthRoom=" + lengthRoom +
                ", heightRoom=" + heightRoom +
                ", percentageOfWindowsInTheRoom=" + percentageOfWindowsInTheRoom +
                ", windowListInTheFlat=" + windowListInTheFlat +
                ']';
    }

    public BigDecimal getWidthRoom() {
        return widthRoom;
    }

    public void setWidthRoom(BigDecimal widthRoom) {
        this.widthRoom = widthRoom;
    }

    public BigDecimal getLengthRoom() {
        return lengthRoom;
    }

    public void setLengthRoom(BigDecimal lengthRoom) {
        this.lengthRoom = lengthRoom;
    }

    public BigDecimal getHeightRoom() {
        return heightRoom;
    }

    public void setHeightRoom(BigDecimal heightRoom) {
        this.heightRoom = heightRoom;
    }

    public BigDecimal getPercentageOfWindowsInTheRoom() {
        return percentageOfWindowsInTheRoom;
    }

    public void setPercentageOfWindowsInTheRoom(BigDecimal percentageOfWindowsInTheRoom) {
        this.percentageOfWindowsInTheRoom = percentageOfWindowsInTheRoom;
    }

    public List<Window> getWindowListInTheFlat() {
        return windowListInTheFlat;
    }

    public void setWindowListInTheFlat(List<Window> windowListInTheFlat) {
        this.windowListInTheFlat = windowListInTheFlat;
    }
}
