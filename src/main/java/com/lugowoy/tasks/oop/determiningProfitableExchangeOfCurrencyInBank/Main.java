package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank;

import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Bank;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Currency;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.TypeOfCurrency;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.util.filling.Fillable;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.util.filling.FillingBankCurrency;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.util.filling.FillingBankList;
import com.lugowoy.util.reading.Reading;
import com.lugowoy.util.reading.ReadingUserInputData;

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
        Reading<Integer> reading = new ReadingUserInputData()::readInt;
        int selectCurrencyForExchange = reading.reading();
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
        Reading<Double> reading = new ReadingUserInputData()::readDouble;

        System.out.println("Select the sum to be exchanged : ");
        double enterSum = reading.reading();
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
