package com.lugowoy.util.reading;

/**
 * Created by Konstantin on 11.11.2016.
 */
//todo проверить комментарии и написать там где их нет.
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
        /*See private method getCorrectIntNumberValue();*/
        return this.getCorrectIntNumberValue();
    }

    /*
    * Method to determine the correctness of input integer value
    * */
    private int getCorrectIntNumberValue() {
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

    /*
    * Override abstract method interface "ReadableUserInput" to implement
    * it with the delegation of responsibilities for the implementation of the class instance Scanner.
    * */
    @Override
    public double readDouble() {
        return this.getCorrectDoubleNumberValue();
    }

    private double getCorrectDoubleNumberValue() {
        double inputValue = 0;

        String value = SCANNER.nextLine();
        try {
            if (((value.matches("\\d+?[.]\\d+?")) || (value.matches("-\\d+?[.]\\d+?")))
                    || (((value.matches("\\d+?")) || (value.matches("-\\d+?"))))) {
                inputValue = Double.parseDouble(value);
            } else {
                System.out.println("Not correct input number value.");
                System.out.println("Re-enter : ");
                inputValue = this.readDouble();
            }
        } catch (NumberFormatException ex) {
            System.out.println("Not correct input number value.");
            System.out.println("Re-enter : ");
            inputValue = this.readDouble();
        }
        return inputValue;
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
