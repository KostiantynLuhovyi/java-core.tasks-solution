package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model;

import java.util.List;

/** Created by Konstantin Lugowoy on 09.03.2017. */

public class Currency {

    private TypeOfCurrency typeOfCurrency;

    private List<CurrencyRate> currencyRateList;

    public Currency() {
    }

    public Currency(TypeOfCurrency typeOfCurrency) {
        this.typeOfCurrency = typeOfCurrency;
    }

    public Currency(TypeOfCurrency typeOfCurrency, List<CurrencyRate> currencyRateList) {
        this.typeOfCurrency = typeOfCurrency;
        this.currencyRateList = currencyRateList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Currency)) return false;

        Currency currency = (Currency) o;

        if (getTypeOfCurrency() != currency.getTypeOfCurrency()) return false;
        return getCurrencyRateList() != null ? getCurrencyRateList().equals(currency.getCurrencyRateList()) : currency.getCurrencyRateList() == null;
    }

    @Override
    public int hashCode() {
        int result = getTypeOfCurrency() != null ? getTypeOfCurrency().hashCode() : 0;
        result = 31 * result + (getCurrencyRateList() != null ? getCurrencyRateList().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Currency[" +
                "typeOfCurrency=" + typeOfCurrency +
                ", currencyRateList=" + currencyRateList +
                ']';
    }

    public TypeOfCurrency getTypeOfCurrency() {
        return typeOfCurrency;
    }

    public void setTypeOfCurrency(TypeOfCurrency typeOfCurrency) {
        this.typeOfCurrency = typeOfCurrency;
    }

    public List<CurrencyRate> getCurrencyRateList() {
        return currencyRateList;
    }

    public void setCurrencyRateList(List<CurrencyRate> currencyRateList) {
        this.currencyRateList = currencyRateList;
    }

}
