package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.determine;

import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Bank;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.TypeOfCurrency;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/** Created by Konstantin Lugowoy on 19.03.2017. */

public class DeterminerCurrencyProfitability implements DeterminableBankToBestRateForCurrencyExchange, DeterminableCorrectnessOfSumOnBalanceForCurrencyExchange {

    @Override
    public Bank determineBankToBestRateForCurrencyExchange(List<Bank> bankList, TypeOfCurrency fromTypeOfCurrency, TypeOfCurrency inTypeOfCurrency) {
        Bank resultBankToBestOptionsForCurrencyExchangesRates = new Bank();



        /*for (Bank bank : bankList) {
            switch (fromTypeOfCurrency ) {
                case UAH:
            }
        }*/
        return resultBankToBestOptionsForCurrencyExchangesRates;
    }

    @Override
    public void determineCorrectnessOfSumOnBalanceForCurrencyExchange(Bank bank, TypeOfCurrency inTypeOfCurrency, BigDecimal sumForExchange) {

    }
}
