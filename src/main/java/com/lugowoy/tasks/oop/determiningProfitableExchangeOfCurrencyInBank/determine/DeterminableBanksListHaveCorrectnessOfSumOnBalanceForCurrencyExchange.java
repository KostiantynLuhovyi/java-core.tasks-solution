package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.determine;

import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Bank;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.TypeOfCurrency;

import java.math.BigDecimal;
import java.util.List;

/** Created by Konstantin Lugowoy on 19.03.2017. */

public interface DeterminableBanksListHaveCorrectnessOfSumOnBalanceForCurrencyExchange {

    List<Bank> determineBanksListHaveCorrectnessOfSumOnBalanceForCurrencyExchange(List<Bank> banksList, TypeOfCurrency inTypeOfCurrency, BigDecimal sumForExchange);

}
