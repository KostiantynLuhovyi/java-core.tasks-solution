package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 18-Feb-17.*/

public enum TypeOfPaint {
    TYPE_WATERBASED (0.15, 0.16, 0.17, 0.20, 0.18),
    TYPE_ENAMEL (0.12, 0.12, 0.13, 0.16, 0.15),
    TYPE_OIL (0.18, 0.19, 0.20, 0.21, 0.20),
    TYPE_SILICONE (0.8, 0.9, 0.9, 0.11, 0.10),
    TYPE_PLASTIC (0.8, 0.9, 0.9, 0.11, 0.10),
    TYPE_ACRYLIC (0.8, 0.9, 0.9, 0.11, 0.10),
    TYPE_LATEX (0.10, 0.10, 0.11, 0.13, 0.12),
    TYPE_ALKYD (0.11, 0.11, 0.12, 0.13, 0.12);

    private double expenseForTheMetalSurface;
    private double expenseForSmoothSurface;
    private double expenseForTheWoodSurface;
    private double expenseForThePlasterSurface;
    private double expenseForTheGypsumPlasterboardSurface;

    TypeOfPaint(double expenseForTheMetalSurface, double expenseForSmoothSurface,
                double expenseForTheWoodSurface, double expenseForThePlasterSurface,
                double expenseForTheGypsumPlasterboardSurface) {
        this.expenseForTheMetalSurface = expenseForTheMetalSurface;
        this.expenseForSmoothSurface = expenseForSmoothSurface;
        this.expenseForTheWoodSurface = expenseForTheWoodSurface;
        this.expenseForThePlasterSurface = expenseForThePlasterSurface;
        this.expenseForTheGypsumPlasterboardSurface = expenseForTheGypsumPlasterboardSurface;
    }

    public double getExpenseForTheMetalSurface() {
        return expenseForTheMetalSurface;
    }

    public void setExpenseForTheMetalSurface(double expenseForTheMetalSurface) {
        this.expenseForTheMetalSurface = expenseForTheMetalSurface;
    }

    public double getExpenseForSmoothSurface() {
        return expenseForSmoothSurface;
    }

    public void setExpenseForSmoothSurface(double expenseForSmoothSurface) {
        this.expenseForSmoothSurface = expenseForSmoothSurface;
    }

    public double getExpenseForTheWoodSurface() {
        return expenseForTheWoodSurface;
    }

    public void setExpenseForTheWoodSurface(double expenseForTheWoodSurface) {
        this.expenseForTheWoodSurface = expenseForTheWoodSurface;
    }

    public double getExpenseForThePlasterSurface() {
        return expenseForThePlasterSurface;
    }

    public void setExpenseForThePlasterSurface(double expenseForThePlasterSurface) {
        this.expenseForThePlasterSurface = expenseForThePlasterSurface;
    }

    public double getExpenseForTheGypsumPlasterboardSurface() {
        return expenseForTheGypsumPlasterboardSurface;
    }

    public void setExpenseForTheGypsumPlasterboardSurface(double expenseForTheGypsumPlasterboardSurface) {
        this.expenseForTheGypsumPlasterboardSurface = expenseForTheGypsumPlasterboardSurface;
    }
}
