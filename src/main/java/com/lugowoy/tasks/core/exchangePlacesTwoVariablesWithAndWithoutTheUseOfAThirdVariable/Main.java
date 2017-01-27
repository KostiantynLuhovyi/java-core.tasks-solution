package com.lugowoy.tasks.core.exchangePlacesTwoVariablesWithAndWithoutTheUseOfAThirdVariable;

import com.lugowoy.util.reading.*;
import com.lugowoy.util.reading.Readable;

/**
 * Created by Konstantin on 18-Jan-17.
 */

public class Main {

    private static final ReadingData<Integer> READING_DATA = new ReadingData<>(new ReadingUserInputData()::readInt);

    public static void main(String[] args) throws StoppingEnterValueException {

        Variables variableForExchangePlacesTwoVariablesWithThirdVariable = new Variables();

        System.out.println("Enter the value of the first variable : ");
        int firstValue = READING_DATA.read();
        variableForExchangePlacesTwoVariablesWithThirdVariable.setFirstVariable(firstValue);

        System.out.println("Enter the value of the second variable : ");
        int secondValue = READING_DATA.read();
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
