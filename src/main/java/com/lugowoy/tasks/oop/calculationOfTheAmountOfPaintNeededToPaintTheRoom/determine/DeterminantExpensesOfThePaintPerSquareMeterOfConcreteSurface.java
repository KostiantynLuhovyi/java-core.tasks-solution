package com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.determine;

import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.TypeOfPaint;
import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.models.TypeOfSurface;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 20-Feb-17.*/

public class DeterminantExpensesOfThePaintPerSquareMeterOfConcreteSurface {

    public static BigDecimal determineExpenseOfThePaintPerSquareMeterOfConcreteSurface(TypeOfSurface typeOfSurface, TypeOfPaint typeOfPaint) {
        BigDecimal expense = null;
        switch (typeOfPaint) {
            case TYPE_WATERBASED:
                expense = getExpenseOfPaintPerSquareMeterOfTheConcreteSurface(typeOfSurface, typeOfPaint);
                break;
            case TYPE_SILICONE:
                expense = getExpenseOfPaintPerSquareMeterOfTheConcreteSurface(typeOfSurface, typeOfPaint);
                break;
            case TYPE_PLASTIC:
                expense = getExpenseOfPaintPerSquareMeterOfTheConcreteSurface(typeOfSurface, typeOfPaint);
                break;
            case TYPE_OIL:
                expense = getExpenseOfPaintPerSquareMeterOfTheConcreteSurface(typeOfSurface, typeOfPaint);
                break;
            case TYPE_LATEX:
                expense = getExpenseOfPaintPerSquareMeterOfTheConcreteSurface(typeOfSurface, typeOfPaint);
                break;
            case TYPE_ENAMEL:
                expense = getExpenseOfPaintPerSquareMeterOfTheConcreteSurface(typeOfSurface, typeOfPaint);
                break;
            case TYPE_ALKYD:
                expense = getExpenseOfPaintPerSquareMeterOfTheConcreteSurface(typeOfSurface, typeOfPaint);
                break;
            case TYPE_ACRYLIC:
                expense = getExpenseOfPaintPerSquareMeterOfTheConcreteSurface(typeOfSurface, typeOfPaint);
                break;
        }
        return expense;
    }

    private static BigDecimal getExpenseOfPaintPerSquareMeterOfTheConcreteSurface(TypeOfSurface typeOfSurface, TypeOfPaint typeOfPaint) {
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
