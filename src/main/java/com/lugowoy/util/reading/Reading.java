package com.lugowoy.util.reading;

/**
 * Created by Konstantin on 11.11.2016.
 */

/*Class "Reading" implements the interface contracts for reading, processing input and generated data.*/
public class Reading implements ReadableRandom, ReadableUserInput {

    /*
    * Override abstract method interface "ReadableRandom" to implement
    * it with the delegation of responsibilities for the implementation of the class instance Random.
    * */
    @Override
    public int readRandomInt() {
        return RANDOM.nextInt();
    }

    /*
    * Override abstract method interface "ReadableRandom" to implement
    * it with the delegation of responsibilities for the implementation of the class instance Random.
    * */
    @Override
    public int readRandomInt(int bound) {
        return RANDOM.nextInt(bound);
    }

    /*
    * Override abstract method interface "ReadableRandom" to implement
    * it with the delegation of responsibilities for the implementation of the class instance Random.
    * */
    @Override
    public double readRandomDouble() {
        return RANDOM.nextDouble();
    }

    /*
    * Override abstract method interface "ReadableUserInput" to implement
    * it with the delegation of responsibilities for the implementation of the class instance Scanner.
    * */
    @Override
    public int readInt() {
        /*See private method getInputCorrectNumberValue();*/
        return this.getInputCorrectNumberValue();
    }

    /*
    * Method to determine the correctness of input integer value
    * */
    private int getInputCorrectNumberValue() {
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
                this.getInputCorrectNumberValue();
            }
        } catch (NumberFormatException ex) {
            /*If catch NumberFormatException exception,
            it prints a message and with the help of recursion require re-enter.*/
            System.out.println("Entered an incorrect value.");
            System.out.println("From -2147483648 to 2147483648.");
            System.out.println("Re-enter the number : ");
            this.getInputCorrectNumberValue();
        }
        return inputValue;
    }

    /*
    * Override abstract method interface "ReadableUserInput" to implement
    * it with the delegation of responsibilities for the implementation of the class instance Scanner.
    * */
    @Override
    public double readDouble() {
        return SCANNER.nextDouble();
    }

    /*
    * Override abstract method interface "ReadableUserInput" to implement
    * it with the delegation of responsibilities for the implementation of the class instance Scanner.
    * */
    @Override
    public String readLine() {
        return SCANNER.nextLine();
    }
}
