package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 17-Feb-17.*/

public class Window {

    private BigDecimal widthWindow;
    private BigDecimal heightWindow;

    public Window(BigDecimal widthWindow, BigDecimal heightWindow) {
        this.widthWindow = widthWindow;
        this.heightWindow = heightWindow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Window)) return false;

        Window window = (Window) o;

        if (widthWindow != null ? !widthWindow.equals(window.widthWindow) : window.widthWindow != null) return false;
        return heightWindow != null ? heightWindow.equals(window.heightWindow) : window.heightWindow == null;

    }

    @Override
    public int hashCode() {
        int result = widthWindow != null ? widthWindow.hashCode() : 0;
        result = 31 * result + (heightWindow != null ? heightWindow.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Window[" +
                "widthWindow=" + widthWindow +
                ", heightWindow=" + heightWindow +
                ']';
    }

    public BigDecimal getWidthWindow() {
        return widthWindow;
    }

    public void setWidthWindow(BigDecimal widthWindow) {
        this.widthWindow = widthWindow;
    }

    public BigDecimal getHeightWindow() {
        return heightWindow;
    }

    public void setHeightWindow(BigDecimal heightWindow) {
        this.heightWindow = heightWindow;
    }
}
