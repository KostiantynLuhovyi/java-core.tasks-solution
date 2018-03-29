package com.lugowoy.tasks.calculationOfMonthlyPaymentsOnDeposit;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

import java.math.BigDecimal;
import java.util.ArrayList;

/** Created by Konstantin Lugowoy on 10-Feb-17. */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

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
        user.setFirstName(READER.readString());

        System.out.println("Enter second name : ");
        user.setSecondName(READER.readString());

        System.out.println("Enter sum of the deposit : ");
        deposit.setSumDeposit(new BigDecimal(READER.readDouble()));

        System.out.println("Enter percent of yearly : ");
        deposit.setPercentYearly(new BigDecimal(READER.readDouble()));

        CalculatingOfMonthlyPaymentsOnDeposit calculatingOfMonthlyPaymentsOnDeposit = new CalculatingOfMonthlyPaymentsOnDeposit();

        System.out.printf("The amount of payments for deposit percent for this month is equal : %f",
                                       calculatingOfMonthlyPaymentsOnDeposit.calculateOfMonthlyPaymentsOnDeposit(user));

    }

}
