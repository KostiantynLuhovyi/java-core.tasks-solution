package com.lugowoy.tasks.core.calculatingNumberProductsOfPurchasedForTheCertainSum;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 11-Feb-17.*/

public class Product {

    private BigDecimal price;

    public Product() {
    }

    public Product(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

}
