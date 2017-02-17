package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom;

import java.awt.*;
import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 17-Feb-17.*/

public class Paint {

    private BigDecimal pricePerLiter;

    private Color colorPaint;

    private BigDecimal paintConsumptionPerSquareMeter;

    public Paint() {
    }

    public Paint(BigDecimal pricePerLiter, BigDecimal paintConsumptionPerSquareMeter) {
        this.pricePerLiter = pricePerLiter;
        this.paintConsumptionPerSquareMeter = paintConsumptionPerSquareMeter;
    }

    public Paint(BigDecimal pricePerLiter, Color colorPaint, BigDecimal paintConsumptionPerSquareMeter) {
        this.pricePerLiter = pricePerLiter;
        this.colorPaint = colorPaint;
        this.paintConsumptionPerSquareMeter = paintConsumptionPerSquareMeter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paint)) return false;

        Paint paint = (Paint) o;

        if (pricePerLiter != null ? !pricePerLiter.equals(paint.pricePerLiter) : paint.pricePerLiter != null)
            return false;
        if (colorPaint != null ? !colorPaint.equals(paint.colorPaint) : paint.colorPaint != null) return false;
        return paintConsumptionPerSquareMeter != null ? paintConsumptionPerSquareMeter.equals(paint.paintConsumptionPerSquareMeter) : paint.paintConsumptionPerSquareMeter == null;

    }

    @Override
    public int hashCode() {
        int result = pricePerLiter != null ? pricePerLiter.hashCode() : 0;
        result = 31 * result + (colorPaint != null ? colorPaint.hashCode() : 0);
        result = 31 * result + (paintConsumptionPerSquareMeter != null ? paintConsumptionPerSquareMeter.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Paint[" +
                "pricePerLiter=" + pricePerLiter +
                ", colorPaint=" + colorPaint +
                ", paintConsumptionPerSquareMeter=" + paintConsumptionPerSquareMeter +
                ']';
    }

    public BigDecimal getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(BigDecimal pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public Color getColorPaint() {
        return colorPaint;
    }

    public void setColorPaint(Color colorPaint) {
        this.colorPaint = colorPaint;
    }

    public BigDecimal getPaintConsumptionPerSquareMeter() {
        return paintConsumptionPerSquareMeter;
    }

    public void setPaintConsumptionPerSquareMeter(BigDecimal paintConsumptionPerSquareMeter) {
        this.paintConsumptionPerSquareMeter = paintConsumptionPerSquareMeter;
    }
}
