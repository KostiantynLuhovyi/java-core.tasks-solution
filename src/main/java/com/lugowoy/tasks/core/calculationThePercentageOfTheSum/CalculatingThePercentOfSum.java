package com.lugowoy.tasks.core.calculationThePercentageOfTheSum;

import java.math.BigDecimal;

/**
 * Created by Konstantin on 04-Jan-17.
 */

public class CalculatingThePercentOfSum implements Calculating<Perсent, Sum, PartOfTheSum> {

    @Override
    public Perсent calculateThePercentageOfTheAmountOf(final Sum sum, final PartOfTheSum partOfTheSum) {

        BigDecimal result = new BigDecimal((partOfTheSum.getPartOfSum().doubleValue() / sum.getSum().doubleValue()) * 100);

        return new Perсent(result);
    }
}
