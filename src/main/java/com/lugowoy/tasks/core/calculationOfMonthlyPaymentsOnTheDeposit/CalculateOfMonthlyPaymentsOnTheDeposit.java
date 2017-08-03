package com.lugowoy.tasks.core.calculationOfMonthlyPaymentsOnTheDeposit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;

/** Created by Konstantin Lugowoy on 10-Feb-17. */

public class CalculateOfMonthlyPaymentsOnTheDeposit {

    public BigDecimal calculateOfMonthlyPaymentsOnTheDeposit(User user) {
        BigDecimal sumOnThePercentOfMonthly = null;

        Deposit deposit = this.getDepositServiceOnThePersonalAccount(user.getPersonalAccount());

        Calendar calendar = Calendar.getInstance();
        int dayOfActualMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        sumOnThePercentOfMonthly = new BigDecimal(deposit.getSumDeposit()
                .multiply(new BigDecimal(deposit.getPercentYearly().doubleValue())
                        .divide(new BigDecimal(100), 2, RoundingMode.HALF_DOWN))
                .multiply(new BigDecimal(dayOfActualMonth))
                .divide(new BigDecimal(calendar.getActualMaximum(Calendar.DAY_OF_YEAR)), 2, BigDecimal.ROUND_HALF_DOWN).doubleValue());

        return sumOnThePercentOfMonthly;
    }

    private Deposit getDepositServiceOnThePersonalAccount(PersonalAccount account) {
        return (Deposit) account.getBankingServices().stream()
                .findAny()
                .filter(bankingService -> bankingService instanceof Deposit)
                .orElse(null);
    }

}
