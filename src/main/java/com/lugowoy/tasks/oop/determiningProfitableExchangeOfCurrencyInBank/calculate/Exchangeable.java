package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.calculate;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 19.03.2017. */

@FunctionalInterface
public interface Exchangeable {

    BigDecimal exchangeCurrency();
}
