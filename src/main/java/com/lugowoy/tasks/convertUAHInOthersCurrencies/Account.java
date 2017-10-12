package com.lugowoy.tasks.convertUAHInOthersCurrencies;

import java.math.BigDecimal;

/**Created by Konstantin Lugowoy on 15-Dec-16.*/

public class Account {

    private BigDecimal UAH;
    private BigDecimal USD;
    private BigDecimal EUR;
    private BigDecimal RUB;

    public Account() {
    }

    public BigDecimal getUAH() {
        return UAH;
    }

    public void setUAH(BigDecimal UAH) {
        this.UAH = UAH;
    }

    public BigDecimal getUSD() {
        return USD;
    }

    public void setUSD(BigDecimal USD) {
        this.USD = USD;
    }

    public BigDecimal getEUR() {
        return EUR;
    }

    public void setEUR(BigDecimal EUR) {
        this.EUR = EUR;
    }

    public BigDecimal getRUB() {
        return RUB;
    }

    public void setRUB(BigDecimal RUB) {
        this.RUB = RUB;
    }

}
