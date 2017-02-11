package com.lugowoy.tasks.core.convertUAHInOthersCurrencies;

import com.lugowoy.util.converting.ConvertingData;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 15-Dec-16.*/

public class Main {

    private static final ConvertUAHInOtherCurrencies CONVERT_UAH_IN_OTHER_CURRENCIES = new ConvertUAHInOtherCurrencies();

    public static void main(String[] args) throws StoppingEnterValueException {

        Account account = new Account();

        System.out.println("Enter the amount in UAH : ");
        ReadingData<Double> readingData = new ReadingData<>(new ReadingUserInputData()::readDouble);
        account.setUAH(new BigDecimal(readingData.read()));

        ConvertingData<Account> convertingData = new ConvertingData<>(new ConvertUAHInOtherCurrencies(29.11, 27.21, 2.20)::convert);

        convertingData.convert(account);

        System.out.println("In the UAH : " + account.getUAH());
        System.out.println("In the USD : " + account.getUSD());
        System.out.println("In the EUR : " + account.getEUR());
        System.out.println("In the RUB : " + account.getRUB());


    }
}
