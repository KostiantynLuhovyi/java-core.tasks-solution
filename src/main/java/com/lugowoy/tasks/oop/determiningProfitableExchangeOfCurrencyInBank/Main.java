package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank;

import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.determine.DeterminerCurrencyProfitabilityOfBanksList;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Bank;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Currency;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.TypeOfCurrency;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.util.filling.Fillable;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.util.filling.FillingBankCurrency;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.util.filling.FillingBankList;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

import java.math.BigDecimal;
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

        Currency currency = new Currency(selectTypeOfCurrencyForExchange());
        System.out.println();

        BigDecimal sumToBeExchanged = enterTheSumToBeExchanged();
        System.out.println();

        TypeOfCurrency currencyInWhichYouWantToExchange = selectTheCurrencyInWhichYouWantToExchange();
        System.out.println();

        DeterminerCurrencyProfitabilityOfBanksList determinerCurrencyProfitability = new DeterminerCurrencyProfitabilityOfBanksList();

        List<Bank> banks = determinerCurrencyProfitability.determineBanksListHaveCorrectnessOfSumOnBalanceForCurrencyExchange(banksListInTheCity, currencyInWhichYouWantToExchange, sumToBeExchanged);
        banks.forEach(System.out::println);

        Bank bank = determinerCurrencyProfitability.determineBankToBestRateForConcreteCurrencyExchange(banks, currency.getTypeOfCurrency(), currencyInWhichYouWantToExchange);
        System.out.println("The most profitable bank for the exchange of funds you choose" + bank);

    }

    private static TypeOfCurrency selectTypeOfCurrencyForExchange() {
        System.out.println("Select currency for exchange : ");
        return selectAndGetTypeOfCurrency();
    }

    private static TypeOfCurrency selectTheCurrencyInWhichYouWantToExchange() {
        System.out.println("Select the currency in which you want to exchange : ");
        return selectAndGetTypeOfCurrency();
    }

    private static TypeOfCurrency selectAndGetTypeOfCurrency() {
        TypeOfCurrency typeOfCurrency = null;
        System.out.println("UAH : 1 ,\n" +
                "USD : 2 ,\n" +
                "EUR : 3 ,\n" +
                "RUB : 4 .");
        ReadingData<Integer> reading = new ReadingData<>(new ReadingUserInputData()::readInt);
        int selectCurrencyForExchange = reading.read();

        if ((selectCurrencyForExchange >= 1) && (selectCurrencyForExchange <= 4)) {
            typeOfCurrency = TypeOfCurrency.getIndexTypeOfCurrency(selectCurrencyForExchange);
        } else {
            System.out.println("Incorrect selection.");
            System.out.println("Re-enter : ");
            selectAndGetTypeOfCurrency();
        }
        return typeOfCurrency;
    }

    private static BigDecimal enterTheSumToBeExchanged() {
        BigDecimal sumToBeExchanged = new BigDecimal(0);

        System.out.println("Select the sum to be exchanged : ");
        ReadingData<Double> reading = new ReadingData<>(new ReadingUserInputData()::readDouble);
        double enterSum = reading.read();

        if (enterSum <= 0) {
            System.out.println("The amount was incorrectly entered.");
            System.out.println("The amount must be nonzero and positive.");
            enterTheSumToBeExchanged();
            System.out.println();
        } else {
            sumToBeExchanged = sumToBeExchanged.add(new BigDecimal(enterSum)).setScale(2, BigDecimal.ROUND_DOWN);
        }
        return sumToBeExchanged;
    }




}
