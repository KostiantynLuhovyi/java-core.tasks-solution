package com.lugowoy.tasks.core.calculationOfMonthlyPaymentsOnTheDeposit;

import com.lugowoy.util.reading.ReadingUserInputData;

import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * Created by Konstantin on 10-Feb-17.
 *
 * @author Konstantin Lugowoy
 */
public class Main {

    private static final ReadingUserInputData READING_DATA = new ReadingUserInputData();

    public static void main(String[] args) {

        Bank bank = new Bank();
        User user = new User();
        PersonalAccount personalAccount = new PersonalAccount();
        Deposit deposit = new Deposit();

        personalAccount.setBank(bank);
        personalAccount.setBankingServices(new ArrayList<>());
        personalAccount.setUser(user);

        personalAccount.getBankingServices().add(deposit);

        user.setPersonalAccount(personalAccount);

        System.out.println("Enter first name : ");
        READING_DATA.readLine();

        System.out.println("Enter second name : ");
        READING_DATA.readLine();

        System.out.println("Enter sum of the deposit : ");
        deposit.setSumDeposit(new BigDecimal(READING_DATA.readDouble()));

        System.out.println("Enter percent of yearly : ");
        deposit.setPercentYearly(new BigDecimal(READING_DATA.readDouble()));

        CalculateOfMonthlyPaymentsOnTheDeposit calculateOfMonthlyPaymentsOnTheDeposit = new CalculateOfMonthlyPaymentsOnTheDeposit();

        System.out.printf("The amount of payments for deposit percent for this month is equal : %f",
                calculateOfMonthlyPaymentsOnTheDeposit.calculateOfMonthlyPaymentsOnTheDeposit(user));
    }
}
