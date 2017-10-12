package com.lugowoy.tasks.exchangePlacesTwoVariablesWithAndWithoutTheUseOfAThirdVariable;

import com.lugowoy.helper.reading.Reader;
import com.lugowoy.helper.reading.ReadingDataUserInputInConsole;

/**Created by Konstantin Lugowoy on 18-Jan-17.*/

public class Main {

    private static Reader reader = new Reader(new ReadingDataUserInputInConsole());

    public static void main(String[] args) {

        Variables variableForExchangePlacesTwoVariablesWithThirdVariable = new Variables();

        System.out.println("Enter the value of the first variable : ");
        int firstValue = reader.readInt();
        variableForExchangePlacesTwoVariablesWithThirdVariable.setFirstVariable(firstValue);

        System.out.println("Enter the value of the second variable : ");
        int secondValue = reader.readInt();
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
