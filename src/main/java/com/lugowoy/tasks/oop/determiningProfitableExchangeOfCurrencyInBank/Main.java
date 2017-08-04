package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.determine.DeterminerCurrencyProfitabilityOfBanksList;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Bank;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.Currency;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model.TypeOfCurrency;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.util.filling.Fillable;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.util.filling.FillingBankCurrency;
import com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.util.filling.FillingBankList;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Created by Konstantin Lugowoy on 09.03.2017. */

public class Main {

    private static Fillable<Bank> bankFillable = FillingBankList::fillingBankList;
    private static Fillable<Bank> currencyFillable = FillingBankCurrency::fillingBankCurrency;

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

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

        System.out.println();
        Bank bank = determinerCurrencyProfitability.determineBankToBestRateForConcreteCurrencyExchange(banks, currency.getTypeOfCurrency(), currencyInWhichYouWantToExchange);

        if (Objects.nonNull(bank)) {
            System.out.println("The most profitable bank for the exchange of funds you choose : ");
            System.out.println(bank);
        }

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
        int selectCurrencyForExchange = reader.readInt();

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
        double enterSum = reader.readDouble();

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
