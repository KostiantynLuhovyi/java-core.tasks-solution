package com.lugowoy.tasks.calculationOfMonthlyPaymentsOnTheDeposit;

import java.io.Serializable;

/** Created by Konstantin Lugowoy on 11-Feb-17. */

public class BankingService implements Serializable, Cloneable {

    private int id;

    public BankingService() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BankingService)) return false;

        BankingService that = (BankingService) o;

        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        return "BankingService[" +
                "id=" + id +
                ']';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
