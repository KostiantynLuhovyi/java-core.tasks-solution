package com.lugowoy.util.models.other;

/** Created by Konstantin Lugowoy on 02.07.2017. */

public class PointDoubleCoordinates extends Point<Double> {

    public PointDoubleCoordinates() {
    }

    public PointDoubleCoordinates(Double coordinateX, Double coordinateY) {
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
    public Double getCoordinateX() {
        return super.getCoordinateX();
    }

    @Override
    public void setCoordinateX(Double coordinateX) {
        super.setCoordinateX(coordinateX);
    }

    @Override
    public Double getCoordinateY() {
        return super.getCoordinateY();
    }

    @Override
    public void setCoordinateY(Double coordinateY) {
        super.setCoordinateY(coordinateY);
    }

}
