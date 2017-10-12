package com.lugowoy.tasks.calculatingNumberProductsOfPurchasedForTheCertainSum;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 11-Feb-17.*/

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        User user = new User();
        Product product = new Product();

        System.out.println("Enter available sum of money : ");
        user.setAvailableSumOfMoney(new BigDecimal(reader.readDouble()));

        System.out.println("Enter price of product : ");
        product.setPrice(new BigDecimal(reader.readDouble()));

        int numberOfProducts = user.getAvailableSumOfMoney().divide(product.getPrice(), BigDecimal.ROUND_DOWN).intValue();

        user.setAvailableSumOfMoney(user.getAvailableSumOfMoney().subtract(product.getPrice().multiply(new BigDecimal(numberOfProducts))));

        System.out.printf("Is bought %d products", numberOfProducts);
        System.out.println();
        System.out.printf("Change of money : %f", user.getAvailableSumOfMoney());

    }

}
