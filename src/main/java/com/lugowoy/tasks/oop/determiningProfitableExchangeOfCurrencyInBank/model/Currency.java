package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 09.03.2017. */

public class Currency {

    private static BigDecimal currencyBalance;

    private TypeOfCurrency typeOfCurrency;
    private BigDecimal rate;

    public Currency() {
    }

    public Currency(TypeOfCurrency typeOfCurrency) {
        this.typeOfCurrency = typeOfCurrency;
    }

    public Currency(BigDecimal rate) {
        this.rate = rate;
    }

    public Currency(TypeOfCurrency typeOfCurrency, BigDecimal rate) {
        this.typeOfCurrency = typeOfCurrency;
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Currency)) return false;

        Currency currency = (Currency) o;

        if (typeOfCurrency != currency.typeOfCurrency) return false;
        return rate != null ? rate.equals(currency.rate) : currency.rate == null;
    }

    @Override
    public int hashCode() {
        int result = typeOfCurrency != null ? typeOfCurrency.hashCode() : 0;
        result = 31 * result + (rate != null ? rate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Currency[" +
                "typeOfCurrency=" + typeOfCurrency +
                ", rate=" + rate +
                ']';
    }

    public static BigDecimal getCurrencyBalance() {
        return currencyBalance;
    }

    public static void setCurrencyBalance(BigDecimal currencyBalance) {
        Currency.currencyBalance = currencyBalance;
    }

    public TypeOfCurrency getTypeOfCurrency() {
        return typeOfCurrency;
    }

    public void setTypeOfCurrency(TypeOfCurrency typeOfCurrency) {
        this.typeOfCurrency = typeOfCurrency;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }
}
