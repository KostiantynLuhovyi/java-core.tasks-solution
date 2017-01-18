package com.lugowoy.tasks.core.exchangePlacesTwoVariablesWithAndWithoutTheUseOfAThirdVariable;

import com.lugowoy.util.reading.ForStopingEnterValueException;
import com.lugowoy.util.reading.Reading;

/**
 * Created by Konstantin on 18-Jan-17.
 */

public class Main {

    private static final Reading READING = new Reading();

    public static void main(String[] args) throws ForStopingEnterValueException {

        Variables variableForExchangePlacesTwoVariablesWithThirdVariable = new Variables();

        System.out.println("Enter the value of the first variable : ");
        int firstValue = READING.readInt();
        variableForExchangePlacesTwoVariablesWithThirdVariable.setFirstVariable(firstValue);

        System.out.println("Enter the value of the second variable : ");
        int secondValue = READING.readInt();
        variableForExchangePlacesTwoVariablesWithThirdVariable.setSecondVariable(secondValue);

        Exchangeable<Variables> variablesExchangeableWithTheUseThirdVariable =
                (variableForExchangeWithTheUseThirdVariable) -> {
            if (variableForExchangeWithTheUseThirdVariable != null) {
                int tmp = variableForExchangeWithTheUseThirdVariable.getFirstVariable();
                variableForExchangeWithTheUseThirdVariable.setFirstVariable(variableForExchangeWithTheUseThirdVariable.getSecondVariable());
                variableForExchangeWithTheUseThirdVariable.setSecondVariable(tmp);
            } else {
                System.out.println("Variable is equal null");
            }
            return variableForExchangeWithTheUseThirdVariable;
        };

        variablesExchangeableWithTheUseThirdVariable.exchange(variableForExchangePlacesTwoVariablesWithThirdVariable);

        System.out.printf("After the exchange of variable values using the third variable, the result is : \n" +
                "firstVariable = %d;\n" +
                "secondVariable = %d;\n", variableForExchangePlacesTwoVariablesWithThirdVariable.getFirstVariable(), variableForExchangePlacesTwoVariablesWithThirdVariable.getSecondVariable());


        Variables variableForExchangePlacesTwoVariablesWithoutThirdVariable = new Variables(firstValue, secondValue);

        Exchangeable<Variables> variablesExchangeTwoVariablesWithoutTheUseThirdVariable =
                (variableForExchangeTwoVariablesWithoutTheUseThirdVariable) -> {
                    variableForExchangeTwoVariablesWithoutTheUseThirdVariable.setFirstVariable(variableForExchangeTwoVariablesWithoutTheUseThirdVariable.getFirstVariable()
                                                            + variableForExchangeTwoVariablesWithoutTheUseThirdVariable.getSecondVariable());
                    variableForExchangeTwoVariablesWithoutTheUseThirdVariable.setSecondVariable(variableForExchangeTwoVariablesWithoutTheUseThirdVariable.getFirstVariable()
                                                            - variableForExchangeTwoVariablesWithoutTheUseThirdVariable.getSecondVariable());
                    variableForExchangeTwoVariablesWithoutTheUseThirdVariable.setFirstVariable(variableForExchangeTwoVariablesWithoutTheUseThirdVariable.getFirstVariable()
                                                            - variableForExchangeTwoVariablesWithoutTheUseThirdVariable.getSecondVariable());
                    return variableForExchangeTwoVariablesWithoutTheUseThirdVariable;
                };

        variablesExchangeTwoVariablesWithoutTheUseThirdVariable.exchange(variableForExchangePlacesTwoVariablesWithoutThirdVariable);

        System.out.printf("After the exchange of variable values without using the third variable, the result is : \n" +
                "firstVariable = %d;\n" +
                "secondVariable = %d;", variableForExchangePlacesTwoVariablesWithThirdVariable.getFirstVariable(), variableForExchangePlacesTwoVariablesWithThirdVariable.getSecondVariable());


    }
}
