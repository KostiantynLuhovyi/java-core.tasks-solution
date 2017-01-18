package com.lugowoy.tasks.core.exchangePlacesTwoVariablesWithAndWithoutTheUseOfAThirdVariable;

/**
 * Created by Konstantin on 18-Jan-17.
 */

@FunctionalInterface
public interface ExchangeableTwoVariablesWithTheUseThirdVariable extends Exchangeable<Variables> {

    @Override
    Variables exchange(Variables variables);
}
