package com.lugowoy.tasks.calculationOfMonthlyPaymentsOnTheDeposit;

import java.io.Serializable;

/** Created by Konstantin Lugowoy on 11-Feb-17. */

public class BankingService implements Serializable {

    private int id;

    public BankingService() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BankingService that = (BankingService) o;

        return id == that.id;

    }

    @Override
    public int hashCode() {
        return id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
