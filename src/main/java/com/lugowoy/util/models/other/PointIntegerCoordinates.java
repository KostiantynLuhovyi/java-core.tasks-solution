package com.lugowoy.util.models.other;

/** Created by Konstantin Lugowoy on 02.07.2017. */

public class PointIntegerCoordinates extends Point<Integer> {

    public PointIntegerCoordinates() {
    }

    public PointIntegerCoordinates(Integer coordinateX, Integer coordinateY) {
        super(coordinateX, coordinateY);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Integer getCoordinateX() {
        return super.getCoordinateX();
    }

    @Override
    public void setCoordinateX(Integer coordinateX) {
        super.setCoordinateX(coordinateX);
    }

    @Override
    public Integer getCoordinateY() {
        return super.getCoordinateY();
    }

    @Override
    public void setCoordinateY(Integer coordinateY) {
        super.setCoordinateY(coordinateY);
    }

}
