package com.lugowoy.util.reading;

/**
 * Created by Konstantin on 27-Jan-17.
 * @author Konstantin
 * @version 1.1
 * @since 1.1
 *
 * This class implements the contract announced in the interface "ReadableUserInputData"
 * and abstract contract passed by inheritance from interface "ReadableData".
 *
 * @see com.lugowoy.util.reading.ReadableData
 * @see com.lugowoy.util.reading.ReadableUserInputData
 */
public class ReadingUserInputData implements ReadableUserInputData {

    /**
    * This method read user input in the console.
    * Override(implements) method with interface "ReadableUserInputData".
    *
    * @return User input string.
     * @since 1.0
     * */
    public String readLine(){
        return SCANNER.nextLine();
    }

    /**
    * This method read user input in the console.
     * Override(implements) method with interface "ReadableData".
     *
     * @return User input integer number.
     * @since 1.0
     * @throws com.lugowoy.util.reading.StoppingEnterValueException
    * */
    @Override
    public int readInt() throws StoppingEnterValueException {
        /*See private method getCorrectIntNumberValue();*/
        return getCorrectIntNumberValue();
    }

    /*
    * Method to determine the correctness of input integer value
    * */
    private int getCorrectIntNumberValue() throws StoppingEnterValueException {
        /*Local variable save and return correct value*/
        int inputValue = 0;
        /*Local variable String value stores the value read from the console, the class instance Scanner.*/
        String value = SCANNER.nextLine();
        /*
        * The entered number can exceed the limit of integer type int values, and in this case the method parseInt();
        * the instance class "Integer", throw NumberFormatException.
        * For this reason, the code waits and catches an exception.
        * */
        try {
            if (!value.equalsIgnoreCase("stop")) {
            /*
            * Regular expressions check entered variable value that the number of signed or unsigned.
            * */
                if ((value.matches("\\d+?")) || (value.matches("-\\d+?"))) {
                /*
                * If verify = "true", the variable inputValue correct and correct.
                * */
                    inputValue = Integer.parseInt(value);
                } else {
                /*If verify = "false", it prints a message and with the help of recursion require re-enter.*/
                    System.out.println("Entered an incorrect value.");
                    System.out.println("From -2147483648 to 2147483648.");
                    System.out.println("Re-enter the number : ");
                    inputValue = this.getCorrectIntNumberValue();
                }
            } else {
                throw new StoppingEnterValueException();
            }
        } catch (NumberFormatException ex) {
            /*If catch NumberFormatException exception,
            it prints a message and with the help of recursion require re-enter.*/
            System.out.println("Entered an incorrect value.");
            System.out.println("From -2147483648 to 2147483648.");
            System.out.println("Re-enter the number : ");
            inputValue = this.getCorrectIntNumberValue();
        }
        return inputValue;
    }

    /**
     * This method read user input in the console.
     * Override(implements) method with interface "ReadableData".
     *
     * @return User input double value.
     * @since 1.0
     * @throws com.lugowoy.util.reading.StoppingEnterValueException
     * */
    @Override
    public double readDouble() throws StoppingEnterValueException {
        return this.getCorrectDoubleNumberValue();
    }

    private double getCorrectDoubleNumberValue() throws StoppingEnterValueException {
        double inputValue = 0;

        String value = SCANNER.nextLine();

        try {

            if (!value.equalsIgnoreCase("stop")) {

                if (((value.matches("\\d+?[.]\\d+?")) || (value.matches("-\\d+?[.]\\d+?")))
                        || (((value.matches("\\d+?")) || (value.matches("-\\d+?"))))) {
                    inputValue = Double.parseDouble(value);
                } else {
                    System.out.println("Not correct input number value.");
                    System.out.println("Re-enter : ");
                    inputValue = this.getCorrectDoubleNumberValue();
                }
            } else {
                throw new StoppingEnterValueException();
            }
        } catch (NumberFormatException ex) {
            System.out.println("Not correct input number value.");
            System.out.println("Re-enter : ");
            inputValue = this.getCorrectDoubleNumberValue();
        }
        return inputValue;
    }
}
