package com.lugowoy.tasks.calculationOfMonthlyPaymentsOnDeposit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;

/** Created by Konstantin Lugowoy on 10-Feb-17. */

public class CalculatingOfMonthlyPaymentsOnDeposit {

    public BigDecimal calculateOfMonthlyPaymentsOnTheDeposit(User user) {
        Deposit deposit = this.getDepositServiceOnThePersonalAccount(user.getPersonalAccount());

        Calendar calendar = Calendar.getInstance();
        int dayOfActualMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        return new BigDecimal(deposit.getSumDeposit().multiply(new BigDecimal(deposit.getPercentYearly().doubleValue())
                                                     .divide(new BigDecimal(100), 2, RoundingMode.HALF_DOWN))
                                                     .multiply(new BigDecimal(dayOfActualMonth))
                                                     .divide(new BigDecimal(calendar.getActualMaximum(Calendar.DAY_OF_YEAR)), 2, RoundingMode.DOWN)
                                                     .doubleValue());
    }

    private Deposit getDepositServiceOnThePersonalAccount(PersonalAccount account) {
        return (Deposit) account.getBankingServices().stream()
                                                     .findAny()
                                                     .filter(bankingService -> bankingService instanceof Deposit)
                                                     .orElse(null);
    }

}
