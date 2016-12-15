package com.lugowoy.tasks.core.convertUAHInOthersCurrencies;

import java.math.BigDecimal;

/**
 * Created by Konstantin on 15-Dec-16.
 */

public interface ConvertibleUAHtoEUR {

    BigDecimal EUR_EXCHANGE_RATE = new BigDecimal(28.30);

    BigDecimal convertUAHtoEUR(BigDecimal UAH);
}
