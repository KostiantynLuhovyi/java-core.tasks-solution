package com.lugowoy.tasks.core.calculationOfMonthlyPaymentsOnTheDeposit;

/**
 * Created by Konstantin on 10-Feb-17.
 *
 * @author Konstantin Lugowoy
 */
public class Main {

    public static void main(String[] args) {

        CalculateOfMonthlyPaymentsOnTheDeposit calculateOfMonthlyPaymentsOnTheDeposit = new CalculateOfMonthlyPaymentsOnTheDeposit();

        calculateOfMonthlyPaymentsOnTheDeposit.calculateOfMonthlyPaymentsOnTheDeposit(new User(), new Bank());


    }
}
