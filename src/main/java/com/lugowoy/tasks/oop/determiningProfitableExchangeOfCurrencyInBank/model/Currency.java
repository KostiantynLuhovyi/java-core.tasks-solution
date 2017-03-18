package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model;

import java.math.BigDecimal;
import java.util.List;

/** Created by Konstantin Lugowoy on 09.03.2017. */

public class Currency {

    private TypeOfCurrency typeOfCurrency;

    private List<CurrencyRate> currencyRateList;

    private List<CurrencyBalance> currencyBalanceList;

    public Currency() {
    }

    public Currency(TypeOfCurrency typeOfCurrency) {
        this.typeOfCurrency = typeOfCurrency;
    }

    public Currency(TypeOfCurrency typeOfCurrency, List<CurrencyRate> currencyRateList, List<CurrencyBalance> currencyBalanceList) {
        this.typeOfCurrency = typeOfCurrency;
        this.currencyRateList = currencyRateList;
        this.currencyBalanceList = currencyBalanceList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Currency)) return false;

        Currency currency = (Currency) o;

        if (typeOfCurrency != currency.typeOfCurrency) return false;
        if (currencyRateList != null ? !currencyRateList.equals(currency.currencyRateList) : currency.currencyRateList != null)
            return false;
        return currencyBalanceList != null ? currencyBalanceList.equals(currency.currencyBalanceList) : currency.currencyBalanceList == null;
    }

    @Override
    public int hashCode() {
        int result = typeOfCurrency != null ? typeOfCurrency.hashCode() : 0;
        result = 31 * result + (currencyRateList != null ? currencyRateList.hashCode() : 0);
        result = 31 * result + (currencyBalanceList != null ? currencyBalanceList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Currency[" +
                "typeOfCurrency=" + typeOfCurrency +
                ", currencyRateList=" + currencyRateList +
                ", currencyBalanceList=" + currencyBalanceList +
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

    public List<CurrencyBalance> getCurrencyBalanceList() {
        return currencyBalanceList;
    }

    public void setCurrencyBalanceList(List<CurrencyBalance> currencyBalanceList) {
        this.currencyBalanceList = currencyBalanceList;
    }
}
