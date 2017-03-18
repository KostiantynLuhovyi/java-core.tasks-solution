package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank;

import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.factory.FactoryCurrency;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Bank;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Currency;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.util.filling.Fillable;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.util.filling.FillingBankCurrency;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.util.filling.FillingBankList;

import java.util.ArrayList;
import java.util.List;

/** Created by Konstantin Lugowoy on 09.03.2017. */

public class Main {

    private static Fillable<Bank> bankFillable = FillingBankList::fillingBankList;
    private static Fillable<Bank> currencyFillable = FillingBankCurrency::fillingBankCurrency;

    public static void main(String[] args) {

        List<Bank> banksListInTheCity = new ArrayList<>();

        bankFillable.filling(banksListInTheCity);
        currencyFillable.filling(banksListInTheCity);



    }

    private static Currency selectCurrencyForExchange() {
        Currency currency = null;
        System.out.println("Select currency for exchange : ");
        return currency;
    }

}
