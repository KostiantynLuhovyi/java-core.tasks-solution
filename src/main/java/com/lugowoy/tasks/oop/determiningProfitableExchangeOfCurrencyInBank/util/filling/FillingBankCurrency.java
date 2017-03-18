package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.util.filling;

import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.calculate.CalculableCurrencyRate;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.factory.Factory;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.factory.FactoryCurrency;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/** Created by Konstantin Lugowoy on 09.03.2017. */

public abstract class FillingBankCurrency {

    private static final int QUANTITY_OF_CURRENCY_IN_THE_BANK = 4;

    private static final Factory<Currency> CURRENCY_FACTORY = FactoryCurrency::createCurrency;

    public static void fillingBankCurrency(List<Bank> bankList) {
        if (bankList != null) {
            for (Bank bank : bankList) {
                if (bank != null) {
                    bank.setCurrencyList(new ArrayList<>(0));

                    for (int indexCurrency = 1; indexCurrency <= QUANTITY_OF_CURRENCY_IN_THE_BANK; indexCurrency++) {
                        Currency currency = CURRENCY_FACTORY.create();
                        currency.setTypeOfCurrency(TypeOfCurrency.getIndexTypeOfCurrency(indexCurrency));

                        bank.getCurrencyList().add(currency);

                        fillingAndSetCurrencyRatesListForConcreteCurrency(currency);

                        currency.setCurrencyBalanceList(new ArrayList<>(0));
                        fillingAndSetCurrencyBalanceListForConcreteCurrency(indexCurrency, currency);
                    }
                }
            }
        }
    }

    private static void fillingAndSetCurrencyRatesListForConcreteCurrency(Currency currency) {
        List<CurrencyRate> currencyRateList = new ArrayList<>(0);
        currency.setCurrencyRateList(currencyRateList);

        CalculableCurrencyRate calculableCurrencyRate = CalculableCurrencyRate::calculateCurrencyRate;

        switch (currency.getTypeOfCurrency()) {
            case UAH:
                fillingAndSetCurrencyRateList(currencyRateList,
                        new CurrencyRate(TypeOfCurrency.USD, calculableCurrencyRate.calculateRate(CurrencyRate.MAX_UAH_TO_USD, CurrencyRate.MIN_UAH_TO_USD)),
                        new CurrencyRate(TypeOfCurrency.EUR, calculableCurrencyRate.calculateRate(CurrencyRate.MAX_UAH_TO_EUR, CurrencyRate.MIN_UAH_TO_EUR)),
                        new CurrencyRate(TypeOfCurrency.RUB, calculableCurrencyRate.calculateRate(CurrencyRate.MAX_UAH_TO_RUB, CurrencyRate.MIN_UAH_TO_RUB)));
                break;
            case USD:
                fillingAndSetCurrencyRateList(currencyRateList,
                        new CurrencyRate(TypeOfCurrency.EUR, calculableCurrencyRate.calculateRate(CurrencyRate.MAX_USD_TO_EUR, CurrencyRate.MIN_USD_TO_EUR)),
                        new CurrencyRate(TypeOfCurrency.UAH, calculableCurrencyRate.calculateRate(CurrencyRate.MAX_UAH_TO_USD, CurrencyRate.MIN_UAH_TO_USD)),
                        new CurrencyRate(TypeOfCurrency.RUB, calculableCurrencyRate.calculateRate(CurrencyRate.MAX_RUB_TO_USD, CurrencyRate.MIN_RUB_TO_USD)));
                break;
            case EUR:
                fillingAndSetCurrencyRateList(currencyRateList,
                        new CurrencyRate(TypeOfCurrency.USD, calculableCurrencyRate.calculateRate(CurrencyRate.MAX_USD_TO_EUR, CurrencyRate.MIN_USD_TO_EUR)),
                        new CurrencyRate(TypeOfCurrency.UAH, calculableCurrencyRate.calculateRate(CurrencyRate.MAX_UAH_TO_EUR, CurrencyRate.MIN_UAH_TO_EUR)),
                        new CurrencyRate(TypeOfCurrency.RUB, calculableCurrencyRate.calculateRate(CurrencyRate.MAX_RUB_TO_EUR, CurrencyRate.MIN_RUB_TO_EUR)));
                break;
            case RUB:
                fillingAndSetCurrencyRateList(currencyRateList,
                        new CurrencyRate(TypeOfCurrency.USD, calculableCurrencyRate.calculateRate(CurrencyRate.MAX_RUB_TO_USD, CurrencyRate.MIN_RUB_TO_USD)),
                        new CurrencyRate(TypeOfCurrency.EUR, calculableCurrencyRate.calculateRate(CurrencyRate.MAX_RUB_TO_EUR, CurrencyRate.MIN_RUB_TO_EUR)),
                        new CurrencyRate(TypeOfCurrency.UAH, calculableCurrencyRate.calculateRate(CurrencyRate.MAX_UAH_TO_RUB, CurrencyRate.MIN_UAH_TO_RUB)));
                break;
        }
    }

    private static void fillingAndSetCurrencyRateList(List<CurrencyRate> currencyRateList,
                                                      CurrencyRate currencyRateFirst, CurrencyRate currencyRateSecond, CurrencyRate currencyRateThird) {
        currencyRateList.add(currencyRateFirst);
        currencyRateList.add(currencyRateSecond);
        currencyRateList.add(currencyRateThird);
    }

    private static void fillingAndSetCurrencyBalanceListForConcreteCurrency(int indexTypeOfCurrency, Currency currency) {
        CurrencyBalance currencyBalance = new CurrencyBalance();
        currencyBalance.setTypeOfCurrency(TypeOfCurrency.getIndexTypeOfCurrency(indexTypeOfCurrency));
        currencyBalance.setCurrencyBalance(new BigDecimal((Math.random() * (10000 - 2000)) + 2000));
        currency.getCurrencyBalanceList().add(currencyBalance);
    }

}
