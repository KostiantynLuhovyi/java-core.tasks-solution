package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.calculate;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 18.03.2017. */

@FunctionalInterface
public interface CalculableCurrencyRate {

    BigDecimal calculateRate(double maxRate, double minRate);

    static BigDecimal calculateCurrencyRate(double maxRate, double minRate) {
        return new BigDecimal((Math.random() * (maxRate - minRate)) + minRate).setScale(2, BigDecimal.ROUND_DOWN);
    }
}
