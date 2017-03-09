package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model;

import java.util.List;

/** Created by Konstantin Lugowoy on 09.03.2017. */

public class Bank {

    private String bankName;

    private List<Currency> currencyList;

    public Bank() {
    }

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public Bank(List<Currency> currencyList) {
        this.currencyList = currencyList;
    }

    public Bank(String bankName, List<Currency> currencyList) {
        this.bankName = bankName;
        this.currencyList = currencyList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bank)) return false;

        Bank bank = (Bank) o;

        if (bankName != null ? !bankName.equals(bank.bankName) : bank.bankName != null) return false;
        return currencyList != null ? currencyList.equals(bank.currencyList) : bank.currencyList == null;
    }

    @Override
    public int hashCode() {
        int result = bankName != null ? bankName.hashCode() : 0;
        result = 31 * result + (currencyList != null ? currencyList.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Bank[" +
                "bankName='" + bankName + '\'' +
                ", currencyList=" + currencyList +
                ']';
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public List<Currency> getCurrencyList() {
        return currencyList;
    }

    public void setCurrencyList(List<Currency> currencyList) {
        this.currencyList = currencyList;
    }
}
