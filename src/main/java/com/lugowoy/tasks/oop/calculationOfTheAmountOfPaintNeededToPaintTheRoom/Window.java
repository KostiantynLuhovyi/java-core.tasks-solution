package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 17-Feb-17.*/

public class Window {

    private BigDecimal widthWindow;
    private BigDecimal lengthWindow;
    private BigDecimal heightWindow;

    public Window(BigDecimal widthWindow, BigDecimal lengthWindow, BigDecimal heightWindow) {
        this.widthWindow = widthWindow;
        this.lengthWindow = lengthWindow;
        this.heightWindow = heightWindow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Window)) return false;

        Window window = (Window) o;

        if (getWidthWindow() != null ? !getWidthWindow().equals(window.getWidthWindow()) : window.getWidthWindow() != null) return false;
        if (getLengthWindow() != null ? !getLengthWindow().equals(window.getLengthWindow()) : window.getLengthWindow() != null) return false;
        return getHeightWindow() != null ? getHeightWindow().equals(window.getHeightWindow()) : window.getHeightWindow() == null;

    }

    @Override
    public int hashCode() {
        int result = getWidthWindow() != null ? getWidthWindow().hashCode() : 0;
        result = 31 * result + (getLengthWindow() != null ? getLengthWindow().hashCode() : 0);
        result = 31 * result + (getHeightWindow() != null ? getHeightWindow().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Window[" +
                "widthWindow=" + widthWindow +
                ", lengthWindow=" + lengthWindow +
                ", heightWindow=" + heightWindow +
                ']';
    }

    public BigDecimal getWidthWindow() {
        return widthWindow;
    }

    public void setWidthWindow(BigDecimal widthWindow) {
        this.widthWindow = widthWindow;
    }

    public BigDecimal getLengthWindow() {
        return lengthWindow;
    }

    public void setLengthWindow(BigDecimal lengthWindow) {
        this.lengthWindow = lengthWindow;
    }

    public BigDecimal getHeightWindow() {
        return heightWindow;
    }

    public void setHeightWindow(BigDecimal heightWindow) {
        this.heightWindow = heightWindow;
    }
}
