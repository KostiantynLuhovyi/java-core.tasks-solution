package com.lugowoy.tasks.core.exchangePlacesTwoVariablesWithAndWithoutTheUseOfAThirdVariable;

/**
 * Created by Konstantin on 18-Jan-17.
 */

@FunctionalInterface
public interface ExchangeTwoVariablesWithoutTheUseThirdVariable extends Exchangeable<Variables> {

    @Override
    Variables exchange(Variables variables);
}
