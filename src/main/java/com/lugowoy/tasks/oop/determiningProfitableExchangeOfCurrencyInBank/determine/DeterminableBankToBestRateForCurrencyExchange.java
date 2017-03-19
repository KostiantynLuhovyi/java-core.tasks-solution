package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.determine;

import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Bank;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.TypeOfCurrency;

import java.util.List;

/** Created by Konstantin Lugowoy on 19.03.2017. */

public interface DeterminableBankToBestRateForCurrencyExchange extends Determinable {

    Bank determineBankToBestRateForCurrencyExchange(List<Bank> bankList, TypeOfCurrency fromTypeOfCurrency, TypeOfCurrency inTypeOfCurrency);

}
