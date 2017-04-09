package com.lugowoy.tasks.arrays.determineTheTimeOfStayOfTheIthCustomerInTheQueue;

import com.lugowoy.util.reading.ReadingUserInputData;

import java.math.BigDecimal;
import java.util.Arrays;

/** Created by Konstantin Lugowoy on 16.03.2017. */

public class Main {

    private static final ReadingUserInputData READING = new ReadingUserInputData();

    public static void main(String[] args) {

        System.out.println("Enter quantity customer in the queue : ");
        int quantityCustomersInTheQueue = READING.readInt();

        Queue<Customer> customerQueue = new Queue<>();

        fillCustomerQueue(customerQueue, quantityCustomersInTheQueue);

        System.out.println("Result queue : ");
        Arrays.stream(customerQueue.getQueue()).forEachOrdered(System.out::println);
        System.out.println();

        System.out.println("Enter time of service for the customer : ");
        Queue.setTimeService(new BigDecimal(READING.readDouble()));

        Determinable<Customer, BigDecimal> determinable = Determinable::determineTimeOfStayCustomerInTheQueue;

        BigDecimal resultTime = determinable.determine(customerQueue, quantityCustomersInTheQueue);

        System.out.printf("Result time : %f", resultTime.setScale(2, BigDecimal.ROUND_DOWN).doubleValue());

    }

    private static void fillCustomerQueue(Queue<Customer> customerQueue, int quantityCustomers) {
        Customer[] customers = new Customer[quantityCustomers];
        for (int i = 0; i < quantityCustomers; i++) {
            customers[i] = new Customer();
        }
        customerQueue.setQueue(customers);
    }

}
