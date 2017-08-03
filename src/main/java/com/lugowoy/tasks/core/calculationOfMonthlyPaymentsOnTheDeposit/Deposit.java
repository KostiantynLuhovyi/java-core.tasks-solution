package com.lugowoy.tasks.core.calculationOfMonthlyPaymentsOnTheDeposit;

import java.math.BigDecimal;

/** Created by Konstantin Lugowoy on 10-Feb-17. */

public class Deposit extends BankingService {

    private BigDecimal sumDeposit;
    private BigDecimal percentYearly;

    public Deposit() {
        super();
    }

    public Deposit(BigDecimal sumDeposit, BigDecimal percentYearly) {
        super();
        this.sumDeposit = sumDeposit;
        this.percentYearly = percentYearly;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Deposit{" + super.toString() +
                "sumDeposit=" + sumDeposit +
                ", percentYearly=" + percentYearly +
                "} ";
    }

    public BigDecimal getSumDeposit() {
        return sumDeposit;
    }

    public void setSumDeposit(BigDecimal sumDeposit) {
        this.sumDeposit = sumDeposit;
    }

    public BigDecimal getPercentYearly() {
        return percentYearly;
    }

    public void setPercentYearly(BigDecimal percentYearly) {
        this.percentYearly = percentYearly;
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

}
