package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.util.filling;

import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.factory.Factory;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.factory.FactoryBank;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Bank;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Currency;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.TypeOfCurrency;

import java.math.BigDecimal;
import java.util.List;
import java.util.Random;

/** Created by Konstantin Lugowoy on 09.03.2017. */

public class FillingBankCurrency {

    public static final int QUANTITY_OF_BANKS = 10;

    private static final int QUANTITY_OF_CURRENCY_IN_THE_BANK = 4;

    private static final Factory<Currency> CURRENCY_FACTORY = Currency::new;

    public static void fillingBankCurrency(List<Bank> bankList) {
        for (Bank bank : bankList) {
            for (int i = 0; i < QUANTITY_OF_CURRENCY_IN_THE_BANK; i++) {
                Currency currency = CURRENCY_FACTORY.create();
                currency.setTypeOfCurrency(TypeOfCurrency.getIndexTypeOfCurrency(i));
                BigDecimal rateCurrency = new BigDecimal(0);
                Random random = new Random();
                switch (currency.getTypeOfCurrency().getIndexTypeOfCurrency()) {
                    case 0: rateCurrency = new BigDecimal(0);
                }
                bank.getCurrencyList().add(currency);
            }
        }
    }


}
