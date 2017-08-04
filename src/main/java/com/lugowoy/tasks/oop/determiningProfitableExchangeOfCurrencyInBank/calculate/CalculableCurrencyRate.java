package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.calculate;

import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.CurrencyRate;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 18.03.2017. */

@FunctionalInterface
public interface CalculableCurrencyRate {

    BigDecimal calculateRate(CurrencyRate.Rate rate);

    static BigDecimal calculateCurrencyRate(CurrencyRate.Rate rate) {
        return new BigDecimal((Math.random() * (rate.getMaxRate() - rate.getMinRate())) + rate.getMinRate()).setScale(2, BigDecimal.ROUND_DOWN);
    }

}
