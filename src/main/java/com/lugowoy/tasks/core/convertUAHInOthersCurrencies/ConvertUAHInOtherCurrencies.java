package com.lugowoy.tasks.core.convertUAHInOthersCurrencies;

import com.lugowoy.helper.converting.Convertable;

import java.math.BigDecimal;
import java.math.MathContext;

/**Created by Konstantin Lugowoy on 15-Dec-16.*/

public class ConvertUAHInOtherCurrencies implements Convertable<Account> {

    private BigDecimal EUR_EXCHANGE_RATE;
    private BigDecimal RUB_EXCHANGE_RATE;
    private BigDecimal USD_EXCHANGE_RATE;

    private Account account;

    public ConvertUAHInOtherCurrencies() {
    }

    public ConvertUAHInOtherCurrencies(BigDecimal EUR_EXCHANGE_RATE, BigDecimal RUB_EXCHANGE_RATE, BigDecimal USD_EXCHANGE_RATE) {
        this.EUR_EXCHANGE_RATE = EUR_EXCHANGE_RATE;
        this.RUB_EXCHANGE_RATE = RUB_EXCHANGE_RATE;
        this.USD_EXCHANGE_RATE = USD_EXCHANGE_RATE;
    }

    public ConvertUAHInOtherCurrencies(double EUR_EXCHANGE_RATE, double USD_EXCHANGE_RATE, double RUB_EXCHANGE_RATE) {
        this.EUR_EXCHANGE_RATE = new BigDecimal(EUR_EXCHANGE_RATE);
        this.USD_EXCHANGE_RATE = new BigDecimal(USD_EXCHANGE_RATE);
        this.RUB_EXCHANGE_RATE = new BigDecimal(RUB_EXCHANGE_RATE);
    }

    @Override
    public void convert(Account account) {
        account.setEUR(account.getUAH().divide(EUR_EXCHANGE_RATE, 2, BigDecimal.ROUND_HALF_DOWN));
        account.setUSD(account.getUAH().divide(USD_EXCHANGE_RATE, 2, BigDecimal.ROUND_HALF_DOWN));
        account.setRUB(account.getUAH().multiply(RUB_EXCHANGE_RATE, new MathContext(BigDecimal.ROUND_HALF_DOWN)));
    }

    public BigDecimal getEUR_EXCHANGE_RATE() {
        return EUR_EXCHANGE_RATE;
    }

    public void setEUR_EXCHANGE_RATE(BigDecimal EUR_EXCHANGE_RATE) {
        this.EUR_EXCHANGE_RATE = EUR_EXCHANGE_RATE;
    }

    public BigDecimal getRUB_EXCHANGE_RATE() {
        return RUB_EXCHANGE_RATE;
    }

    public void setRUB_EXCHANGE_RATE(BigDecimal RUB_EXCHANGE_RATE) {
        this.RUB_EXCHANGE_RATE = RUB_EXCHANGE_RATE;
    }

    public BigDecimal getUSD_EXCHANGE_RATE() {
        return USD_EXCHANGE_RATE;
    }

    public void setUSD_EXCHANGE_RATE(BigDecimal USD_EXCHANGE_RATE) {
        this.USD_EXCHANGE_RATE = USD_EXCHANGE_RATE;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

}
