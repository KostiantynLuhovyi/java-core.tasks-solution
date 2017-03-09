package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.util.filling;

import com.lugowoy.tasks.oop.calculationOfTheAmountOfPaintNeededToPaintTheRoom.factory.Factory;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.factory.FactoryBank;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Bank;

import java.util.List;

/** Created by Konstantin Lugowoy on 09.03.2017. */

public class FillingBankCurrency {

    public static final int QUANTITY_OF_BANKS = 10;

    private static final int QUANTITY_OF_CURRENCY_IN_THE_BANK = 4;

    public static void fillingBankCurrency(List<Bank> bankList) {
        Factory<Bank> bankFactory = FactoryBank::createBank;

        for (int i = 0; i < QUANTITY_OF_BANKS; i++) {

        }
    }
}
