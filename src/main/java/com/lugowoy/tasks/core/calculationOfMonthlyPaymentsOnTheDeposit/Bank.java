package com.lugowoy.tasks.core.calculationOfMonthlyPaymentsOnTheDeposit;

/**
 * Created by Konstantin on 10-Feb-17.
 *
 * @author Konstantin Lugowoy
 */
public class Bank {

    private Deposit deposit;

    public Bank() {
    }

    public Bank(Deposit deposit) {
        this.deposit = deposit;
    }

    public Deposit getDeposit() {
        return deposit;
    }

    public void setDeposit(Deposit deposit) {
        this.deposit = deposit;
    }
}
