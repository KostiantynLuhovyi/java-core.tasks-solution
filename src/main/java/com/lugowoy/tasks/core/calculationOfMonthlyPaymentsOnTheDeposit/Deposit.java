package com.lugowoy.tasks.core.calculationOfMonthlyPaymentsOnTheDeposit;

import java.math.BigDecimal;

/**
 * Created by Konstantin on 10-Feb-17.
 *
 * @author Konstantin Lugowoy
 */
public class Deposit {

    private BigDecimal percentYearly;

    public Deposit() {
    }

    public Deposit(BigDecimal percentYearly) {
        this.percentYearly = percentYearly;
    }

    public BigDecimal getPercentYearly() {
        return percentYearly;
    }

    public void setPercentYearly(BigDecimal percentYearly) {
        this.percentYearly = percentYearly;
    }
}
