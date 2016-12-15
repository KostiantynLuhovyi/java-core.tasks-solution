package com.lugowoy.tasks.core.convertUAHInOthersCurrencies;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Created by Konstantin on 15-Dec-16.
 */

public class ConvertUAHInOtherCurrencies implements ConvertibleUAHtoUSD, ConvertibleUAHtoEUR, ConvertibleUAHtoRUB {

    @Override
    public BigDecimal convertUAHtoEUR(BigDecimal UAH) {
        return UAH.divide(EUR_EXCHANGE_RATE, 2, BigDecimal.ROUND_HALF_DOWN);
    }

    @Override
    public BigDecimal convertUAHtoRUB(BigDecimal UAH) {
        return UAH.multiply(RUB_EXCHANGE_RATE, new MathContext(BigDecimal.ROUND_HALF_DOWN));
    }

    @Override
    public BigDecimal convertUAHtoUSD(BigDecimal UAH) {
        return UAH.divide(USD_EXCHANGE_RATE, 2, BigDecimal.ROUND_HALF_DOWN);
    }
}
