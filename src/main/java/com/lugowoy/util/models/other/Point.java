package com.lugowoy.util.models.other;

import com.lugowoy.util.models.Model;

/** Created by Konstantin Lugowoy on 02.07.2017. */

public class Point<T> extends Model {

    private T coordinateX;
    private T coordinateY;

    public Point() {
    }

    public Point(T coordinateX, T coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        if (!super.equals(o)) return false;

        Point<?> point = (Point<?>) o;

        if (coordinateX != null ? !coordinateX.equals(point.coordinateX) : point.coordinateX != null) return false;
        return coordinateY != null ? coordinateY.equals(point.coordinateY) : point.coordinateY == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (coordinateX != null ? coordinateX.hashCode() : 0);
        result = 31 * result + (coordinateY != null ? coordinateY.hashCode() : 0);
        return result;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Point point = (Point) super.clone();
        point.coordinateX = this.coordinateX;
        point.coordinateY = this.coordinateY;
        return point;
    }

    @Override
    public String toString() {
        return "Point[" +
                "coordinateX=" + coordinateX +
                ", coordinateY=" + coordinateY +
                ']';
    }

    public T getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(T coordinateX) {
        this.coordinateX = coordinateX;
    }

    public T getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(T coordinateY) {
        this.coordinateY = coordinateY;
    }

}

