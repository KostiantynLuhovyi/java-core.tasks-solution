package com.lugowoy.tasks.core.convertUAHInOthersCurrencies;

import java.math.BigDecimal;

/**
 * Created by Konstantin on 15-Dec-16.
 */

public interface ConvertibleUAHtoUSD {

    BigDecimal USD_EXCHANGE_RATE = new BigDecimal(26.30);

    BigDecimal convertUAHtoUSD(BigDecimal UAH);


}
