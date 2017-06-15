package com.lugowoy.tasks.core.calculateTheTotalCostOfOrderingLaptopAtDiscount;

import com.lugowoy.util.calculating.CalculableOnTheThreeVariables;
import com.lugowoy.util.reading.ReadingData;
import com.lugowoy.util.reading.ReadingUserInputData;

import java.math.BigDecimal;
import java.util.Random;

/** Created by Konstantin Lugowoy on 15.06.2017. */

public class Main {

    private static final ReadingData<Double> READING_DATA = new ReadingData<>(new ReadingUserInputData()::readDouble);

    public static void main(String[] args) {

        Laptop laptop = new Laptop(new Random().nextInt(10), "Dell", getEnterPrice());

        Integer numberOfLaptop = getNumberOfLaptop();

        BigDecimal discount = getTotalDiscountOnTheLaptop();

        System.out.println("The total cost of the order : " + calculating.calculate(laptop, numberOfLaptop, discount).doubleValue());

    }

    private static CalculableOnTheThreeVariables<BigDecimal, Laptop, Integer, BigDecimal> calculating = (laptop, numberOfLaptop, discount) -> {

        BigDecimal sumPriceOfLaptop = new BigDecimal(laptop.getPrice().multiply(new BigDecimal(numberOfLaptop)).doubleValue());

        return new BigDecimal(sumPriceOfLaptop.subtract(sumPriceOfLaptop.multiply(discount).divide(new BigDecimal(100))).doubleValue());
    };

    private static int getNumberOfLaptop() {
        int numberOfLaptop;
        System.out.println("Enter the number of laptops : ");
        while (true) {
            numberOfLaptop = new ReadingUserInputData().readInt();
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
            double enterDiscount = READING_DATA.read();
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
            double enterPrice = READING_DATA.read();
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
