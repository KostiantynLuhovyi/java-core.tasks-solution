package com.lugowoy.tasks.core.convertUAHInOthersCurrencies;

import java.math.BigDecimal;

/**
 * Created by Konstantin on 15-Dec-16.
 */

public interface ConvertibleUAHtoRUB {

    BigDecimal RUB_EXCHANGE_RATE = new BigDecimal(2.34);

    BigDecimal convertUAHtoRUB(BigDecimal UAH);
}
