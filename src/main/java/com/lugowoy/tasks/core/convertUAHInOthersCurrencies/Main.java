package com.lugowoy.tasks.core.convertUAHInOthersCurrencies;

import com.lugowoy.helper.converting.ConvertingData;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 15-Dec-16.*/

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        Account account = new Account();

        System.out.println("Enter the amount in UAH : ");
        account.setUAH(new BigDecimal(reader.readDouble()));

        ConvertingData<Account> convertingData = new ConvertingData<>(new ConvertUAHInOtherCurrencies(29.11, 27.21, 2.20)::convert);

        convertingData.convert(account);

        System.out.println("In the UAH : " + account.getUAH());
        System.out.println("In the USD : " + account.getUSD());
        System.out.println("In the EUR : " + account.getEUR());
        System.out.println("In the RUB : " + account.getRUB());

    }

}
