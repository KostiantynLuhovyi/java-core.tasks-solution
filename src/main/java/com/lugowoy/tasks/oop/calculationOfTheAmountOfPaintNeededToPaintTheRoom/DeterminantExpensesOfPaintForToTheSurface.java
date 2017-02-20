package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 20-Feb-17.*/

public class DeterminantExpensesOfPaintForToTheSurface {

    public static BigDecimal determineExpenseOfPaintOnTheSurface(TypeOfSurface typeOfSurface, TypeOfPaint typeOfPaint) {
        BigDecimal expense = null;
        switch (typeOfPaint) {
            case TYPE_WATERBASED:
                expense = getExpenseOfPaintOnTheSurface(typeOfSurface, typeOfPaint);
                break;
            case TYPE_SILICONE:
                expense = getExpenseOfPaintOnTheSurface(typeOfSurface, typeOfPaint);
                break;
            case TYPE_PLASTIC:
                expense = getExpenseOfPaintOnTheSurface(typeOfSurface, typeOfPaint);
                break;
            case TYPE_OIL:
                expense = getExpenseOfPaintOnTheSurface(typeOfSurface, typeOfPaint);
                break;
            case TYPE_LATEX:
                expense = getExpenseOfPaintOnTheSurface(typeOfSurface, typeOfPaint);
                break;
            case TYPE_ENAMEL:
                expense = getExpenseOfPaintOnTheSurface(typeOfSurface, typeOfPaint);
                break;
            case TYPE_ALKYD:
                expense = getExpenseOfPaintOnTheSurface(typeOfSurface, typeOfPaint);
                break;
            case TYPE_ACRYLIC:
                expense = getExpenseOfPaintOnTheSurface(typeOfSurface, typeOfPaint);
                break;
        }
        return expense;
    }

    private static BigDecimal getExpenseOfPaintOnTheSurface(TypeOfSurface typeOfSurface, TypeOfPaint typeOfPaint) {
        BigDecimal expense = null;
        switch (typeOfSurface) {
            case TYPE_METAL_SURFACE:
                expense = new BigDecimal(typeOfPaint.getExpenseForTheMetalSurface());
                break;
            case TYPE_SMOOTH_SURFACE:
                expense = new BigDecimal(typeOfPaint.getExpenseForSmoothSurface());
                break;
            case TYPE_WOOD_SURFACE:
                expense = new BigDecimal(typeOfPaint.getExpenseForTheWoodSurface());
                break;
            case TYPE_PLASTER_SURFACE:
                expense = new BigDecimal(typeOfPaint.getExpenseForThePlasterSurface());
                break;
            case TYPE_GYPSUM_PLASTERBOARD_SURFACE:
                expense = new BigDecimal(typeOfPaint.getExpenseForTheGypsumPlasterboardSurface());
                break;
        }
        return expense;
    }


}
