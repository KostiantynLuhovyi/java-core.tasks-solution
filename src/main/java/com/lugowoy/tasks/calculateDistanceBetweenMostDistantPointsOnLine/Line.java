package com.lugowoy.tasks.calculateDistanceBetweenMostDistantPointsOnLine;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/** Created by Konstantin Lugowoy on 10.07.2017. */

public class Line<T> implements Serializable, Cloneable {

    private  static final int MIN_NUMBER_POINTS_ON_LINE = 3;

    private T[] pointsOnLine;

    private T valueMinPoint;
    private T valueMaxPoint;

    public Line() {
    }

    public Line(T[] pointsOnLine) {
        if (checkPointsOnLine(pointsOnLine)) {
            this.pointsOnLine = Arrays.copyOf(pointsOnLine, pointsOnLine.length);
        } else {
            System.out.println("The array of arguments passed is equal to null or does not correspond to the correct size.");
        }
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

    @SuppressWarnings("unchecked")
    @Override
    protected Line<T> clone() throws CloneNotSupportedException {
        Line<T> line = (Line<T>) super.clone();
        line.setValueMinPoint(this.getValueMinPoint());
        line.setValueMaxPoint(this.getValueMaxPoint());
        line.setPointsOnLine(this.getPointsOnLine());
        return line;
    }

    public T[] getPointsOnLine() {
        return Arrays.copyOf(pointsOnLine, pointsOnLine.length);
    }

    public void setPointsOnLine(T[] pointsOnLine) {
        if (checkPointsOnLine(pointsOnLine)) {
            this.pointsOnLine = Arrays.copyOf(pointsOnLine, pointsOnLine.length);
        } else {
            throw new IllegalArgumentException("The array of arguments passed is equal to null or does not correspond to the correct size.");
        }
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

    private static <T> boolean checkPointsOnLine(T[] pointsOnLine) {
        boolean resultOfCheck = false;
        if (Objects.nonNull(pointsOnLine)) {
            if (pointsOnLine.length >= MIN_NUMBER_POINTS_ON_LINE) {
                resultOfCheck = true;
            }
        }
        return resultOfCheck;
    }

}
