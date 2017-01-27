package com.lugowoy.tasks.core.convertUAHInOthersCurrencies;

import com.lugowoy.util.reading.*;
import com.lugowoy.util.reading.Readable;

import java.math.BigDecimal;

/**
 * Created by Konstantin on 15-Dec-16.
 */

public class Main {

    private static final ConvertUAHInOtherCurrencies CONVERT_UAH_IN_OTHER_CURRENCIES = new ConvertUAHInOtherCurrencies();

    public static void main(String[] args) throws StoppingEnterValueException {

        Account account = new Account();

        System.out.println("Enter the amount in UAH : ");
        ReadingData<Double> readingData = new ReadingData<>(new ReadingUserInputData()::readDouble);
        account.setUAH(new BigDecimal(readingData.read()));

        account.setUSD(CONVERT_UAH_IN_OTHER_CURRENCIES.convertUAHtoUSD(account.getUAH()));
        account.setEUR(CONVERT_UAH_IN_OTHER_CURRENCIES.convertUAHtoEUR(account.getUAH()));
        account.setRUB(CONVERT_UAH_IN_OTHER_CURRENCIES.convertUAHtoRUB(account.getUAH()));

        System.out.println("In the UAH : " + account.getUAH());
        System.out.println("In the USD : " + account.getUSD());
        System.out.println("In the EUR : " + account.getEUR());
        System.out.println("In the RUB : " + account.getRUB());


    }
}
