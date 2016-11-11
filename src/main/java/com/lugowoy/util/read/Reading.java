package com.lugowoy.util.read;

/**
 * Created by Konstantin on 11.11.2016.
 */
public class Reading implements ReadableRandom, ReadableUserInput {

    @Override
    public int readRandomInt() {
        return RANDOM.nextInt();
    }

    @Override
    public int readRandomInt(int bound) {
        return RANDOM.nextInt(bound);
    }

    @Override
    public double readRandomDouble() {
        return RANDOM.nextDouble();
    }

    @Override
    public int readInt() {
        return this.getInputCorrectNumberValue();
    }

    private int getInputCorrectNumberValue() {
        int inputValue = 0;
        String value = SCANNER.nextLine();
        try {
            if ((value.matches("\\d+?")) || (value.matches("-\\d+?"))) {
                inputValue = Integer.parseInt(value);
            } else {
                System.out.println("Entered an incorrect value.");
                System.out.println("From -2147483648 to 2147483648.");
                System.out.println("Re-enter the number : ");
                this.getInputCorrectNumberValue();
            }
        } catch (NumberFormatException ex) {
            System.out.println("Entered an incorrect value.");
            System.out.println("From -2147483648 to 2147483648.");
            System.out.println("Re-enter the number : ");
            this.getInputCorrectNumberValue();
        }
        return inputValue;
    }

    @Override
    public double readDouble() {
        return SCANNER.nextDouble();
    }

    @Override
    public String readLine() {
        return SCANNER.nextLine();
    }
}
