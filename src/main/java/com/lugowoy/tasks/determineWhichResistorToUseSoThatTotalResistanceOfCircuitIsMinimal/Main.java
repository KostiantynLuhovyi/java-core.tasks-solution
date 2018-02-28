package com.lugowoy.tasks.determineWhichResistorToUseSoThatTotalResistanceOfCircuitIsMinimal;

import com.lugowoy.helper.io.reading.Reader;
import com.lugowoy.helper.io.reading.ReadingConsole;

/** Created by Konstantin Lugowoy on 10.11.2017. */

public class Main {

    private static final Reader READER = Reader.getReader(new ReadingConsole());

    public static void main(String[] args) {

        System.out.println("Enter the value of the main resistor : ");
        Resistor mainResistor = new Resistor(READER.readDouble());

        System.out.println("Enter the value of the first resistor :");
        Resistor firstResistor = new Resistor(READER.readDouble());

        System.out.println("Enter the value of the second resistor :");
        Resistor secondResistor = new Resistor(READER.readDouble());

        System.out.println("Enter the value of the third resistor :");
        Resistor thirdResistor = new Resistor(READER.readDouble());

        Calculator calculator = Calculator::calculationOfResistanceOfCircuitForFirstConnectionMethods;
        double firstValueOfChainSection = calculator.calculate(mainResistor, firstResistor, secondResistor, thirdResistor);
        double secondValueOfChainSection = calculator.calculate(mainResistor, firstResistor, secondResistor, thirdResistor);
        double thirdValueOfChainSection = calculator.calculate(mainResistor, firstResistor, secondResistor, thirdResistor);

        Determinator determinator = Determinator::determineFirstVariantOfMethodConnection;
        boolean A = determinator.determineMethodOfConnection(firstValueOfChainSection, secondValueOfChainSection, thirdValueOfChainSection);
        boolean B = determinator.determineMethodOfConnection(firstValueOfChainSection, secondValueOfChainSection, thirdValueOfChainSection);
        System.out.println("To achieve the minimum resistance in the chain section, it is necessary to use : ");
        System.out.println(A ? firstResistor : B ? secondResistor : thirdResistor);

    }

}
