package com.lugowoy.tasks.core.getReverseEntryThreeDigitNumber;

/**
 * Created by Konstantin on 03-Feb-17.
 *
 * @author Konstantin Lugowoy
 */
public class ReverseService implements Reversible {

    @Override
    public int reverse(int number) {
        int oneDigit, decimalDigit, thousandthDigit;

        oneDigit = number % 10;
        number /= 10;

        decimalDigit = number % 10;
        number /= 10;

        thousandthDigit = number;

        number = 100 * oneDigit + 10 * decimalDigit + thousandthDigit;
        return number;
    }
}
