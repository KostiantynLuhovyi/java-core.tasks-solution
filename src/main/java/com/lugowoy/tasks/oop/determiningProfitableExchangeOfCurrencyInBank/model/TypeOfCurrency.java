package com.lugowoy.tasks.oop.determiningProfitableExchangeOfCurrencyInBank.model;

/** Created by Konstantin Lugowoy on 09.03.2017. */

public enum TypeOfCurrency {
    UAH(1), USD(2), EUR(3), RUB(4);

    private int indexTypeOfCurrency;

    TypeOfCurrency(int indexTypeOfCurrency) {
        this.indexTypeOfCurrency = indexTypeOfCurrency;
    }

    public int getIndexTypeOfCurrency() {
        return indexTypeOfCurrency;
    }

    public void setIndexTypeOfCurrency(int indexTypeOfCurrency) {
        this.indexTypeOfCurrency = indexTypeOfCurrency;
    }

    public static TypeOfCurrency getIndexTypeOfCurrency(int indexTypeOfCurrency) {
        TypeOfCurrency typeOfCurrency = null;
        switch (indexTypeOfCurrency) {
            case 1: typeOfCurrency = TypeOfCurrency.UAH; break;
            case 2: typeOfCurrency = TypeOfCurrency.USD; break;
            case 3: typeOfCurrency = TypeOfCurrency.EUR; break;
            case 4: typeOfCurrency = TypeOfCurrency.RUB; break;
        }
        return typeOfCurrency;
    }

}
