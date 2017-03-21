package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.factory;

import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Bank;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Currency;

import java.util.List;

/** Created by Konstantin Lugowoy on 09.03.2017. */

public interface FactoryBank {

    static Bank createBank() {
        return new Bank();
    }

    static Bank createBank(String nameBank) {
        return new Bank(nameBank);
    }

}
