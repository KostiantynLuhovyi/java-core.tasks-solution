package com.lugowoy.tasks.core.calculateDistanceBetweenMostDistantPointsOnLine;

import java.io.Serializable;
import java.util.Arrays;

/** Created by Konstantin Lugowoy on 10.07.2017. */

public class Line<T> implements Serializable, Cloneable {

    private T[] pointsOnLine;

    private T valueMinPoint;
    private T valueMaxPoint;

    public Line() {
    }

    public Line(T[] pointsOnLine) {
        this.pointsOnLine = pointsOnLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line)) return false;

        Line<?> line = (Line<?>) o;

        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        if (!Arrays.equals(getPointsOnLine(), line.getPointsOnLine())) return false;
        if (getValueMinPoint() != null ? !getValueMinPoint().equals(line.getValueMinPoint()) : line.getValueMinPoint() != null)
            return false;
        return getValueMaxPoint() != null ? getValueMaxPoint().equals(line.getValueMaxPoint()) : line.getValueMaxPoint() == null;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(pointsOnLine);
        result = 31 * result + (valueMaxPoint != null ? valueMaxPoint.hashCode() : 0);
        result = 31 * result + (valueMinPoint != null ? valueMinPoint.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Line[" +
                "pointsOnLine=" + Arrays.toString(pointsOnLine) +
                ", valueMaxPoint=" + valueMaxPoint +
                ", valueMinPoint=" + valueMinPoint +
                ']';
    }

    @Override
    protected Line<T> clone() throws CloneNotSupportedException {
        Line<T> line = (Line<T>) super.clone();
        line.setValueMinPoint(this.getValueMinPoint());
        line.setValueMaxPoint(this.getValueMaxPoint());
        line.setPointsOnLine(this.getPointsOnLine());
        return line;
    }

    public T[] getPointsOnLine() {
        return pointsOnLine;
    }

    public void setPointsOnLine(T[] pointsOnLine) {
        this.pointsOnLine = pointsOnLine;
    }

    public T getValueMinPoint() {
        return valueMinPoint;
    }

    public void setValueMinPoint(T valueMinPoint) {
        this.valueMinPoint = valueMinPoint;
    }

    public T getValueMaxPoint() {
        return valueMaxPoint;
    }

    public void setValueMaxPoint(T valueMaxPoint) {
        this.valueMaxPoint = valueMaxPoint;
    }

}
