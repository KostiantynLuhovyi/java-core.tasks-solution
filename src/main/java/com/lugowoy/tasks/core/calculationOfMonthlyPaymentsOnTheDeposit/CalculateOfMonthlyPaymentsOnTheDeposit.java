package com.lugowoy.tasks.core.calculationOfMonthlyPaymentsOnTheDeposit;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;

/**
 * Created by Konstantin on 10-Feb-17.
 *
 * @author Konstantin Lugowoy
 */
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

    /**
     * The method is realized isn't completely probable and it isn't completely correct.
     * Is the reason for that that proceeding from implementation of a class "PersonalAccount" we imply that one personal account may contain the n-number of the services provided by bank.
     * For example several objects of the class "Deposit" and also if we generate still subclasses of the class "BankingService" and the user will use these services,
     * then objects of these classes will be is stored in a set of the banking services encapsulated in the class "PersonalAccounts".
     * Therefore correctly to realize this method it is necessary to add the parameter of the distinctive characteristic of banking service which we look for, to be exact of an id.
     * In mine a case it was possible to make other implementation:
     * First variant. encapsulated in the class "PersonalAccount" not to parameterize a set for storage of banking services the BankingService type, to parameterize type of specific service, namely "Deposit".
     * Second variant. To encapsulate not a set of services, but an object reference of the class "Deposit", but this option wouldn't reflect possible naturalness and plausibility of an example in the class "PersonalAccount".
     * Therefore an argument the method accepts an object of the class "PersonalAccount" and from a set which is encapsulated in this object that the unique object which is stored is a "Deposit" object and returns it.
     */
    private Deposit getDepositServiceOnThePersonalAccount(PersonalAccount account) {
        return (Deposit) account.getBankingServices().stream()
                .findAny()
                .filter(bankingService -> bankingService instanceof Deposit)
                .orElse(null);
    }
}
