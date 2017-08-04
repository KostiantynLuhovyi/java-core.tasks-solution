package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models;

import java.math.BigDecimal;
import java.util.List;

/**Created by Konstantin Lugowoy on 17-Feb-17.*/

public class Room {

    private BigDecimal widthRoom;
    private BigDecimal lengthRoom;
    private BigDecimal heightRoom;

    private BigDecimal totalAreaRoom;
    private BigDecimal areaRoomWithoutAreaDoorsAndWindows;

    private List<Window> windowListInTheFlat;
    private BigDecimal percentageOfTheAreaOfTheWindowsFromTheAreaRoom;
    private BigDecimal totalAreaOfTheWindowsInTheRoom;

    private List<Door> doorListInTheFlat;
    private BigDecimal percentageOfTheAreaOfTheDoorsFromTheAreaRoom;
    private BigDecimal totalAreaOfTheDoorsInTheRoom;

    private TypeOfSurface typeOfSurface;

    public Room() {
    }

    public Room(BigDecimal widthRoom, BigDecimal lengthRoom, BigDecimal heightRoom) {
        this.widthRoom = widthRoom;
        this.lengthRoom = lengthRoom;
        this.heightRoom = heightRoom;
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
        if (getTotalAreaRoom() != null ? !getTotalAreaRoom().equals(room.getTotalAreaRoom()) : room.getTotalAreaRoom() != null)
            return false;
        if (getAreaRoomWithoutAreaDoorsAndWindows() != null ? !getAreaRoomWithoutAreaDoorsAndWindows().equals(room.getAreaRoomWithoutAreaDoorsAndWindows()) : room.getAreaRoomWithoutAreaDoorsAndWindows() != null)
            return false;
        if (getWindowListInTheFlat() != null ? !getWindowListInTheFlat().equals(room.getWindowListInTheFlat()) : room.getWindowListInTheFlat() != null)
            return false;
        if (getPercentageOfTheAreaOfTheWindowsFromTheAreaRoom() != null ? !getPercentageOfTheAreaOfTheWindowsFromTheAreaRoom().equals(room.getPercentageOfTheAreaOfTheWindowsFromTheAreaRoom()) : room.getPercentageOfTheAreaOfTheWindowsFromTheAreaRoom() != null)
            return false;
        if (getTotalAreaOfTheWindowsInTheRoom() != null ? !getTotalAreaOfTheWindowsInTheRoom().equals(room.getTotalAreaOfTheWindowsInTheRoom()) : room.getTotalAreaOfTheWindowsInTheRoom() != null)
            return false;
        if (getDoorListInTheFlat() != null ? !getDoorListInTheFlat().equals(room.getDoorListInTheFlat()) : room.getDoorListInTheFlat() != null)
            return false;
        if (getPercentageOfTheAreaOfTheDoorsFromTheAreaRoom() != null ? !getPercentageOfTheAreaOfTheDoorsFromTheAreaRoom().equals(room.getPercentageOfTheAreaOfTheDoorsFromTheAreaRoom()) : room.getPercentageOfTheAreaOfTheDoorsFromTheAreaRoom() != null)
            return false;
        if (getTotalAreaOfTheDoorsInTheRoom() != null ? !getTotalAreaOfTheDoorsInTheRoom().equals(room.getTotalAreaOfTheDoorsInTheRoom()) : room.getTotalAreaOfTheDoorsInTheRoom() != null)
            return false;
        return getTypeOfSurface() == room.getTypeOfSurface();

    }

    @Override
    public int hashCode() {
        int result = getWidthRoom() != null ? getWidthRoom().hashCode() : 0;
        result = 31 * result + (getLengthRoom() != null ? getLengthRoom().hashCode() : 0);
        result = 31 * result + (getHeightRoom() != null ? getHeightRoom().hashCode() : 0);
        result = 31 * result + (getTotalAreaRoom() != null ? getTotalAreaRoom().hashCode() : 0);
        result = 31 * result + (getAreaRoomWithoutAreaDoorsAndWindows() != null ? getAreaRoomWithoutAreaDoorsAndWindows().hashCode() : 0);
        result = 31 * result + (getWindowListInTheFlat() != null ? getWindowListInTheFlat().hashCode() : 0);
        result = 31 * result + (getPercentageOfTheAreaOfTheWindowsFromTheAreaRoom() != null ? getPercentageOfTheAreaOfTheWindowsFromTheAreaRoom().hashCode() : 0);
        result = 31 * result + (getTotalAreaOfTheWindowsInTheRoom() != null ? getTotalAreaOfTheWindowsInTheRoom().hashCode() : 0);
        result = 31 * result + (getDoorListInTheFlat() != null ? getDoorListInTheFlat().hashCode() : 0);
        result = 31 * result + (getPercentageOfTheAreaOfTheDoorsFromTheAreaRoom() != null ? getPercentageOfTheAreaOfTheDoorsFromTheAreaRoom().hashCode() : 0);
        result = 31 * result + (getTotalAreaOfTheDoorsInTheRoom() != null ? getTotalAreaOfTheDoorsInTheRoom().hashCode() : 0);
        result = 31 * result + (getTypeOfSurface() != null ? getTypeOfSurface().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Room[" +
                "widthRoom=" + widthRoom +
                ", lengthRoom=" + lengthRoom +
                ", heightRoom=" + heightRoom +
                ", totalAreaRoom=" + totalAreaRoom +
                ", areaRoomWithoutAreaDoorsAndWindows=" + areaRoomWithoutAreaDoorsAndWindows +
                ", windowListInTheFlat=" + windowListInTheFlat +
                ", percentageOfTheAreaOfTheWindowsFromTheAreaRoom=" + percentageOfTheAreaOfTheWindowsFromTheAreaRoom +
                ", totalAreaOfTheWindowsInTheRoom=" + totalAreaOfTheWindowsInTheRoom +
                ", doorListInTheFlat=" + doorListInTheFlat +
                ", percentageOfTheAreaOfTheDoorsFromTheAreaRoom=" + percentageOfTheAreaOfTheDoorsFromTheAreaRoom +
                ", totalAreaOfTheDoorsInTheRoom=" + totalAreaOfTheDoorsInTheRoom +
                ", typeOfSurface=" + typeOfSurface +
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

    public BigDecimal getTotalAreaRoom() {
        return totalAreaRoom;
    }

    public void setTotalAreaRoom(BigDecimal totalAreaRoom) {
        this.totalAreaRoom = totalAreaRoom;
    }

    public BigDecimal getAreaRoomWithoutAreaDoorsAndWindows() {
        return areaRoomWithoutAreaDoorsAndWindows;
    }

    public void setAreaRoomWithoutAreaDoorsAndWindows(BigDecimal areaRoomWithoutAreaDoorsAndWindows) {
        this.areaRoomWithoutAreaDoorsAndWindows = areaRoomWithoutAreaDoorsAndWindows;
    }

    public List<Window> getWindowListInTheFlat() {
        return windowListInTheFlat;
    }

    public void setWindowListInTheFlat(List<Window> windowListInTheFlat) {
        this.windowListInTheFlat = windowListInTheFlat;
    }

    public BigDecimal getPercentageOfTheAreaOfTheWindowsFromTheAreaRoom() {
        return percentageOfTheAreaOfTheWindowsFromTheAreaRoom;
    }

    public void setPercentageOfTheAreaOfTheWindowsFromTheAreaRoom(BigDecimal percentageOfTheAreaOfTheWindowsFromTheAreaRoom) {
        this.percentageOfTheAreaOfTheWindowsFromTheAreaRoom = percentageOfTheAreaOfTheWindowsFromTheAreaRoom;
    }

    public BigDecimal getTotalAreaOfTheWindowsInTheRoom() {
        return totalAreaOfTheWindowsInTheRoom;
    }

    public void setTotalAreaOfTheWindowsInTheRoom(BigDecimal totalAreaOfTheWindowsInTheRoom) {
        this.totalAreaOfTheWindowsInTheRoom = totalAreaOfTheWindowsInTheRoom;
    }

    public List<Door> getDoorListInTheFlat() {
        return doorListInTheFlat;
    }

    public void setDoorListInTheFlat(List<Door> doorListInTheFlat) {
        this.doorListInTheFlat = doorListInTheFlat;
    }

    public BigDecimal getPercentageOfTheAreaOfTheDoorsFromTheAreaRoom() {
        return percentageOfTheAreaOfTheDoorsFromTheAreaRoom;
    }

    public void setPercentageOfTheAreaOfTheDoorsFromTheAreaRoom(BigDecimal percentageOfTheAreaOfTheDoorsFromTheAreaRoom) {
        this.percentageOfTheAreaOfTheDoorsFromTheAreaRoom = percentageOfTheAreaOfTheDoorsFromTheAreaRoom;
    }

    public BigDecimal getTotalAreaOfTheDoorsInTheRoom() {
        return totalAreaOfTheDoorsInTheRoom;
    }

    public void setTotalAreaOfTheDoorsInTheRoom(BigDecimal totalAreaOfTheDoorsInTheRoom) {
        this.totalAreaOfTheDoorsInTheRoom = totalAreaOfTheDoorsInTheRoom;
    }

    public TypeOfSurface getTypeOfSurface() {
        return typeOfSurface;
    }

    public void setTypeOfSurface(TypeOfSurface typeOfSurface) {
        this.typeOfSurface = typeOfSurface;
    }

}
