package com.lugowoy.tasks.core.calculationOfMonthlyPaymentsOnTheDeposit;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * Created by Konstantin on 10-Feb-17.
 *
 * @author Konstantin Lugowoy
 */
public class CalculateOfMonthlyPaymentsOnTheDeposit {

    public BigDecimal calculateOfMonthlyPaymentsOnTheDeposit(BigDecimal sumOfDeposit, BigDecimal percentYearly, Integer dayInTheMonth) {
        BigDecimal sumOnThePercentOfMonthly = null;

        switch(dayInTheMonth) {
            case 28:
                sumOnThePercentOfMonthly = new BigDecimal(sumOfDeposit.multiply(percentYearly.divide(new BigDecimal(100), BigDecimal.ROUND_HALF_DOWN).multiply(new BigDecimal(dayInTheMonth))).divide(new BigDecimal(365), BigDecimal.ROUND_HALF_DOWN).doubleValue());
        }

        return sumOnThePercentOfMonthly;
    }
}
