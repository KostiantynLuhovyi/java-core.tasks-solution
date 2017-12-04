package com.lugowoy.tasks.calculateTheTotalCostOfOrderingLaptopAtDiscount;

import com.lugowoy.helper.calculating.CalculationUsingThreeParameters;
import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

import java.math.BigDecimal;
import java.util.Random;

/** Created by Konstantin Lugowoy on 15.06.2017. */

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        Laptop laptop = new Laptop(new Random().nextInt(10), "Dell", getEnterPrice());

        Integer numberOfLaptop = getNumberOfLaptop();

        BigDecimal discount = getTotalDiscountOnTheLaptop();

        System.out.println("The total cost of the order : " + calculating.calculate(laptop, numberOfLaptop, discount).doubleValue());

    }

    private static CalculationUsingThreeParameters<BigDecimal, Laptop, Integer, BigDecimal> calculating = (laptop, numberOfLaptop, discount) -> {

        BigDecimal sumPriceOfLaptop = new BigDecimal(laptop.getPrice().multiply(new BigDecimal(numberOfLaptop)).doubleValue());

        return new BigDecimal(sumPriceOfLaptop.subtract(sumPriceOfLaptop.multiply(discount).divide(new BigDecimal(100), 2)).doubleValue());
    };

    private static int getNumberOfLaptop() {
        int numberOfLaptop;
        System.out.println("Enter the number of laptops : ");
        while (true) {
            numberOfLaptop = reader.readInt();
            if (numberOfLaptop > 0) {
                break;
            } else {
                System.out.println("Number of laptop must be a positive number.");
                System.out.println("Re-enter : ");
            }
        }
        return numberOfLaptop;
    }

    private static BigDecimal getTotalDiscountOnTheLaptop() {
        BigDecimal discount;
        System.out.println("Enter the total discount on the laptop : ");
        while (true) {
            double enterDiscount = reader.readDouble();
            if ((enterDiscount >= 0) && (enterDiscount <= 100)) {
                discount = new BigDecimal(enterDiscount);
                break;
            } else {
                System.out.println("The discount on the laptop must be a positive number or not exceed 100% .");
                System.out.println("Re-enter : ");
            }
        }
        return discount;
    }

    private static BigDecimal getEnterPrice() {
        BigDecimal price;
        System.out.println("Enter price of the laptop : ");
        while (true) {
            double enterPrice = reader.readDouble();
            if (enterPrice > 0) {
                price = new BigDecimal(enterPrice);
                break;
            } else {
                System.out.println("The price for a laptop must be a positive number.");
                System.out.println("Re-enter : ");
            }
        }
        return price;
    }

}
