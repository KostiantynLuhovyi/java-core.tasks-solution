package com.lugowoy.tasks.core.calculationThePercentageOfTheSum;

import com.lugowoy.util.reading.*;
import com.lugowoy.util.reading.Readable;

import java.math.BigDecimal;
import java.util.Comparator;

/**
 * Created by Konstantin on 04-Jan-17.
 */

public class Main {

    private static final ReadingData<Double> READING_DATA = new ReadingData<>(new ReadingUserInputData()::readDouble);

    public static void main(String[] args) throws StoppingEnterValueException {

        System.out.println("Enter sum : ");
        Sum sum = new Sum();
        sum.setSum(new BigDecimal(READING_DATA.read()));

        System.out.println("Enter part of the sum : ");
        PartOfTheSum partOfTheSum = new PartOfTheSum();
        partOfTheSum.setPartOfSum(new BigDecimal(READING_DATA.read()));

        Comparator<BigDecimal> comparator = new Comparator<BigDecimal>() {
            @Override
            public int compare(BigDecimal decimalFirst, BigDecimal decimalSecond) {
                int resultToCompare = 0;
                if (decimalFirst.doubleValue() < decimalSecond.doubleValue()) {
                    resultToCompare = 1;
                } if (decimalFirst.doubleValue() >= decimalSecond.doubleValue()) {
                    resultToCompare = 0;
                }
                return resultToCompare;
            }
        };

        if (comparator.compare(partOfTheSum.getPartOfSum(), sum.getSum()) == 1) {
            CalculatingThePercentOfSum calculatingThePercentOfSum = new CalculatingThePercentOfSum();
            Perсent perсent = calculatingThePercentOfSum.calculateThePercentageOfTheAmountOf(sum, partOfTheSum);

            System.out.printf("Result calculation the percent of the sum of equal : %f", perсent.getPerсent().setScale(2, BigDecimal.ROUND_HALF_DOWN));
        } else {
            System.out.println("It is impossible to calculate the percentage of the sum.");
        }



    }
}
