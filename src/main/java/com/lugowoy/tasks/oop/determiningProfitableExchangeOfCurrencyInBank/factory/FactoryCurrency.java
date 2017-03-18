package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.factory;

import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Currency;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.TypeOfCurrency;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 09.03.2017. */

public interface FactoryCurrency {

    static Currency createCurrency() {
        return new Currency();
    }

    static Currency createCurrency(TypeOfCurrency typeOfCurrency) {
        return new Currency(typeOfCurrency);
    }

}
