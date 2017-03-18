package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 18.03.2017. */

public class CurrencyRate {

    public static final double MIN_UAH_TO_USD = 26.50;
    public static final double MAX_UAH_TO_USD = 29.00;

    public static final double MIN_UAH_TO_EUR = 28.30;
    public static final double MAX_UAH_TO_EUR = 31.00;

    public static final double MIN_UAH_TO_RUB = 0.38;
    public static final double MAX_UAH_TO_RUB = 0.48;

    public static final double MIN_RUB_TO_USD = 56.00;
    public static final double MAX_RUB_TO_USD = 59.00;

    public static final double MIN_RUB_TO_EUR = 60.00;
    public static final double MAX_RUB_TO_EUR = 64.00;

    public static final double MIN_USD_TO_EUR = 1.030;
    public static final double MAX_USD_TO_EUR = 1.090;

    private TypeOfCurrency typeOfCurrency;
    private BigDecimal currencyRate;

    public CurrencyRate() {
    }

    public CurrencyRate(TypeOfCurrency typeOfCurrency) {
        this.typeOfCurrency = typeOfCurrency;
    }

    public CurrencyRate(BigDecimal currencyRate) {
        this.currencyRate = currencyRate;
    }

    public CurrencyRate(TypeOfCurrency typeOfCurrency, BigDecimal currencyRate) {
        this.typeOfCurrency = typeOfCurrency;
        this.currencyRate = currencyRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CurrencyRate)) return false;

        CurrencyRate that = (CurrencyRate) o;

        if (typeOfCurrency != that.typeOfCurrency) return false;
        return currencyRate != null ? currencyRate.equals(that.currencyRate) : that.currencyRate == null;
    }

    @Override
    public int hashCode() {
        int result = typeOfCurrency != null ? typeOfCurrency.hashCode() : 0;
        result = 31 * result + (currencyRate != null ? currencyRate.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CurrencyRate[" +
                "typeOfCurrency=" + typeOfCurrency +
                ", currencyRate=" + currencyRate +
                ']';
    }

    public TypeOfCurrency getTypeOfCurrency() {
        return typeOfCurrency;
    }

    public void setTypeOfCurrency(TypeOfCurrency typeOfCurrency) {
        this.typeOfCurrency = typeOfCurrency;
    }

    public BigDecimal getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(BigDecimal currencyRate) {
        this.currencyRate = currencyRate;
    }
}

