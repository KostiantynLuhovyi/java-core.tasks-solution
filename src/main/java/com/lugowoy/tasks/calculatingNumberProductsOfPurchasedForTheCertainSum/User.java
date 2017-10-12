package com.lugowoy.tasks.calculatingNumberProductsOfPurchasedForTheCertainSum;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 11-Feb-17.*/

public class User {

    private BigDecimal availableSumOfMoney;

    public User() {
    }

    public User(BigDecimal availableSumOfMoney) {
        this.availableSumOfMoney = availableSumOfMoney;
    }

    public BigDecimal getAvailableSumOfMoney() {
        return availableSumOfMoney;
    }

    public void setAvailableSumOfMoney(BigDecimal availableSumOfMoney) {
        this.availableSumOfMoney = availableSumOfMoney;
    }

}
