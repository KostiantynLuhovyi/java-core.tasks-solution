package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models;

import java.awt.Color;
import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 17-Feb-17.*/

public class Paint {

    private BigDecimal pricePerLiter;

    private Color colorPaint;

    private TypeOfPaint typeOfPaint;
    private BigDecimal expenseOfThePaintPerSquareMeter;

    public Paint() {
    }

    public Paint(BigDecimal pricePerLiter, TypeOfPaint typeOfPaint) {
        this.pricePerLiter = pricePerLiter;
        this.typeOfPaint = typeOfPaint;
    }

    public Paint(BigDecimal pricePerLiter, Color colorPaint, TypeOfPaint typeOfPaint) {
        this.pricePerLiter = pricePerLiter;
        this.colorPaint = colorPaint;
        this.typeOfPaint = typeOfPaint;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Paint)) return false;

        Paint paint = (Paint) o;

        if (getPricePerLiter() != null ? !getPricePerLiter().equals(paint.getPricePerLiter()) : paint.getPricePerLiter() != null)
            return false;
        if (getColorPaint() != null ? !getColorPaint().equals(paint.getColorPaint()) : paint.getColorPaint() != null)
            return false;
        if (getTypeOfPaint() != paint.getTypeOfPaint()) return false;
        return getExpenseOfThePaintPerSquareMeter() != null ? getExpenseOfThePaintPerSquareMeter().equals(paint.getExpenseOfThePaintPerSquareMeter()) : paint.getExpenseOfThePaintPerSquareMeter() == null;

    }

    @Override
    public int hashCode() {
        int result = getPricePerLiter() != null ? getPricePerLiter().hashCode() : 0;
        result = 31 * result + (getColorPaint() != null ? getColorPaint().hashCode() : 0);
        result = 31 * result + (getTypeOfPaint() != null ? getTypeOfPaint().hashCode() : 0);
        result = 31 * result + (getExpenseOfThePaintPerSquareMeter() != null ? getExpenseOfThePaintPerSquareMeter().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Paint[" +
                "pricePerLiter=" + pricePerLiter +
                ", colorPaint=" + colorPaint +
                ", typeOfPaint=" + typeOfPaint +
                ", expenseOfThePaintPerSquareMeter=" + expenseOfThePaintPerSquareMeter +
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

    public TypeOfPaint getTypeOfPaint() {
        return typeOfPaint;
    }

    public void setTypeOfPaint(TypeOfPaint typeOfPaint) {
        this.typeOfPaint = typeOfPaint;
    }

    public BigDecimal getExpenseOfThePaintPerSquareMeter() {
        return expenseOfThePaintPerSquareMeter;
    }

    public void setExpenseOfThePaintPerSquareMeter(BigDecimal expenseOfThePaintPerSquareMeter) {
        this.expenseOfThePaintPerSquareMeter = expenseOfThePaintPerSquareMeter;
    }

}
