package com.lugowoy.util.reading;

import java.util.Scanner;

/**
 * Created by Konstantin Lugowoy on 27-Jan-17.
 *
 * @author Konstantin Lugowoy
 * @version 1.1
 * @since 1.2
 * <p>
 * This class implements the contract declared in the ReadableUserInputData interface.
 * @see com.lugowoy.util.reading.Readable
 * @see com.lugowoy.util.reading.ReadableData
 * @see com.lugowoy.util.reading.ReadableUserInputData
 * The purpose of the functional implemented by this class is to read the data entered by the user.
 * At this stage of development, user input is made to the console,
 * but in the future it is likely that the hierarchy that implements the user input reading functionality will be extended.
 * </p>
 */
public class ReadingUserInputData implements ReadableUserInputData {

    /**
     * A static context attribute that reads data from the console.
     *
     * @see java.util.Scanner
     */
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * <p>
     * Reading a string entered by the user into the console.
     * </p>
     *
     * @return The string entered by the user in the console.
     * @since 1.0
     */
    public String readLine() {
        return SCANNER.nextLine();
    }

    /**
     * <p>
     * Read the integer value entered by the user in the console.
     * </p>
     * @return The integer value entered by the user in the console.
     * @since 1.1
     */
    @Override
    public int readInt() {
        /*See private method getCorrectIntNumberValue();*/
        return getCorrectIntNumberValue();
    }

    /*
    * The method that performs the necessary checks on the correctness of the entered data and returns the correct result.
    * */
    private int getCorrectIntNumberValue() {
        int inputValue; //Variable for save and return correct value.

        String value = SCANNER.nextLine();//The variable takes on a value that the user entered into the console.

        //Verification that the user entered string is not equal to "stop".
        if (!value.equalsIgnoreCase("stop")) {
            //Checking with regular expressions that the entered string is indeed a number with or without a sign.
            if ((value.matches("\\d+?")) || (value.matches("-\\d+?"))) {
                //If the checks were successful, then allocating the string representation of the integer number is assigned
                // to the variable that returns this value from the method.
                inputValue = Integer.parseInt(value);
            } else {
                //If during the scan of the entered line it is determined that this is not an integer number,
                // then a corresponding message is displayed about incorrect data entry and by recursion please repeat the input.
                System.out.println("Entered an incorrect value.");
                System.out.println("From -2147483648 to 2147483648.");
                System.out.println("Re-enter the number : ");
                inputValue = this.getCorrectIntNumberValue();
            }
        } else {
            //If the input string was equal to the value "stop", then throw an exception StoppingEnterValueException;
            throw new StoppingEnterValueException();
        }
        return inputValue;

    }

    /**
     * <p>
     * Read the real double value entered by the user in the console.
     * </p>
     * @return The real double value entered by the user in the console.
     * @since 1.1
     */
    @Override
    public double readDouble() {
        /*See private method getCorrectDoubleNumberValue();*/
        return this.getCorrectDoubleNumberValue();
    }

    /*
    * The method that performs the necessary checks on the correctness of the entered data and returns the correct result.
    * */
    private double getCorrectDoubleNumberValue() {
        double value;//Variable for save and return correct value.

        String inputValue = SCANNER.nextLine();//The variable takes on a value that the user entered into the console.

        //Verification that the user entered string is not equal to "stop".
        if (!inputValue.equalsIgnoreCase("stop")) {
            //Checking with regular expressions that the entered string is indeed a number with or without a sign.
            if (((inputValue.matches("\\d+?[.]\\d+?")) || (inputValue.matches("-\\d+?[.]\\d+?")))
                    || (((inputValue.matches("\\d+?")) || (inputValue.matches("-\\d+?"))))) {
                //If the checks were successful, then allocating the string representation of the real double number is assigned
                // to the variable that returns this value from the method.
                value = Double.parseDouble(inputValue);
            } else {
                //If during the scan of the entered line it is determined that this is not an real double number,
                // then a corresponding message is displayed about incorrect data entry and by recursion please repeat the input.
                System.out.println("Not correct input number value.");
                System.out.println("Re-enter : ");
                value = this.getCorrectDoubleNumberValue();
            }
        } else {
            //If the input string was equal to the value "stop", then throw an exception StoppingEnterValueException;
            throw new StoppingEnterValueException();
        }
        return value;

    }

}
