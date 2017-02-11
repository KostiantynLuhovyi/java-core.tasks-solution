package com.lugowoy.tasks.core.calculatingNumberProductsOfPurchasedForTheCertainSum;

import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;
import com.lugowoy.util.reading.StoppingEnterValueException;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**Created by Konstantin Lugowoy on 11-Feb-17.*/

public class Main {

    private static final ReadingData<Double> READING_DATA = new ReadingData<>(new ReadingUserInputData()::readDouble);

    public static void main(String[] args) throws StoppingEnterValueException {

        User user = new User();
        Product product = new Product();

        System.out.println("Enter available sum of money : ");
        user.setAvailableSumOfMoney(new BigDecimal(READING_DATA.read()));

        System.out.println("Enter price of product : ");
        product.setPrice(new BigDecimal(READING_DATA.read()));

        int numberOfProducts = user.getAvailableSumOfMoney().divide(product.getPrice(), BigDecimal.ROUND_DOWN).intValue();

        user.setAvailableSumOfMoney(user.getAvailableSumOfMoney().subtract(product.getPrice().multiply(new BigDecimal(numberOfProducts))));

        System.out.printf("Is bought %d products", numberOfProducts);
        System.out.println();
        System.out.printf("Change of money : %f", user.getAvailableSumOfMoney());

    }
}
