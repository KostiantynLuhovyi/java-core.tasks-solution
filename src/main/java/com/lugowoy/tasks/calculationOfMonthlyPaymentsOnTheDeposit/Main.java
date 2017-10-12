package com.lugowoy.tasks.calculationOfMonthlyPaymentsOnTheDeposit;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

import java.math.BigDecimal;
import java.util.ArrayList;

/** Created by Konstantin Lugowoy on 10-Feb-17. */

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

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
        user.setFirstName(reader.readString());

        System.out.println("Enter second name : ");
        user.setSecondName(reader.readString());

        System.out.println("Enter sum of the deposit : ");
        deposit.setSumDeposit(new BigDecimal(reader.readDouble()));

        System.out.println("Enter percent of yearly : ");
        deposit.setPercentYearly(new BigDecimal(reader.readDouble()));

        CalculateOfMonthlyPaymentsOnTheDeposit calculateOfMonthlyPaymentsOnTheDeposit = new CalculateOfMonthlyPaymentsOnTheDeposit();

        System.out.printf("The amount of payments for deposit percent for this month is equal : %f",
                calculateOfMonthlyPaymentsOnTheDeposit.calculateOfMonthlyPaymentsOnTheDeposit(user));
    }

}
